package com.daaw;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.o41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6978o41 {

    /* JADX INFO: renamed from: com.daaw.o41$a */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            ViewOnLongClickListenerC7814r41.g(view, charSequence);
        }
    }
}
