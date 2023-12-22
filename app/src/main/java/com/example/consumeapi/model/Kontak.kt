package com.example.consumeapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.NavigableMap

@Serializable
data class Kontak(
    val id: Int,
    val nama: String,
    val alamat: String,
    @SerialName(value = "telepon")
    val nohp: String,
)

