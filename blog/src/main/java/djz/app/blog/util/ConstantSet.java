package djz.app.blog.util;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListener;
import org.omg.CORBA.PUBLIC_MEMBER;

public class ConstantSet {
	// 常用路径
	public static final String WEB_INF_PATH = File.separator + "WEB-INF";
	public static final String ARTICLE_FILE_PATH = WEB_INF_PATH + File.separator + "article";
	// 提示信息
	public static final String LOGIN_SUCCESS = "登录成功！";
	public static final String LOGIN_FAILD = "登录失败！";
	public static final String REGIST_SUCCESS = "注册成功！";
	public static final String REGIST_FAILD = "注册失败！";
	// 结果代码
	public static final String RESULT_CODE = "result_code";
	public static final int SUCCESS_CODE = 1;
	public static final int FAILD_CODE = 2;
	public static final int UNKNOWN_CODE = 0;
	//结果消息
	public static final String RESULT_MSG = "result_msg";
	public static final String ACCOUNT_PWD_ERR="用户名或密码错误";
	public static final String PLEASE_LOGIN_FIRST="请先进行登录";
	// JSP View
	public static final String ACTION_RESULT_VIEW = "action_result";
	public static final String LOGIN_VIEW = "login";
	public static final String REGIST_VIEW = "regist";
	public static final String ADMIN_ACTION_VIEW = "admin_action";
	// Category mapping
	public static final int CATEGORY_UNKNOWN = 0;
	public static final int CATEGORY_TECHNOLOGY = 1;
	public static final int CATEGORY_ENTERTAINMENT = 2;
	public static final int CATEGORY_STORY = 3;
	public static final int CATEGORY_FEELING = 4;
}
