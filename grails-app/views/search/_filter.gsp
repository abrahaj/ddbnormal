<div class="list">
  <g:each in="${results}" status="i" var="item">
    <div class="row">
      <div class="col-md-6 col-lg-6">
      
        <g:link controller="item" action="show" params="[id: "${item.id}", itemTitle: urlTitle(text:item.title)]">
          ${item.title}
        </g:link>
        <br />
        ${item.subtitle}
      </div>
      <div class="col-md-6 col-lg-6">
        <g:if test="${item.thumbnail}">
          <img src="${request.contextPath}${item.thumbnail}" />
        </g:if>
      </div>
    </div>
  </g:each>

</div>
<div class="paginateButtons">
  <util:remotePaginate total="${resultsTotal}" update="filteredList" action="filter" params="[query:query]" pageSizes="[5: '5 on Page',10:'10 on Page',15:'15 on Page']" />
</div>
