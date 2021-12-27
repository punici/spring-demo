package com.punici.demo.server.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.punici.demo.server")
public class DemoServerApplication
{
    public static void main(String[] args)
    {
        System.out.println("运行开始");
        SpringApplication.run(DemoServerApplication.class, args);
        System.out.println("运行结束");
    }
}
