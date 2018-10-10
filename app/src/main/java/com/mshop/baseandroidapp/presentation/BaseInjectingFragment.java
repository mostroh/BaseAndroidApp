package com.mshop.baseandroidapp.presentation;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.LayoutRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseInjectingFragment extends Fragment {

    @Override
    public void onAttach(final Context context) {
        onInject();

        super.onAttach(context);
    }

    @Override
    @CallSuper
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(getLayoutId(), container, false);
    }

    public abstract void onInject();

    @LayoutRes
    protected abstract int getLayoutId();
}
