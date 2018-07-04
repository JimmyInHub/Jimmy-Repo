package com.jimmy.logfun.service;

import java.util.List;

import com.jimmy.logfun.Utils.ResultInfo;
import com.jimmy.logfun.domain.Article;

public interface IArticleService {
	ResultInfo save(Article article);
	Article get(Long id);
	List<Article> find(int pageSize);
}
