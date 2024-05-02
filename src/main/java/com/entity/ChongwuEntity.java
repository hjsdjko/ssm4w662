package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 宠物
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
@TableName("chongwu")
public class ChongwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChongwuEntity() {
		
	}
	
	public ChongwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宠物名字
	 */
					
	private String chongwumingzi;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宠物名字
	 */
	public void setChongwumingzi(String chongwumingzi) {
		this.chongwumingzi = chongwumingzi;
	}
	/**
	 * 获取：宠物名字
	 */
	public String getChongwumingzi() {
		return chongwumingzi;
	}
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
