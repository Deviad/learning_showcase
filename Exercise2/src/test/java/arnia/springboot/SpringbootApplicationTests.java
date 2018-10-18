package arnia.springboot;

import arnia.springboot.configs.MvcConfig;
import arnia.springboot.configs.WebSecurityConfig;
import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.Filter;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.unauthenticated;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static sun.security.jgss.GSSUtil.login;


//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(classes = { MvcConfig.class, WebSecurityConfig.class}, loader = AnnotationConfigWebContextLoader.class)
//public class SpringbootApplicationTests {
//
//    @Autowired
//    private WebApplicationContext context;
//
//    @Autowired
//    private Filter springSecurityFilterChain;
//
//    private MockMvc mvc;
//
//    @Before
//    public void setup() {
//        mvc = MockMvcBuilders
//                .webAppContextSetup(context)
//                .addFilters(springSecurityFilterChain)
//                .build();
//    }
//
//    @Test
//    public void authenticationSuccess() throws Exception {
//        mvc
//                .perform(login())
//                .andExpect(status().isMovedTemporarily())
//                .andExpect(redirectedUrl("/hello"))
//                .andExpect(authenticated().withUsername("user"));
//    }
//    private static SecurityMockMvcRequestBuilders.FormLoginRequestBuilder login() {
//        return SecurityMockMvcRequestBuilders
//                .formLogin("/login")
//                .userParameter("user")
//                .passwordParam("{noop}password");
//    }
//
//}


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MvcConfig.class, WebSecurityConfig.class}, loader = AnnotationConfigWebContextLoader.class)
@WebAppConfiguration
public class SpringbootApplicationTests {

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private Filter springSecurityFilterChain;

    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders
                .webAppContextSetup(context)
                .addFilters(springSecurityFilterChain)
                .build();
    }

    @Test
    public void authenticationSuccess() throws Exception {
        mvc
                .perform(login())
                .andExpect(status().isMovedTemporarily())
                .andExpect(redirectedUrl("/hello"))
                .andExpect(authenticated().withUsername("user"));
    }

    @Test
    public void authenticationFailed() throws Exception {
        mvc
                .perform(login().user("notfound").password("invalid"))
                .andExpect(status().isMovedTemporarily())
                .andExpect(redirectedUrl("/login?error"))
                .andExpect(unauthenticated());
    }

    static SecurityMockMvcRequestBuilders.FormLoginRequestBuilder login() {
        return SecurityMockMvcRequestBuilders
                .formLogin("/login")
                .userParameter("user")
                .passwordParam("password");
    }
}