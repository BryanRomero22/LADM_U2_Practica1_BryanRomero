package mx.edu.ittepic.ladm_u2_practica1_bryanromero

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Point
import android.view.View

class Lienzo (p:MainActivity) : View(p){
    var puntero = p

    var coco1 = FiguraGeometrica(10, 100-10, 5)
    var coco2 = FiguraGeometrica(154, 100-40, 5)
    var coco3 = FiguraGeometrica(298, 100-20, 5)
    var coco4 = FiguraGeometrica(442, 100-30, 5)
    var coco5 = FiguraGeometrica(586, 100+100, 5)
    var coco6 = FiguraGeometrica(730, 100+90, 5)
    var coco7 = FiguraGeometrica(874, 100-60, 5)
    var coco8 = FiguraGeometrica(1018, 100-5, 5)
    var coco9 = FiguraGeometrica(1162, 100+25, 5)
    var coco10 = FiguraGeometrica(1306, 100, 5)

    var coco11 = FiguraGeometrica(10, 100+512-50, 5)
    var coco12 = FiguraGeometrica(154, 100+512-200, 5)
    var coco13 = FiguraGeometrica(298, 100+512-30, 5)
    var coco14 = FiguraGeometrica(442, 100+512+40, 5)
    var coco15 = FiguraGeometrica(586, 100+512-40, 5)
    var coco16 = FiguraGeometrica(730, 100+512+30, 5)
    var coco17 = FiguraGeometrica(874, 100+512-20, 5)
    var coco18 = FiguraGeometrica(1018, 100+512+60, 5)
    var coco19 = FiguraGeometrica(1162, 100+512-50, 5)
    var coco20 = FiguraGeometrica(1306, 100+512+30, 5)

    var coco21 = FiguraGeometrica(10, 100+(512*2)+100, 5)
    var coco22 = FiguraGeometrica(154, 100+(512*2)-100, 5)
    var coco23 = FiguraGeometrica(298, 100+(512*2)+40, 5)
    var coco24 = FiguraGeometrica(442, 100+(512*2)-10, 5)
    var coco25 = FiguraGeometrica(586, 100+(512*2)+20, 5)
    var coco26 = FiguraGeometrica(730, 100+(512*2), 5)
    var coco27 = FiguraGeometrica(874, 100+(512*2)+60, 5)
    var coco28 = FiguraGeometrica(1018, 100+(512*2)-30, 5)
    var coco29 = FiguraGeometrica(1162, 100+(512*2)-10, 5)
    var coco30 = FiguraGeometrica(1306, 100+(512*2)+5, 5)

    var coco31 = FiguraGeometrica(10, 100+(512*3)-50, 5)
    var coco32 = FiguraGeometrica(154, 100+(512*3)+50, 5)
    var coco33 = FiguraGeometrica(298, 100+(512*3)-70, 5)
    var coco34 = FiguraGeometrica(442, 100+(512*3)+30, 5)
    var coco35 = FiguraGeometrica(586, 100+(512*3)-20, 5)
    var coco36 = FiguraGeometrica(730, 100+(512*3)+30, 5)
    var coco37 = FiguraGeometrica(874, 100+(512*3)-50, 5)
    var coco38 = FiguraGeometrica(1018, 100+(512*3)-80, 5)
    var coco39 = FiguraGeometrica(1162, 100+(512*3)+40, 5)
    var coco40 = FiguraGeometrica(1306, 100+(512*3)-20, 5)

    var coco41 = FiguraGeometrica(10, 100+(512*4)+50, 5)
    var coco42 = FiguraGeometrica(154, 100+(512*4)-90, 5)
    var coco43 = FiguraGeometrica(298, 100+(512*4)+10, 5)
    var coco44 = FiguraGeometrica(442, 100+(512*4)+30, 5)
    var coco45 = FiguraGeometrica(586, 100+(512*4)-10, 5)
    var coco46 = FiguraGeometrica(730, 100+(512*4)-100, 5)
    var coco47 = FiguraGeometrica(874, 100+(512*4)+30, 5)
    var coco48 = FiguraGeometrica(1018, 100+(512*4)+10, 5)
    var coco49 = FiguraGeometrica(1162, 100+(512*4)-50, 5)
    var coco50 = FiguraGeometrica(1306, 100+(512*4)+40, 5)


    var punteroFiguraGeometrica: FiguraGeometrica? = null


    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        puntero.setTitle(""+width+","+""+height)
        var p = Paint()

        //fondo
        var fondo = p.color
        fondo = Color.rgb(45,45,158)
        c.drawColor(fondo)


