<div class="col-xs-12 col-sm-3 no-margin sidebar narrow">
  <!-- ========================================= Keywords FILTER ========================================= -->
  <div class="widget">
    <h1>Product Filters</h1>
    <div class="body bordered">

      <div class="category-filter">
        <h2><g:message code="ddbnormal.item.keywords" /></h2>
        <hr>
        <ul>
          <g:each in="${item.view.retrieveKeywords()}">
            <li><input checked="checked" class="le-checkbox" type="checkbox"><i class="fake-box"></i> <label> ${it}
            </label></li>
          </g:each>
        </ul>
        <div class="price-range-holder">
          <span class="filter-button"> <a href="#">Search</a>
          </span>
        </div>
      </div>
      <!-- /.category-filter -->


    </div>
    <!-- /.body -->
  </div>
  <!-- /.widget -->
  <!-- ========================================= Keywords : END ========================================= -->
  <!-- ========================================= CATEGORY TREE ========================================= -->
  <div class="widget accordion-widget category-accordions">
    <h1 class="border">Hierarchy Tree</h1>
    <div class="accordion">
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" href="#collapseOne">  ${item.view.getTitle() }</a>
        </div>
        <g:if test="${item.parents }">
        <div id="collapseOne" class="accordion-body collapse in">
          <div class="accordion-inner">
            <ul>
              <li>
                <div class="accordion-heading">
                  <a href="#collapseSub2" data-toggle="collapse">tablet</a>
                </div>
                <div id="collapseSub2" class="accordion-body collapse in">
                  <ul>
                    <li>
                      <div class="accordion-heading">
                        <a class="" href="#collapseSub3" data-toggle="collapse">Three Level Accordion</a>
                      </div>
                      <div style="height: auto;" id="collapseSub3" class="accordion-body collapse in">
                        <ul>
                          <li><a href="#">PDA</a></li>
                          <li><a href="#">notebook</a></li>
                          <li><a href="#">mini notebook</a></li>
                        </ul>
                      </div> <!-- /.accordion-body -->
                    </li>
                  </ul>
                </div>
              </li>
            </ul>
          </div>
          <!-- /.accordion-inner -->
        </div>
        </g:if>
      </div>
      <!-- /.accordion-group -->

      

    </div>
    <!-- /.accordion -->
  </div>
  <!-- /.category-accordions -->
  <!-- ========================================= CATEGORY TREE : END ========================================= -->

</div>