package com.nurif.mvp;

import android.os.Bundle;

import com.nurif.mvp.base.BaseActivity;
import com.nurif.mvp.presenter.MainPresenter;
import com.nurif.mvp.view.MainView;

/**
 * Created by if_alan on 11/21/2017
 */

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding(R.layout.activity_main);
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void initialize() {

    }
}
