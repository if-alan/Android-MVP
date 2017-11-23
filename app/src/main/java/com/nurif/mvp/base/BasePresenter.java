package com.nurif.mvp.base;

/**
 * Created by if_alan on 6/18/17
 */

public class BasePresenter<V> {
    public V view;

    public void attachView(V view) {
        this.view = view;
    }

    public void dettachView() {
        this.view = null;
    }
}
