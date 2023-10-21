package com.zucodu.security

import grails.plugin.springsecurity.userdetails.GormUserDetailsService
import grails.plugin.springsecurity.userdetails.GrailsUserDetailsService
import org.springframework.dao.DataAccessException
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailService extends GormUserDetailsService {

    @Override
    UserDetails loadUserByUsername(String username, boolean loadRoles) throws UsernameNotFoundException, DataAccessException {
        println ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"
        return null
    }

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        println ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>:::"
        return null
    }
}
