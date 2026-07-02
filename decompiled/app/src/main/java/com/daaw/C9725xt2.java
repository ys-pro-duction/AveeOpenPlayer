package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.xt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9725xt2 implements InterfaceC4956gr2 {
    public final Context a;
    public final Executor b;
    public final AbstractC1167Ih2 c;

    public C9725xt2(Context context, Executor executor, AbstractC1167Ih2 abstractC1167Ih2) {
        this.a = context;
        this.b = executor;
        this.c = abstractC1167Ih2;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, final C2994Zq2 c2994Zq2) {
        AbstractC0326Ah2 abstractC0326Ah2B = this.c.b(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C0430Bh2(new InterfaceC3761cd2() { // from class: com.daaw.st2
            @Override // com.daaw.InterfaceC3761cd2
            public final void a(boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
                C2994Zq2 c2994Zq22 = c2994Zq2;
                try {
                    ((C4502fG2) c2994Zq22.b).A(z);
                    ((C4502fG2) c2994Zq22.b).E(context);
                } catch (KF2 e) {
                    throw new C3483bd2(e.getCause());
                }
            }
        }));
        abstractC0326Ah2B.c().x0(new C12((C4502fG2) c2994Zq2.b), this.b);
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC0326Ah2B.m());
        return abstractC0326Ah2B.k();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        try {
            FF2 ff2 = c9267wF2.a.a;
            if (ff2.o.a == 3) {
                ((C4502fG2) c2994Zq2.b).w(this.a, ff2.d, c4498fF2.x.toString(), (InterfaceC3689cM1) c2994Zq2.c);
            } else {
                ((C4502fG2) c2994Zq2.b).v(this.a, ff2.d, c4498fF2.x.toString(), (InterfaceC3689cM1) c2994Zq2.c);
            }
        } catch (Exception e) {
            AbstractC4274eT1.zzk("Fail to load ad from adapter ".concat(String.valueOf(c2994Zq2.a)), e);
        }
    }
}
