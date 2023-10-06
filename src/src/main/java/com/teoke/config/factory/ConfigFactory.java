package com.teoke.config.factory;

import com.teoke.config.FrameWorkConfig;
import org.aeonbits.owner.ConfigCache;

public class ConfigFactory {
    private ConfigFactory() {
    }

    public static FrameWorkConfig config() {
        return ConfigCache.getOrCreate(FrameWorkConfig.class);
    }

}