<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<script type="text/javascript">
	$(document).ready(function() {
		document.f.username.focus();
	});
</script>
	
<div class="container">	
	
	<form id="loginForm" class="form-login" name='f' action='${pageContext.request.contextPath}/login'	method='POST'>
		
		<h2 class="form-signin-heading">Please sign in</h2>
		
		<c:if test="${param.error}">
			<b>Login Failed</b>
		</c:if>

		<label for="inputEmail" class="sr-only">Email address</label>
		<input name="username" value="" type="email" id="inputEmail" class="form-control"  placeholder="Email address" />
		
		<label for="inputPassword" class="sr-only">Password</label>
		<input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" />
		
		<div class="checkbox">
         	<label>
				<input type="checkbox" name="remember-me" value="remember-me"> Remember Me
			</label>
		</div>
		
		<button name="submit" type="submit" class="btn btn-lg btn-primary btn-block">Log In</button>
		
		<input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}" />
		
	</form>

</div> <!-- /container -->