package com.example.notesdemo.model

import com.example.notesdemo.R

data class NotesModel(
    var title: String? = null,
    var desc: String? = null,
    var time: String? = null,
    var bgColor: Int = R.color.white
)
