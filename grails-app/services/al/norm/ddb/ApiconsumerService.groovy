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

import al.norm.ddb.exceptions.ServiceUnavailableException
import grails.plugins.rest.client.RestBuilder
import org.springframework.http.HttpStatus

class ApiconsumerService {
  
 
  def transactional=false

  def grailsApplication

  /**
   * TODO improve the exception throwing
   * Utilizes the grails.plugins.rest.client.RestBuilder
   * Wrapped in this method due to error handling mainly
   * @param url
   * @return RestResponse
   */
  def doGet(String url){
    def rest = createRestBuilder()
    log.info "String URL "+ url+createAuthString()
    def response = rest.get(url+createAuthString())
    if (response.getStatusCode()!=HttpStatus.OK) {
      response.exceptionMessage= response.getMessage()
      log.error "Failed retrieving a resource successfully"
       throw new ServiceUnavailableException([status: response.getStatusCode(),
        message: "Invoking service failed"],
      "Invoking service failed")
    }
  return response
  }

  private createAuthString(){
    return "&oauth_consumer_key="+grailsApplication.config.ddb.backend.apikey
  }
  
  private createRestBuilder() {
      log.info "proxy use" + grailsApplication.config.proxy.use
    if (grailsApplication.config.proxy.use==true) {
      log.info  "Found Proxy"
      return new RestBuilder(connectTimeout:1000, readTimeout:20000, proxy:['proxy.fiz-karlsruhe.de':grailsApplication.config.proxy.port])
    }
    return new RestBuilder()
  }
}
