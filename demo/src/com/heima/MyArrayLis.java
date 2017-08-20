package com.heima;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.management.RuntimeErrorException;

public class MyArrayLis {
	public static void main(String[] args)throws IOException {
		//创建list集合
		List<Bean> list = new ArrayList<>();
		list.add(new Bean("1","2","3"));
		list.add(new Bean("1","2","3"));
		list.add(new Bean("1","2","3"));
		
		//创建json类对象
		JsonBean jsonBean = new JsonBean();
		//封装list集合
		jsonBean.setList(list);
		
		//将jsonBean 转换成json数据,就可以得到
		

	}
	
	
 }

//封装list属性的类
class JsonBean{
	private List<Bean> data;

	public List<Bean> getList() {
		return data;
	}

	public void setList(List<Bean> data) {
		this.data = data;
	}
	
	
}

//list需要的类
class Bean{
	private String fileName;
	private String id;
	private String lastName;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Bean(String fileName, String id, String lastName) {
		super();
		this.fileName = fileName;
		this.id = id;
		this.lastName = lastName;
	}
	public Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
