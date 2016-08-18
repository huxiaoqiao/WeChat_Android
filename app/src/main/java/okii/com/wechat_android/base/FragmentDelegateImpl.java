package okii.com.wechat_android.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.MvpView;
import com.hannesdorfmann.mosby.mvp.delegate.BaseMvpDelegateCallback;
import com.hannesdorfmann.mosby.mvp.delegate.FragmentMvpDelegateImpl;

/**
 * Created by SteveJoe on 16/8/18.
 */
public class FragmentDelegateImpl<V extends MvpView,P extends MvpPresenter<V>> extends FragmentMvpDelegateImpl<V,P> {

    public FragmentDelegateImpl(BaseMvpDelegateCallback<V, P> delegateCallback) {
        super(delegateCallback);
    }

    public void onCreate(Bundle saved) {
        super.onViewCreated((View)null,(Bundle)null);
    }

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}
