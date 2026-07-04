package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.daaw.aN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3137aN2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ UM2 C;
    public final /* synthetic */ InterfaceC6224lN2 D;
    public final /* synthetic */ C7521q11 E;
    public final /* synthetic */ C3973dN2 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3137aN2(C3973dN2 c3973dN2, C7521q11 c7521q11, UM2 um2, InterfaceC6224lN2 interfaceC6224lN2, C7521q11 c7521q112) {
        super(c7521q11);
        this.F = c3973dN2;
        this.C = um2;
        this.D = interfaceC6224lN2;
        this.E = c7521q112;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.daaw.qN2] */
    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        try {
            ?? E = this.F.a.e();
            UM2 um2 = this.C;
            String str = this.F.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", um2.b());
            bundle.putString("callerPackage", str);
            bundle.putString("appId", um2.a());
            E.c2(bundle, new BinderC3694cN2(this.F, this.D));
        } catch (RemoteException e) {
            C3973dN2.c.b(e, "dismiss overlay display from: %s", this.F.b);
            this.E.d(new RuntimeException(e));
        }
    }
}
