package com.teethen.sdk.xwidget.ninegrid.simple;

import android.content.Context;
import android.widget.ImageView;
import java.util.List;

public interface ItemImageClickListener<T> {
    void onItemImageClick(Context context, ImageView imageView, int index, List<T> list);
}
