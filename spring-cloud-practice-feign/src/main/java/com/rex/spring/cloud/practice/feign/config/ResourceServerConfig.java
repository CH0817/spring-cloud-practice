package com.rex.spring.cloud.practice.feign.config;

// @Configuration
// @EnableResourceServer
// @EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfig {//extends ResourceServerConfigurerAdapter {

    // @Value("${security.oauth2.client.client-id}")
    // private String clientId;
    // @Value("${security.oauth2.client.client-secret}")
    // private String secret;
    // @Value("${security.oauth2.authorization.check-token-access}")
    // private String checkTokenEndpointUrl;
    //
    // @Autowired
    // private RedisConnectionFactory redisConnectionFactory;
    //
    // @Bean
    // public TokenStore redisTokenStore() {
    //     return new RedisTokenStore(redisConnectionFactory);
    // }
    //
    // @Bean
    // public RemoteTokenServices tokenService() {
    //     RemoteTokenServices tokenService = new RemoteTokenServices();
    //     tokenService.setClientId(clientId);
    //     tokenService.setClientSecret(secret);
    //     tokenService.setCheckTokenEndpointUrl(checkTokenEndpointUrl);
    //     return tokenService;
    // }
    //
    // @Override
    // public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    //     resources.tokenServices(tokenService());
    // }

}
