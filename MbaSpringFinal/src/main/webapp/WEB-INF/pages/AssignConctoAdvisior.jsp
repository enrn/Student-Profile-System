<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Assign Concentration to Advisor</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
   
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      
      .page-header{
      	margin-top:-40px;
      }
      .row.content {height:auto;}
    }
  </style>
</head>
<body>

  
<div class="container-fluid text-center">
  <div class="row content">
    <div class="col-sm-2">
      
    </div>
    <div class="col-sm-8">
    <div class="page-header text-center" style="margin-top:00px; ">
	
	<img src="<c:url value="resources/images/header.jpg"/>" width=100%/>
	  </div>
	<div class="col-sm-3" style="text-align:left; padding-left: 0px">
      
  <c:import url="/resources/images/QuickLinks.jsp" />
    </div>
    <div class="col-sm-7">
      <h2>Assign Concentration to Advisor</h2>
    <form class="form-horizontal" action="/saveConcenToAdvisor" method="POST">
    <div class="form-group">
    
    <label class="control-label col-sm-4" for="Choose_Advisor">Choose Concentration:</label>
    <div class="col-sm-8">
      <select name="Concentration_id">
       <option >select Concentration</option>
       <c:forEach items="${concentration}" var="conc">
      <option value="${conc.concentration_name}">${conc.concentration_name}</option>
      </c:forEach>
      </select>
    </div>
  </div>
  
  <div class="form-group">
    <label class="control-label col-sm-4" for="Concentration">Choose Advisor:</label>
    <div class="col-sm-8">
     <select name="Advisor_id">
       <option >select Advisor</option>
       <c:forEach items="${advisor}" var="adv">
      <option value="${adv.first_name}&nbsp;&nbsp;${adv.last_name}">${adv.first_name}&nbsp;&nbsp;${adv.last_name}</option>
      </c:forEach>
      </select>
    </div>
  </div>
  
  
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-8">
      <input type="submit" name="submit" value="Add" class="btn btn-default">
    </div>
  </div>
        
    </form>
     
      </div>
      <div class="col-sm-2">
      
    </div>
    
    </div>
    <div class="col-sm-2">
          </div>
  </div>
</div>

</body>
</html>

