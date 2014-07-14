/*
 * Copyright (C) 2014 A Brahaj (ARB-FIZ)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package al.norm.ddb

import al.norm.ddb.model.search.SearchParameter
import al.norm.ddb.model.search.SearchResponse
import grails.plugins.rest.client.RestBuilder
import org.apache.commons.logging.LogFactory
import org.codehaus.groovy.grails.web.json.JSONObject
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType

/**
 * Handle the search operations
 * @author arb
 *
 */
class SearchService {
    
    def transactional=false
    
    def grailsApplication
    
    def apiconsumerService
    
    private static final log = LogFactory.getLog(this)

    /**    
     * Handle a search operation
     * @param searchParam
     * @return Map
     */
    def doSearch(SearchParameter searchParam, String searchMethod="search/") {
        log.info "DoSearch for " + searchParam.toQueryString()
        
       def response = apiconsumerService.doGet(grailsApplication.config.ddb.backend.url.toString()+searchMethod+searchParam.toQueryString())
       SearchResponse sr = new SearchResponse(response.json)
       def map=[numberOfResults:sr.numberOfResults, results:sr.results]
       return map
    }
    
    def doEntitySearch(SearchParameter searchParam){
      return doSearch(searchParam,"entities")
    }
}
