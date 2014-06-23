class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?(.$format)?"{
			constraints {
				// apply constraints here
			}
		}
		"/search/"{
			controller="search"
			action="list"
		}

		"/$itemTitle.$id"{
			controller="item"
			action="show"
			constraints {
				id(matches:/[A-Z0-9]{32}/)
			}
		}
		"/binary/$filename**" {
			controller="imagewrapper"
			action="index"
		}

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
