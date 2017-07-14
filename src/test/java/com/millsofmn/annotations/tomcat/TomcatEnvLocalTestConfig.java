package com.millsofmn.annotations.tomcat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class TomcatEnvLocalTestConfig {

    @TomcatEnv("DEV")
    @Bean
    public TomcatEnvStageInterface stageIsDev(){
        return new TomcatEnvDev();
    }

    @TomcatEnv("LOCAL")
    @Bean
    public TomcatEnvStageInterface stageIsLocal(){
        return new TomcatEnvLocal();
    }
}
