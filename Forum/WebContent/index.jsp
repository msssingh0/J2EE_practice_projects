<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.Query" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<title>Insert title here</title>
</head>
<body class="container">
<div>
<h1> Welcome to forum</h1>
<span class="pull-right">
<form action="postQuestion.jsp"> <button class="btn btn-primary" type="submit">Post a Question</button></form>
</span>
<br><br>
</div>
<div><%String[][] question = new Query().selectAll(); %></div>
<div>
<%! int current;int init; %>
<%
	if(request.getParameter("no")==null)
		current =0;
	else{
		current=Integer.parseInt(request.getParameter("no"));
		if(current>=question.length || current<-1)
			current=0;
	}
	try{
		  init=Integer.parseInt(request.getParameter("no1"));
		  if(init>=question.length || init<-1)
				init=0;
	}
	catch(Exception e){
		 init=0;
		 if(init>=question.length || init<-1)
				init=0;
	}
%>    
</div>

<div class="panel panel-danger">
 	<div class="panel-heading">
 	<%=question[current][1] %>
 	
 		</div><%! String[] answer; %>
  		<div class="panel-body">
  		<div>
  
     		 <%answer=new Query().answer(current);%>
	   		 <ul class="list-group">
	   		 	<form class="well" action="Page">
 					 <div class="form-group">
 				     <label for="answer">Post your Answer</label>
    				 <textarea class="form-control" rows="3" name="ans"></textarea>
    				 <input type="hidden" value=<%=current %> name="id">
 					 <button class="btn btn-success" name=button value="post" type="submit">submit</button>
 					 </div>
	   		  	</form>
	   		 <%for(int j=0;j<answer.length;j++) {%>
	   		 	<li class="list-group-item">
	   				<%=answer[j]%>
	   			</li>
	   		 </ul>
	   		 <%} %>
   		 </div>
	</div> 
</div>
<div>
	


</div>
<div>
	<nav aria-label="Page navigation">
  		<ul class="pagination">
    <li><%int i1=init-5; %>
      <a href="/Forum/index.jsp?no1=<%=i1%>&no=<%=i1%>" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
      
      
    </li>
    <%int count=1;
    for(int k=init;k<question.length;k++,init++){ 
    	if(count++>5){ count =1;break; }
    %>
    <li><a  href="/Forum/index.jsp?no=<%=k%>"><%=k+1%></a></li>
    <%} %>
    <li>
      <a href="/Forum/index.jsp?no1=<%=init%>&no=<%=init%>" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
   	 </li>
 	 </ul>
	</nav>
</div>
</body>
</html>