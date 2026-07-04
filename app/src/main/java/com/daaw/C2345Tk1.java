package com.daaw;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: renamed from: com.daaw.Tk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2345Tk1 extends AbstractDialogInterfaceOnCancelListenerC5487im1 {
    public final C2823Ya G;
    public final C10157zT H;

    public C2345Tk1(InterfaceC1453Lb0 interfaceC1453Lb0, C10157zT c10157zT, C9320wT c9320wT) {
        super(interfaceC1453Lb0, c9320wT);
        this.G = new C2823Ya();
        this.H = c10157zT;
        this.B.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C10157zT c10157zT, H8 h8) {
        InterfaceC1453Lb0 interfaceC1453Lb0C = LifecycleCallback.c(activity);
        C2345Tk1 c2345Tk1 = (C2345Tk1) interfaceC1453Lb0C.b("ConnectionlessLifecycleHelper", C2345Tk1.class);
        if (c2345Tk1 == null) {
            c2345Tk1 = new C2345Tk1(interfaceC1453Lb0C, c10157zT, C9320wT.n());
        }
        AbstractC7506py0.m(h8, "ApiKey cannot be null");
        c2345Tk1.G.add(h8);
        c10157zT.a(c2345Tk1);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.daaw.AbstractDialogInterfaceOnCancelListenerC5487im1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.daaw.AbstractDialogInterfaceOnCancelListenerC5487im1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.H.b(this);
    }

    @Override // com.daaw.AbstractDialogInterfaceOnCancelListenerC5487im1
    public final void m(ConnectionResult connectionResult, int i) {
        this.H.B(connectionResult, i);
    }

    @Override // com.daaw.AbstractDialogInterfaceOnCancelListenerC5487im1
    public final void n() {
        this.H.C();
    }

    public final C2823Ya t() {
        return this.G;
    }

    public final void v() {
        if (this.G.isEmpty()) {
            return;
        }
        this.H.a(this);
    }
}
