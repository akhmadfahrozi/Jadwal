package com.ozi.jadwal

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.ozi.jadwal.Network.ApiRetrofit
import com.ozi.jadwal.model.ResponseJadwal
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getdate()
        data()

    }

    private fun getdate() {

        ApiRetrofit.create().getJadwalSholat("Tenggarong")
            .enqueue(object : Callback<ResponseJadwal> {
                override fun onFailure(call: Call<ResponseJadwal>?, t: Throwable?) {
                    Toast.makeText(this@MainActivity, "Gagal mendapatkan Data", Toast.LENGTH_LONG)
                        .show()

                }

                override fun onResponse(call: Call<ResponseJadwal>?, response: Response<ResponseJadwal>?) {
                    if (response?.isSuccessful!!) {

                        Log.e("TAG", "Hasil data${Gson().toJson(response.body())}")

                        txtSubuh.text = response.body().items?.get(0)?.shurooq
                        txtAshar.text = response.body().items?.get(0)?.asr
                        txtDzuhur.text = response.body().items?.get(0)?.dhuhr
                        txtIsya.text = response.body().items?.get(0)?.isha
                        txtMaghrib.text = response.body().items?.get(0)?.maghrib
                    } else {
                        Toast.makeText(this@MainActivity, "Hasil data", Toast.LENGTH_LONG).show()

                    }
                }

            })

    }

    private fun data() {
        val sdf = SimpleDateFormat("dd MMM yyyy ", Locale.getDefault())
        val currentDateandTime = sdf.format(Date())
        tv_tanngal?.text = currentDateandTime
    }
}
