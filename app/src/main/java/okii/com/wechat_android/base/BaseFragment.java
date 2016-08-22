package okii.com.wechat_android.base;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.FragmentMvpDelegate;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by SteveJoe on 16/8/18.
 */
public abstract class BaseFragment<V extends MvpView,P extends MvpBasePresenter<V>> extends MvpFragment<V,P>{
    public BaseFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        int rootLayoutId = getRootLayoutId();
        View rootView = inflater.inflate(rootLayoutId,container,false);

        ButterKnife.bind(this,rootView);
        initView();
        initData();
        setListener();
        return rootView;
    }

    protected abstract void setListener();

    protected abstract void initData();

    protected abstract void initView();

    public abstract int getRootLayoutId();

}
