package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Es2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0795Es2 implements InterfaceC4956gr2 {
    public final Context a;
    public final AbstractC7686qd2 b;
    public final Executor c;

    public C0795Es2(Context context, AbstractC7686qd2 abstractC7686qd2, Executor executor) {
        this.a = context;
        this.b = abstractC7686qd2;
        this.c = executor;
    }

    public static final boolean c(C9267wF2 c9267wF2, int i) {
        return c9267wF2.a.a.g.contains(Integer.toString(i));
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final /* bridge */ /* synthetic */ Object a(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2, C6092kt2 {
        C7969re2 c7969re2I;
        C5093hM1 c5093hM1D = ((C4502fG2) c2994Zq2.b).d();
        C5372iM1 c5372iM1E = ((C4502fG2) c2994Zq2.b).e();
        InterfaceC6219lM1 interfaceC6219lM1I = ((C4502fG2) c2994Zq2.b).i();
        if (interfaceC6219lM1I != null && c(c9267wF2, 6)) {
            c7969re2I = C7969re2.g0(interfaceC6219lM1I);
        } else if (c5093hM1D != null && c(c9267wF2, 6)) {
            c7969re2I = C7969re2.J(c5093hM1D);
        } else if (c5093hM1D != null && c(c9267wF2, 2)) {
            c7969re2I = C7969re2.H(c5093hM1D);
        } else if (c5372iM1E != null && c(c9267wF2, 6)) {
            c7969re2I = C7969re2.K(c5372iM1E);
        } else {
            if (c5372iM1E == null || !c(c9267wF2, 1)) {
                throw new C6092kt2(1, "No native ad mappers");
            }
            c7969re2I = C7969re2.I(c5372iM1E);
        }
        FF2 ff2 = c9267wF2.a.a;
        if (!ff2.g.contains(Integer.toString(c7969re2I.P()))) {
            throw new C6092kt2(1, "No corresponding native ad listener");
        }
        AbstractC8527te2 abstractC8527te2D = this.b.d(new C10054z42(c9267wF2, c4498fF2, c2994Zq2.a), new C0635De2(c7969re2I), new C0526Cf2(c5372iM1E, c5093hM1D, interfaceC6219lM1I));
        ((BinderC3558bs2) c2994Zq2.c).a3(abstractC8527te2D.g());
        abstractC8527te2D.c().x0(new C12((C4502fG2) c2994Zq2.b), this.c);
        return abstractC8527te2D.h();
    }

    @Override // com.daaw.InterfaceC4956gr2
    public final void b(C9267wF2 c9267wF2, C4498fF2 c4498fF2, C2994Zq2 c2994Zq2) throws KF2 {
        C4502fG2 c4502fG2 = (C4502fG2) c2994Zq2.b;
        FF2 ff2 = c9267wF2.a.a;
        String string = c4498fF2.x.toString();
        String strZzl = zzbw.zzl(c4498fF2.u);
        InterfaceC3689cM1 interfaceC3689cM1 = (InterfaceC3689cM1) c2994Zq2.c;
        FF2 ff22 = c9267wF2.a.a;
        c4502fG2.u(this.a, ff2.d, string, strZzl, interfaceC3689cM1, ff22.i, ff22.g);
    }
}
