package com.snowy.southwind.feign;

import org.springframework.stereotype.Component;

@Component
public class Feignrongduan implements TestFeign{
    @Override
    public Student testfeign() {
        System.out.println("降级");
        return null;
    }
}
