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

	/**
	 * @description: 保存/修改文章内容
	 * @param: article 文章实体
	 * @return: ResultInfo 结果信息
	 * @date: 2018/8/1 14:32
	 * @author: Jimmy
	 */
	ResultInfo save(Article article);

	/**
	 * @description: 通过id获取一篇文章
	 * @param: id
	 * @return: Article
	 * @date: 2018/8/1 14:32
	 * @author: Jimmy
	 */
	Article get(Long id);
	
	/**
	 * @description: 获取文章列表
	 * @param: pageSize 单页数量
	 * @return: list
	 * @date: 2018/8/1 14:33
	 * @author: Jimmy
	 */
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
