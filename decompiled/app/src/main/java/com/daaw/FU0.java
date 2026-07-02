package com.daaw;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class FU0 {
    public final c a;

    public static class a extends c {
        public final View a;

        public a(View view) {
            this.a = view;
        }
    }

    public static class b extends a {
        public View b;

        public b(View view) {
            super(view);
            this.b = view;
        }
    }

    public static class c {
    }

    public FU0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new b(view);
        } else {
            this.a = new a(view);
        }
    }
}
