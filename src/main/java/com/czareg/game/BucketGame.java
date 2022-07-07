package com.czareg.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.czareg.game.screen.GameScreen;
import com.czareg.game.screen.MainMenuScreen;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BucketGame extends Game {
    private final ObjectProvider<MainMenuScreen> mainMenuScreenObjectProvider;
    private final ObjectProvider<GameScreen> gameScreenObjectProvider;

    public SpriteBatch batch;
    public BitmapFont font;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // use libGDX's default Arial font
        setMainMenuScreen();
    }

    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

    public void setGameScreen() {
        this.setScreen(gameScreenObjectProvider.getObject(this));
    }

    public void setMainMenuScreen() {
        this.setScreen(mainMenuScreenObjectProvider.getObject(this));
    }
}