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

class ItemBinary {
  String category
  String primary
  String position
  String path
  String mimetype
  String name3
  String name2
  String name
  
  public ItemBinary(JSONObject binary){
  this.category=binary."@category"
  this.primary=binary."@primary"
  this.position=binary."@position"
  this.path=binary."@path"
  this.mimetype=binary."@mimetype"
  this.name3=binary."@name3"
  this.name2=binary."@name2"
  this.name=binary."@name"
  }
}
