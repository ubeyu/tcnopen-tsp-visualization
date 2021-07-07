package com.tsp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PathConfig {
    public static String tmpPath;

    @Value("${tmp.path}")
    public void setTmpPath(String param){
        tmpPath = param;
    }
}
