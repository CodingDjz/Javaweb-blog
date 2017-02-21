function formCheck() {
	var title = document.getElementById("title").value;
	var category = document.getElementById("category").value;
	var file = document.getElementById("article_file").value;
	var author = document.getElementById("author").value;
	if(title==""){
		alert("请输入文章名称");
		return false;
	}else if(category==-1){
		alert("请选择文章类型");
		return false;
	}else if(file ==""){
		alert("未上传内容文件");
		return false;
	}else if(author ==""){
		alert("请输入文章作者");
		return false;
	}
}