package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * """
 * Using a root package also allows the @ComponentScan annotation to be used without needing to specify a basePackage attribute.
 * You can also use the @SpringBootApplication annotation if your main class is in the root package.
 * """
 *
 * @See <a href="https://docs.spring.io/spring-boot/docs/1.5.9.RELEASE/reference/htmlsingle/"></a>
 */

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}