package okii.com.wechat_android.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by SteveJoe on 16/8/22.
 */
public class MFViewPager extends ViewPager{

    private boolean scrollable = true; //是否可以滚动

    public MFViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        if (!scrollable){
            return true;
        }

        return super.onTouchEvent(ev);
    }

    public boolean isScrollable() {
        return scrollable;
    }

    public void setScrollable(boolean scrollable) {
        this.scrollable = scrollable;
    }
}
