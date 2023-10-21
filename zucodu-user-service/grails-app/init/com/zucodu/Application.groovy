package com.zucodu

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import groovy.transform.CompileStatic
import grails.plugins.metadata.*
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@CompileStatic
//@EnableDiscoveryClient
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
