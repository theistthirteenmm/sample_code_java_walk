package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        char[] walk = {'n', 'n', 'e', 'e', 's', 'w', 'w', 'w', 'n', 's'};

        boolean resalt1 = level1(walk);
        boolean resalt2 = level2(walk);
        boolean resalt3 = level3(walk);
        System.out.println("level1 === " + resalt1);
        System.out.println("level2 === " + resalt2);
        System.out.println("level3 === " + resalt3);

    }


}
