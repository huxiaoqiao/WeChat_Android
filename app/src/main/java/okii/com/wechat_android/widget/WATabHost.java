package okii.com.wechat_android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.orhanobut.logger.Logger;

/**
 * Created by SteveJoe on 16/8/18.
 */
public class WATabHost extends LinearLayout implements View.OnClickListener {

    public WATabHost(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WATabHost(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View view = getChildAt(i);
            if (view instanceof WATabButton){
                view.setOnClickListener(this);
            }
        }
    }

    public WATabHost(Context context) {
        super(context);
    }

    @Override
    public void onClick(View view) {
        Logger.d(view);
    }
}
