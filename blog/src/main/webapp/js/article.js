function mdView(){
	var mdView = document.getElementById('mdDiv');
	var content = document.getElementById('article_content').value;
	console.log(content);
	mdView.innerHTML = marked(content);
	
}

