package com.chord.topnews;

import android.content.Context;
import android.widget.ListView;

/**
 * Created by AllanCL on 2016/1/26.
 */
public class NewsListView extends ListView {
    public NewsListView(Context context) {
        super(context);
        setAdapter(new NewsAdapter(context));
    }
}
