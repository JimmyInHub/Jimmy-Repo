package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.Article;

public interface ArticleMapper {
	/**
	 * @author Jimmy
	 * @date   2018/7/18
	 * @desvription 保存文章
	 */
	void save(Article article);

	/**
	 * @author Jimmy
	 * @date   2018/7/18
	 * @return article 实体
	 * @desvription 根据id获取文章
	 */
	Article get(Long id);
	
	/**
	 * @author Jimmy
	 * @date   2018/7/18
	 * @return list
	 * @desvription 查询概列表
	 */
	List<Article> find();
}
