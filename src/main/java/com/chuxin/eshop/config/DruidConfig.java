package com.chuxin.eshop.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chuxin
 * @ClassName DruidConfig
 * @Date 2021/12/5 12:42 AM
 * @Description: Druid 配置文件
 */
@Configuration
public class DruidConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        servletRegistrationBean.addInitParameter("allow", "");
        servletRegistrationBean.addInitParameter("loginUsername", "admin");
        servletRegistrationBean.addInitParameter("loginPassword", "admin123");
        servletRegistrationBean.addInitParameter("resetEnable", "true");
        return servletRegistrationBean;
    }

    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>(new WebStatFilter());
        // 添加过滤器规则
        filterRegistrationBean.addUrlPatterns(("/*"));
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
