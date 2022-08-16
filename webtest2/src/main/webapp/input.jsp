<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="PrintServlet" method="get">
		氏名： <input type="text" name="name" value="-"><br>
		<hr>
		性別：<br> <input type="radio" name="seibetsu" value="male" checked>男性
		<input type="radio" name="seibetsu" value="female">女性<br>
		<hr>
		趣味(複数回答可)：<br> <input type="checkbox" name="pleasure"
			value="reading">読書 <input type="checkbox" name="pleasure"
			value="traveling">旅行 <input type="checkbox" name="pleasure"
			value="shopping">ショッピング <input type="checkbox"
			name="pleasure" value="sports">スポーツ<br>
		<hr>
		年齢区分： <select name="age" size="3">
			<option value="teens">10~19</option>
			<option value="twenties">20~29</option>
			<option value="thirties">30~39</option>
			<option value="fourties">40~49</option>
			<option value="fifties">50~59</option>
			<option value="other">その他</option>
		</select><br>
		<hr>
		<input type="submit" value="送信"> <input type="reset"
			value="クリア">
	</form>
</body>
</html>