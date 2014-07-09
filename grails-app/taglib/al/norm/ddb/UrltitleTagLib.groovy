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
/**
 * 
 * Clean the title of an Item from HTML Tags and replaces all spaces with -
 * Used in generating title urls
 * 1st replaceAll remove all html tags
 * 2nd replaceAll replace spaces with dash -
 * 3rd replaceAll remove all characters which are not unicode
 * Might be refactored to have a TagLib which retrieves only unicode chars and then this other which is used for URL-Titles
 * @author arb
 *
 */
class UrltitleTagLib {
    static defaultEncodeAs = 'html'
    def urlTitle = { attrs, body ->
        out << attrs.text.replaceAll("<(.|\n)*?>", '').replaceAll(" ","-").replaceAll("[^\\p{L}\\p{N}-]+", '')
        
    }
}
