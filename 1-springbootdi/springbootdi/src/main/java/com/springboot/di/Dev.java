package com.springboot.di;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build () {
        System.out.println("******* Let's build something interesting! *********");
    }
}
