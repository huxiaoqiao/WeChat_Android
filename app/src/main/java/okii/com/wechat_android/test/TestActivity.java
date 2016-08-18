package okii.com.wechat_android.test;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import okii.com.wechat_android.R;
import okii.com.wechat_android.base.BaseActivity;
import okii.com.wechat_android.module.main.IMainView;
import okii.com.wechat_android.module.main.MainPresenter;

public class TestActivity extends BaseActivity<IMainView,MainPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void loadData() {

    }
}
