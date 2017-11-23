package com.nurif.mvp.presenter;

import com.nurif.mvp.base.BasePresenter;
import com.nurif.mvp.view.MainView;

/**
 * Created by if_alan on 11/21/2017.
 * PRESENTER CLASS: The presenter acts upon the model and the view. It retrieves data from repositories (the model), and formats it for display in the view.
 */

public class MainPresenter extends BasePresenter<MainView>{
    public MainPresenter(MainView view) {
        super.attachView(view);
    }
}
