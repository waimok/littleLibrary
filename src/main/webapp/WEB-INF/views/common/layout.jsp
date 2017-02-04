<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
    href='${pageContext.request.contextPath}/css/bootstrap/bootstrap.min.css'>
<script type="text/javascript"
    src='${pageContext.request.contextPath}/js/jquery-1.7.1.min.js'></script>
<title>${param.title}</title>

</head>

<body>
	<ul class="nav nav-pills">
	  <li class="active">
	    <a href="${pageContext.request.contextPath}">Home</a>
	  </li>
	  <li class="active">
	  	<a href="${pageContext.request.contextPath}/personlist">Person List</a>
	  </li>
	  <li class="active">
	  	<a href="${pageContext.request.contextPath}/booklist">Book List</a>
	  </li>
	</ul>
	
    <div class="container">
        <div class="content">
            <div class="row">
                <h1>
                    <a href='${pageContext.request.contextPath}'>Little Library</a>
                </h1>
            </div>
            <div class="row">${param.body}</div>
        </div>
        <footer>
            <p></p>
        </footer>
    </div>
</body>
</html>