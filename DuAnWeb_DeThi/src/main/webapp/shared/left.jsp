<%-- 
    Document   : Left
    Created on : Sep 28, 2023, 12:08:09 PM
    Author     : KHOACNTT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card mb-3">
    <h3 class="card-header">Category</h3>  
        <ul class="list-group list-group-flush">
            <c:forEach var="l" items="${listLoai}">
            <li class="list-group-item">
                <a href="san-pham?catId=${l.MaLoai}">${l.TenLoai}</a></li>
            </c:forEach>
        </ul>   
</div>
