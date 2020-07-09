package com.example.tripbook

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PlaceViewModel(application: Application): AndroidViewModel(application) {
    private val repository: PlaceRepository
    // LiveData gives us updated placeses when they change.
    val allPlaceses: LiveData<List<Place>>

    init {
        // Gets reference to PlaceDAO from Database to construct
        // the correct PlaceRepository.
        val placesesDao = DataBase.getDatabase(application,viewModelScope).placeDao()
        repository = PlaceRepository(placesesDao)
        allPlaceses = repository.allPlaces
    }
    fun insert(place:Place)= viewModelScope.launch {
        repository.insert(place)
    }
}