package br.com.alessanderleite.androidpaginglibrary;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

public class ItemDataSource extends PageKeyedDataSource<Integer, Item> {

    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull LoadInitialCallback<Integer, Item> callback) {
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }
}
