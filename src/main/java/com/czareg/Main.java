package com.czareg;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.czareg.game.BucketGame;
import com.czareg.game.config.ConfigurationFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private BucketGame bucketGame;
    @Autowired
    private ConfigurationFactory configurationFactory;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        new Lwjgl3Application(bucketGame, configurationFactory.create());
    }
}