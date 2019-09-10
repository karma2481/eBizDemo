package com.skcc.eBiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class EBizDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBizDemoApplication.class, args);
	}
	
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello world... 테스트입니다.";
    }	

}