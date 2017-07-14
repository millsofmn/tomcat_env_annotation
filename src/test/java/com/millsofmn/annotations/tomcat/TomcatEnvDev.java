package com.millsofmn.annotations.tomcat;

public class TomcatEnvDev implements TomcatEnvStageInterface {
    public String getWhoIs() {
        return "DEV";
    }
}
