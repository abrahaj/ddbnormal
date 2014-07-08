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

class ItemEDM {
//  RDF: {
//    Aggregation: {
//    @about: "http://www.deutsche-digitale-bibliothek.de/edm/obj87110545_DE-14"
//    aggregatedCHO: {
//    @resource: "http://www.deutsche-digitale-bibliothek.de/item/PZ6IIQX6GXHEBXUKZHJ6Q5I2BM7LLSL3"
//    }-
//    dataProvider: [2]
//    0:  "Deutsche Fotothek"
//    1:  {
//    @resource: "S7B4CBSR4H6QJKRZVAXRHP7CI5IG5TBM"
//    }-
//    -
//    isShownAt: {
//    @resource: "http://www.deutschefotothek.de/obj87110545.html"
//    }-
//    isShownBy: {
//    @resource: "http://fotothek.slub-dresden.de/fotos/df/st/0099000/df_st_0099276.jpg"
//    }-
//    object: {
//    @resource: "http://fotothek.slub-dresden.de/thumbs/df_st_0099276.jpg"
//    }-
//    provider: "Deutsche Digitale Bibliothek"
//    rights: [2]
//    0:  {
//    @resource: "http://www.europeana.eu/rights/rr-f/"
//    }-
//    1:  {
//    @resource: "http://creativecommons.org/publicdomain/zero/1.0/"
//    }-
//    -
//    $: " "
//    }-
//    WebResource: {
//    @about: "http://www.deutschefotothek.de/obj87110545.html"
//    rights: {
//    @resource: "http://www.deutsche-digitale-bibliothek.de/lizenzen/rv-fz/"
//    }-
//    type: {
//    @resource: "http://ddb.vocnet.org/medientyp/mt002"
//    }-
//    format: "image/jpeg"
//    $: " "
//    }-
//    Concept: [4]
//    0:  {
//    @about: "2VXMWHA3ARKFGGI35EGFZWV6WSMSBG7I"
//    prefLabel: "Fotografie"
//    $: " "
//    }-
//    1:  {
//    @about: "6VAMEJYKPDW63V3L4GZVRPKDKIOS3DOT"
//    prefLabel: "Foto"
//    $: " "
//    }-
//    2:  {
//    @about: "PGCPHIFUIR565ZSCDTLYAL44I377LMA5"
//    prefLabel: "Fotos"
//    $: " "
//    }-
//    3:  {
//    @about: "SXHECCEQ4TJEFL27EME7WFWMBAQXE6JC"
//    prefLabel: "Technik-Katalog"
//    $: " "
//    }-
//    -
//    Agent: {
//    @about: "KEOBRVYCG3M6PQ6TIX23RT47LJ3MD4HH"
//    prefLabel: "Stoedtner, Franz (Lichtbildverlag) (Fotograf)"
//    wasPresentAt: {
//    @resource: "YMQSIZZEVWNEDZUNID64BJAXYNG6CAFS"
//    }-
//    $: " "
//    }-
//    ProvidedCHO: {
//    @about: "http://www.deutsche-digitale-bibliothek.de/item/PZ6IIQX6GXHEBXUKZHJ6Q5I2BM7LLSL3"
//    currentLocation: {
//    @resource: "http://d-nb.info/gnd/4012995-0"
//    }-
//    hasMet: {
//    @resource: "YMQSIZZEVWNEDZUNID64BJAXYNG6CAFS"
//    }-
//    type: "IMAGE"
//    creator: "Stoedtner, Franz (Lichtbildverlag) (Fotograf)"
//    description: "L�nderkunde | Ethnographie, Europa | Albanien, Zigeunerin aus Albanien"
//    identifier: "http://www.deutschefotothek.de/obj87110545.html"
//    date: "1900"
//    subject: [4]
//    0:  {
//    @resource: "2VXMWHA3ARKFGGI35EGFZWV6WSMSBG7I"
//    }-
//    1:  {
//    @resource: "6VAMEJYKPDW63V3L4GZVRPKDKIOS3DOT"
//    }-
//    2:  {
//    @resource: "PGCPHIFUIR565ZSCDTLYAL44I377LMA5"
//    }-
//    3:  {
//    @resource: "SXHECCEQ4TJEFL27EME7WFWMBAQXE6JC"
//    }-
//    -
//    title: "Zigeunerin aus Albanien"
//    $: " "
//    }-
//    Place: {
//    @about: "http://d-nb.info/gnd/4012995-0"
//    lat: "51.02874"
//    long: "13.73593"
//    prefLabel: "Dresden"
//    $: " "
//    }-
//    Event: {
//    @about: "YMQSIZZEVWNEDZUNID64BJAXYNG6CAFS"
//    hasType: {
//    @resource: "http://terminology.lido-schema.org/lido00012"
//    }-
//    P11_had_participant: {
//    @resource: "KEOBRVYCG3M6PQ6TIX23RT47LJ3MD4HH"
//    }-
//    occuredAt: [2]
//    0:  {
//    @resource: "http://ddb.vocnet.org/zeitvokabular/dat00015"
//    }-
//    1:  {
//    @resource: "http://ddb.vocnet.org/zeitvokabular/dat00019"
//    }-
//    -
//    $: " "
//    }-
//    TimeSpan: [3]
//    0:  {
//    @about: "http://ddb.vocnet.org/zeitvokabular/dat00015"
//    notation: "time_61900"
//    $: " "
//    }-
//    1:  {
//    @about: "http://ddb.vocnet.org/zeitvokabular/dat00019"
//    notation: "time_61975"
//    $: " "
//    }-
//    2:  {
//    @about: "#/event/obj87110545_c/timeBeginEnd"
//    begin: "1900"
//    end: "1900"
//    $: " "
//    }-
//    -
//    $: " "
//    }
}
