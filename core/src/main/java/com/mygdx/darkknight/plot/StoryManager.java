package com.mygdx.darkknight.plot;

import java.util.ArrayList;

public class StoryManager {
    private ArrayList<Cutscene> scenes;
    private int currentSceneIndex = 0;

    public StoryManager(ArrayList<Cutscene> scenes) {
        this.scenes = scenes;
    }

    public Cutscene getCurrentScene() {
        return scenes.get(currentSceneIndex);
    }

    public boolean hasNext() {
        return currentSceneIndex < scenes.size() - 1;
    }

    public void nextScene() {
        if (hasNext()) currentSceneIndex++;
    }

    public void reset() {
        currentSceneIndex = 0;
    }
}
