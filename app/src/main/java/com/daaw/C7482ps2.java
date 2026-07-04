package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.ps2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7482ps2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC1978Qc2 b;
    public final zzcaz c;
    public final Executor d;

    public C7482ps2(Context context, zzcaz zzcazVar, AbstractC1978Qc2 abstractC1978Qc2, Executor executor) {
        this.a = context;
        this.c = zzcazVar;
        this.b = abstractC1978Qc2;
        this.d = executor;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, final C2994Zq2 c2994Zq2) {
        AbstractC5998kc2 abstractC5998kc2C = this.b.c(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C8517tc2(new InterfaceC3761cd2() { // from class: com.daaw.os2
            @Override // com.daaw.InterfaceC3761cd2
            public final void a(boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
                this.a.c(c2994Zq2, z, context, c4184e72);
            }
        }, null));
        abstractC5998kc2C.c().x0(new C12((C4502fG2) c2994Zq2.b), this.d);
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC5998kc2C.g());
        return abstractC5998kc2C.i();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        C4502fG2 c4502fG2 = (C4502fG2) c2994Zq2.b;
        FF2 ff2 = c9267wF2.a.a;
        c4502fG2.t(this.a, ff2.d, c4498fF2.x.toString(), zzbw.zzl(c4498fF2.u), (InterfaceC3689cM1) c2994Zq2.c);
    }

    public final /* synthetic */ void c(C2994Zq2 c2994Zq2, boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
        try {
            ((C4502fG2) c2994Zq2.b).A(z);
            if (this.c.D < ((Integer) zzba.zzc().b(AbstractC9820yE1.G0)).intValue()) {
                ((C4502fG2) c2994Zq2.b).C();
            } else {
                ((C4502fG2) c2994Zq2.b).D(context);
            }
        } catch (KF2 e) {
            AbstractC4274eT1.zzi("Cannot show interstitial.");
            throw new C3483bd2(e.getCause());
        }
    }
}
