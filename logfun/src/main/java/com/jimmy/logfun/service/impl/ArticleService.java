package com.jimmy.logfun.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jimmy.logfun.Utils.ResultInfo;
import com.jimmy.logfun.domain.Article;
import com.jimmy.logfun.mapper.ArticleMapper;
import com.jimmy.logfun.service.IArticleService;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	private ArticleMapper articleMapper;
	
	@Override
	public ResultInfo save(Article article) {
		ResultInfo resultInfo = new ResultInfo();
		Article newArticle = new Article();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		String updateTime = sdf.format(new java.util.Date());
		
		//第一次保存时,创建时间和更新时间一致
		newArticle.setCreateTime(updateTime);
		newArticle.setUpdateTime(updateTime);
		newArticle.setTitle(article.getTitle());
		newArticle.setContent(article.getContent());
		newArticle.setAuthor("Jimmy");
		articleMapper.save(newArticle);
		return resultInfo;
	}

	@Override
	public Article get(Long id) {
		return articleMapper.get(id);
	}

	@Override
	public List<Article> find(int pageSize) {
		
		//分页功能
		PageHelper.startPage(0, pageSize);
		List<Article> list = articleMapper.find();
		return list;
	}

}
