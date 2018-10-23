package org.zerock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.StoreVO;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/store/*")
@Log4j
public class StoreController {
	
	@PostMapping("/new")
	public String add(@RequestBody StoreVO vo) {
		
		log.info("--------------------------");
		log.info(vo);
		
		return "success";
	}

	@GetMapping("/sample")
	public StoreVO get() {
		StoreVO vo = new StoreVO();
		vo.setSno(1);
		vo.setSname("김밥천국");
		vo.setLat(37.123);
		vo.setLng(123.4567);
		
		return vo;
	}
}
