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
				<th>이름</th>
				<th>위치</th>
				<th>연봉</th>
				<th>경로</th>
				<th>규모</th>
				<th>설명</th>
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