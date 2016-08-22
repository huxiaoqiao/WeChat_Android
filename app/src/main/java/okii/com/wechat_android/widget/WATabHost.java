package okii.com.wechat_android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.orhanobut.logger.Logger;

/**
 * Created by SteveJoe on 16/8/18.
 */
public class WATabHost extends LinearLayout implements View.OnClickListener {


    /*
     * 构造方法
     */
    public WATabHost(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int count = getChildCount();
        //为每个Button设置点击事件
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            if (view instanceof WATabButton){
                view.setTag(i);
                view.setOnClickListener(this);
                //默认选择第0个tab
                if (i == 0){
                    view.setSelected(true);
                }
            }
        }
    }

    public WATabHost(Context context) {
        super(context);
    }

    @Override
    public void onClick(View view) {
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View v = getChildAt(i);
            if (view == v){
                v.setSelected(true);
            }else {
                v.setSelected(false);
            }

        }
        if (mListener != null){
            mListener.onCheckedChange((int)view.getTag());
        }
    }

    private OncheckedChangeListenr mListener;

    public void setmListener(OncheckedChangeListenr mListener) {
        this.mListener = mListener;
    }

    public interface OncheckedChangeListenr{
        void onCheckedChange(int checkedPostion);
    }

    public void setChecked(int position){
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View v = getChildAt(i);
            if (getChildAt(position).getTag() == i) {
                v.setSelected(true);
            }else {
                v.setSelected(false);
            }
        }
    }


}