        //suelo
        p.color = Color.rgb(12,12,57)
        c.drawRect(0f,1500f,2000f,3000f,p)

        //casa
        c.drawRect(800f,1100f,1500f,1500f,p)

        //ventanas
        p.color = Color.rgb(255,255,204)
        c.drawRect(900f,1250f,900f+150f,1250f+150f,p)
        c.drawRect(1250f,1250f,1250f+150f,1250f+150f,p)

        //luna
        p.color = Color.rgb(233,233,233)
        c.drawCircle(250f,250f,150f,p)
        p.color = Color.rgb(192,192,192)
        c.drawCircle(280f,280f,10f,p)
        c.drawCircle(200f,200f,30f,p)
        c.drawCircle(330f,300f,20f,p)
        c.drawCircle(290f,220f,10f,p)
        c.drawCircle(190f,320f,20f,p)

        //cocos de nieve
        p.color = Color.rgb(224,224,224)
        coco1.pintar(c, p)
        coco2.pintar(c, p)
        coco3.pintar(c, p)
        coco4.pintar(c, p)
        coco5.pintar(c, p)
        coco6.pintar(c, p)
        coco7.pintar(c, p)
        coco8.pintar(c, p)
        coco9.pintar(c, p)
        coco10.pintar(c, p)
        coco11.pintar(c, p)
        coco12.pintar(c, p)
        coco13.pintar(c, p)
        coco14.pintar(c, p)
        coco15.pintar(c, p)
        coco16.pintar(c, p)
        coco17.pintar(c, p)
        coco18.pintar(c, p)
        coco19.pintar(c, p)
        coco20.pintar(c, p)
        coco21.pintar(c, p)
        coco22.pintar(c, p)
        coco23.pintar(c, p)
        coco24.pintar(c, p)
        coco25.pintar(c, p)
        coco26.pintar(c, p)
        coco27.pintar(c, p)
        coco28.pintar(c, p)
        coco29.pintar(c, p)
        coco30.pintar(c, p)
        coco31.pintar(c, p)
        coco32.pintar(c, p)
        coco33.pintar(c, p)
        coco34.pintar(c, p)
        coco35.pintar(c, p)
        coco36.pintar(c, p)
        coco37.pintar(c, p)
        coco38.pintar(c, p)
        coco39.pintar(c, p)
        coco40.pintar(c, p)
        coco41.pintar(c, p)
        coco42.pintar(c, p)
        coco43.pintar(c, p)
        coco44.pintar(c, p)
        coco45.pintar(c, p)
        coco46.pintar(c, p)
        coco47.pintar(c, p)
        coco48.pintar(c, p)
        coco49.pintar(c, p)
        coco50.pintar(c, p)

    }


    fun animarCirculo() {
        coco1.rebote(width, height)
        coco2.rebote(width, height)
        coco3.rebote(width, height)
        coco4.rebote(width, height)
        coco5.rebote(width, height)
        coco6.rebote(width, height)
        coco7.rebote(width, height)
        coco8.rebote(width, height)
        coco9.rebote(width, height)
        coco10.rebote(width, height)
        coco11.rebote(width, height)
        coco12.rebote(width, height)
        coco13.rebote(width, height)
        coco14.rebote(width, height)
        coco15.rebote(width, height)
        coco16.rebote(width, height)
        coco17.rebote(width, height)
        coco18.rebote(width, height)
        coco19.rebote(width, height)
        coco20.rebote(width, height)
        coco21.rebote(width, height)
        coco22.rebote(width, height)
        coco23.rebote(width, height)
        coco24.rebote(width, height)
        coco25.rebote(width, height)
        coco26.rebote(width, height)
        coco27.rebote(width, height)
        coco28.rebote(width, height)
        coco29.rebote(width, height)
        coco30.rebote(width, height)
        coco31.rebote(width, height)
        coco32.rebote(width, height)
        coco33.rebote(width, height)
        coco34.rebote(width, height)
        coco35.rebote(width, height)
        coco36.rebote(width, height)
        coco37.rebote(width, height)
        coco38.rebote(width, height)
        coco39.rebote(width, height)
        coco40.rebote(width, height)
        coco41.rebote(width, height)
        coco42.rebote(width, height)
        coco43.rebote(width, height)
        coco44.rebote(width, height)
        coco45.rebote(width, height)
        coco46.rebote(width, height)
        coco47.rebote(width, height)
        coco48.rebote(width, height)
        coco49.rebote(width, height)
        coco50.rebote(width, height)

        invalidate()
    }


}