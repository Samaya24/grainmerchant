<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<tr>
		<th>ID</th>
		<th>Email</th>
		<th>Item Name</th>
		<th>Rate</th>
		<th>Quality</th>
		<th>Quantity</th>
		<th>Availability</th>
		<th>Time left</th>
	</tr>
	<c:forEach var="grain" items="${grains}">
		<tr>
			<td>${grain.grainid}</td>
			<td>${grain.username}</td>
			<td>${grain.itemname}</td>
			<td>${grain.rate}</td>
			<td>${grain.quality}</td>
			<td>${grain.quantity}</td>
			<td>${grain.isavailable}</td>
			<td>${grain.timeleft}</td>
		</tr> 	
	</c:forEach>
</table>