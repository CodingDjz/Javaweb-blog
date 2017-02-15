function parseMDtoHTML() {
	document.getElementById("article_content").innerHTML = marked($(article_content));

}