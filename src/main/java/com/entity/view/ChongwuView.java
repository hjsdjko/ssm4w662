package com.entity.view;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宠物
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
@TableName("chongwu")
public class ChongwuView  extends ChongwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwuView(){
	}
 
 	public ChongwuView(ChongwuEntity chongwuEntity){
 	try {
			BeanUtils.copyProperties(this, chongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
