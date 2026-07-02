package com.daaw;

import com.daaw.InterfaceC1376Ki;
import com.daaw.InterfaceC1583Mi;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.uH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8707uH implements InterfaceC4476fA0 {
    public final /* synthetic */ C4765gA0 B;

    public C8707uH() {
        BH bh = BH.a;
        C4765gA0 c4765gA0O0 = C4765gA0.O0(bh.h(), InterfaceC3072a8.b.b(), EnumC0336Ak0.E, AbstractC8679uA.e, true, C2352Tm0.o(EnumC7592qH.G.c()), InterfaceC1583Mi.a.DECLARATION, RU0.a, false, false, false, false, false, false);
        c4765gA0O0.b1(bh.k(), AbstractC1599Mm.k(), null, null, AbstractC1599Mm.k());
        this.B = c4765gA0O0;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public boolean E() {
        return this.B.E();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean E0() {
        return this.B.E0();
    }

    @Override // com.daaw.InterfaceC1583Mi
    public InterfaceC1583Mi I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        InterfaceC4476fA0 interfaceC4476fA0N0 = this.B.I(interfaceC8612tw, enumC0336Ak0, abstractC8965vA, aVar, z);
        G10.f(interfaceC4476fA0N0, "copy(...)");
        return interfaceC4476fA0N0;
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean J() {
        return this.B.J();
    }

    @Override // com.daaw.InterfaceC0834Fc1
    public boolean L() {
        return this.B.L();
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public AbstractC2887Yq T() {
        return this.B.T();
    }

    @Override // com.daaw.InterfaceC1376Ki
    public Object X(InterfaceC1376Ki.a aVar) {
        return this.B.X(aVar);
    }

    @Override // com.daaw.InterfaceC8612tw
    public InterfaceC4476fA0 a() {
        InterfaceC4476fA0 interfaceC4476fA0A = this.B.a();
        G10.f(interfaceC4476fA0A, "getOriginal(...)");
        return interfaceC4476fA0A;
    }

    @Override // com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        InterfaceC8612tw interfaceC8612twB = this.B.b();
        G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
        return interfaceC8612twB;
    }

    @Override // com.daaw.InterfaceC4297eZ0
    public InterfaceC4476fA0 c(C8957v81 c8957v81) {
        G10.g(c8957v81, "substitutor");
        return this.B.c(c8957v81);
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 c0() {
        return this.B.c0();
    }

    @Override // com.daaw.InterfaceC4476fA0, com.daaw.InterfaceC1583Mi, com.daaw.InterfaceC1376Ki
    public Collection e() {
        Collection collectionE = this.B.e();
        G10.f(collectionE, "getOverriddenDescriptors(...)");
        return collectionE;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC5044hA0 f() {
        return this.B.f();
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean f0() {
        return this.B.f0();
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC7565qA0 g() {
        return this.B.g();
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        InterfaceC3072a8 annotations = this.B.getAnnotations();
        G10.f(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        C2352Tm0 name = this.B.getName();
        G10.f(name, "getName(...)");
        return name;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public I80 getReturnType() {
        return this.B.getReturnType();
    }

    @Override // com.daaw.InterfaceC8516tc1
    public I80 getType() {
        I80 type = this.B.getType();
        G10.f(type, "getType(...)");
        return type;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List getTypeParameters() {
        List typeParameters = this.B.getTypeParameters();
        G10.f(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // com.daaw.InterfaceC0383Aw
    public AbstractC8965vA getVisibility() {
        AbstractC8965vA visibility = this.B.getVisibility();
        G10.f(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List h() {
        List listH = this.B.h();
        G10.f(listH, "getValueParameters(...)");
        return listH;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return this.B.h0(interfaceC9735xw, obj);
    }

    @Override // com.daaw.InterfaceC1583Mi
    public InterfaceC1583Mi.a i() {
        InterfaceC1583Mi.a aVarI = this.B.i();
        G10.f(aVarI, "getKind(...)");
        return aVarI;
    }

    @Override // com.daaw.InterfaceC1376Ki
    public RE0 i0() {
        return this.B.i0();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return this.B.isExternal();
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0J = this.B.j();
        G10.f(ru0J, "getSource(...)");
        return ru0J;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC3401bK k0() {
        return this.B.k0();
    }

    @Override // com.daaw.InterfaceC2232Si0
    public EnumC0336Ak0 l() {
        EnumC0336Ak0 enumC0336Ak0L = this.B.l();
        G10.f(enumC0336Ak0L, "getModality(...)");
        return enumC0336Ak0L;
    }

    @Override // com.daaw.InterfaceC4476fA0
    public InterfaceC3401bK n0() {
        return this.B.n0();
    }

    @Override // com.daaw.InterfaceC1376Ki
    public List o0() {
        List listO0 = this.B.o0();
        G10.f(listO0, "getContextReceiverParameters(...)");
        return listO0;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean p0() {
        return this.B.p0();
    }

    @Override // com.daaw.InterfaceC1583Mi
    public void v0(Collection collection) {
        G10.g(collection, "overriddenDescriptors");
        this.B.v0(collection);
    }

    @Override // com.daaw.InterfaceC4476fA0
    public List w() {
        List listW = this.B.w();
        G10.f(listW, "getAccessors(...)");
        return listW;
    }

    @Override // com.daaw.InterfaceC0626Dc1
    public boolean y() {
        return this.B.y();
    }
}
