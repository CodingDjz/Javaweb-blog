package djz.app.blog.service;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import djz.app.blog.model.Article;

public interface ArticleService extends BaseService<Article> {
	public String saveArticleContentFile(MultipartFile contentFile);
}
