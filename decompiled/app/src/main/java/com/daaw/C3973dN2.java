package com.daaw;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.daaw.dN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3973dN2 {
    public static final C8455tN2 c = new C8455tN2("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final EN2 a;
    public final String b;

    public C3973dN2(Context context) {
        if (HN2.a(context)) {
            this.a = new EN2(context.getApplicationContext(), c, "OverlayDisplayService", d, YM2.a, null);
        } else {
            this.a = null;
        }
        this.b = context.getPackageName();
    }

    public final void c() {
        if (this.a == null) {
            return;
        }
        c.c("unbind LMD display overlay service", new Object[0]);
        this.a.u();
    }

    public final void d(UM2 um2, InterfaceC6224lN2 interfaceC6224lN2) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
        } else {
            C7521q11 c7521q11 = new C7521q11();
            this.a.s(new C3137aN2(this, c7521q11, um2, interfaceC6224lN2, c7521q11), c7521q11);
        }
    }

    public final void e(AbstractC5377iN2 abstractC5377iN2, InterfaceC6224lN2 interfaceC6224lN2) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
            return;
        }
        if (abstractC5377iN2.g() != null) {
            C7521q11 c7521q11 = new C7521q11();
            this.a.s(new ZM2(this, c7521q11, abstractC5377iN2, interfaceC6224lN2, c7521q11), c7521q11);
        } else {
            c.a("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            AbstractC5657jN2 abstractC5657jN2C = AbstractC5936kN2.c();
            abstractC5657jN2C.b(8160);
            interfaceC6224lN2.a(abstractC5657jN2C.c());
        }
    }

    public final void f(AbstractC6782nN2 abstractC6782nN2, InterfaceC6224lN2 interfaceC6224lN2, int i) {
        if (this.a == null) {
            c.a("error: %s", "Play Store not found.");
        } else {
            C7521q11 c7521q11 = new C7521q11();
            this.a.s(new C3416bN2(this, c7521q11, abstractC6782nN2, i, interfaceC6224lN2, c7521q11), c7521q11);
        }
    }
}
