package com.busrautmn.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.busrautmn.recyclerview.R
import com.busrautmn.recyclerview.adapter.SoundsAdapter
import com.busrautmn.recyclerview.dto.SoundsDTO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundList = ArrayList<SoundsDTO>()
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/venedik-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/tokyo-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/fransa-paris-gezilecek-gorulecek-tarihi-turistik-yerler-eiffel-Kulesi.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/londra-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/roma-italya-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/rio-de-janeiro-brezilyaogezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/new-york-citiy-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/amsterdam-hollanda-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/cin-seddi-gezilecek-gorulecek-yerler.jpg"))
        soundList.add(SoundsDTO("https://img.gorulesiyer.com/sidney-avustralya-gezilecek-gorulecek-yerler.jpg"))


        recyclerView.apply {

            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = SoundsAdapter(soundList) { view, SoundsDTO ->

                Toast.makeText(this@MainActivity, SoundsDTO.imageLink, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
