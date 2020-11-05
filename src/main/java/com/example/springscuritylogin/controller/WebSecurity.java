package com.example.springscuritylogin.controller;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

    http.cors()
            .and()
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/users")
            .hasRole("adminRole")
            .anyRequest().authenticated()
            .and().formLogin();



    }
}
