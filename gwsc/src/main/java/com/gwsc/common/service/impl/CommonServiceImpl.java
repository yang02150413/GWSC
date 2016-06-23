package com.gwsc.common.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gwsc.common.dao.CommonDAO;
import com.gwsc.common.service.CommonService;

@Service("commonService")
public class CommonServiceImpl implements CommonService {
	@Resource(name="commonDAO")
	CommonDAO commonDAO;
	
}
