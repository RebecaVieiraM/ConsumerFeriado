package com.example.consumerferiado

import retrofit2.Response
import retrofit2.http.GET

interface FeriadoApi {
    @GET("/api/feriados/v1/2024")
    suspend fun getFeriados() : Response<List<Feriado>>
}