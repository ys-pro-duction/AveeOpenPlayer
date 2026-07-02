package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Tt2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2382Tt2 implements InterfaceC4956gr2 {
    public final Context a;
    public final Executor b;
    public final AbstractC1167Ih2 c;

    public C2382Tt2(Context context, Executor executor, AbstractC1167Ih2 abstractC1167Ih2) {
        this.a = context;
        this.b = executor;
        this.c = abstractC1167Ih2;
    }

    public static final void e(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) {
        try {
            ((C4502fG2) c2994Zq2.b).p(c9267wF2.a.a.d, c4498fF2.x.toString());
        } catch (Exception e) {
            AbstractC4274eT1.zzk("Fail to load ad from adapter ".concat(String.valueOf(c2994Zq2.a)), e);
        }
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, final C2994Zq2 c2994Zq2) {
        AbstractC0326Ah2 abstractC0326Ah2B = this.c.b(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C0430Bh2(new InterfaceC3761cd2() { // from class: com.daaw.Pt2
            @Override // com.daaw.InterfaceC3761cd2
            public final void a(boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
                C2994Zq2 c2994Zq22 = c2994Zq2;
                try {
                    ((C4502fG2) c2994Zq22.b).A(z);
                    ((C4502fG2) c2994Zq22.b).a();
                } catch (KF2 e) {
                    AbstractC4274eT1.zzk("Cannot show rewarded video.", e);
                    throw new C3483bd2(e.getCause());
                }
            }
        }));
        abstractC0326Ah2B.c().x0(new C12((C4502fG2) c2994Zq2.b), this.b);
        C72 c72D = abstractC0326Ah2B.d();
        P62 p62A = abstractC0326Ah2B.a();
        ((BinderC3836cs2) c2994Zq2.c).a3(new BinderC2278St2(this, abstractC0326Ah2B.h(), p62A, c72D, abstractC0326Ah2B.i()));
        return abstractC0326Ah2B.k();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        if (((C4502fG2) c2994Zq2.b).c()) {
            e(c9267wF2, c4498fF2, c2994Zq2);
            return;
        }
        ((BinderC3836cs2) c2994Zq2.c).b3(new C2172Rt2(this, c9267wF2, c4498fF2, c2994Zq2));
        Object obj = c2994Zq2.b;
        Context context = this.a;
        FF2 ff2 = c9267wF2.a.a;
        ((C4502fG2) obj).m(context, ff2.d, null, (InterfaceC6235lQ1) c2994Zq2.c, c4498fF2.x.toString());
    }
}
