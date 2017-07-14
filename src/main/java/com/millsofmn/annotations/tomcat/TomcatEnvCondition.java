package com.millsofmn.annotations.tomcat;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class TomcatEnvCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attributes = metadata.getAnnotationAttributes(TomcatEnv.class.getName());

        String type = (String) attributes.get("value");
        String stage = System.getProperty("TOMCATENV","LOCAL");

        return (stage != null && type != null && stage.equalsIgnoreCase(type));
    }
}
