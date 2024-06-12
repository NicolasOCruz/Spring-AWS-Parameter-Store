package com.nicolascruz.parameter_store.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties("process.api")
@RefreshScope
@Component
public class ProcessProperties {

    private String url;
    private String user;

    public String getUrl() {
        return url == null ? "" : url;
    }

    public String getUser() {
        return user == null ? "" : user;
    }
}
