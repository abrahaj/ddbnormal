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
package al.norm.ddb.model
/**
 * CONSIDER!!! the Utils section of Grails is probably not best place to put "own" models. Should consider /src/groovy/
 * Model for the Address representation of Items or anyother object
 * Fields have been left to Strings as postalCode can be found in the form D-77xxx or house numbers can be found in the form 22a etc.
 * @author arb
 */
class Address {
    String street
    String houseIdentifier
    String postalCode
    String city
    String country
}