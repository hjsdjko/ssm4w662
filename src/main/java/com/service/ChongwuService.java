package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuView;


/**
 * 宠物
 *
 * @author 
 * @email 
 * @date 2021-04-20 16:25:12
 */
public interface ChongwuService extends IService<ChongwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwuVO> selectListVO(Wrapper<ChongwuEntity> wrapper);
   	
   	ChongwuVO selectVO(@Param("ew") Wrapper<ChongwuEntity> wrapper);
   	
   	List<ChongwuView> selectListView(Wrapper<ChongwuEntity> wrapper);
   	
   	ChongwuView selectView(@Param("ew") Wrapper<ChongwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwuEntity> wrapper);
   	
}

