<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="panel panel-default"
	style="overflow: scroll; padding-left: 0px;">
		<s:form action="SearchInactiveAccount" method="post">
				<div class="col-sm-12 col-md-12 col-lg-12">
				Account Name: <input type="text" class="form-control" id="" value="<s:property value="accname" />" name="accname">
			</div>
			<div class="col-lg-3 col-md-6 col-sm-12">
				Phone: <input type="text" class="form-control" id=""
					value="<s:property value="contact" />" name="contact">
			</div>
			<div class="col-lg-3 col-md-6 col-sm-12">
				<button class="btn btn-primary" value="Search" id="" type="submit">Search</button>
			</div>
		</s:form>
	</div>
<script type="text/javascript">
	$(document).ready(function() {

	});
</script>

