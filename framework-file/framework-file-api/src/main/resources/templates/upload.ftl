<!DOCTYPE html>
<html>
<body>

<h1>Spring Boot file upload example</h1>

<form method="POST" action="fdfs_upload" enctype="multipart/form-data">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input type="file" name="file" /><br/><br/>
    <input type="submit" value="Submit" />
</form>

</body>
</html>