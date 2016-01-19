package com.trademe.test.retrofit;


import com.trademe.test.models.categoryModels.Root;
import com.trademe.test.models.searchModels.Search;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by alexanderparra on 17/01/16.
 */
public class SyncService {

    public static Observable<Root> pullDataFromService(){
        return NetworkAdapter.rxCall().categoryList()
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .flatMap(new Func1<Root, Observable<Root>>() {
                    @Override
                    public Observable<Root> call(final Root root) {
                        if (root != null) {
                            return Observable.create(new Observable.OnSubscribe<Root>() {
                                @Override
                                public void call(Subscriber<? super Root> subscriber) {
                                   subscriber.onNext(root);
                                }
                            });
                        } else
                            return Observable.empty();
                    }
                });
    }



    public static Observable<Search> searchFromService(String query){
        return NetworkAdapter.rxCall().searchList(query)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .flatMap(new Func1<Search, Observable<Search>>() {
                    @Override
                    public Observable<Search> call(final Search search) {
                        if(search != null){
                            return Observable.create(new Observable.OnSubscribe<Search>() {
                                @Override
                                public void call(Subscriber<? super Search> subscriber) {
                                    subscriber.onNext(search);
                                }
                            });
                        }else
                            return Observable.empty();

                    }
                });

    }


}
