package com.daaw;

import com.daaw.AbstractC8747uR;
import com.daaw.InterfaceC1583Mi;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.vR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9033vR extends JS0 {
    public static final a f0 = new a(null);

    /* JADX INFO: renamed from: com.daaw.vR$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C9033vR a(C7632qR c7632qR, boolean z) {
            G10.g(c7632qR, "functionClass");
            List listV = c7632qR.v();
            C9033vR c9033vR = new C9033vR(c7632qR, null, InterfaceC1583Mi.a.DECLARATION, z, null);
            RE0 re0J0 = c7632qR.J0();
            List listK = AbstractC1599Mm.k();
            List listK2 = AbstractC1599Mm.k();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listV) {
                if (((Z71) obj).o() != EnumC1042Hc1.G) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<C8500tZ> iterableS0 = AbstractC2455Um.S0(arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(iterableS0, 10));
            for (C8500tZ c8500tZ : iterableS0) {
                arrayList2.add(C9033vR.f0.b(c9033vR, c8500tZ.c(), (Z71) c8500tZ.d()));
            }
            c9033vR.R0(null, re0J0, listK, listK2, arrayList2, ((Z71) AbstractC2455Um.p0(listV)).s(), EnumC0336Ak0.F, AbstractC8679uA.e);
            c9033vR.Z0(true);
            return c9033vR;
        }

        public final InterfaceC9918yc1 b(C9033vR c9033vR, int i, Z71 z71) {
            String lowerCase;
            String strC = z71.getName().c();
            G10.f(strC, "asString(...)");
            if (G10.c(strC, RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                lowerCase = "instance";
            } else if (G10.c(strC, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strC.toLowerCase(Locale.ROOT);
                G10.f(lowerCase, "toLowerCase(...)");
            }
            InterfaceC3072a8 interfaceC3072a8B = InterfaceC3072a8.b.b();
            C2352Tm0 c2352Tm0L = C2352Tm0.l(lowerCase);
            G10.f(c2352Tm0L, "identifier(...)");
            YS0 ys0S = z71.s();
            G10.f(ys0S, "getDefaultType(...)");
            RU0 ru0 = RU0.a;
            G10.f(ru0, "NO_SOURCE");
            return new C10197zc1(c9033vR, null, i, interfaceC3072a8B, c2352Tm0L, ys0S, false, false, false, null, ru0);
        }

        public a() {
        }
    }

    public /* synthetic */ C9033vR(InterfaceC8612tw interfaceC8612tw, C9033vR c9033vR, InterfaceC1583Mi.a aVar, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC8612tw, c9033vR, aVar, z);
    }

    @Override // com.daaw.JS0, com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: L0 */
    public AbstractC8747uR o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(aVar, "kind");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(ru0, "source");
        return new C9033vR(interfaceC8612tw, (C9033vR) interfaceC8468tR, aVar, isSuspend());
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public boolean M() {
        return false;
    }

    @Override // com.daaw.AbstractC8747uR
    public InterfaceC8468tR M0(AbstractC8747uR.c cVar) {
        G10.g(cVar, "configuration");
        C9033vR c9033vR = (C9033vR) super.M0(cVar);
        if (c9033vR == null) {
            return null;
        }
        List listH = c9033vR.h();
        G10.f(listH, "getValueParameters(...)");
        List list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c9033vR;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I80 type = ((InterfaceC9918yc1) it.next()).getType();
            G10.f(type, "getType(...)");
            if (AR.d(type) != null) {
                List listH2 = c9033vR.h();
                G10.f(listH2, "getValueParameters(...)");
                List list2 = listH2;
                ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    I80 type2 = ((InterfaceC9918yc1) it2.next()).getType();
                    G10.f(type2, "getType(...)");
                    arrayList.add(AR.d(type2));
                }
                return c9033vR.p1(arrayList);
            }
        }
        return c9033vR;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return false;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public boolean isInline() {
        return false;
    }

    public final InterfaceC8468tR p1(List list) {
        C2352Tm0 c2352Tm0;
        int size = h().size() - list.size();
        boolean z = true;
        if (size == 0) {
            List listH = h();
            G10.f(listH, "getValueParameters(...)");
            List<C0576Cs0> listT0 = AbstractC2455Um.T0(list, listH);
            if ((listT0 instanceof Collection) && listT0.isEmpty()) {
                return this;
            }
            for (C0576Cs0 c0576Cs0 : listT0) {
                if (!G10.c((C2352Tm0) c0576Cs0.a(), ((InterfaceC9918yc1) c0576Cs0.b()).getName())) {
                }
            }
            return this;
        }
        List listH2 = h();
        G10.f(listH2, "getValueParameters(...)");
        List<InterfaceC9918yc1> list2 = listH2;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        for (InterfaceC9918yc1 interfaceC9918yc1 : list2) {
            C2352Tm0 name = interfaceC9918yc1.getName();
            G10.f(name, "getName(...)");
            int index = interfaceC9918yc1.getIndex();
            int i = index - size;
            if (i >= 0 && (c2352Tm0 = (C2352Tm0) list.get(i)) != null) {
                name = c2352Tm0;
            }
            arrayList.add(interfaceC9918yc1.W(this, name, index));
        }
        AbstractC8747uR.c cVarS0 = S0(C8957v81.b);
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z = false;
        } else {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((C2352Tm0) it.next()) == null) {
                    break;
                }
            }
            z = false;
        }
        AbstractC8747uR.c cVarM = cVarS0.H(z).c(arrayList).m(a());
        G10.f(cVarM, "setOriginal(...)");
        InterfaceC8468tR interfaceC8468tRM0 = super.M0(cVarM);
        G10.d(interfaceC8468tRM0);
        return interfaceC8468tRM0;
    }

    public C9033vR(InterfaceC8612tw interfaceC8612tw, C9033vR c9033vR, InterfaceC1583Mi.a aVar, boolean z) {
        super(interfaceC8612tw, c9033vR, InterfaceC3072a8.b.b(), C2680Wq0.i, aVar, RU0.a);
        f1(true);
        h1(z);
        Y0(false);
    }
}
