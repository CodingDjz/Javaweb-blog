package djz.app.blog.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import djz.app.blog.model.Article;

public interface ArticleService extends BaseService<Article> {
	public void saveArticleContentFile(MultipartFile contentFile, HttpServletRequest request);

	public void setArticleValue(Article article);
}
