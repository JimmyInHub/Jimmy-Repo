package com.jimmy.logfun.mapper;

import java.util.List;

import com.jimmy.logfun.domain.Article;

public interface ArticleMapper {
	void save(Article article);
	Article get(Long id);
	List<Article> find();
}
