package com.daaw;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class LO1 {
    public View a;
    public final Map b = new HashMap();

    public final LO1 b(View view) {
        this.a = view;
        return this;
    }

    public final LO1 c(Map map) {
        this.b.clear();
        for (Map.Entry entry : map.entrySet()) {
            View view = (View) entry.getValue();
            if (view != null) {
                this.b.put((String) entry.getKey(), new WeakReference(view));
            }
        }
        return this;
    }
}
