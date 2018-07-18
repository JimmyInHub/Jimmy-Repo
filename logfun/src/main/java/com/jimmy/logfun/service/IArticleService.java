package com.jimmy.logfun.service;

import java.util.List;

import com.jimmy.logfun.Utils.ResultInfo;
import com.jimmy.logfun.domain.Article;

public interface IArticleService {
	ResultInfo save(Article article);
	Article get(Long id);
	
	
	List<Article> find(int pageSize);
	
	/**
	 * @author Jimmy
	 * @date   2018/7/18
	 * @return list
	 * @desvription 查询概述
	 */
	List<Article> querySummary();
}
