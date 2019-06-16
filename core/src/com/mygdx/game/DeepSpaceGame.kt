package com.mygdx.game

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.mygdx.game.constants.GameConst.GAME_TAG
import com.mygdx.game.ui.space.SpaceScreen

class DeepSpaceGame : Game() {

    override fun create() {
        Gdx.app.log(GAME_TAG, "created")

        setScreen(SpaceScreen())
    }

    override fun dispose() {
        super.dispose()
    }
}
