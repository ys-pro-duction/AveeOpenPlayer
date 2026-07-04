package com.daaw;

import android.os.Handler;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.daaw.aQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3148aQ1 extends WebView {
    public final Handler B;
    public final RT1 C;
    public boolean D;

    public C3148aQ1(C4834gR1 c4834gR1, Handler handler, RT1 rt1) {
        super(c4834gR1);
        this.D = false;
        this.B = handler;
        this.C = rt1;
    }

    public static /* bridge */ /* synthetic */ boolean e(C3148aQ1 c3148aQ1, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void c(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        this.B.post(new Runnable() { // from class: com.daaw.pO1
            @Override // java.lang.Runnable
            public final void run() {
                N42.a(this.B, str3);
            }
        });
    }
}
