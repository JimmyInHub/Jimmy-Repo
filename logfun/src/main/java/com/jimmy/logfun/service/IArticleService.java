package com.jimmy.logfun.service;

import java.util.List;

import com.jimmy.logfun.domain.Article;
import com.jimmy.logfun.utils.ResultInfo;

/**
 * @description: 文章接口
 * @fileName: IArticleService.java
 * @date: 2018/7/27 15:41
 * @author: Jimmy
 * @version: v1.0
 */
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

	/**
	 * @description 根据id删除文章
	 * @param  id
	 * @date: 2018/7/27 15:26
	 * @author: Jimmy
	 */
	ResultInfo delete(Long id);

}
