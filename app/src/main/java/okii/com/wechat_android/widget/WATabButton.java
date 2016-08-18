package okii.com.wechat_android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import okii.com.wechat_android.R;

/**
 * Created by SteveJoe on 16/8/18.
 */
public class WATabButton extends RelativeLayout {


    private ImageView ivTabItemIcon;
    private TextView tvTabItemTitle;

    public WATabButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initLayout(context,attrs);
    }

    /**
     * @param context
     */
    public WATabButton(Context context) {
        super(context);
    }

    public WATabButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initLayout(context,attrs);
    }

    private void initLayout(Context context, AttributeSet attrs) {
        View contentView = LayoutInflater.from(context).inflate(R.layout.main_tab_bottom_item, this);


        ivTabItemIcon = (ImageView)contentView.findViewById(R.id.iv_tab_item_icon);
        tvTabItemTitle = (TextView)contentView.findViewById(R.id.tv_tab_item_icon);

        TypedArray typedArray = getResources().obtainAttributes(attrs,R.styleable.tab_button);
        Drawable drawable = typedArray.getDrawable(R.styleable.tab_button_drawableTop);
        String text = typedArray.getString(R.styleable.tab_button_tabText);
        String attrStr = typedArray.getString(R.styleable.tab_button_drawbleTopAttr);
        typedArray.recycle();

        tvTabItemTitle.setText(text);
        if (drawable != null) {
            ivTabItemIcon.setImageDrawable(drawable);
        }else {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(getResources().getIdentifier(attrStr,"attr",context.getPackageName()),typedValue,true);
            ivTabItemIcon.setImageResource(typedValue.resourceId);
        }

    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
    }


}
