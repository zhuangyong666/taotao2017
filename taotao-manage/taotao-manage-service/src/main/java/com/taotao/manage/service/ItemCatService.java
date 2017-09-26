package com.taotao.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manage.mapper.TbItemCatMapper;
import com.taotao.manage.pojo.TbItemCat;
import com.taotao.manage.pojo.TbItemCatExample;
import com.taotao.manage.pojo.TbItemCatExample.Criteria;

@Service
public class ItemCatService {
	@Autowired
	private TbItemCatMapper tbItemCatMapper;

	public List<TbItemCat> listItemCat(Long parentId) {
		TbItemCatExample tbItemCatExample = new TbItemCatExample();
		Criteria criteria = tbItemCatExample.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		return tbItemCatMapper.selectByExample(tbItemCatExample);
	}
}
