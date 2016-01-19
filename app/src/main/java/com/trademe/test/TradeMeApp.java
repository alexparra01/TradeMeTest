package com.trademe.test;
import android.app.Application;
import com.trademe.test.models.categoryModels.Root;
import com.trademe.test.models.searchModels.Search;




/**
 * Created by alexanderparra on 16/01/16.
 */
public class TradeMeApp extends Application {
    private static TradeMeApp context;
    private static Root rootList;
    private static Boolean firstTime;
    private static Search searchList;

    @Override
    public void onCreate() {
       super.onCreate();
        context = this;
        setFirstTime(true);
    }
    //Singletons
    public static Root getList(){
        return rootList;
    }
    public static void setList(Root root){
        rootList = root;
    }
    public static Boolean isFirstTime (){
         return firstTime;
    }
    public static void setFirstTime(Boolean firstTime1){
        firstTime = firstTime1;
    }
    public static TradeMeApp getContext(){
        return context;
    }

    public static Search getSearchList() {
        return searchList;
    }

    public static void setSearchList(Search searchList) {
        TradeMeApp.searchList = searchList;
    }
}
