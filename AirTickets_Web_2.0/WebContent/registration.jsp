<jsp:include page="header.jsp"/>

<script src="js/checkPwd.js"></script>

<h3>Sign up</h3>

<div class="well well-sm span4">	
	<form class="form-horizontal form-group-sm" role="form" name="registration" action="Registration" method="post" style="display:block" onsubmit="return validate()">
		<div class="form-group">
			<label class="col-sm-2 control-label" for="email">Email</label>
			<div class="col-sm-10">
				<input type="email" class="form-group" id="email" placeholder="Email" name="email">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="dateOfBirth">Date of birth</label>
			<div class="col-sm-10">
				<input type="datetime-local" class="form-group" id="dateOfBirth" placeholder="MM/DD/YYYY" name="dateOfBirth">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-group" id="password" placeholder="Password" name="password">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password2">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-group" id="password2" placeholder="Retype your password" name="password2" onkeyup="checkPass(); return false;">
			</div>
			<span id="confirmMessage" class="confirmMessage col-md-5 control-label"></span> 
		</div>
		<input class="col-sm-offset-1 btn btn-primary btn-sm" type="submit" value="Submit">
		<input type="button" class="btn btn-danger btn-sm" value="Cancel" onclick="window.location='login.jsp';" >	
	</form>
</div>
	
<jsp:include page="bottom.jsp"/>