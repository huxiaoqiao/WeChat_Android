package okii.com.wechat_android.module.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import okii.com.wechat_android.R;
import okii.com.wechat_android.base.BaseActivity;
import okii.com.wechat_android.module.main.adpter.MainTabAdapter;
import okii.com.wechat_android.widget.MFViewPager;
import okii.com.wechat_android.widget.WATabHost;

public class MainActivity extends BaseActivity<IMainView, MainPresenter> implements WATabHost.OncheckedChangeListenr,ViewPager.OnPageChangeListener{


    @BindView(R.id.viewpager)
    MFViewPager viewpager;
    @BindView(R.id.tab_host)
    WATabHost tabHost;
    @BindView(R.id.ll_tabbar)
    LinearLayout llTabbar;

    private MainTabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initMainTab();
    }

    /*
     * 初始化tabbar
     */
    private void initMainTab() {

        tabAdapter = new MainTabAdapter(getSupportFragmentManager());

        viewpager.setAdapter(tabAdapter);
        tabAdapter.clear();
        viewpager.setOffscreenPageLimit(4);


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


    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }



    /**
     * viewpager滑动到当前位置
     * @param position
     */
    @Override
    public void onPageSelected(int position) {
        tabHost.setChecked(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onCheckedChange(int checkedPostion) {
         viewpager.setCurrentItem(checkedPostion);
    }


}
