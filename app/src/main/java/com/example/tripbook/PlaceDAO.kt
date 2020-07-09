package com.example.tripbook



import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface PlaceDAO {
    @Query("SELECT * from place_table ORDER BY city ASC")
    fun getPlaces(): LiveData<List<Place>>

    @Query("SELECT * from place_table WHERE city = :cityName")
    fun getPlacesesByCityName( cityName :String): LiveData<List<Place>>

    @Query("SELECT * from place_table WHERE country = :countryName")
    fun getPlacesesByCountryName (countryName :String): LiveData<List<Place>>

    @Query("SELECT * from place_table WHERE type = :placeType")
    fun getPlacesesByType (placeType :String): LiveData<List<Place>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(place: Place)

    @Query("DELETE FROM place_table")
    suspend fun deleteAll()

}