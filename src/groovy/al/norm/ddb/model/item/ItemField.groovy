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

class ItemField {
  String resource
  String id
  String name
  List value=[]

  public ItemField(JSONObject field){
    this.resource=field."@resource"
    this.id=field."@id"
    this.name=field.name
    
    /* Values might come in a list or as a string delimited by | or ; or , */
    if (field.value instanceof String ){
      value=field.value.split(/\||;|,/);
    }else if(field.value instanceof JSONObject){
      field.value.each{
        value.add(it)
      }
    }else{
      value=field.value
    }
  }

  public List toList(){
    return [this.id,this.name,this.resource,this.__getValue()]
  }

  public List __getValue(){
    return this.value

  }
}
