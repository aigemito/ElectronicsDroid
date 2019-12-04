package com.emito.electronicsdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var r1: RecyclerView?=null
    var layoutManager: RecyclerView.LayoutManager?=null
    var madr : MyAdapter?=null
    var images=intArrayOf(R.drawable.tablet1,R.drawable.labtop1,R.drawable.printer1,R.drawable.tv1)
    var productList=ArrayList<Product>(
        arrayListOf(
            Product("101","ThinkPad E590 (15) Laptop",499.00,"Black",R.drawable.thinkpad.toString(),"The ThinkPad E590’s security features help your SMB take control. The optional fingerprint reader adds secure biometric authentication, while the discrete trusted platform module (TPM) encrypts data at the hardware level. We take care of security so you can take care of business.")
            ,Product("102","APPLE iPhone 11 Pro Max",1249.99,"Midnight Green",R.drawable.iphone11.toString(),"Featuring a Stunning Pro Display, A13 Bionic, Cutting-Edge Pro Camera System and Longest Battery Life Ever in iPhone with iPhone 11 Pro Max")
            ,Product("103","VIZIO 70\" Class 4K",599.99,"Black",R.drawable.tv2.toString(),"The Vizio might have a bit of an edge in design, while the TCL boasts a slightly more preferable smart platform, but what matters most is picture quality. Both TVs here deliver 4K resolution screens, High Dynamic Range compatibility, full-array LED backlights with local dimming, and 120 Hz refresh rates.")
            ,Product("104","Epson WorkForce WF-2750",299.00,"Black",R.drawable.printer2.toString(),"The Epson WorkForce WF-2750 is an all-in-one inkjet printer with scan and copy functions, an automatic document feeder and built-in faxing. It works with Windows and macOS. The capacity of the main paper tray is 150 sheets, a typical size. ... The printer has a medium-size 2.3-inch display screen.")
            ,Product("105","Samsung Galaxy S10e",749.9,"Brown",R.drawable.sumsung.toString(),"Samsung Galaxy S10e smartphone was launched in February 2019. The phone comes with a 5.80-inch touchscreen display at a pixel density of 438 pixels per inch (ppi) and an aspect ratio of 19:9. Samsung Galaxy S10e is powered by a 1.9GHz octa-core Samsung Exynos 9820 processor. It comes with 6GB of RAM.")
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        r1 = findViewById<RecyclerView>(R.id.rv)

        madr = MyAdapter(this,productList)
        layoutManager = LinearLayoutManager(this)
        r1?.layoutManager = layoutManager
        r1?.adapter = madr
    }
}
