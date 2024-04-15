package com.example.starbucksapp

import android.content.Context
import android.content.Intent
import android.os.Bundle

class Order() {

    lateinit var productName: String
    lateinit var customerName: String

    constructor(pName: String) : this() {
        productName = pName
    }

    constructor(pName:String, cName: String) : this(pName) {
        productName = pName
        customerName = cName
    }

}