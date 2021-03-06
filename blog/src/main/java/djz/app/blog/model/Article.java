package djz.app.blog.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "article")
public class Article {
	@Id // 修饰主键
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO) // 自动增长
	private Long id;
	@Temporal(TemporalType.DATE)
	@Column(name = "create_time", nullable = false)
	private Date createTime;
	@Column(name = "title")
	private String title;
	@Column(name = "content_path")
	private String contentPath;
	@Column(name = "category")
	private Integer category;
	@Column(name = "original")
	private Boolean original;
	@Column(name = "author")
	private String author;

	public Article() {
		super();
	}

	public Article(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContentPath() {
		return contentPath;
	}

	public void setContentPath(String contentPath) {
		this.contentPath = contentPath;
	}

	public Integer getCategory() {
		return category;
	}

	public void setCategory(Integer category) {
		this.category = category;
	}

	public Boolean getOriginal() {
		return original;
	}

	public void setOriginal(Boolean original) {
		this.original = original;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
