package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1172Ij implements Z71 {
    public final Z71 B;
    public final InterfaceC8612tw C;
    public final int D;

    public C1172Ij(Z71 z71, InterfaceC8612tw interfaceC8612tw, int i) {
        G10.g(z71, "originalDescriptor");
        G10.g(interfaceC8612tw, "declarationDescriptor");
        this.B = z71;
        this.C = interfaceC8612tw;
        this.D = i;
    }

    @Override // com.daaw.Z71
    public boolean D() {
        return this.B.D();
    }

    @Override // com.daaw.InterfaceC9177vw, com.daaw.InterfaceC8612tw
    public InterfaceC8612tw b() {
        return this.C;
    }

    @Override // com.daaw.Z71
    public InterfaceC10174zX0 e0() {
        InterfaceC10174zX0 interfaceC10174zX0E0 = this.B.e0();
        G10.f(interfaceC10174zX0E0, "getStorageManager(...)");
        return interfaceC10174zX0E0;
    }

    @Override // com.daaw.A7
    public InterfaceC3072a8 getAnnotations() {
        return this.B.getAnnotations();
    }

    @Override // com.daaw.Z71
    public int getIndex() {
        return this.D + this.B.getIndex();
    }

    @Override // com.daaw.InterfaceC3809cn0
    public C2352Tm0 getName() {
        C2352Tm0 name = this.B.getName();
        G10.f(name, "getName(...)");
        return name;
    }

    @Override // com.daaw.Z71
    public List getUpperBounds() {
        List upperBounds = this.B.getUpperBounds();
        G10.f(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return this.B.h0(interfaceC9735xw, obj);
    }

    @Override // com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0J = this.B.j();
        G10.f(ru0J, "getSource(...)");
        return ru0J;
    }

    @Override // com.daaw.Z71, com.daaw.InterfaceC10240zl
    public C71 k() {
        C71 c71K = this.B.k();
        G10.f(c71K, "getTypeConstructor(...)");
        return c71K;
    }

    @Override // com.daaw.Z71
    public boolean l0() {
        return true;
    }

    @Override // com.daaw.Z71
    public EnumC1042Hc1 o() {
        EnumC1042Hc1 enumC1042Hc1O = this.B.o();
        G10.f(enumC1042Hc1O, "getVariance(...)");
        return enumC1042Hc1O;
    }

    @Override // com.daaw.InterfaceC10240zl
    public YS0 s() {
        YS0 ys0S = this.B.s();
        G10.f(ys0S, "getDefaultType(...)");
        return ys0S;
    }

    public String toString() {
        return this.B + "[inner-copy]";
    }

    @Override // com.daaw.InterfaceC10240zl, com.daaw.InterfaceC8612tw
    public Z71 a() {
        Z71 z71A = this.B.a();
        G10.f(z71A, "getOriginal(...)");
        return z71A;
    }
}
