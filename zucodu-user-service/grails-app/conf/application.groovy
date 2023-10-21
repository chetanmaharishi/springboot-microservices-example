grails.plugin.springsecurity.filterChain.chainMap = [
        //Stateless chain
        [
                pattern: '/**',
                filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'
        ],

        //Traditional, stateful chain
        [
                pattern: '/stateful/**',
                filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter'
        ]
]
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/api/**/signup', access: ['permitAll']],
        [pattern: '/fonts/**', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']]
]
grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/api/**/signup', filters:'none'],

]
grails.plugin.springsecurity.filterChain.chainMap = [
        //Stateless chain
        [pattern: '/api/**', filters:'JOINED_FILTERS,-exceptionTranslationFilter, -securityContextPersistenceFilter'],

        //Traditional chain
        [
                pattern: '/**',
                filters: 'JOINED_FILTERS,-basicAuthenticationFilter,-basicExceptionTranslationFilter,-restTokenValidationFilter,-restExceptionTranslationFilter'
        ],

//				[pattern: '/api/**', filters:'JOINED_FILTERS,-exceptionTranslationFilter'],
]


grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.zucodu.security.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.zucodu.security.UserRole'
grails.plugin.springsecurity.authority.className = 'com.zucodu.security.Role'


grails {
    plugin {
        auditLog {
            auditDomainClassName = 'com.zucodu.security.AuditLog'
            excluded = ['version', 'lastUpdated', 'owner', 'lastUpdatedBy']
            mask = ['agentId', 'accessToken', 'refreshToken']
            defaultActor = 'HIVE_MTD_SYSTEM'
        }
    }
}

