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

import al.norm.ddb.model.Institution
import org.codehaus.groovy.grails.web.json.JSONObject

class ItemView {
  /* Group retrieved in the Search Response */ 
  String id
  String title
  String subtitle
  String media
  String thumbnail
  String view
  String label
  String latitude
  String longitude
  String preview
  String match
  String category
  String type

  /* Addition  from item aip| no id in this case*/
  String identifier
  String rights
  String metadataRights
  String origin
  String viewers
  
  ItemLicense license
  
  Institution institution
  
  Map<String,List<ItemField>> fields=[:]
  
  public ItemView(JSONObject item){
    
    this.identifier=item.identifier
    
    this.title=item.title
    
    this.subtitle=item.subtitle
    
    this.media=item.media
    
    this.thumbnail=item.thumbnail
    
    this.view=item.view
    
    this.label=item.label
    
    this.latitude=item.latitude
    
    this.longitude=item.longitude
    
    this.preview=item.preview
    
    this.match=item.match
    
    this.category=item.category
    
    this.type=item.type
    
    this.rights=item.rights
    this.metadataRights=item."metadata-rights"
    this.origin=item.origin
    this.viewers=item.viewers
    
    this.license = new ItemLicense(item.license)
    
    this.institution = new Institution(item.institution)

    
    /** Fields population below */
    item.fields.each{
      ArrayList fieldsList =[]
      it.field.each{
        fieldsList.add(new ItemField(it))
      }
      this.fields.put(it."@usage",fieldsList)
    }
  }
  
  public ItemView(JSONObject item, Boolean forSearch=1){
    
    this.id=item.id
    
    this.title=item.title
    
    this.subtitle=item.subtitle
    
    this.media=item.media
    
    this.thumbnail=item.thumbnail
    
    this.view=item.view
    
    this.label=item.label
    
    this.latitude=item.latitude
    
    this.longitude=item.longitude
    
    this.preview=item.preview
    
    this.match=item.match
    
    this.category=item.category
    
    this.type=item.type
  }
}
