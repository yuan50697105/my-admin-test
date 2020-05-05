import cn.hutool.json.JSONUtil;
import com.aliyun.alink.dm.api.DeviceInfo;
import com.aliyun.alink.dm.api.InitResult;
import com.aliyun.alink.linkkit.api.ILinkKitConnectListener;
import com.aliyun.alink.linkkit.api.IoTMqttClientConfig;
import com.aliyun.alink.linkkit.api.LinkKit;
import com.aliyun.alink.linkkit.api.LinkKitInitParams;
import com.aliyun.alink.linksdk.cmp.connect.channel.MqttPublishRequest;
import com.aliyun.alink.linksdk.cmp.connect.channel.MqttSubscribeRequest;
import com.aliyun.alink.linksdk.cmp.core.base.AMessage;
import com.aliyun.alink.linksdk.cmp.core.base.ARequest;
import com.aliyun.alink.linksdk.cmp.core.base.AResponse;
import com.aliyun.alink.linksdk.cmp.core.base.ConnectState;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectNotifyListener;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectSendListener;
import com.aliyun.alink.linksdk.cmp.core.listener.IConnectSubscribeListener;
import com.aliyun.alink.linksdk.tmp.device.payload.ValueWrapper;
import com.aliyun.alink.linksdk.tools.AError;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: aliyun-demo
 * @description:
 * @author: yuane
 * @create: 2020-05-05 19:20
 */
public class CC {
    public static void main(String[] args) {
        final String productKey = "a12mkmuZtyi";
        final String deviceName = "test_1";
        final String deviceSecret = "BQ4k3KQXt2ceNY032zxJ2hXjc6YBtvOX";
        final String region = "cn-shanghai";

        LinkKitInitParams params = new LinkKitInitParams();
        //LinkKit底层是mqtt协议，设置mqtt的配置
        IoTMqttClientConfig config = new IoTMqttClientConfig();
        config.productKey = productKey;
        config.deviceName = deviceName;
        config.deviceSecret = deviceSecret;
        config.channelHost = productKey + ".iot-as-mqtt." + region + ".aliyuncs.com:1883";
        //设备的信息
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.productKey = productKey;
        deviceInfo.deviceName = deviceName;
        deviceInfo.deviceSecret = deviceSecret;
        deviceInfo.iotId= String.valueOf(System.currentTimeMillis());
        //报备的设备初始状态，此处没有物模型初始状态
        Map<String, ValueWrapper> propertyValues = new HashMap<String, ValueWrapper>();
        params.mqttClientConfig = config;
        params.deviceInfo = deviceInfo;
        params.propertyValues = propertyValues;

        //连接并设置连接成功以后的回调函数
        LinkKit.getInstance().init(params, new ILinkKitConnectListener() {
            @Override
            public void onError(AError aError) {
                System.out.println("Init error:" + aError);
            }

            //初始化成功以后的回调
            @Override
            public void onInitDone(InitResult initResult) {
                //设置订阅的topic
                MqttSubscribeRequest request = new MqttSubscribeRequest();
                request.topic = "/" + productKey + "/" + deviceName + "/user/control";
                request.isSubscribe = true;
                //发出订阅请求并设置订阅成功或者失败的回调函数
                LinkKit.getInstance().subscribe(request, new IConnectSubscribeListener() {
                    @Override
                    public void onSuccess() {
                        System.out.println("订阅成功");
                    }

                    @Override
                    public void onFailure(AError aError) {
                        System.out.println("JSONUtil.toJsonStr(aError) = " + JSONUtil.toJsonStr(aError));
                    }
                });
                //设置订阅的下行消息到来时的回调函数
                LinkKit.getInstance().registerOnNotifyListener(new IConnectNotifyListener() {
                    //此处定义收到下行消息以后的回调函数。

                    @Override
                    public void onNotify(String connectId, String topic, AMessage aMessage) {
                        System.out.println("connectId = " + connectId);
                        System.out.println("topic = " + topic);
                        System.out.println("aMessage.data = " + aMessage.data);
                        System.out.println(
                                "received message from " + topic + ":" + new String((byte[])aMessage.getData()));
                    }

                    @Override
                    public boolean shouldHandle(String s, String s1) {
                        return true;
                    }

                    @Override
                    public void onConnectStateChange(String s, ConnectState connectState) {
                        System.out.println("s = " + s);
                        System.out.println("connectState = " + connectState);
                    }
                });
            }
        });
    }
}