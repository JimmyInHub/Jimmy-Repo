package com.jimmy.logfun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jimmy.logfun.Utils.ResultInfo;
import com.jimmy.logfun.domain.Article;
import com.jimmy.logfun.service.IArticleService;

@Controller
@RequestMapping("/writing")
public class WritingController {

	@Autowired
	private IArticleService articleService;

	@RequestMapping("/index")
	public String index() {
		return "/writing/index";
	}
	
	@RequestMapping("/editor")
	public String editor() {
		return "/writing/editor";
	}

	@RequestMapping("/list")
	public List<Article> list() {
		return articleService.find(10);
	}

	@RequestMapping("/save")
	public ResultInfo save(Article article) {
		return articleService.save(article);
	}

}
