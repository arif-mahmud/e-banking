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
<style type="text/css">
	.nopadding-left{
		padding-left: 0px;
	}
	.nopadding-right{
		padding-right:0px;
	}
	.nopadding{
		padding: 0px;
	}
	.padding10{
		padding: 10px;
	}
	.nomargin{
		margin:0px;
	} 
</style>
</head>
<body>
	<header class="navbar navbar-static-top bs-docs-nav">
		<tiles:insertAttribute name="header" />
	</header>
	
	<div class="row">
		<div class="col-sm-12 col-md-8 col-lg-3 nopadding-right">
			<tiles:insertAttribute name="menu"/>	
		</div>
		<div class="col-sm-12 col-md-12 col-lg-9 nopadding-left">
			<tiles:insertAttribute name="content"/>	
		</div>		
	</div>

	<footer role="contentinfo" class="footer_container bs-docs-footer">
		<tiles:insertAttribute name="footer"/>	
	</footer>
</body>
</html>