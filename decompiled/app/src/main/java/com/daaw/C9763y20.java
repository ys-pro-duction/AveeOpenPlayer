package com.daaw;

import com.daaw.YV0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.y20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9763y20 {
    public static final C9763y20 a = new C9763y20();
    public static final Map b = AbstractC1473Lg0.k(D61.a("PACKAGE", EnumSet.noneOf(H80.class)), D61.a("TYPE", EnumSet.of(H80.U, H80.h0)), D61.a("ANNOTATION_TYPE", EnumSet.of(H80.V)), D61.a("TYPE_PARAMETER", EnumSet.of(H80.W)), D61.a("FIELD", EnumSet.of(H80.Y)), D61.a("LOCAL_VARIABLE", EnumSet.of(H80.Z)), D61.a("PARAMETER", EnumSet.of(H80.a0)), D61.a("CONSTRUCTOR", EnumSet.of(H80.b0)), D61.a("METHOD", EnumSet.of(H80.c0, H80.d0, H80.e0)), D61.a("TYPE_USE", EnumSet.of(H80.f0)));
    public static final Map c = AbstractC1473Lg0.k(D61.a("RUNTIME", G80.B), D61.a("CLASS", G80.C), D61.a("SOURCE", G80.D));

    public static final I80 e(InterfaceC2968Zk0 interfaceC2968Zk0) {
        I80 type;
        G10.g(interfaceC2968Zk0, "module");
        InterfaceC9918yc1 interfaceC9918yc1B = AbstractC6169lA.b(C8926v20.a.d(), interfaceC2968Zk0.p().o(YV0.a.H));
        return (interfaceC9918yc1B == null || (type = interfaceC9918yc1B.getType()) == null) ? BH.d(AH.e1, new String[0]) : type;
    }

    public final AbstractC2887Yq b(InterfaceC7803r20 interfaceC7803r20) {
        U20 u20 = interfaceC7803r20 instanceof U20 ? (U20) interfaceC7803r20 : null;
        if (u20 != null) {
            Map map = c;
            C2352Tm0 c2352Tm0D = u20.d();
            G80 g80 = (G80) map.get(c2352Tm0D != null ? c2352Tm0D.c() : null);
            if (g80 != null) {
                C6607ml c6607mlC = C6607ml.d.c(YV0.a.K);
                C2352Tm0 c2352Tm0L = C2352Tm0.l(g80.name());
                G10.f(c2352Tm0L, "identifier(...)");
                return new C3946dH(c6607mlC, c2352Tm0L);
            }
        }
        return null;
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) b.get(str);
        return enumSet != null ? enumSet : AbstractC9867yQ0.d();
    }

    public final AbstractC2887Yq d(List list) {
        G10.g(list, "arguments");
        ArrayList<U20> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof U20) {
                arrayList.add(obj);
            }
        }
        ArrayList<H80> arrayList2 = new ArrayList();
        for (U20 u20 : arrayList) {
            C9763y20 c9763y20 = a;
            C2352Tm0 c2352Tm0D = u20.d();
            AbstractC2141Rm.A(arrayList2, c9763y20.c(c2352Tm0D != null ? c2352Tm0D.c() : null));
        }
        ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(arrayList2, 10));
        for (H80 h80 : arrayList2) {
            C6607ml c6607mlC = C6607ml.d.c(YV0.a.J);
            C2352Tm0 c2352Tm0L = C2352Tm0.l(h80.name());
            G10.f(c2352Tm0L, "identifier(...)");
            arrayList3.add(new C3946dH(c6607mlC, c2352Tm0L));
        }
        return new C4027db(arrayList3, C9484x20.B);
    }
}
