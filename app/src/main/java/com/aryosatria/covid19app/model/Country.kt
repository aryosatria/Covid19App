package com.aryosatria.covid19app.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AllNegara(
	val Global: Dunia?,
	val Countries: List<Negara>?
) : Parcelable

//region Data
@Parcelize
data class Dunia(
	val TotalConfirmed: String?,
	val TotalRecovered: String?,
	val TotalDeaths: String?
) : Parcelable

@Parcelize
data class Negara (
	val Country: String?,
	val Date: String?,
	val NewConfirmed: String?,
	val TotalConfirmed: String?,
	val TotalDeaths: String?,
	val NewDeaths: String?,
	val TotalRecovered: String?,
	val NewRecovered: String?,
	val CountryCode: String?
) : Parcelable

@Parcelize
data class InfoNegara(
	val Deaths: String?,
	val Confirmed: String?,
	val Recovered: String?,
	val Active: String?,
	val Date: String?
) : Parcelable
