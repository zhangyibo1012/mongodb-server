package com.sky.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring Security 配置类.
 * 在服务器上不需要 点击上传可以自己返回路径在MakerDown上  添加上就不会返回了
 */
@Configuration
@EnableWebMvc
public class SecurityConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*") ; // 允许跨域请求
	}

//    public static void main(String[] args) {
//        int m = 4 ,n =999,time=11.11;
//        int p = m * 1000 + n;
//    }
}