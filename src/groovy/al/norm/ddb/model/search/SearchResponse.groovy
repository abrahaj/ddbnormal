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

import al.norm.ddb.model.Entity
import al.norm.ddb.model.Facet
import al.norm.ddb.model.item.ItemView;

import org.codehaus.groovy.grails.web.json.JSONObject

class SearchResponse {
  /**
   * Total number of results
   */
  Integer numberOfResults

  /**
   * A list of items
   */
  List<ItemView> results=[]

  List<Facet> facets

  List<Entity> entities

  String correctedQuery

  List<String> highlightedTerms

  String randomSeed

  /**
   * Do Population of the object here
   * @param searchResponse
   */
  public SearchResponse(JSONObject searchResponse) {

    this.numberOfResults = searchResponse.numberOfResults

    searchResponse.results.docs[0].each{
      results.add(new ItemView(it,true))
    }
    
    

  }
}
