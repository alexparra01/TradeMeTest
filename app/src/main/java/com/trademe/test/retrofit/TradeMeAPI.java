package com.trademe.test.retrofit;


import com.trademe.test.models.categoryModels.Root;
import com.trademe.test.models.searchModels.Search;

import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by alexanderparra on 14/01/16.
 */
public interface TradeMeAPI {
    @Headers("Authorization: OAuth oauth_callback=\"http%3A%2F%2Fwww.website-tm-access.co.nz%2Ftrademe-callback\"")
    @GET("Categories.json")
    Observable<Root> categoryList();

    @GET("Search/General.json")
    Observable<Search> searchList(@Query("search_string")String search);

}
