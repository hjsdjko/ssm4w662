package com.dao;

import com.entity.ChongwufenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwufenleiVO;
import com.entity.view.ChongwufenleiView;


/**
 * 宠物分类
 * 
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
public interface ChongwufenleiDao extends BaseMapper<ChongwufenleiEntity> {
	
	List<ChongwufenleiVO> selectListVO(@Param("ew") Wrapper<ChongwufenleiEntity> wrapper);
	
	ChongwufenleiVO selectVO(@Param("ew") Wrapper<ChongwufenleiEntity> wrapper);
	
	List<ChongwufenleiView> selectListView(@Param("ew") Wrapper<ChongwufenleiEntity> wrapper);

	List<ChongwufenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwufenleiEntity> wrapper);
	
	ChongwufenleiView selectView(@Param("ew") Wrapper<ChongwufenleiEntity> wrapper);
	
}
