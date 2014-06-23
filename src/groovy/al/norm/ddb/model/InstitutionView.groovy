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
 * Model for the InstitutionView
 * ToConsider the email structure is not a string from cortex (as of June 2014) and any attempt for population might result in a strange string
 * Example of population for this object: 
 * itemview=[
            name: institution.name,
            logo: institution.logo,
            address: new Address(
                                street:institution.locations.location.address.street, 
                                houseIdentifier:institution.locations.location.address.houseIdentifier,postalCode:institution.locations.location.address.postalCode ,city: institution.locations.location.address.city,country: institution.locations.location.address.country
                                ),
            geoLocation: new Geocode(
                                latitude:institution.locations.location.geocode.latitude.toDouble(),
                                longitude:institution.locations.location.geocode.longitude.toDouble()
                                ),
            uri: institution.uri,
            description: institution.description,
            email: institution.email,
            sector:institution.sector]
 * @author arb
 */
class InstitutionView {
    String name
    String logo
    Address address
    Geocode geoLocation
    String uri
    String description
    //The structure of email in the XML is not clear
    String email
    String sector

    InstitutionView(){
    }

}
