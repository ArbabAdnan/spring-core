<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> springmvc search  </title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
     <link href="<c:url value="/resources/css/style.css" />">
    <script src="<c:url value="/resources/js/script.js"/>"></script>
  </head>
  <body>
  
  <img alt="my image" src="<c:url value="/resources/image/profile.png"/>">
    <div class="container">
    	
    		<div class="card mx-auto mt-5 bg-primary" style="width: 50%">
    			<div class="card-body PY-5">
    				<h3 class="text-center text-white">MY SEARCH</h3>
    				<form action="search" class="mt-3">
    					<div class="form-group">
    					<input type="text" name="querybox"
    					placeholder="Enter your keyword" class="form-control">
    					
    					</div>
    					<div class="container text-center mt-2">
    						<button class="btn btn-outline-light">search</button>
    					</div>
    					
    				</form>
    				
    			</div>
    		</div>
    
    </div>
    
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
  </body>
</html>