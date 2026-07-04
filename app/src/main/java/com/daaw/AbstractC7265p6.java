package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: renamed from: com.daaw.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7265p6 {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.c(null, a.B, 1, null);

    /* JADX INFO: renamed from: com.daaw.p6$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final boolean a(View view) {
        G10.g(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
