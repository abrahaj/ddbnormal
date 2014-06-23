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
package al.norm.ddb.model.search

class SearchParameter {
    /**
     * Term(s) to be searched. Must be URL-encoded and compliant to the SOLR Query Syntax.
     * Default search value is "*:*"
     */
    String query
    
    /**
     * Number of the first entry of the result
     */
    Integer offset
    
    /**
     * Count of results entries to be shown in total
     */    
    Integer rows
    
    /**
     * REPEATABLE Name of a facet which will be taken into account. Only facets which are supplied via a query parameter will be included into results
     */
    String facet
    
    /**
     * Repeatable Defines a search query on the given facet name. Allows to reduce the result by certain values of facets.
     */
    String facet_name
    
    /**
     * The amount of documents a facet must exceed to be included in the result set. 
     */
    
    Integer minDocs
    
    /**
     * Limits the number of values of a facet to the given amount
     * has to be passed as "facet.limit"
     */

    Integer facetLimit
    
    /**
     * Defines the sorting order (). Requires the query parameter, otherwise the sort is always random_<seed>
     * Cannot be enum since the random_seed is dynamic
     */
    String sort
    /**
     * Returns a string which contains the params as their should be represented in an URL for search
     * @return
     */
    public String toQueryString() {
        StringBuffer str=new StringBuffer ("?")
        if (query) {
            query=java.net.URLEncoder.encode(query,"UTF-8")
            str.append("query="+query);
        }else {
            str.append("query=*:*")
        }
        if (rows) {
            str.append("&rows="+rows);
        }
        if (offset) {
            str.append("&offset="+offset);
        }
        return str.toString()
        
    }
}
