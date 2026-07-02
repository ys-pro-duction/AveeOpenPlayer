package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.ts2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8597ts2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC1978Qc2 b;

    public C8597ts2(Context context, AbstractC1978Qc2 abstractC1978Qc2) {
        this.a = context;
        this.b = abstractC1978Qc2;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        C6087ks2 c6087ks2 = new C6087ks2(c4498fF2, (ZM1) c2994Zq2.b, AdFormat.INTERSTITIAL);
        AbstractC5998kc2 abstractC5998kc2C = this.b.c(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C8517tc2(c6087ks2, null));
        c6087ks2.b(abstractC5998kc2C.b());
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC5998kc2C.f());
        return abstractC5998kc2C.i();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        try {
            ((ZM1) c2994Zq2.b).G2(c4498fF2.b0);
            ((ZM1) c2994Zq2.b).h0(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC8318ss2(this, c2994Zq2, null), (InterfaceC3689cM1) c2994Zq2.c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new KF2(e);
        }
    }
}
