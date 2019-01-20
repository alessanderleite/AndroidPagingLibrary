package br.com.alessanderleite.androidpaginglibrary;

import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;

public class ItemDataSource extends PageKeyedDataSource<Integer, Item> {

    //the size of a page that we want
    public static final int PAGE_SIZE = 50;

    //we will start from the first page which is 1
    public static final int FIRST_PAGE = 1;

    //we need to fetch for stackoverflow
    public static final String SITE_NAME = "stackoverflow";

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
