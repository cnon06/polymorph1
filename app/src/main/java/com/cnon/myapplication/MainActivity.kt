package com.cnon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


open class Asker
{

    open fun selam()
    {
        println("Asker Selam Verdi")
    }

}

class Er :Asker()
{

     override fun selam()
    {
        println("Er Selam Verdi")
    }
     

}

class Yuzbasi :Asker()
{
    override fun selam()
    {
        println("Yüzbaşı Selam Verdi")
    }
}




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var er = Er()
        var yzbasi=Yuzbasi()
        var asker= Asker()


        selam_al(er)
        selam_al(yzbasi)
        selam_al(asker)

    }

    fun selam_al(asker:Asker)
    {
        asker.selam()
    }


}