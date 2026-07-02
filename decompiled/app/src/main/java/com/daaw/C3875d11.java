package com.daaw;

import com.daaw.InterfaceC4460f7;

/* JADX INFO: renamed from: com.daaw.d11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3875d11 implements InterfaceC4460f7 {
    public final InterfaceC5164hd1 a;
    public final InterfaceC3626c71 b;
    public final Object c;
    public final Object d;
    public final AbstractC8664u7 e;
    public final AbstractC8664u7 f;
    public final AbstractC8664u7 g;
    public final long h;
    public final AbstractC8664u7 i;

    public C3875d11(InterfaceC5164hd1 interfaceC5164hd1, InterfaceC3626c71 interfaceC3626c71, Object obj, Object obj2, AbstractC8664u7 abstractC8664u7) {
        G10.g(interfaceC5164hd1, "animationSpec");
        G10.g(interfaceC3626c71, "typeConverter");
        this.a = interfaceC5164hd1;
        this.b = interfaceC3626c71;
        this.c = obj;
        this.d = obj2;
        AbstractC8664u7 abstractC8664u72 = (AbstractC8664u7) c().a().invoke(obj);
        this.e = abstractC8664u72;
        AbstractC8664u7 abstractC8664u73 = (AbstractC8664u7) c().a().invoke(g());
        this.f = abstractC8664u73;
        AbstractC8664u7 abstractC8664u7A = abstractC8664u7 == null ? null : AbstractC8950v7.a(abstractC8664u7);
        abstractC8664u7A = abstractC8664u7A == null ? AbstractC8950v7.c((AbstractC8664u7) c().a().invoke(obj)) : abstractC8664u7A;
        this.g = abstractC8664u7A;
        this.h = interfaceC5164hd1.d(abstractC8664u72, abstractC8664u73, abstractC8664u7A);
        this.i = interfaceC5164hd1.c(abstractC8664u72, abstractC8664u73, abstractC8664u7A);
    }

    @Override // com.daaw.InterfaceC4460f7
    public boolean a() {
        return this.a.a();
    }

    @Override // com.daaw.InterfaceC4460f7
    public long b() {
        return this.h;
    }

    @Override // com.daaw.InterfaceC4460f7
    public InterfaceC3626c71 c() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC4460f7
    public AbstractC8664u7 d(long j) {
        return !e(j) ? this.a.g(j, this.e, this.f, this.g) : this.i;
    }

    @Override // com.daaw.InterfaceC4460f7
    public boolean e(long j) {
        return InterfaceC4460f7.a.a(this, j);
    }

    @Override // com.daaw.InterfaceC4460f7
    public Object f(long j) {
        return !e(j) ? c().b().invoke(this.a.b(j, this.e, this.f, this.g)) : g();
    }

    @Override // com.daaw.InterfaceC4460f7
    public Object g() {
        return this.d;
    }

    public String toString() {
        return "TargetBasedAnimation: " + this.c + " -> " + g() + ",initial velocity: " + this.g + ", duration: " + AbstractC5028h7.b(this) + " ms";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3875d11(InterfaceC5866k7 interfaceC5866k7, InterfaceC3626c71 interfaceC3626c71, Object obj, Object obj2, AbstractC8664u7 abstractC8664u7) {
        this(interfaceC5866k7.e(interfaceC3626c71), interfaceC3626c71, obj, obj2, abstractC8664u7);
        G10.g(interfaceC5866k7, "animationSpec");
        G10.g(interfaceC3626c71, "typeConverter");
    }
}
