package com.snowy.southwind.feign;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value = "fzy",fallback = Feignrongduan.class)

public interface TestFeign {
    @ResponseBody
    @RequestMapping(value = "/a")

    public Student testfeign();
}
