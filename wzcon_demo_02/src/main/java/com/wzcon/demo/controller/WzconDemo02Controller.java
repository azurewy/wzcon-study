package com.wzcon.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wzcon.demo.entity.WzconDemo02;
import com.wzcon.demo.service.WzconDemo02Service;



@RestController
@RequestMapping("/demo")
public class WzconDemo02Controller {
	@Resource
    private WzconDemo02Service wzconDemo02Service;
	
    /**
     * 测试保存数据方法.
     * @return
     */

    @RequestMapping("/save")
    public String save(){
    	WzconDemo02 d = new WzconDemo02();
        d.setName("wzcon");
        wzconDemo02Service.save(d);//保存数据.
        return "ok.DemoController.save";

    }	

}
