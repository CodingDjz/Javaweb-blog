function getContent() {
	var content = document.getElementById('content');
	var article_content = document.getElementById('article_content').value;
	console.log(article_content);
	content.innerHTML = marked(article_content);
	
}

function initContent(){
	var rendererMD = new marked.Renderer();
	marked.setOptions({
		renderer : rendererMD,
		gfm : true,
		tables : true,
		breaks : false,
		pedantic : false,
		sanitize : false,
		smartLists : true,
		smartypants : false
	});
	var markdownString = document.getElementById('article_content').value;
	marked.setOptions({
		highlight : function(code) {
			return hljs.highlightAuto(code).value;
		}
	});

	document.getElementById('content').innerHTML = marked(markdownString);
	
}
