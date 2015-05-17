package com.silvercoastgames.pod;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public abstract class BaseScene extends Scene
{

    protected Engine engine;
    protected GameActivity activity;
    protected ResourceManager resourceManager;
    protected VertexBufferObjectManager vbom;
    protected BoundCamera camera;

    public BaseScene()
    {
        super();

        resourceManager = ResourceManager.getInstance();

        engine = resourceManager.engine;
        activity = resourceManager.activity;
        vbom = resourceManager.vbom;
        camera = resourceManager.camera;

        createScene();
    }

    public abstract void createScene();

    public abstract void onBackKeyPressed();

    public abstract SceneManager.SceneType getSceneType();

    public abstract void disposeScene();
}
