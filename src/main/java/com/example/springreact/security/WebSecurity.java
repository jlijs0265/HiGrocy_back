package com.example.springreact.security;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(SecurityProperties.BASIC_AUTH_ORDER - 10)    // 인증에 관련된 다른 설정보다 10만큼 먼저 실행
@EnableWebSecurity  // CSRF 보호 활성화
public class WebSecurity {
    public class WebSecurity extends WebSecurityConfigurerAdapter{

    }
}
