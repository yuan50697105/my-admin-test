# Spring 学习

1. Spring 概述
   1. Spring 是一个挑战传统Java EE标准框架，最初只是为了解决十分复杂的EJB注入管理，本人并没有使用EJB内容，词句只是从网上获得，有问题敬请谅解
   2. Spring基本内容
      1. IOC 控制反转 
         1. 主要内容就是内容托管组件的动态注入
      2. AOP 切面编程
         1. 这个与拦截器有类似的地方，但是切面更加通用，只要是符合要求的就会处理
      3. Web 
         1. 用于JavaWeb 核心，这个也是Spring 最常用的形式
         2. 组件
            1. Spring MVC 
               1. 基于Servlet 修改的快速开发MVC框架
            2. Spring WebFlux
               1. Spring 5.0 新增的框架，使用反应式编程理念创建，与Spring MVC不同的实现
      4. 高级内容
         1. Spring Context 
            1. Spring 上下文是托管整个应用的生态
         2. Spring Bean
            1. IOC注入时，产生的内容，提供创建于执行的功能
         3. Spring AOP
            1. 面向切面编程
      5. 组件库（官方库）
      6. 