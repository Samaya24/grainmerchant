<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<script type="text/javascript">

	function onLoad(){
		/* $("#password").keyup(checkPassMatch); */
		$("#cPassword").keyup(checkPassMatch);
		$("#createForm").submit(checkPassMatch);
	}

	function checkPassMatch(){
		var password = $("#password").val();
		var cPassword = $("#cPassword").val();
		
		if(password == cPassword){
			$("#passMatchText").text("Password matches");
			$("#passMatchText").addClass("valid");
			$("#passMatchText").removeClass("invalid");
			return true;
		}
		else{
			$("#passMatchText").text("Password doesn't match!");
			$("#passMatchText").addClass("invalid");
			$("#passMatchText").removeClass("valid");
			return false;
		}
	}
	
	
	$(document).ready(onLoad);
	
</script>