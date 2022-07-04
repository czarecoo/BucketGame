package com.czareg.game.config;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.springframework.stereotype.Component;

@Component
public class ConfigurationFactory {
    public Lwjgl3ApplicationConfiguration create() {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setIdleFPS(60);
        config.useVsync(true);
        config.setTitle("Catch the droplets!");
        config.setWindowedMode(800, 480);
        return config;
    }
}