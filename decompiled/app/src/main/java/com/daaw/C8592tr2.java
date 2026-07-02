package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.tr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8592tr2 implements InterfaceC4956gr2 {
    public final Context a;
    public final J22 b;

    public C8592tr2(Context context, J22 j22) {
        this.a = context;
        this.b = j22;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        C6087ks2 c6087ks2 = new C6087ks2(c4498fF2, (ZM1) c2994Zq2.b, AdFormat.APP_OPEN_AD);
        G22 g22A = this.b.a(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C8517tc2(c6087ks2, null), new H22(c4498fF2.c0));
        c6087ks2.b(g22A.b());
        ((BinderC3558bs2) c2994Zq2.c).a3(g22A.f());
        return g22A.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        try {
            ((ZM1) c2994Zq2.b).G2(c4498fF2.b0);
            ((ZM1) c2994Zq2.b).K0(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC8313sr2(c2994Zq2, null), (InterfaceC3689cM1) c2994Zq2.c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new KF2(e);
        }
    }
}
