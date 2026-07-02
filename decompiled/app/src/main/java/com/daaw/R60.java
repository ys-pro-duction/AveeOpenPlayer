package com.daaw;

import com.daaw.AbstractC5347iG0;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7823r60;
import com.daaw.InterfaceC4346ej0;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class R60 extends AbstractC7823r60 {
    public final Class E;
    public final O90 F;

    public final class a extends AbstractC7823r60.b {
        public static final /* synthetic */ W60[] j = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};
        public final AbstractC5347iG0.a d;
        public final AbstractC5347iG0.a e;
        public final O90 f;
        public final O90 g;
        public final AbstractC5347iG0.a h;

        public a() {
            super();
            this.d = AbstractC5347iG0.b(new M60(R60.this));
            this.e = AbstractC5347iG0.b(new N60(this));
            EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
            this.f = AbstractC3192ab0.b(enumC7395pb0, new O60(this, R60.this));
            this.g = AbstractC3192ab0.b(enumC7395pb0, new P60(this));
            this.h = AbstractC5347iG0.b(new Q60(R60.this, this));
        }

        public static final C3943dG0 m(R60 r60) {
            G10.g(r60, "this$0");
            return C3943dG0.c.a(r60.b());
        }

        public static final Collection n(R60 r60, a aVar) {
            G10.g(r60, "this$0");
            G10.g(aVar, "this$1");
            return r60.I(aVar.l(), AbstractC7823r60.d.B);
        }

        public static final C5025h61 o(a aVar) {
            C9514x80 c9514x80A;
            G10.g(aVar, "this$0");
            C3943dG0 c3943dG0I = aVar.i();
            if (c3943dG0I != null && (c9514x80A = c3943dG0I.a()) != null) {
                String[] strArrA = c9514x80A.a();
                String[] strArrG = c9514x80A.g();
                if (strArrA != null && strArrG != null) {
                    C0576Cs0 c0576Cs0M = C7540q50.m(strArrA, strArrG);
                    return new C5025h61((C5019h50) c0576Cs0M.a(), (FA0) c0576Cs0M.b(), c9514x80A.d());
                }
            }
            return null;
        }

        public static final Class p(a aVar, R60 r60) {
            C9514x80 c9514x80A;
            G10.g(aVar, "this$0");
            G10.g(r60, "this$1");
            C3943dG0 c3943dG0I = aVar.i();
            String strE = (c3943dG0I == null || (c9514x80A = c3943dG0I.a()) == null) ? null : c9514x80A.e();
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return r60.b().getClassLoader().loadClass(AY0.r(strE, '/', '.', false, 4, null));
        }

        public static final InterfaceC4346ej0 q(a aVar) {
            G10.g(aVar, "this$0");
            C3943dG0 c3943dG0I = aVar.i();
            return c3943dG0I != null ? aVar.b().c().a(c3943dG0I) : InterfaceC4346ej0.b.b;
        }

        public final C3943dG0 i() {
            return (C3943dG0) this.d.c(this, j[0]);
        }

        public final C5025h61 j() {
            return (C5025h61) this.g.getValue();
        }

        public final Class k() {
            return (Class) this.f.getValue();
        }

        public final InterfaceC4346ej0 l() {
            Object objC = this.e.c(this, j[1]);
            G10.f(objC, "getValue(...)");
            return (InterfaceC4346ej0) objC;
        }
    }

    public /* synthetic */ class b extends AbstractC9312wR implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2);
        }

        @Override // com.daaw.AbstractC1687Ni, com.daaw.InterfaceC9220w50
        public final String getName() {
            return "loadProperty";
        }

        @Override // com.daaw.AbstractC1687Ni
        public final InterfaceC6429m60 getOwner() {
            return AbstractC5624jG0.b(C3511bj0.class);
        }

        @Override // com.daaw.AbstractC1687Ni
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4476fA0 invoke(C3511bj0 c3511bj0, HA0 ha0) {
            G10.g(c3511bj0, "p0");
            G10.g(ha0, "p1");
            return c3511bj0.u(ha0);
        }
    }

    public R60(Class cls) {
        G10.g(cls, "jClass");
        this.E = cls;
        this.F = AbstractC3192ab0.b(EnumC7395pb0.C, new L60(this));
    }

    public static final a R(R60 r60) {
        G10.g(r60, "this$0");
        return r60.new a();
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection F() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection G(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return S().c(c2352Tm0, EnumC5496io0.I);
    }

    @Override // com.daaw.AbstractC7823r60
    public InterfaceC4476fA0 H(int i) {
        C5025h61 c5025h61J = ((a) this.F.getValue()).j();
        if (c5025h61J != null) {
            C5019h50 c5019h50 = (C5019h50) c5025h61J.a();
            FA0 fa0 = (FA0) c5025h61J.b();
            C4740g50 c4740g50 = (C4740g50) c5025h61J.c();
            AbstractC5674jS.f fVar = AbstractC7261p50.n;
            G10.f(fVar, "packageLocalVariable");
            HA0 ha0 = (HA0) SA0.b(fa0, fVar, i);
            if (ha0 != null) {
                Class clsB = b();
                NA0 na0Z = fa0.Z();
                G10.f(na0Z, "getTypeTable(...)");
                return (InterfaceC4476fA0) AbstractC8511tb1.h(clsB, ha0, c5019h50, new B81(na0Z), c4740g50, b.B);
            }
        }
        return null;
    }

    @Override // com.daaw.AbstractC7823r60
    public Class J() {
        Class clsK = ((a) this.F.getValue()).k();
        return clsK == null ? b() : clsK;
    }

    @Override // com.daaw.AbstractC7823r60
    public Collection K(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return S().a(c2352Tm0, EnumC5496io0.I);
    }

    public final InterfaceC4346ej0 S() {
        return ((a) this.F.getValue()).l();
    }

    @Override // com.daaw.InterfaceC2967Zk
    public Class b() {
        return this.E;
    }

    public boolean equals(Object obj) {
        return (obj instanceof R60) && G10.c(b(), ((R60) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "file class " + AbstractC9544xF0.e(b()).a();
    }
}
