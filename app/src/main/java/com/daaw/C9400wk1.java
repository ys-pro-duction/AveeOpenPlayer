package com.daaw;

import android.os.RemoteException;

/* JADX INFO: renamed from: com.daaw.wk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9400wk1 extends AbstractRunnableC5758jk1 {
    public final /* synthetic */ byte[] C;
    public final /* synthetic */ Long D;
    public final /* synthetic */ C7521q11 E;
    public final /* synthetic */ W00 F;
    public final /* synthetic */ C0337Ak1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9400wk1(C0337Ak1 c0337Ak1, C7521q11 c7521q11, byte[] bArr, Long l, C7521q11 c7521q112, W00 w00) {
        super(c7521q11);
        this.G = c0337Ak1;
        this.C = bArr;
        this.D = l;
        this.E = c7521q112;
        this.F = w00;
    }

    @Override // com.daaw.AbstractRunnableC5758jk1
    public final void a(Exception exc) {
        if (exc instanceof C0970Gk1) {
            super.a(new V00(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.daaw.bk1] */
    @Override // com.daaw.AbstractRunnableC5758jk1
    public final void b() {
        try {
            this.G.c.e().h2(C0337Ak1.a(this.G, this.C, this.D), new BinderC9958yk1(this.G, this.E));
        } catch (RemoteException e) {
            this.G.a.c(e, "requestIntegrityToken(%s)", this.F);
            this.E.d(new V00(-100, e));
        }
    }
}
