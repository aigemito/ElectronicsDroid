package com.emito.electronicsdroid

import java.io.Serializable

data class Product(val ItemId:String,var Title:String,var Price:Double,var Color:String,var Image:String,var Desc:String):Serializable{

}