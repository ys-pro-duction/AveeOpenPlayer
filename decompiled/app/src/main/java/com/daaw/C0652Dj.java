package com.daaw;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0652Dj implements InterfaceC0539Cj {
    public final InterfaceC6440m81 a;
    public C2146Rn0 b;

    public C0652Dj(InterfaceC6440m81 interfaceC6440m81) {
        G10.g(interfaceC6440m81, "projection");
        this.a = interfaceC6440m81;
        e().b();
        EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
    }

    @Override // com.daaw.C71
    public Collection b() {
        I80 type = e().b() == EnumC1042Hc1.H ? e().getType() : p().I();
        G10.d(type);
        return AbstractC1496Lm.e(type);
    }

    @Override // com.daaw.C71
    public /* bridge */ /* synthetic */ InterfaceC10240zl c() {
        return (InterfaceC10240zl) f();
    }

    @Override // com.daaw.C71
    public boolean d() {
        return false;
    }

    @Override // com.daaw.InterfaceC0539Cj
    public InterfaceC6440m81 e() {
        return this.a;
    }

    public Void f() {
        return null;
    }

    public final C2146Rn0 g() {
        return this.b;
    }

    @Override // com.daaw.C71
    public List getParameters() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.C71
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0652Dj a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        InterfaceC6440m81 interfaceC6440m81A = e().a(q80);
        G10.f(interfaceC6440m81A, "refine(...)");
        return new C0652Dj(interfaceC6440m81A);
    }

    public final void i(C2146Rn0 c2146Rn0) {
        this.b = c2146Rn0;
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        AbstractC8670u80 abstractC8670u80P = e().getType().N0().p();
        G10.f(abstractC8670u80P, "getBuiltIns(...)");
        return abstractC8670u80P;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + e() + ')';
    }
}
