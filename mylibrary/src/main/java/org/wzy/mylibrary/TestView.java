package org.wzy.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;

import org.wzy.mylibrary.databinding.TestViewBinding;

/**
 * Created by zeyiwu on 09/12/2016.
 */

public class TestView extends LinearLayout {

    private TestViewBinding mBinding;

    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        mBinding = TestViewBinding.bind(this);

        mBinding.setDesc("hello world!");
        Log.d("www", "text=" + mBinding.getDesc());
    }
}
