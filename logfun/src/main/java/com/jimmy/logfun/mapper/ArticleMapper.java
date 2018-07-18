package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.Article;

public interface ArticleMapper {
	void save(Article article);
	Article get(Long id);
	
	/**
	 * @author Jimmy
	 * @date   2018/7/18
	 * @return list
	 * @desvription 查询概列表
	 */
	List<Article> find();
}
