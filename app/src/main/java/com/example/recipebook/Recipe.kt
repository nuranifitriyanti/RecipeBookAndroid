package com.example.recipebook

data class Recipe(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var ingredients: String = "",
    var directions: String = ""
)