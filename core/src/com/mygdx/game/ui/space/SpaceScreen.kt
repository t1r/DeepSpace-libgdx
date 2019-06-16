package com.mygdx.game.ui.space

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer

class SpaceScreen : Screen {

    private val shapeRenderer: ShapeRenderer by lazy { ShapeRenderer() }
    private val presenter: SpaceScreenPresenter by lazy { SpaceScreenPresenter() }
    private var camera: OrthographicCamera

    init {
        val w = Gdx.graphics.width
        val h = Gdx.graphics.height
        camera = OrthographicCamera(30F, 30F * (h / w))
        camera.position.set(camera.viewportWidth / 2F, camera.viewportHeight / 2f, 0F)
        camera.update()
    }

    override fun hide() {}

    override fun show() {}

    override fun render(delta: Float) {
        camera.update()
        shapeRenderer.projectionMatrix = camera.combined

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)

        presenter.getCelestialObjects().forEach { obj ->
            shapeRenderer.setColor(obj.rgbaColor.r, obj.rgbaColor.g, obj.rgbaColor.b, obj.rgbaColor.a)
            shapeRenderer.rect(obj.x, obj.y, obj.width, obj.height)
        }

        shapeRenderer.end()

    }

    override fun pause() {}

    override fun resume() {}

    override fun resize(width: Int, height: Int) {
        camera.viewportWidth = 30F
        camera.viewportHeight = 30F * height / width
        camera.update()
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}