package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.pr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7477pr2 implements InterfaceC4956gr2 {
    public final Context a;
    public final J22 b;
    public final Executor c;

    public C7477pr2(Context context, J22 j22, Executor executor) {
        this.a = context;
        this.b = j22;
        this.c = executor;
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, final C2994Zq2 c2994Zq2) {
        G22 g22A = this.b.a(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C8517tc2(new InterfaceC3761cd2() { // from class: com.daaw.or2
            @Override // com.daaw.InterfaceC3761cd2
            public final void a(boolean z, Context context, C4184e72 c4184e72) throws C3483bd2 {
                C2994Zq2 c2994Zq22 = c2994Zq2;
                try {
                    ((C4502fG2) c2994Zq22.b).A(z);
                    ((C4502fG2) c2994Zq22.b).B(context);
                } catch (KF2 e) {
                    throw new C3483bd2(e.getCause());
                }
            }
        }, null), new H22(c4498fF2.c0));
        g22A.c().x0(new C12((C4502fG2) c2994Zq2.b), this.c);
        ((BinderC3558bs2) c2994Zq2.c).a3(g22A.g());
        return g22A.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        C4502fG2 c4502fG2 = (C4502fG2) c2994Zq2.b;
        FF2 ff2 = c9267wF2.a.a;
        c4502fG2.q(this.a, ff2.d, c4498fF2.x.toString(), (InterfaceC3689cM1) c2994Zq2.c);
    }
}
