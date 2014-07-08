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
    /** 
     * ItemProperties are technical information. They are missing on some objects
     * No exception handling is needed
     */
    if (item.properties){
      this.properties=new ItemProperties(item.properties)
    }else {
      this.properties=null
    }
    /**
     * Indexing Profile are technical information. They are missing on some objects
     * No exception handling is needed
     */
    if (item."indexing-profile"){
      this.indexingProfile=new ItemIndexingProfile(item."indexing-profile")
    }else{
      this.indexingProfile=null
    }

    /**
     * Indexing Preview 
     * 
     */
    if (item.preview){
      this.preview = new ItemPreview(item.preview)
    }else{
      this.preview=null
    }

    if (item.view){
      this.view = new ItemView(item.view.item)
    }else{
      this.view=null
    }
    
    this.metadataRecord= item."metadata-record"

    this.providerInfo=new ItemProvider(item."provider-info")

    item.binaries.binary.each{
      binaries.add(new ItemBinary(it))
    }
  }
}
