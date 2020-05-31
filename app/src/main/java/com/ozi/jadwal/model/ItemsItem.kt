package com.ozi.jadwal.model

import com.google.gson.annotations.SerializedName


data class ItemsItem(

	@field:SerializedName("asr")
	val asr: String? = null,

	@field:SerializedName("isha")
	val isha: String? = null,

	@field:SerializedName("shurooq")
	val shurooq: String? = null,

	@field:SerializedName("date_for")
	val dateFor: String? = null,

	@field:SerializedName("dhuhr")
	val dhuhr: String? = null,

	@field:SerializedName("fajr")
	val fajr: String? = null,

	@field:SerializedName("maghrib")
	val maghrib: String? = null
)