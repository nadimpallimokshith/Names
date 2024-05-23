<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Names</title>
</head>
<body>
    <h1>Names</h1>
    <ul>
        <% 
            // Fetch the list of names from the request attribute
            List<String> names = (List<String>) request.getAttribute("names");
            if (names != null) {
                for (String name : names) { 
        %>
                    <li><%= name %></li>
        <% 
                }
            } else {
        %>
            <li>No names found.</li>
        <% 
            }
        %>
    </ul>
</body>
</html>
