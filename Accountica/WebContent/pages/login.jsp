<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
<div class="col-sm-12 col-md-12 col-lg-12">
	<div class="col-sm-4 col-md-4 col-lg-4"></div>
	<div class="col-sm-4 col-md-4 col-lg-4">
		<div class="form-horizontal well">
		
		<s:form action="loginFrm" method="post">
			<p class="f_legend">Customer Login</p>
		    <s:textfield name="loginId" key="global.LoginId" class="form-control" placeholder="Username" aria-describedby="basic-addon1" />
		    <s:textfield name="password" key="global.Password" class="form-control" placeholder="Username" aria-describedby="basic-addon1" />
		    <s:select list="{'AccountHolder','Admin'}" name="loginType" key="global.LoginType" class="form-control"/>
			<s:submit value="login" key="global.submit" align="center" />
		</s:form>
			<div class="">
				<a href="createAccount">Register</a>
			</div>
		</div>
	</div>
	<div class="col-sm-4 col-md-4 col-lg-4"></div>
</div>
<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>

