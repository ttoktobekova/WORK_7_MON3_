package com.example.work_7_mon3_

import java.io.Serializable

data class User(val avatar: String,
    val userName : String,
    val profession :String? = "Профессия не указан" ):Serializable
