package com.entity.model;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 宠物
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
public class ChongwuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物分类
	 */
	
	private String chongwufenlei;
		
	/**
	 * 宠物年龄
	 */
	
	private Integer chongwunianling;
		
	/**
	 * 宠物眼色
	 */
	
	private String chongwuyanse;
		
	/**
	 * 宠物体型
	 */
	
	private String chongwutixing;
		
	/**
	 * 宠物毛长
	 */
	
	private String chongwumaozhang;
		
	/**
	 * 宠物视频
	 */
	
	private String chongwushipin;
		
	/**
	 * 宠物图片
	 */
	
	private String chongwutupian;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：宠物分类
	 */
	 
	public void setChongwufenlei(String chongwufenlei) {
		this.chongwufenlei = chongwufenlei;
	}
	
	/**
	 * 获取：宠物分类
	 */
	public String getChongwufenlei() {
		return chongwufenlei;
	}
				
	
	/**
	 * 设置：宠物年龄
	 */
	 
	public void setChongwunianling(Integer chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	
	/**
	 * 获取：宠物年龄
	 */
	public Integer getChongwunianling() {
		return chongwunianling;
	}
				
	
	/**
	 * 设置：宠物眼色
	 */
	 
	public void setChongwuyanse(String chongwuyanse) {
		this.chongwuyanse = chongwuyanse;
	}
	
	/**
	 * 获取：宠物眼色
	 */
	public String getChongwuyanse() {
		return chongwuyanse;
	}
				
	
	/**
	 * 设置：宠物体型
	 */
	 
	public void setChongwutixing(String chongwutixing) {
		this.chongwutixing = chongwutixing;
	}
	
	/**
	 * 获取：宠物体型
	 */
	public String getChongwutixing() {
		return chongwutixing;
	}
				
	
	/**
	 * 设置：宠物毛长
	 */
	 
	public void setChongwumaozhang(String chongwumaozhang) {
		this.chongwumaozhang = chongwumaozhang;
	}
	
	/**
	 * 获取：宠物毛长
	 */
	public String getChongwumaozhang() {
		return chongwumaozhang;
	}
				
	
	/**
	 * 设置：宠物视频
	 */
	 
	public void setChongwushipin(String chongwushipin) {
		this.chongwushipin = chongwushipin;
	}
	
	/**
	 * 获取：宠物视频
	 */
	public String getChongwushipin() {
		return chongwushipin;
	}
				
	
	/**
	 * 设置：宠物图片
	 */
	 
	public void setChongwutupian(String chongwutupian) {
		this.chongwutupian = chongwutupian;
	}
	
	/**
	 * 获取：宠物图片
	 */
	public String getChongwutupian() {
		return chongwutupian;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
