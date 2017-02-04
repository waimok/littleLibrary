<c:import url="/WEB-INF/views/common/layout.jsp" charEncoding="UTF-8">

    <c:param name="body">
        <b>Person List</b>
        <table
            class="table">
            <tr>
            	<th>&nbsp;</th>                
                <th>NAME</th>
                <th>PHONE</th> 
                <th>EMAIL</th>               
                <th>Lent Out Book</th>
            </tr>
            <c:forEach items="${persons}" var="person">
                <tr> 
                	<td></td>                    
                    <td>${person.name}</td>
                    <td>${person.phone}</td>  
                    <td>${person.email}</td>                  
                    <td>
	                    <c:forEach var="book" items="${person.books}">
	                    	<a href="<c:url value='/book/${book.id}' />"><c:out value="${book.title}" /></a>	        				
	    				</c:forEach>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:param>
</c:import>

