package com.mygdx.game.data

import com.mygdx.game.domain.entity.CelestialObject
import com.mygdx.game.domain.entity.RgbaColor

class CelestialObjectGenerator {

    fun getMockCelestialObject(): List<CelestialObject> =
            listOf(
                    CelestialObject(0f, 0f, 0.5f, 0.5f, getMockColor()),
                    CelestialObject(1f, 1f, 0.5f, 0.5f, getMockColor()),
                    CelestialObject(4f, 4f, 0.5f, 0.5f, getMockColor2()),
                    CelestialObject(6f, 6f, 0.5f, 0.5f, getMockColor3()),
                    CelestialObject(9f, 9f, 0.5f, 0.5f, getMockColor4()),
                    CelestialObject(12f, 12f, 0.5f, 0.5f, getMockColor()),
                    CelestialObject(-1F, 1f, 0.5f, 0.5f, getMockColor4()),
                    CelestialObject(1F, -1f, 0.5f, 0.5f, getMockColor3())
            )

    private fun getMockColor(): RgbaColor =
            RgbaColor(0.976F, 0.969F, 0.659F, 1F)

    private fun getMockColor2(): RgbaColor =
            RgbaColor(1F, 0.5F, 0.5F, 1F)

    private fun getMockColor3(): RgbaColor =
            RgbaColor(0.5F, 1F, 0.5F, 1F)

    private fun getMockColor4(): RgbaColor =
            RgbaColor(0.5F, 0.5F, 1F, 1F)
}