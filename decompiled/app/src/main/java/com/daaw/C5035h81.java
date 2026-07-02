package com.daaw;

import com.daaw.E71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.h81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5035h81 {
    public static final a f = new a(null);
    public final AbstractC6197lH a;
    public final C3353b81 b;
    public final C9085vd0 c;
    public final O90 d;
    public final InterfaceC5471ij0 e;

    /* JADX INFO: renamed from: com.daaw.h81$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.daaw.I80 a(com.daaw.I80 r17, com.daaw.C8957v81 r18, java.util.Set r19, boolean r20) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5035h81.a.a(com.daaw.I80, com.daaw.v81, java.util.Set, boolean):com.daaw.I80");
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.h81$b */
    public static final class b {
        public final Z71 a;
        public final AbstractC6476mH b;

        public b(Z71 z71, AbstractC6476mH abstractC6476mH) {
            G10.g(z71, "typeParameter");
            G10.g(abstractC6476mH, "typeAttr");
            this.a = z71;
            this.b = abstractC6476mH;
        }

        public final AbstractC6476mH a() {
            return this.b;
        }

        public final Z71 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(bVar.a, this.a) && G10.c(bVar.b, this.b);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode();
            return iHashCode + (iHashCode * 31) + this.b.hashCode();
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
        }
    }

    public C5035h81(AbstractC6197lH abstractC6197lH, C3353b81 c3353b81) {
        G10.g(abstractC6197lH, "projectionComputer");
        G10.g(c3353b81, "options");
        this.a = abstractC6197lH;
        this.b = c3353b81;
        C9085vd0 c9085vd0 = new C9085vd0("Type parameter upper bound erasure results");
        this.c = c9085vd0;
        this.d = AbstractC3192ab0.a(new C4467f81(this));
        InterfaceC5471ij0 interfaceC5471ij0G = c9085vd0.g(new C4756g81(this));
        G10.f(interfaceC5471ij0G, "createMemoizedFunction(...)");
        this.e = interfaceC5471ij0G;
    }

    public static final C9830yH c(C5035h81 c5035h81) {
        G10.g(c5035h81, "this$0");
        return BH.d(AH.X0, c5035h81.toString());
    }

    public static final I80 f(C5035h81 c5035h81, b bVar) {
        G10.g(c5035h81, "this$0");
        return c5035h81.g(bVar.b(), bVar.a());
    }

    public final I80 d(AbstractC6476mH abstractC6476mH) {
        I80 i80D;
        YS0 ys0A = abstractC6476mH.a();
        return (ys0A == null || (i80D = H81.D(ys0A)) == null) ? h() : i80D;
    }

    public final I80 e(Z71 z71, AbstractC6476mH abstractC6476mH) {
        G10.g(z71, "typeParameter");
        G10.g(abstractC6476mH, "typeAttr");
        Object objInvoke = this.e.invoke(new b(z71, abstractC6476mH));
        G10.f(objInvoke, "invoke(...)");
        return (I80) objInvoke;
    }

    public final I80 g(Z71 z71, AbstractC6476mH abstractC6476mH) {
        InterfaceC6440m81 interfaceC6440m81A;
        Set setC = abstractC6476mH.c();
        if (setC != null && setC.contains(z71.a())) {
            return d(abstractC6476mH);
        }
        YS0 ys0S = z71.s();
        G10.f(ys0S, "getDefaultType(...)");
        Set<Z71> setL = H81.l(ys0S, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(AbstractC1703Nm.v(setL, 10)), 16));
        for (Z71 z712 : setL) {
            if (setC == null || !setC.contains(z712)) {
                interfaceC6440m81A = this.a.a(z712, abstractC6476mH, this, e(z712, abstractC6476mH.d(z71)));
            } else {
                interfaceC6440m81A = D81.t(z712, abstractC6476mH);
                G10.f(interfaceC6440m81A, "makeStarProjection(...)");
            }
            C0576Cs0 c0576Cs0A = D61.a(z712.k(), interfaceC6440m81A);
            linkedHashMap.put(c0576Cs0A.c(), c0576Cs0A.d());
        }
        C8957v81 c8957v81G = C8957v81.g(E71.a.e(E71.c, linkedHashMap, false, 2, null));
        G10.f(c8957v81G, "create(...)");
        List upperBounds = z71.getUpperBounds();
        G10.f(upperBounds, "getUpperBounds(...)");
        Set setI = i(c8957v81G, upperBounds, abstractC6476mH);
        if (setI.isEmpty()) {
            return d(abstractC6476mH);
        }
        if (!this.b.a()) {
            if (setI.size() == 1) {
                return (I80) AbstractC2455Um.B0(setI);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listM0 = AbstractC2455Um.M0(setI);
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(listM0, 10));
        Iterator it = listM0.iterator();
        while (it.hasNext()) {
            arrayList.add(((I80) it.next()).Q0());
        }
        return D10.a(arrayList);
    }

    public final C9830yH h() {
        return (C9830yH) this.d.getValue();
    }

    public final Set i(C8957v81 c8957v81, List list, AbstractC6476mH abstractC6476mH) {
        Set setB = AbstractC9588xQ0.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            I80 i80 = (I80) it.next();
            InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
            if (interfaceC10240zlC instanceof InterfaceC4923gl) {
                setB.add(f.a(i80, c8957v81, abstractC6476mH.c(), this.b.b()));
            } else if (interfaceC10240zlC instanceof Z71) {
                Set setC = abstractC6476mH.c();
                if (setC == null || !setC.contains(interfaceC10240zlC)) {
                    List upperBounds = ((Z71) interfaceC10240zlC).getUpperBounds();
                    G10.f(upperBounds, "getUpperBounds(...)");
                    setB.addAll(i(c8957v81, upperBounds, abstractC6476mH));
                } else {
                    setB.add(d(abstractC6476mH));
                }
            }
            if (!this.b.a()) {
                break;
            }
        }
        return AbstractC9588xQ0.a(setB);
    }

    public /* synthetic */ C5035h81(AbstractC6197lH abstractC6197lH, C3353b81 c3353b81, int i, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC6197lH, (i & 2) != 0 ? new C3353b81(false, false) : c3353b81);
    }
}
