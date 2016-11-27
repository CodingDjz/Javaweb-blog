package djz.app.blog.service;

import java.util.ArrayList;

import djz.app.blog.model.Article;

public interface ArticleService {
	public void saveArticle(Article article);

	public void deleteArticle(Long articleId);

	public void updateArticle(Article article);

	public Article queryArticle(Long articleId);

	public ArrayList<Article> getAllArticles();
}
