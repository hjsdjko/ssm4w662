package com.dao;

import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwuVO;
import com.entity.view.ChongwuView;


/**
 * 宠物
 * 
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
public interface ChongwuDao extends BaseMapper<ChongwuEntity> {
	
	List<ChongwuVO> selectListVO(@Param("ew") Wrapper<ChongwuEntity> wrapper);
	
	ChongwuVO selectVO(@Param("ew") Wrapper<ChongwuEntity> wrapper);
	
	List<ChongwuView> selectListView(@Param("ew") Wrapper<ChongwuEntity> wrapper);

	List<ChongwuView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwuEntity> wrapper);
	
	ChongwuView selectView(@Param("ew") Wrapper<ChongwuEntity> wrapper);
	
}
