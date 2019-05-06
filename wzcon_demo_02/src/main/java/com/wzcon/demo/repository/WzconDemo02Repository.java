package com.wzcon.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wzcon.demo.entity.WzconDemo02;

public interface WzconDemo02Repository extends JpaRepository<WzconDemo02, Long> {

	@Query(value = "select d from WzconDemo02 d where d.name=?1")
	List<WzconDemo02> finByName(String name);

}

