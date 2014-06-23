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
package al.norm.ddb.model.item

import org.codehaus.groovy.grails.web.json.JSONObject;

class ItemProvider {
  List domains=[]
  String name
  String parentId
  String uri
  String email
  String collection
  String itemId
  String itemIdType
  String id
  String ddbId
  String logo
  String longitude
  String latitude
  String state
  ItemProvider parents
  
  public ItemProvider(JSONObject provider){
   
    provider."provider-domains".each{
      this.domains.add(it)
    }
    
    this.name=provider."provider-name"
    this.parentId=provider."provider-parent-id"
    this.uri=provider."provider-uri"
    this.email=provider."provider-email"
    this.collection=provider."provider-collection"
    this.itemId=provider."provider-item-id"
    this.itemIdType=provider."provider-id-type"
    this.id=provider."provider-id"
    this.ddbId=provider."provider-ddb-id"
    this.logo=provider."provider-logo"
    this.longitude=provider."provider-longitude"
    this.latitude=provider."provider-latitude"
    this.state=provider."provider-state"
    if (provider."provider-parents"){
      this.parents=new ItemProvider(provider."provider-parents"."provider-info")
    }
  }
}
