package com.daaw;

import com.daaw.C5309i71;
import com.daaw.InterfaceC4346ej0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K0 extends AbstractC9456ww implements InterfaceC5586j71 {
    public static final /* synthetic */ W60[] K = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(K0.class), "constructors", "getConstructors()Ljava/util/Collection;"))};
    public final InterfaceC10174zX0 F;
    public final AbstractC8965vA G;
    public final InterfaceC0881Fo0 H;
    public List I;
    public final a J;

    public static final class a implements C71 {
        public a() {
        }

        @Override // com.daaw.C71
        public C71 a(Q80 q80) {
            G10.g(q80, "kotlinTypeRefiner");
            return this;
        }

        @Override // com.daaw.C71
        public Collection b() {
            Collection collectionB = c().d0().N0().b();
            G10.f(collectionB, "getSupertypes(...)");
            return collectionB;
        }

        @Override // com.daaw.C71
        public boolean d() {
            return true;
        }

        @Override // com.daaw.C71
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InterfaceC5586j71 c() {
            return K0.this;
        }

        @Override // com.daaw.C71
        public List getParameters() {
            return K0.this.R0();
        }

        @Override // com.daaw.C71
        public AbstractC8670u80 p() {
            return AbstractC8400tA.m(c());
        }

        public String toString() {
            return "[typealias " + c().getName().c() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(InterfaceC10174zX0 interfaceC10174zX0, InterfaceC8612tw interfaceC8612tw, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, RU0 ru0, AbstractC8965vA abstractC8965vA) {
        super(interfaceC8612tw, interfaceC3072a8, c2352Tm0, ru0);
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(c2352Tm0, "name");
        G10.g(ru0, "sourceElement");
        G10.g(abstractC8965vA, "visibilityImpl");
        this.F = interfaceC10174zX0;
        this.G = abstractC8965vA;
        this.H = interfaceC10174zX0.h(new H0(this));
        this.J = new a();
    }

    public static final YS0 N0(K0 k0, Q80 q80) {
        G10.g(k0, "this$0");
        InterfaceC10240zl interfaceC10240zlF = q80.f(k0);
        if (interfaceC10240zlF != null) {
            return interfaceC10240zlF.s();
        }
        return null;
    }

    public static final Collection O0(K0 k0) {
        G10.g(k0, "this$0");
        return k0.Q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean T0(com.daaw.K0 r1, com.daaw.AbstractC5708ja1 r2) {
        /*
            java.lang.String r0 = "this$0"
            com.daaw.G10.g(r1, r0)
            com.daaw.G10.d(r2)
            boolean r0 = com.daaw.N80.a(r2)
            if (r0 != 0) goto L28
            com.daaw.C71 r2 = r2.N0()
            com.daaw.zl r2 = r2.c()
            boolean r0 = r2 instanceof com.daaw.Z71
            if (r0 == 0) goto L28
            com.daaw.Z71 r2 = (com.daaw.Z71) r2
            com.daaw.tw r2 = r2.b()
            boolean r1 = com.daaw.G10.c(r2, r1)
            if (r1 != 0) goto L28
            r1 = 1
            goto L29
        L28:
            r1 = 0
        L29:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.K0.T0(com.daaw.K0, com.daaw.ja1):java.lang.Boolean");
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return false;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return false;
    }

    @Override // com.daaw.InterfaceC0339Al
    public boolean K() {
        return D81.c(d0(), new I0(this));
    }

    public final YS0 M0() {
        InterfaceC4346ej0 interfaceC4346ej0C0;
        InterfaceC4923gl interfaceC4923glR = r();
        if (interfaceC4923glR == null || (interfaceC4346ej0C0 = interfaceC4923glR.C0()) == null) {
            interfaceC4346ej0C0 = InterfaceC4346ej0.b.b;
        }
        YS0 ys0U = D81.u(this, interfaceC4346ej0C0, new J0(this));
        G10.f(ys0U, "makeUnsubstitutedType(...)");
        return ys0U;
    }

    @Override // com.daaw.AbstractC9456ww
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5586j71 a() {
        InterfaceC10293zw interfaceC10293zwA = super.a();
        G10.e(interfaceC10293zwA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (InterfaceC5586j71) interfaceC10293zwA;
    }

    public final Collection Q0() {
        InterfaceC4923gl interfaceC4923glR = r();
        if (interfaceC4923glR == null) {
            return AbstractC1599Mm.k();
        }
        Collection<InterfaceC3241al> collectionM = interfaceC4923glR.m();
        G10.f(collectionM, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3241al interfaceC3241al : collectionM) {
            C5309i71.a aVar = C5309i71.j0;
            InterfaceC10174zX0 interfaceC10174zX0 = this.F;
            G10.d(interfaceC3241al);
            InterfaceC4751g71 interfaceC4751g71B = aVar.b(interfaceC10174zX0, this, interfaceC3241al);
            if (interfaceC4751g71B != null) {
                arrayList.add(interfaceC4751g71B);
            }
        }
        return arrayList;
    }

    public abstract List R0();

    public final void S0(List list) {
        G10.g(list, "declaredTypeParameters");
        this.I = list;
    }

    public final InterfaceC10174zX0 e0() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC2232Si0, com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        G10.g(interfaceC9735xw, "visitor");
        return interfaceC9735xw.j(this, obj);
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return false;
    }

    @Override // com.daaw.InterfaceC10240zl
    public C71 k() {
        return this.J;
    }

    @Override // com.daaw.AbstractC8898uw
    public String toString() {
        return "typealias " + getName().c();
    }

    @Override // com.daaw.InterfaceC0339Al
    public List v() {
        List list = this.I;
        if (list != null) {
            return list;
        }
        G10.u("declaredTypeParametersImpl");
        return null;
    }
}
