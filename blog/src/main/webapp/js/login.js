function loginCheck() {
	var account = document.getElementById("account").value;
	var password = document.getElementById("password").value;
	if (account == ""|| password == "") {
		alert("用户名和密码不能为空");
		return false;
	}
}