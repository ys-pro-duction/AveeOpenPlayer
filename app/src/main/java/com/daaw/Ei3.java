package com.daaw;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class Ei3 {
    public final Context a;
    public final InterfaceC3648cC0 b;
    public final VT1 c;
    public final Ch3 d = new Ch3(this, true);
    public final Ch3 e = new Ch3(this, false);
    public boolean f;

    public Ei3(Context context, InterfaceC3648cC0 interfaceC3648cC0, UY1 uy1, FS1 fs1, InterfaceC0930Ga1 interfaceC0930Ga1, VT1 vt1) {
        this.a = context;
        this.b = interfaceC3648cC0;
        this.c = vt1;
    }

    public static /* bridge */ /* synthetic */ FS1 a(Ei3 ei3) {
        ei3.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ InterfaceC0930Ga1 e(Ei3 ei3) {
        ei3.getClass();
        return null;
    }

    public final InterfaceC3648cC0 d() {
        return this.b;
    }

    public final void f() {
        this.d.c(this.a);
        this.e.c(this.a);
    }

    public final void g(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f = z;
        this.e.a(this.a, intentFilter2);
        if (this.f) {
            this.d.b(this.a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.d.a(this.a, intentFilter);
        }
    }
}
