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

import al.norm.ddb.model.item.Item
import grails.plugins.rest.client.RestResponse

class ItemService {
  def transactional=false

  def grailsApplication

  def apiconsumerService

  def retrieveItem(String id) {
    
    String backendUri = grailsApplication.config.ddb.backend.url.toString()
    
    RestResponse response = apiconsumerService.doGet(backendUri+"items/"+id+"/aip?c=1")
    Item item = new Item(response.json)
    return item
  }
}
