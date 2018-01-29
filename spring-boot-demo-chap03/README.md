* @SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan

* Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute. You can also use the @SpringBootApplication annotation if your main class is in the root package.

[reference](https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/)

* Here is a typical layout:

```
com
 +- example
     +- myproject
         +- Application.java
         |
         +- domain
         |   +- Customer.java
         |   +- CustomerRepository.java
         |
         +- service
         |   +- CustomerService.java
         |
         +- web
             +- CustomerController.java
```

* ** WARNING ** : Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package.
don't advise coder to set Application.java in the root package.

# 配置文件的类型： properties文件和yaml文件
# 目标：多环境构建（application.properties和application-${profile}.properties）
#       spring.profile.active指定要激活的配置文件
# 变量的传递（从配置文件的设置，到自动映射到Java Bean/Component) 
        @ConfigurationProperties(prefix="person")
      

