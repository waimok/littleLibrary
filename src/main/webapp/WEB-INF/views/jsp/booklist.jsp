<c:import url="/WEB-INF/views/common/layout.jsp" charEncoding="UTF-8">

    <c:param name="body">
        <b>Book List</b>
        <table
            class="table">
            <tr>
            	<th>&nbsp;</th>                
                <th>TITLE</th>
                <th>AUTHOR</th> 
                <th>ISBN</th>               
                <th>BORROWER</th>
            </tr>
            <c:forEach items="${books}" var="book">
                <tr> 
                	<td></td>                    
                    <td>${book.title}</td>
                    <td>${book.title}</td>  
                    <td>${book.title}</td>                  
                    <td><a href="<c:url value='/person/${book.person.id}' />"><c:out value="${book.person.name}" /></a></td>
                </tr>
            </c:forEach>
        </table>
    </c:param>
</c:import>

