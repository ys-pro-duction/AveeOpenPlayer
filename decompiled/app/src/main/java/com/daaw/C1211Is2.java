package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.Is2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1211Is2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC7686qd2 b;
    public InterfaceC6219lM1 c;
    public final zzcaz d;

    public C1211Is2(Context context, AbstractC7686qd2 abstractC7686qd2, zzcaz zzcazVar) {
        this.a = context;
        this.b = abstractC7686qd2;
        this.d = zzcazVar;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws C6092kt2 {
        if (!c9267wF2.a.a.g.contains(Integer.toString(6))) {
            throw new C6092kt2(2, "Unified must be used for RTB.");
        }
        C7969re2 c7969re2G0 = C7969re2.g0(this.c);
        FF2 ff2 = c9267wF2.a.a;
        if (!ff2.g.contains(Integer.toString(c7969re2G0.P()))) {
            throw new C6092kt2(1, "No corresponding native ad listener");
        }
        AbstractC8527te2 abstractC8527te2D = this.b.d(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C0635De2(c7969re2G0), new C0526Cf2(null, null, this.c));
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC8527te2D.f());
        return abstractC8527te2D.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        try {
            ((ZM1) c2994Zq2.b).G2(c4498fF2.b0);
            AbstractC1003Gs2 abstractC1003Gs2 = null;
            if (this.d.D < ((Integer) zzba.zzc().b(AbstractC9820yE1.F1)).intValue()) {
                ((ZM1) c2994Zq2.b).f0(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC1107Hs2(this, c2994Zq2, abstractC1003Gs2), (InterfaceC3689cM1) c2994Zq2.c);
            } else {
                ((ZM1) c2994Zq2.b).X0(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC1107Hs2(this, c2994Zq2, abstractC1003Gs2), (InterfaceC3689cM1) c2994Zq2.c, c9267wF2.a.a.i);
            }
        } catch (RemoteException e) {
            throw new KF2(e);
        }
    }
}
