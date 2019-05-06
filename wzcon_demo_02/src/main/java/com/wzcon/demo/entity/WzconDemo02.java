package com.wzcon.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity // 加入这个注解，Demo就会进行持久化了
@Table(name = "t_demo02")
@Data
public class WzconDemo02 {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "tname")
	private String name;
}
