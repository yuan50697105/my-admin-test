# Java学习

1. 基础内容
   1. 基础数据类型
      1. 整型 、浮点、布尔、字符
   2. 逻辑控制
      1. if
      2. switch
   3. 方法
      1. 多种实现
   4. 面向对象
      1. class
   5. 常用API
      1. 集合
      2. IO
      3. 线程
   6. JDBC
      1. 面向关系数据库
      2. 四个基础配置参数
      3. DataSource 连接池
   7. Servlet
      1. Request
      2. Response
      3. Session
   
2. JavaWeb
   1. Java EE（主要是EJB目前新项目已经基本没有使用，如果是旧项目也可能有接近20年了）
   2. Spring
      1. Spring IOC
         
         1. 依赖注入
      2. Spring AOP、
         
         1. 面向切面
      3. Spring Web
         1. Spring面向Web开发组件
         2. 内容
            1. Spring MVC（Servlet技术栈Web框架）
            2. Spring WebFlux（Reactor 技术栈Web框架）
            3. 与其他框架组合
               1. Struts2（目前新项目基本没有使用的了）
      4. Spring Data （Spring 统一数据访问标准）
         1. Spring Data JDBC
            1. 使用Spring Data 标准加上JDBCTamplate 制作的框架，只提供最基本的JDBC访问，需要根据需要自行扩展，难度较大
            2. 其他扩展
               1. Mybatis
                  1. SQLMapper
                  
                     1. Mybatis 默认使用代理实现方式自动生成实现类，SQL书写在对应的XML文件中
                     2. XML文件编写问题
                        1. namespace 要跟接口的package路径与名称一致
                        2. update 可以进行所有事物方面的操作
                  
                  2. 相关扩展
                     1. PageHelper 
                        1. 知名分页插件
                     2. SQLHelper 
                        1. 支持量非常大的分页工具
                     3. Mybatis Mapper 
                        1. 通用Mapper 快速实现单表操作，使用时要会一些JPA注释的使用方式
                        2. 扩展 Mybatis Example Ext 自动对Example进行生成，不过目前只能实现多字段And
                  
                     1. Mybatis Plus
                        1. 一个十分方便的Mybatis 扩展，可以说是Mybatis Mapper和PageHelper的组合
                  
                  3. 逆向工程
                     1. Example
                        1. Example 自动化工具包
                           1. Mybatis Example Ext （详见Gitee）
                     2. DynamicSQL
                        1. Mybatis 3.5 以后新增方式，用Fluent API方式处理
                  
                  4. 其他内容
                  
                     1. 
         2. Spring Data JPA
            1. Spring Data 标准、Spring ORM 、Hibernate 实现
            2. 其他内容（hibernate扩展）
               1. 
         3. Spring Data Mongo
            
            1. 面向NoSQL MongoDB，分为普通型和响应型两个实现
         4. Spring Data Redis
            
            1. 面向NoSQL Redis实现，分为普通型和响应型两个实现
         5. Spring Data 其他框架
            1. Spring Data Elaticsearch 
               1. 面向 ES
            2. Spring Data Solr
               1. 面向Solr 能够比较方便的集成数据仓库
      5. Spring Cache 
         1. 缓存抽象
         2. 已经实现缓存
            1. 会自动按照顺序加载，或者强制指定
      6. Spring Security
         1. Spring 自带的权限安全框架
         2. Spring Security是基于用户-权限方式，可以自行扩展
         3. 相关扩展
            1. Spring Security JWT
            2. Spring Security Oauth2
         4. 同性质框架
            1. Apache Shiro 
               1. 知名权限框架，与Spring Security的方式不同，基于用户-角色-权限方式
      7. Spring LDAP
         
         1. 轻量目录访问协议，可以和Spring Security集成
      8. Spring Session
         
         1. 会话控制 可以和Spring Security 集成实现单点登录
      9. Spring Batch
         
         1. 批处理任务，可以和Quartz集成
      10. Spring Integeration （Spring EIP集成）
          
          1. 大量基础功能集成
      11. Spring AMQP
          1. 消息中间件同城
          2. 相关组件
             1. Spring AMQP 面向Rabbitmq
             2. Spring Kafak 
             3. Spring ActiveMQ
      12. Spring Boot
          1. Spring 技术自动化配置
          2. Spring Cloud
             1. 在Spring Boot基础上实现的Spring 微服务标准
          3. 非Spring 官方定制
   
3. 大数据相关

   1. Hadoop
      1. 知名的大数据框架，自身提供分布式文件储存HDFS，分布式资源协调工具Yarn，分布式离线计算MapReduce
   2. Spark
   3. Solr
   4. ELK



# Kotlin学习

# Scala学习