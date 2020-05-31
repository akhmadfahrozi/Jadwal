package com.ozi.jadwal.model


import com.google.gson.annotations.SerializedName


data class ResponseJadwal(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("status_description")
	val statusDescription: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("status_code")
	val statusCode: Int? = null,

	@field:SerializedName("method")
	val method: Int? = null,

	@field:SerializedName("prayer_method_name")
	val prayerMethodName: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("query")
	val query: String? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("for")
	val jsonMemberFor: String? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("qibla_direction")
	val qiblaDirection: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("status_valid")
	val statusValid: Int? = null,

	@field:SerializedName("sealevel")
	val sealevel: String? = null,

	@field:SerializedName("country_code")
	val countryCode: String? = null,

	@field:SerializedName("daylight")
	val daylight: String? = null,

	@field:SerializedName("today_weather")
	val todayWeather: TodayWeather? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("postal_code")
	val postalCode: String? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null,

	@field:SerializedName("map_image")
	val mapImage: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null
)