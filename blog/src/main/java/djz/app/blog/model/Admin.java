package djz.app.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 管理员信息
 * 
 * @author Djz
 *
 */
// @Entity
// @Table(name = "admin")
public class Admin {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "account", nullable = false)
	private String account;
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "level")
	private Integer level;
	
	

}
