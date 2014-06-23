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

class Item {
  
  ItemProperties properties
  //TODO
  ItemEDM edm
  
  ItemIndexingProfile indexingProfile
  
  ItemPreview preview
  
  ItemView view
  
  String metadataRecord
  
  ItemProvider providerInfo
  
  List<ItemBinary> binaries=[]
  
  public Item(JSONObject item){
    this.properties=new ItemProperties(item.properties)
    this.indexingProfile=new ItemIndexingProfile(item."indexing-profile")
    this.preview = new ItemPreview(item.preview)
    this.view = new ItemView(item.view.item)
    this.metadataRecord= item."metadata-record"
    this.providerInfo=new ItemProvider(item."provider-info")
    item.binaries.binary.each{
      binaries.add(new ItemBinary(it))
    }
  }
}
