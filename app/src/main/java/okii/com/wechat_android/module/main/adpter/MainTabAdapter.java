package okii.com.wechat_android.module.main.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SteveJoe on 16/8/22.
 */
public class MainTabAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragments = new ArrayList<Fragment>();
    private final List<String> mFragmentTitles = new ArrayList<String>();
    private FragmentManager fm;

    public MainTabAdapter(FragmentManager fm) {
        super(fm);
        this.fm = fm;
        //缓存页面
        this.saveState();
    }

    public void addFragment(Fragment fragment, String title){
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    public void clear(){
        mFragments.clear();
        mFragmentTitles.clear();
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }
}
