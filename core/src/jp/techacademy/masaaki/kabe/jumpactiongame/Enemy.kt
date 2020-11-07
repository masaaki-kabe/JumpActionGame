package jp.techacademy.masaaki.kabe.jumpactiongame

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite

class Enemy(texture: Texture, srcX:Int, srcY:Int, srcWidth:Int, srcHeight:Int) : Sprite(texture, srcX,srcY,srcWidth,srcHeight) {

    companion object{
        //横幅、高さ
        val Enemy_WIDTH=0.8f
        val Enemy_HEIGHT=0.8f
    }


    init{
        setSize(Enemy_WIDTH, Enemy_HEIGHT)
    }

}