package com.example.tripbook

import androidx.lifecycle.LiveData

class PlaceRepository (private val placeDao: PlaceDAO) {
    val allPlaces:LiveData<List<Place>> = placeDao.getPlaces()

    suspend fun insert(place: Place) {
        placeDao.insert(place)
    }
    suspend fun selectPlacesesByCity(cityName :String){
        placeDao.getPlacesesByCityName(cityName)
    }
    suspend fun selectPlacesesByCountry(countryName : String){
        placeDao.getPlacesesByCountryName(countryName)
    }
    suspend fun selectPlacesesByType(placeType : String){
        placeDao.getPlacesesByType(placeType)
    }

}