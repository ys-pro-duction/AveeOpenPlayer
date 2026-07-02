package com.daaw;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: com.daaw.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6697n4 implements InterfaceC8076s1 {
    public static final a b = new a(null);
    public final AccessibilityManager a;

    /* JADX INFO: renamed from: com.daaw.n4$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C6697n4(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.a = (AccessibilityManager) systemService;
    }
}
