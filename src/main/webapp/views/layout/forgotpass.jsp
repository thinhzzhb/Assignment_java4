<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V1</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="../util/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../util/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../util/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../util/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="../util/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../util/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="../util/css/util.css">
	<link rel="stylesheet" type="text/css" href="../util/css/main.css">

<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="../util/images/img-01.png" alt="IMG">
				</div>

				<form action="forgot" method="post" class="login100-form validate-form">
					<span class="login100-form-title">
						Forgot Password
					</span>

<%--					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">--%>
<%--						<input class="input100" type="text" name="username" placeholder="username">--%>
<%--						<span class="focus-input100"></span>--%>
<%--						<span class="symbol-input100">--%>
<%--							<i class="fa fa-envelope" aria-hidden="true"></i>--%>
<%--						</span>--%>
<%--					</div>--%>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="email" name="email" id="email" placeholder="Email">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>
					
					<div class="container-login100-form-btn">
						<button id="sendBtn" class="login100-form-btn">
							Send
						</button>
					</div>
				<span><h6 class="text-danger" id="messageReturn"><strong></strong></h6></span>
				</form>
			</div>
		</div>
	</div>


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$('#sendBtn').click(function (){
			$('#messageReturn').text('');
			var email = $('#email').val();
			var formData = {'email':email};
			$.ajax({
				url: 'forgot',
				type: 'POST',
				data: formData
			}).then(function (data){
				$('#messageReturn').text('Password has been return. Please check your email');
				setTimeout(function () {
					window.location.href = 'http://localhost:8080/Assignment_java4_thinhlhph19459/video/index';
				}, 5*1000)
			}).fail(function (error){
				$('#messageReturn').text('Your email is not correct');
			});
		});

	</script>
<!--===============================================================================================-->	
	<script src="../util/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="../util/vendor/bootstrap/js/popper.js"></script>
	<script src="../util/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="../util/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="../util/vendor/tilt/tilt.jquery.min.js"></script>
	<script >
		$('.js-tilt').tilt({
			scale: 1.1
		})
	</script>
<!--===============================================================================================-->
	<script src="../util/js/main.js"></script>

</body>
</html>