package com.trademe.test.retrofit;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

/**
 * Created by alexanderparra on 14/01/16.
 */
public class NetworkAdapter  {

    private static final String END_POINT = "https://api.tmsandbox.co.nz/v1/";
    private static final String CONSUMER_KEY = "355E27443A91DE8A594AE88BF332AB44";
    private static final String CONSUMER_SECRET ="66AABC199B113981C05C3605D9A57335";
    private static final String OAUTH_TOKEN = "4A075370F3802709B4637DE5F602FCA2";
    private static final String OAUTH_TOKEN_SECRET = "0104360B2583E4226AA6BE611C1328D6";

    public static TradeMeAPI rxCall() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(END_POINT)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(getTradeMeClient())
                .build();

        TradeMeAPI adapter = retrofit.create(TradeMeAPI.class);

        return adapter;
    }

    private static OkHttpClient getTradeMeClient(){

        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(CONSUMER_KEY,CONSUMER_SECRET);
        consumer.setTokenWithSecret(OAUTH_TOKEN,OAUTH_TOKEN_SECRET);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new SigningInterceptor(consumer)).build();

        return client;
    }

}
