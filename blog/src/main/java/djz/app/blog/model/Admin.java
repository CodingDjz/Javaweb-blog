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

	// @Column(name = "level")
	private Integer level = 0;

}
