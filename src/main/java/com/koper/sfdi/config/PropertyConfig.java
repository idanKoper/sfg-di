package com.koper.sfdi.config;

import com.koper.sfdi.examplebeans.FakeDataSource;
import com.koper.sfdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${koper.username}")
    String user;

    @Value("${koper.password}")
    String password;

    @Value("${koper.dburl}")
    String url;

    @Value("${koper.jms.username}")
    String jmsUser;

    @Value("${koper.jms.password}")
    String jmsPassword;

    @Value("${koper.jms.url}")
    String jmsUrl;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("username"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }
}
