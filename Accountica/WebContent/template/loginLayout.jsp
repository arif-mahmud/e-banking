<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title><tiles:insertAttribute name="title" ignore="false" /></title>
<link rel="stylesheet" type="text/css"
	href="media/bootstrap/css/bootstrap.min.css" />
<link href="media/css/style.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="media/css/blue.css" />
<script type="text/javascript" src="media/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="media/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<header class="navbar navbar-static-top bs-docs-nav">
		<tiles:insertAttribute name="header" />
	</header>
	
	<div class="row">
		<tiles:insertAttribute name="content"/>	
	</div>

	<footer role="contentinfo" class="footer_container bs-docs-footer">
		<tiles:insertAttribute name="footer"/>	
	</footer>
</body>
</html>