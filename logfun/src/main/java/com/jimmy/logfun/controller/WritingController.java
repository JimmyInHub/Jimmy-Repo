package com.jimmy.logfun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jimmy.logfun.domain.Article;
import com.jimmy.logfun.service.IArticleService;
import com.jimmy.logfun.utils.ResultInfo;

@Controller
@RequestMapping("/writing")
public class WritingController {

	@Autowired
	private IArticleService articleService;

	@RequestMapping("/index")
	public String index(Model model) {
		List<Article> articles= articleService.querySummary();
		model.addAttribute("articles", articles);
		return "/writing/index";
	}
	
	@RequestMapping("/editor")
	public String editor() {
		return "/writing/editor";
	}

	@RequestMapping("/list")
	@ResponseBody
	public List<Article> list() {
		return articleService.find(10);
	}

	@RequestMapping("/save")
	@ResponseBody
	public ResultInfo save(Article article) {
		return articleService.save(article);
	}

}
