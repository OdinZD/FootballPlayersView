package com.odinPerica.footballplayersview;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface API {

    @GET("searchplayers.php")
    Call<Request> getPlayer(@Query("p") String playerName);

}
