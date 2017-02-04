   
<c:import url="/WEB-INF/views/common/layout.jsp" charEncoding="UTF-8">

    <c:param name="body">
    	<b>Book</b>
        <table
            class="table">
            <tr>
                <th>ID</th>
                <th>TITLE</th>
                <th>AUTHOR</th>                
                <th>ISBN</th>
                <th>BORROWER</th>
            </tr>
            
            <tr> 
            	<td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.author}</td>
                <td>${book.isbn}</td>
                <td>
                	<a href="<c:url value='/person/${book.person.id}' />"><c:out value="${book.person.name}" /></a>
                </td>
            </tr>

        </table>
    </c:param>
</c:import>

