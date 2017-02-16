package djz.app.blog.serviceimpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicInterface2;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import djz.app.blog.dao.BaseDao;
import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;
import djz.app.blog.util.ConstantSet;

@Service("articleService")
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {

	String contentPath;

	@Resource(name = "articleDao")
	public void setDao(BaseDao<Article> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	@Override
	public Serializable save(Article entity) {
		return super.save(entity);
	}

	/**
	 * 保存上传的文章内容文件到WEB-INF的article下
	 * 
	 * @param contentFile
	 * @param request
	 * @return
	 */
	public void saveArticleContentFile(MultipartFile contentFile, HttpServletRequest request) {
		if (contentFile == null) {
			return;
		}
		// 这里没有/blog
		String relativePath = ConstantSet.ARTICLE_FILE_PATH + File.separator + contentFile.getOriginalFilename();
		// E:\tomcat\apache-tomcat-7.0.72\webapps\blog\
		String realPath = request.getServletContext().getRealPath(relativePath);
		File file = new File(realPath);
		// ！web项目取到的是eclipse所在目录！
		// System.out.println(System.getProperty("user.dir"));
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
			contentFile.transferTo(file);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		contentPath = relativePath;
	}

	public void setArticleValue(Article article) {
		Date date = new Date();
		article.setCreateTime(date);
		article.setContentPath(contentPath);
	}

	/**
	 * 通过文章id获取文章内容
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public String getContentById(String id) {
		Article article = findById(Long.parseLong(id));
		String content = null;
		if (article != null) {
			System.out.println(article.getContentPath());
			content = getContentByPath(article.getContentPath());
		}
		return content;
	}

	private String getContentByPath(String contentPath) {

		System.out.println("user.dir:" + System.getProperty("user.dir"));
		System.out.println("catalina.home:" + System.getProperty("catalina.home"));
		System.out.println("location:" + this.getClass().getResource("/").getPath());
		contentPath = System.getProperty("catalina.home") + "\\webapps\\blog" + contentPath;

		File file = new File(contentPath);
		boolean a = file.exists();
		FileReader fileReader = null;
		String content = "";
		try {
			fileReader = new FileReader(file);
			int index = 0;
			
			while ((index = fileReader.read()) != -1) {
				content += (char)index;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return content;
	}
}
