package okii.com.wechat_android.base;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hannesdorfmann.mosby.mvp.MvpFragment;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.FragmentMvpDelegate;

import java.util.List;

/**
 * Created by SteveJoe on 16/8/18.
 */
public abstract class BaseFragment<V extends MvpView,P extends MvpPresenter<V>> extends MvpFragment<V,P> {
    public BaseFragment() {
    }

    @NonNull
    protected FragmentMvpDelegate<V, P> getMvpDelegate() {
        if(this.mvpDelegate == null) {
            this.mvpDelegate = new FragmentDelegateImpl(this);
        }

        return this.mvpDelegate;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void onStart() {
        super.onStart();
    }

    public void onResume() {
        super.onResume();
    }

    public void onPause() {
        super.onPause();
    }

    public void onStop() {
        super.onStop();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    public abstract void onClickButton();

    public abstract boolean onUpSlide();

    public abstract boolean onDownSlide();

    public abstract boolean onLeftSlide();

    public abstract boolean onRightSlide();

    public void startActivity(Intent intent) {
        if(this.isIntentAvailable(intent)) {
            super.startActivity(intent);
        }

    }

    public void startActivityForResult(Intent intent, int requestCode) {
        if(this.isIntentAvailable(intent)) {
            super.startActivityForResult(intent, requestCode);
        }

    }

    private boolean isIntentAvailable(Intent intent) {
        if(intent == null) {
            return false;
        } else {
            PackageManager packageManager = this.getContext().getPackageManager();
            List list = packageManager.queryIntentActivities(intent, 1);
            return list.size() > 0;
        }
    }
}
