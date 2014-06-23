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
/**
 * Representation of Item Properties
 * These fields are retrieved through /items/id/aip 
 * @author arb
 *
 */
class ItemProperties {
  String itemId
  String ingestId
  String ingestDate
  String cortexType

  public ItemProperties(JSONObject item){
    this.itemId=item."item-id"
    this.ingestId=item."ingest-id"
    this.ingestDate=item."ingest-date"
    this.cortexType=item."cortex-type"
  }
}
