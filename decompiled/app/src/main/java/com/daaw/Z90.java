package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Z90 implements InterfaceC2186Rx0 {
    public static final /* synthetic */ W60[] i = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(Z90.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(Z90.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(Z90.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final C0504Ca0 a;
    public final InterfaceC7525q20 b;
    public final InterfaceC4097dp0 c;
    public final InterfaceC0881Fo0 d;
    public final InterfaceC8366t30 e;
    public final InterfaceC0881Fo0 f;
    public final boolean g;
    public final boolean h;

    public Z90(C0504Ca0 c0504Ca0, InterfaceC7525q20 interfaceC7525q20, boolean z) {
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC7525q20, "javaAnnotation");
        this.a = c0504Ca0;
        this.b = interfaceC7525q20;
        this.c = c0504Ca0.e().a(new W90(this));
        this.d = c0504Ca0.e().h(new X90(this));
        this.e = c0504Ca0.a().t().a(interfaceC7525q20);
        this.f = c0504Ca0.e().h(new Y90(this));
        this.g = interfaceC7525q20.f();
        this.h = interfaceC7525q20.u() || z;
    }

    public static final Map e(Z90 z90) {
        G10.g(z90, "this$0");
        Collection<InterfaceC7803r20> collectionC = z90.b.c();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7803r20 interfaceC7803r20 : collectionC) {
            C2352Tm0 name = interfaceC7803r20.getName();
            if (name == null) {
                name = B40.c;
            }
            AbstractC2887Yq abstractC2887YqN = z90.n(interfaceC7803r20);
            C0576Cs0 c0576Cs0A = abstractC2887YqN != null ? D61.a(name, abstractC2887YqN) : null;
            if (c0576Cs0A != null) {
                arrayList.add(c0576Cs0A);
            }
        }
        return AbstractC1473Lg0.t(arrayList);
    }

    public static final AP h(Z90 z90) {
        G10.g(z90, "this$0");
        C6607ml c6607mlE = z90.b.e();
        if (c6607mlE != null) {
            return c6607mlE.a();
        }
        return null;
    }

    public static final YS0 s(Z90 z90) {
        G10.g(z90, "this$0");
        AP apD = z90.d();
        if (apD == null) {
            return BH.d(AH.g1, z90.b.toString());
        }
        InterfaceC4923gl interfaceC4923glF = C9768y30.f(C9768y30.a, apD, z90.a.d().p(), null, 4, null);
        if (interfaceC4923glF == null) {
            C20 c20Y = z90.b.y();
            interfaceC4923glF = c20Y != null ? z90.a.a().n().a(c20Y) : null;
            if (interfaceC4923glF == null) {
                interfaceC4923glF = z90.g(apD);
            }
        }
        return interfaceC4923glF.s();
    }

    @Override // com.daaw.O7
    public AP d() {
        return (AP) AbstractC9895yX0.b(this.c, this, i[0]);
    }

    @Override // com.daaw.InterfaceC2186Rx0
    public boolean f() {
        return this.g;
    }

    public final InterfaceC4923gl g(AP ap) {
        return AbstractC5366iL.d(this.a.d(), C6607ml.d.c(ap), this.a.a().b().f().r());
    }

    @Override // com.daaw.O7
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public InterfaceC8366t30 j() {
        return this.e;
    }

    @Override // com.daaw.O7
    public Map k() {
        return (Map) AbstractC9895yX0.a(this.f, this, i[2]);
    }

    @Override // com.daaw.O7
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public YS0 getType() {
        return (YS0) AbstractC9895yX0.a(this.d, this, i[1]);
    }

    public final boolean m() {
        return this.h;
    }

    public final AbstractC2887Yq n(InterfaceC7803r20 interfaceC7803r20) {
        if (interfaceC7803r20 instanceof Z20) {
            return C3271ar.f(C3271ar.a, ((Z20) interfaceC7803r20).getValue(), null, 2, null);
        }
        if (interfaceC7803r20 instanceof U20) {
            U20 u20 = (U20) interfaceC7803r20;
            return q(u20.b(), u20.d());
        }
        if (!(interfaceC7803r20 instanceof InterfaceC10042z20)) {
            if (interfaceC7803r20 instanceof InterfaceC8082s20) {
                return o(((InterfaceC8082s20) interfaceC7803r20).a());
            }
            if (interfaceC7803r20 instanceof I20) {
                return r(((I20) interfaceC7803r20).c());
            }
            return null;
        }
        InterfaceC10042z20 interfaceC10042z20 = (InterfaceC10042z20) interfaceC7803r20;
        C2352Tm0 name = interfaceC10042z20.getName();
        if (name == null) {
            name = B40.c;
        }
        G10.d(name);
        return p(name, interfaceC10042z20.e());
    }

    public final AbstractC2887Yq o(InterfaceC7525q20 interfaceC7525q20) {
        return new Z7(new Z90(this.a, interfaceC7525q20, false, 4, null));
    }

    public final AbstractC2887Yq p(C2352Tm0 c2352Tm0, List list) {
        I80 i80L;
        if (N80.a(getType())) {
            return null;
        }
        InterfaceC4923gl interfaceC4923glL = AbstractC8400tA.l(this);
        G10.d(interfaceC4923glL);
        InterfaceC9918yc1 interfaceC9918yc1B = AbstractC6169lA.b(c2352Tm0, interfaceC4923glL);
        if (interfaceC9918yc1B == null || (i80L = interfaceC9918yc1B.getType()) == null) {
            i80L = this.a.a().m().p().l(EnumC1042Hc1.F, BH.d(AH.f1, new String[0]));
            G10.f(i80L, "getArrayType(...)");
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC2887Yq abstractC2887YqN = n((InterfaceC7803r20) it.next());
            if (abstractC2887YqN == null) {
                abstractC2887YqN = new C2568Vo0();
            }
            arrayList.add(abstractC2887YqN);
        }
        return C3271ar.a.b(arrayList, i80L);
    }

    public final AbstractC2887Yq q(C6607ml c6607ml, C2352Tm0 c2352Tm0) {
        if (c6607ml == null || c2352Tm0 == null) {
            return null;
        }
        return new C3946dH(c6607ml, c2352Tm0);
    }

    public final AbstractC2887Yq r(InterfaceC10047z30 interfaceC10047z30) {
        return C5024h60.b.a(this.a.g().p(interfaceC10047z30, C30.b(C81.C, false, false, null, 7, null)));
    }

    public String toString() {
        return AbstractC2923Yz.Q(AbstractC2923Yz.h, this, null, 2, null);
    }

    public /* synthetic */ Z90(C0504Ca0 c0504Ca0, InterfaceC7525q20 interfaceC7525q20, boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(c0504Ca0, interfaceC7525q20, (i2 & 4) != 0 ? false : z);
    }
}
