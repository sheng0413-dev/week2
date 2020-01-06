<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
<link rel="stylesheet" href="css/css.css">
</head>
<body>
	<form action="all" method="post">
		<input name="pageNum" value="1" type="hidden">
		编号:<input name="id" value="${m.id}">   
		关键字:<input name="guan" value="${m.guan}">
		描述:<input name="maio" value="${m.maio}">
		公司名称:<input name="name" value="${m.name}">
		主营产品:<input name="zhu" value="${m.zhu}">
		地址:<input name="address" value="${m.address}"><br>
		注册资本（万元）:<input name="minben" value="${m.minben}">---<input name="maxben" value="${m.maxben}" >
		成立时间:<input name="mincheng" value="${m.mincheng}" type="date">---<input name="maxcheng" value="${m.maxcheng}" type="date">
		年检日期:<input name="minnain" value="${m.minnain}" type="date">---<input name="maxnain" value="${m.maxnain}" type="date">
		<input type="submit">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本（万元）</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${page.list}" var="l">
		<tr>
			<td>${l.id}</td>
			<td>${l.guan}</td>
			<td>${l.guan}</td>
			<td>${l.name }</td>
			<td>${l.zhu }</td>
			<td>${l.address }</td>
			<td>${l.ben }</td>
			<td>
				<fmt:formatDate value="${l.cheng}" pattern="yyyy-MM-dd"/>
			</td>
			<td><fmt:formatDate value="${l.nain}" pattern="yyyy-MM-dd"/></td>
			<td>${l.checks}</td>
			<td>${l.bei}</td>
			<td>年检审核</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="15">
				<input type="button" onclick="getPage(1)" value="首页">
				<input type="button" onclick="getPage(${page.pageNum-1})" value="上一页">
				<input type="button" onclick="getPage(${page.pageNum+1})" value="下一页">
				<input type="button" onclick="getPage(${page.pages})" value="尾页">
			</td>
		</tr>
	</table>
	<script type="text/javascript">
		function getPage(p){
			$("[name=pageNum]").val(p);
			$("form").submit();
		}
	</script>
</body>
</html>