package com.jimmy.logfun.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.jimmy.logfun.mapper.ArticleMapper;
import com.jimmy.logfun.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.jimmy.logfun.domain.Article;

import com.jimmy.logfun.service.IArticleService;
import com.jimmy.logfun.utils.ResultInfo;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: 文章接口实现类
 * @fileName: ArticleService.java
 * @date: 2018/7/27 15:39
 * @author: Jimmy
 * @version: v1.0
 */
@Service
@Transactional
public class ArticleServiceImpl implements IArticleService {
	
	@Autowired
	private ArticleMapper articleMapper;

	/**
	 * @description: 保存文章
	 * @param: article
	 * @date: 2018/7/27 16:24
	 * @author: Jimmy
	 */
	@Override
	public ResultInfo save(Article article) {
		ResultInfo resultInfo = new ResultInfo();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		String updateTime = sdf.format(new Date());
        article.setUpdateTime(updateTime);
        article.setUpdateName("Jimmy");

		//第一次保存时,创建时间和更新时间一致
        Long id = article.getId();
        if(id == null){
            article.setStatus(Constants.STATUS_VALID);
            article.setCreateTime(updateTime);
            article.setCreateName("Jimmy");
            article.setAuthor("Jimmy");
            articleMapper.save(article);
        }else{
            articleMapper.update(article);
        }
		return resultInfo;
	}

	/**
	 * @description: 根据id获取文章
	 * @param: id
	 * @date: 2018/7/27 16:25
	 * @author: Jimmy
	 */
	@Override
	public Article get(Long id) {
		return articleMapper.get(id);
	}

	/**
	 * @description: 查询列表
	 * @param: pageSize分页信息
	 * @return: list
	 * @date: 2018/7/27 16:25
	 * @author: Jimmy
	 */
	@Override
	public List<Article> find(int pageSize) {
		
		//分页功能
		PageHelper.startPage(0, pageSize);
		List<Article> list = articleMapper.find();
		return list;
	}

	/**
	 * @description: 查询所有文章
	 * @date: 2018/7/27 16:26
	 * @author: Jimmy
	 */
	@Override
	public List<Article> querySummary() {
		return articleMapper.find();
	}

	/**
	 * @description: 根据id删除文章
	 * @param: id
	 * @date: 2018/7/27 16:27
	 * @author: Jimmy
	 */
	@Override
	public ResultInfo delete(Long id) {
		ResultInfo ri = new ResultInfo();
		if(id == 0L){
			ri.fail("未获取到文章ID");
			return ri;
		}

		//	根据id查询数据
		Article article = articleMapper.get(id);
		if(article == null){
			ri.fail("未查询到文章");
			return ri;
		}

		//	状态设为无效
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
		String updateTime = sdf.format(new Date());
		article.setStatus(Constants.STATUS_VOID);
		article.setUpdateName("jimmy");
		article.setUpdateTime(updateTime);
		articleMapper.update(article);
		return ri;
	}

}
