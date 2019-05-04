Spring Boot  初始搭建

需要准备
【Spring Boot】【Maven】【Eclipse】【java8】

源码：


创建步骤
1、创建workspace
2、在eclipse里面配置maven
3、创建一个spring boot工程：选择File-->New-->Static Web Project

4、填写相关的项目内容

5、可以选择你需要在Spring Boot中集成的插件

6、完成

工程目录

src/main/java 程序开发以及主程序入口
src/main/resources 配置文件
src/test/java 测试程序

pom配置
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.4.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.wzcon</groupId>
	<artifactId>wzcon_demo_01</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>wzcon_demo_01</name>
	<description>Wzcon Spring Boot</description>
	<properties>
		<java.version>1.8</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
  
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
</project>



pom.xml中添加支持web的模块：
<dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
</dependency>

pom.xml 文件中默认有两个模块：
spring-boot-starter ：
核心模块，包括自动配置支持、日志和 YAML，如果引入了 spring-boot-	starter-web 
web模块可以去掉此配置spring-boot-starter，因为 spring-boot-starter-web 自动依赖了 spring-boot-starter。
spring-boot-starter-test ：
测试模块，包括 JUnit、Hamcrest、Mockito。

展示效果
启动


Url访问

单元测试


github：

遇到的错误

问题原因
出现这个问题的原因是由于 maven的版本的问题，需要安装eclipse的maven扩展插件。
解决办法
点击 help -> Install New Software -> Work with 输入如下地址:
https://otto.takari.io/content/sites/m2e.extras/m2eclipse-mavenarchiver/0.17.2/N/LATEST/ 

如果这个地址出现无法下载的情况可以改为下面这个地址：
http://repo1.maven.org/maven2/.m2e/connectors/m2eclipse-mavenarchiver/0.17.2/N/LATEST/

