package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChongwuDao;
import com.entity.ChongwuEntity;
import com.service.ChongwuService;
import com.entity.vo.ChongwuVO;
import com.entity.view.ChongwuView;

@Service("chongwuService")
public class ChongwuServiceImpl extends ServiceImpl<ChongwuDao, ChongwuEntity> implements ChongwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwuEntity> page = this.selectPage(
                new Query<ChongwuEntity>(params).getPage(),
                new EntityWrapper<ChongwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwuEntity> wrapper) {
		  Page<ChongwuView> page =new Query<ChongwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChongwuVO> selectListVO(Wrapper<ChongwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwuVO selectVO(Wrapper<ChongwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwuView> selectListView(Wrapper<ChongwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwuView selectView(Wrapper<ChongwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
