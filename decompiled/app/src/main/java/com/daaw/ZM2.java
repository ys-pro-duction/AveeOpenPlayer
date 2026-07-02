package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class ZM2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ AbstractC5377iN2 C;
    public final /* synthetic */ InterfaceC6224lN2 D;
    public final /* synthetic */ C7521q11 E;
    public final /* synthetic */ C3973dN2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZM2(C3973dN2 c3973dN2, C7521q11 c7521q11, AbstractC5377iN2 abstractC5377iN2, InterfaceC6224lN2 interfaceC6224lN2, C7521q11 c7521q112) {
        super(c7521q11);
        this.F = c3973dN2;
        this.C = abstractC5377iN2;
        this.D = interfaceC6224lN2;
        this.E = c7521q112;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.IInterface, com.daaw.qN2] */
    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        try {
            ?? E = this.F.a.e();
            C3973dN2 c3973dN2 = this.F;
            String str = c3973dN2.b;
            AbstractC5377iN2 abstractC5377iN2 = this.C;
            String str2 = c3973dN2.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", abstractC5377iN2.e());
            bundle.putString("adFieldEnifd", abstractC5377iN2.f());
            bundle.putInt("layoutGravity", abstractC5377iN2.c());
            bundle.putFloat("layoutVerticalMargin", abstractC5377iN2.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", abstractC5377iN2.d());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str2);
            if (abstractC5377iN2.g() != null) {
                bundle.putString("appId", abstractC5377iN2.g());
            }
            E.t1(str, bundle, new BinderC3694cN2(this.F, this.D));
        } catch (RemoteException e) {
            C3973dN2.c.b(e, "show overlay display from: %s", this.F.b);
            this.E.d(new RuntimeException(e));
        }
    }
}
