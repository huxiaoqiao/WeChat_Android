package okii.com.wechat_android;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.Logger;


/**
 * Created by SteveJoe on 16/8/18.
 */
public class WeChatApp extends Application{

    private static final String TAG = WeChatApp.class.getSimpleName();
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

    }

}
