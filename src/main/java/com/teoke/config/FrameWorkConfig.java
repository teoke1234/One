package com.teoke.config;


import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;


@LoadPolicy(LoadType.MERGE)
@Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
})
public interface FrameWorkConfig extends Config {

    @DefaultValue("dev")
    String environment();

    @Key("${environment}.url")
    String webURL();


}
