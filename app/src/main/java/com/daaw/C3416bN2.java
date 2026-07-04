package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.daaw.bN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3416bN2 extends AbstractRunnableC8734uN2 {
    public final /* synthetic */ AbstractC6782nN2 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ InterfaceC6224lN2 E;
    public final /* synthetic */ C7521q11 F;
    public final /* synthetic */ C3973dN2 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3416bN2(C3973dN2 c3973dN2, C7521q11 c7521q11, AbstractC6782nN2 abstractC6782nN2, int i, InterfaceC6224lN2 interfaceC6224lN2, C7521q11 c7521q112) {
        super(c7521q11);
        this.G = c3973dN2;
        this.C = abstractC6782nN2;
        this.D = i;
        this.E = interfaceC6224lN2;
        this.F = c7521q112;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.daaw.qN2] */
    @Override // com.daaw.AbstractRunnableC8734uN2
    public final void a() {
        try {
            ?? E = this.G.a.e();
            AbstractC6782nN2 abstractC6782nN2 = this.C;
            String str = this.G.b;
            int i = this.D;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", abstractC6782nN2.b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str);
            bundle.putString("appId", abstractC6782nN2.a());
            E.M(bundle, new BinderC3694cN2(this.G, this.E));
        } catch (RemoteException e) {
            C3973dN2.c.b(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.D), this.G.b);
            this.F.d(new RuntimeException(e));
        }
    }
}
