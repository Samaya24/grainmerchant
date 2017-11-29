<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

	Create New Account
	
	<sf:form id="signupForm" action="${pageContext.request.contextPath}/createaccount" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>Email</td>
				<td><sf:input type="text" path="username" name="username"/><br/>
					<sf:errors path="username" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><sf:input id="password" type="password" path="password" name="password"/><br/>
					<sf:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input id="cPassword" type="password" name="confirmpassword"/><br/>
					<small id="passMatchText"></small>
				</td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><sf:input type="text" path="firstname" name="firstname"/><br/>
					<sf:errors path="firstname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><sf:input type="text" path="lastname" name="lastname"/><br/>
					<sf:errors path="lastname" cssClass="error" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Create"/></td>
			</tr>
		</table>
	</sf:form>