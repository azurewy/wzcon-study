package com.wzcon.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzcon.demo.entity.WzconDemo02;
import com.wzcon.demo.repository.WzconDemo02Repository;
import com.wzcon.demo.service.WzconDemo02Service;

@Service
public class WzconDemo02ServiceImpl implements WzconDemo02Service {

    @Autowired
    private WzconDemo02Repository wzconDemo02Repository;

    public void save(WzconDemo02 demo){
    	wzconDemo02Repository.save(demo);
    }
    
}
