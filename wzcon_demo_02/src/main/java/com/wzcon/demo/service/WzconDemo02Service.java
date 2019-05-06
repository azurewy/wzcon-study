package com.wzcon.demo.service;

import java.util.List;

import com.wzcon.demo.entity.WzconDemo02;

public interface WzconDemo02Service {

	public void save(WzconDemo02 demo);
	
	public void delete(Long id);
	
	public List<WzconDemo02> findByName(String name);
}
