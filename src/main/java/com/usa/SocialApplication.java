//package com.usa;
//
//import java.util.Collections;
//import java.util.Map;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.web.authentication.HttpStatusEntryPoint;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@SpringBootApplication
//@RestController
//public class SocialApplication extends WebSecurityConfigurerAdapter {
//
//    public static void main(String[] args) {
//        SpringApplication.run(SocialApplication.class, args);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        http
//                .authorizeRequests(a -> a
//                .antMatchers("/", "/error", "/webjars/**").permitAll()
//                .anyRequest().authenticated()
//                )
//                .exceptionHandling(e -> e
//                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//                )
//                .oauth2Login();
//        // @formatter:on
//    }
//
//}
