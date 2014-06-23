// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination

// The ACCEPT header will not be used for content negotiation for user agents containing the following strings (defaults to the 4 major rendering engines)
grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [ // the first one is the default format
    all:           '*/*', // 'all' maps to '*' or the first available format in withFormat
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// Legacy setting for codec used to encode data with ${}
grails.views.default.codec = "html"

// The default scope for controllers. May be prototype, session or singleton.
// If unspecified, controllers are prototype scoped.
grails.controllers.defaultScope = 'singleton'

// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside ${}
                scriptlet = 'html' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        // filteringCodecForContentType.'text/html' = 'html'
    }
}


grails.converters.encoding = "UTF-8"
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart=false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false

// configure passing transaction's read-only attribute to Hibernate session, queries and criterias
// set "singleSession = false" OSIV mode in hibernate configuration after enabling
grails.hibernate.pass.readonly = false
// configure passing read-only to OSIV session by default, requires "singleSession = false" OSIV mode
grails.hibernate.osiv.readonly = false

environments {
  development {
    grails.logging.jul.usebridge = true
    grails.config.locations = [
      "file:${userHome}/.grails/${appName}.properties"
    ]
  }
  production {
    grails.logging.jul.usebridge = false
    grails.config.locations = [
      "file:"+ System.getProperty('catalina.base')+ "/grails/app-config/${appName}.properties"
    ]
  }
  test {
    grails.logging.jul.usebridge = true
    grails.config.locations = [
      "file:${userHome}/.grails/${appName}.properties"
    ]
  }
  println "| Read properties from " + grails.config.locations[0]
}

// log4j configuration
log4j = {

  // The appenders define the output method of the loggings
  appenders {
    console name: "console", threshold: org.apache.log4j.Level.INFO, layout:pattern(conversionPattern: "%-5p: %d{dd:MM HH:mm:ss} %c: %m%n")
   }

  // The root logger defines the basic log level and to which appenders the logging is going
  environments {
    development {
      root { info "console", "ddbnext-info", "ddbnext-warn", "ddbnext-error", "stacktrace" }
    }
    production {
      root { info "ddbnext-info", "ddbnext-warn", "ddbnext-error", "stacktrace" }
    }
    test {
      root { info "console", "ddbnext-info", "ddbnext-warn", "ddbnext-error", "stacktrace" }
    }
  }

  // This part can be used to filter out all loggings that are not interesting
  environments {
    development {
      warn "org.codehaus.groovy.grails", // only warnings or errors from grails
          "grails.plugin", // only warnings or errors from grails.plugins
          "org.grails.plugin", // only warnings or errors from plugins
          "org.springframework", // only warnings or errors from spring
          "net.jawr", // only warnings or errors from jawr
          "org.apache.catalina.core", // only warnings or errors from catalina core
          "org.apache.coyote.http11.Http11Protocol", // only warnings or errors from Http11Protocol
          "org.apache.catalina.startup.ContextConfig" // only warnings or errors from ContextConfig

      error "grails.util.GrailsUtil" // hide deprecated warnings on startup
    }
    production {
      //Don't filter messages in production
    }
    test {
      warn "org.codehaus.groovy.grails", // only warnings or errors from grails
          "grails.plugin", // only warnings or errors from grails.plugins
          "org.grails.plugin", // only warnings or errors from plugins
          "org.springframework", // only warnings or errors from spring
          "net.jawr", // only warnings or errors from jawr
          "org.apache.catalina.core", // only warnings or errors from catalina core
          "org.apache.coyote.http11.Http11Protocol", // only warnings or errors from Http11Protocol
          "org.apache.catalina.startup.ContextConfig" // only warnings or errors from ContextConfig

      error "grails.util.GrailsUtil" // hide deprecated warnings on startup
    }
  }

}


grails.plugins.twitterbootstrap.fixtaglib = true
grails.plugins.twitterbootstrap.defaultBundle = 'bundle_bootstrap'
grails.plugins.remotepagination.max=20
grails.plugins.remotepagination.enableBootstrap=true

//If you do not have a key, you have no reason to be here
ddb.backend.apikey=""
