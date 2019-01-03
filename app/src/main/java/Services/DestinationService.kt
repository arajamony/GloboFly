package Services

import com.gmail.rocka.globofly.models.Destination
import retrofit2.Call
import retrofit2.http.GET

interface DestinationService {

    @GET("destination")
    fun getDestinationList(): Call<List<Destination>>
}

