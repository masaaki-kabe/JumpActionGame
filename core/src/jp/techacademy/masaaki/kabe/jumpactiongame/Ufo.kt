package jp.techacademy.masaaki.kabe.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion

class Ufo(texture:Texture,srcX:Int,srcY:Int,srcWidth:Int,srcHeight:Int) :GameObject(texture,srcX,srcY,srcWidth,srcHeight){

    companion object{
        //横幅、高さ
        val UFO_WIDTH=2.0f
        val UFO_HEIGHT=1.3f
    }

    init {
        setSize(UFO_WIDTH, UFO_HEIGHT)
    }
}