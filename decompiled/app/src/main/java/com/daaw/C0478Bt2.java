package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: renamed from: com.daaw.Bt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0478Bt2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC1167Ih2 b;

    public C0478Bt2(Context context, AbstractC1167Ih2 abstractC1167Ih2) {
        this.a = context;
        this.b = abstractC1167Ih2;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        C6087ks2 c6087ks2 = new C6087ks2(c4498fF2, (ZM1) c2994Zq2.b, AdFormat.REWARDED);
        AbstractC0326Ah2 abstractC0326Ah2B = this.b.b(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C0430Bh2(c6087ks2));
        c6087ks2.b(abstractC0326Ah2B.b());
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC0326Ah2B.n());
        return abstractC0326Ah2B.k();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        try {
            ((ZM1) c2994Zq2.b).G2(c4498fF2.b0);
            if (c9267wF2.a.a.o.a == 3) {
                ((ZM1) c2994Zq2.b).Q(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC0374At2(this, c2994Zq2, null), (InterfaceC3689cM1) c2994Zq2.c);
            } else {
                ((ZM1) c2994Zq2.b).Q2(c4498fF2.W, c4498fF2.x.toString(), c9267wF2.a.a.d, BinderC7744qp0.Z2(this.a), new BinderC0374At2(this, c2994Zq2, null), (InterfaceC3689cM1) c2994Zq2.c);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
