package com.teethen.sdk.xdialog.dialogui.listener;

public abstract class DialogUIItemListener {

    /**
     * item点击事件
     */
    public abstract void onItemClick(CharSequence text, int position);

    /**
     * 底部点击事件
     */
    public void onBottomBtnClick() {
    }

}
