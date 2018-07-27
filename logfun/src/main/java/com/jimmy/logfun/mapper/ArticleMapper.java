package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.Article;
import org.springframework.stereotype.Component;

/**
 * @description: 文章映射mapper接口
 * @fileName: ArticleMapper.java
 * @date: 2018/7/27 15:58
 * @author: Jimmy
 * @version: v1.0
 */
@Component
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

	/**
	 * @description: 更新文章
	 * @param: article
	 * @date: 2018/7/27 16:27
	 * @author: Jimmy
	 */
	void update(Article article);
}
