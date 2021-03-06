package com.teethen.sdk.xrefresh.refreshmore;

import android.view.View;

import com.teethen.sdk.xrefresh.refreshmore.indicator.PtrIndicator;

public interface PtrHandler {

    /**
     * Check can do refresh or not. For example the content is empty or the first child is in view.
     */
    abstract boolean checkCanDoRefresh(final PtrFrameLayout frame, final View content, final View header);

    /**
     * When refresh begin
     *
     * @param frame
     */
    public abstract void onRefreshBegin(final PtrFrameLayout frame);
}