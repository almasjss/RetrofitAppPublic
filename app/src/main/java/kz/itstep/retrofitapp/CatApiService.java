package kz.itstep.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CatApiService {
    @GET("v1/images/search")
    Call<List<Cat>> getCats();
}
