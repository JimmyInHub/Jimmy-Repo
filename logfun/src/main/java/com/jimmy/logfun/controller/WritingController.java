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

/**
 * @description: 文章控制器
 * @fileName: WritingController.java
 * @date: 2018/7/27 15:42
 * @author: Jimmy
 * @version: v1.0
 */
@Controller
@RequestMapping("/writing")
public class WritingController {

	@Autowired
	private IArticleService articleService;

	/**
	 * @description 跳转到首页
	 * @date: 2018/7/27 15:24
	 * @author: Jimmy
	 */
	@RequestMapping("/index")
	public String index(Model model) {
		List<Article> articles= articleService.querySummary();
		model.addAttribute("articles", articles);
		model.addAttribute("firstArticle", articles.get(0));
		return "/writing/index";
	}

	/**
	 * @description 跳转到编辑页面
     * @param id 文章id
	 * @date: 2018/7/27 15:24
	 * @author: Jimmy
	 */
	@RequestMapping("/editor")
	public String editor(Long id, Model model) {
		if(id != null){
            model.addAttribute("id", id);
        }
	    return "/writing/editor";
	}

	/**
	 * 查看指定文章
     * @param id
	 * @return article
	 * @author jimmy
	 * @date 2018年7月27日
	 */
	@RequestMapping("/get")
	@ResponseBody
	public Article get(Long id) {
		return articleService.get(id);
	}

    /**
     * 查看文章列表
     * @return
     * @author jimmy
     * @date 2018年7月27日
     */
    @RequestMapping("/list")
    @ResponseBody
    public List<Article> list() {
        return articleService.find(10);
    }

	/**
	 * 保存文章
	 * @param article
	 * @return
	 * @author jimmy
	 * @date 2018年7月27日
	 */
	@RequestMapping("/save")
	@ResponseBody
	public ResultInfo save(Article article) {
		return articleService.save(article);
	}

	/**
	 * 删除文章
	 * @param id
	 * @return
	 * @author jimmy
	 * @date 2018年7月27日
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResultInfo delete(Long id) {
		return articleService.delete(id);
	}

}
