package okii.com.wechat_android.module.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import okii.com.wechat_android.R;
import okii.com.wechat_android.base.BaseActivity;
import okii.com.wechat_android.test.TestActivity;

public class MainActivity extends BaseActivity<IMainView, MainPresenter> {

    @BindView(R.id.bt_test)
    Button btTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // FIXME: 16/8/18 测试滑动返回
        //btTest = (Button) findViewById(R.id.bt_test);
        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);
            }
        });
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
