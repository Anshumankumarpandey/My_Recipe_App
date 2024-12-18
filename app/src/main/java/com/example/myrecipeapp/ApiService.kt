package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val retrofit = Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
/* these upper three line of code says that build connection with the base url and do it in a
 format **/

val recipeService = retrofit.create(ApiService::class.java)
interface ApiService{
 @GET("categories.php") //here to get the net request bottom what kind of file that is
    suspend fun getCategories():CategoriesResponse //this with the help of suspend keywords the
    //connection will be done in the backgroud to keep the user interface resposive
}
