package com.gwsc.common.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gwsc.common.service.CommonService;

@Controller
@RequestMapping("/")
public class CommonWeb {
	@Resource(name="commonService")
	CommonService service;
}
