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

class SearchController {

    def searchService

    def list = {
        SearchParameter searchParams = new SearchParameter();
        if (params.query) {
            //Cleaning here?
            searchParams.query= params.query
        }
        searchParams.rows = Math.min(params.rows ? params.int('rows') : 10, 100)
        Map searchResponse = searchService.doSearch(searchParams)

        render(view:'list', model: [results: searchResponse.results, resultsTotal: searchResponse.numberOfResults])
    }

    def filter = {
        SearchParameter searchParams = new SearchParameter();

        searchParams.query= "Albanien"
        searchParams.rows = Math.min(params.rows ? params.int('rows') : 10, 100)
        searchParams.offset = Math.min(params.offset ? params.int('offset') : 0, 30000)
        Map searchResponse = searchService.doSearch(searchParams)
        render(template: 'filter', model: [results: searchResponse.results, resultsTotal: searchResponse.numberOfResults])
    }
}
