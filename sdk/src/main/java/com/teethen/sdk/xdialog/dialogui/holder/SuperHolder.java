package com.teethen.sdk.xdialog.dialogui.holder;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.View;

import com.teethen.sdk.xdialog.dialogui.bean.BuildBean;

/**
 * 描 述：holder
 */
public abstract class SuperHolder {
    public View rootView;

    public SuperHolder(Context context) {
        rootView = View.inflate(context, setLayoutRes(), null);
        findViews();
    }

    protected abstract void findViews();

    protected abstract
    @LayoutRes
    int setLayoutRes();

    /**
     * 一般情况下，实现这个方法就足够了
     * @param context
     * @param bean
     */
    public abstract void assingDatasAndEvents(Context context, BuildBean bean);

}
