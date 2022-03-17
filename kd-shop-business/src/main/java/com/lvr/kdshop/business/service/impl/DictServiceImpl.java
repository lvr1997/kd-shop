package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.DictMapper;
import com.lvr.kdshop.business.service.DictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("dictService")
public class DictServiceImpl implements DictService {

	@Resource
	private DictMapper dictMapper;

}
