package com.nurif.mvp.base;

import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by if_alan on 11/21/2017
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P presenter;
    protected abstract P initPresenter();
    protected abstract void initialize();

    protected void binding(int layoutId) {
        setContentView(layoutId);
        ButterKnife.bind(this);
        presenter = initPresenter();
        initialize();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) presenter.dettachView();
    }
}
