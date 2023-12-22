package com.example.consumeapi.repository

import com.example.consumeapi.model.Kontak
import com.example.consumeapi.network.KontakService

interface KontakRepository {
    /**Fetches list of Kontak from kontakApi */
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    /**Fetches list of Kontak from kontakApi */
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}