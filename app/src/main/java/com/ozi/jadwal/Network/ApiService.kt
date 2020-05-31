package com.ozi.jadwal.Network

import com.ozi.jadwal.model.ResponseJadwal
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
//@path bisa di ubah di web api
    @GET("{path}/daily.json")
    fun getJadwalSholat(@Path("path") periode: String?): Call<ResponseJadwal>



}