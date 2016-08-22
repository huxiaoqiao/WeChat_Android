package okii.com.wechat_android.module.conversation;

import okii.com.wechat_android.base.BaseFragment;
import okii.com.wechat_android.module.conversation.presenter.ConversationPresenter;
import okii.com.wechat_android.module.conversation.view.IConversationView;

/**
 * Created by SteveJoe on 16/8/22.
 */
public class ConversationFragment extends BaseFragment<IConversationView,ConversationPresenter> {
    public ConversationFragment() {
        super();
    }

    @Override
    public ConversationPresenter createPresenter() {
        return new ConversationPresenter();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void setListener() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public int getRootLayoutId() {
        return 0;
    }
}
