package com.millsofmn.annotations.tomcat;

/**
 * Created by M108491 on 7/13/2017.
 */
public class TomcatEnvLocal implements TomcatEnvStageInterface {
    public String getWhoIs() {
        return "LOCAL";
    }
}
