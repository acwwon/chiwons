<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>its main page</title>
</head>
<body>
	
	<h3>Hi it's chiwon's page</h3>
	<h2>test Version</h2>
	
	<table>
		<thead>
			<tr>
				<th>�̸�</th>
				<th>��ġ</th>
				<th>����</th>
				<th>���</th>
				<th>�Ը�</th>
				<th>����</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${jobData.name}</td>
				<td>${jobData.location}</td>
				<td>${jobData.pay}</td>
				<td>${jobData.route}</td>
				<td>${jobData.size}</td>
				<td>${jobData.discription}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>