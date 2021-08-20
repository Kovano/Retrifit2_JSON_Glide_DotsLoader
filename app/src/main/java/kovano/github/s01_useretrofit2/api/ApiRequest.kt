package kovano.github.s01_useretrofit2.api

import retrofit2.http.GET

const val BASE_URL = "https://random.dog/"

interface ApiRequest {

    @GET("/woof.json?ref=apilist.fun")
    suspend fun getRandomDog(): ApiData

}