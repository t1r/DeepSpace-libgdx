package com.mygdx.game.ui.space

import com.mygdx.game.data.CelestialObjectGenerator
import com.mygdx.game.domain.entity.CelestialObject

class SpaceScreenPresenter {
    private val celestialObjectGenerator: CelestialObjectGenerator = CelestialObjectGenerator()

    fun getCelestialObjects(): List<CelestialObject> =
            celestialObjectGenerator.getMockCelestialObject()
}