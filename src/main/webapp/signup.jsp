<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Signup Page</title>
<%@include file="components/allcss.jsp" %>
</head>
<body>
<%@include file="components/signupnav.jsp" %>
<div class="container p-5">
  <div class="row">
    <div class="col-md-4 offset-md-4">
      <div class="card paint-card">
        <div class="card-body">
          <p class="fs-4 text-center">User Register</p>

          <form action="user_register" method="post">
          <div class="mb-3">
              <label class="form-label">Full Name</label>
              <input required name="name" type="text" class="form-control" >
            </div>
            <div class="mb-3">
              <label class="form-label">Email address</label>
              <input required name="email" type="email" class="form-control">
            </div>

            <div class="mb-3">
              <label class="form-label">Password</label>
              <input required name="password" type="password" class="form-control">
            </div>

            <button type="submit" class="btn bg-info text-white col-md-12">Signup</button>
          </form>
          <br> Already have an account<a herf="index.jsp" class="click">login</a>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>