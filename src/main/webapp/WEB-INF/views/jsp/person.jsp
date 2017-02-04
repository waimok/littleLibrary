   
<c:import url="/WEB-INF/views/common/layout.jsp" charEncoding="UTF-8">

    <c:param name="body">
    	<b>Person</b>
        <table
            class="table">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>PHONE</th>                
                <th>EMAIL</th>
                <th>Lent Out Book</th>
            </tr>
            
            <tr> 
            	<td>${person.id}</td>
                <td>${person.name}</td>
                <td>${person.name}</td>
                <td>${person.name}</td>
                <td>
                	<c:forEach var="book" items="${person.books}">
                    	<a href="<c:url value='/book/${book.id}' />"><c:out value="${book.title}" /></a>	        				
    				</c:forEach>
                </td>
            </tr>

        </table>
    </c:param>
</c:import>

