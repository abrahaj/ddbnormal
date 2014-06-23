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

import java.text.SimpleDateFormat
import org.codehaus.groovy.grails.io.support.UrlResource

/**
 * DDB has restricted direct access to images
 * If ones wants to use the images, he needs to authenticate for each image request.
 * This is a simple image wrapper which wrapps the authentication and requests the images. 
 * @author arb
 *
 */
class ImagewrapperController {

    def apiconsumerService
    def index() {
        def cacheExpiryInDays = 10
        def backendUrl = grailsApplication.config.ddb.backend.url.toString()
        def backendApiKey = grailsApplication.config.ddb.backend.apikey
        
        def imageUrl = new UrlResource(backendUrl+"binary/"+ params.filename+"?oauth_consumer_key="+backendApiKey).getURL()
        byte[] bytes = imageUrl.getBytes() 
        response.setHeader("Cache-Control", "max-age="+cacheExpiryInDays * 24 * 60 *60)
        response.setHeader("Expires", formatDateForExpiresHeader(cacheExpiryInDays).toString())
        response.setHeader("Content-Disposition", "inline; filename=" + params.filename.tokenize('/')[-1])
        response.setContentType("image/jpeg")
        response.setContentLength(bytes.length)
        response.outputStream << bytes
    }
    /**
     *  Format RFC 2822 date
     *  @parameters daysfromtoday, how many days from today do you want the date to be shifted
     *  @return date
     */
    private def formatDateForExpiresHeader(daysfromtoday=4){
        def tomorrow= new Date()+daysfromtoday
        String pattern = "EEE, dd MMM yyyy HH:mm:ss Z"
        SimpleDateFormat format = new SimpleDateFormat(pattern, Locale.US)
        String tomorrowString = String.format(Locale.US, '%ta, %<te %<tb %<tY %<tT CET', tomorrow)
        Date date = format.parse(tomorrowString)
        return date
    }
}
