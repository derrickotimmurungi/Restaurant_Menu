package com.derrick.restaurant_menu

class Foods {
    var name:String? = null //name of item
    var des:String? = null  //description of items
    var image:Int? = null   //image of item
    constructor(name:String, des:String, image:Int){
        this.name = name
        this.des = des
        this.image = image
    }
}