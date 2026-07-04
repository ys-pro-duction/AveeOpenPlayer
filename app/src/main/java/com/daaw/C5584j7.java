package com.daaw;

/* JADX INFO: renamed from: com.daaw.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5584j7 {
    public final InterfaceC3626c71 a;
    public final Object b;
    public final long c;
    public final LQ d;
    public final InterfaceC8007rm0 e;
    public AbstractC8664u7 f;
    public long g;
    public long h;
    public final InterfaceC8007rm0 i;

    public C5584j7(Object obj, InterfaceC3626c71 interfaceC3626c71, AbstractC8664u7 abstractC8664u7, long j, Object obj2, long j2, boolean z, LQ lq) {
        G10.g(interfaceC3626c71, "typeConverter");
        G10.g(abstractC8664u7, "initialVelocityVector");
        G10.g(lq, "onCancel");
        this.a = interfaceC3626c71;
        this.b = obj2;
        this.c = j2;
        this.d = lq;
        this.e = AbstractC9046vU0.d(obj, null, 2, null);
        this.f = AbstractC8950v7.a(abstractC8664u7);
        this.g = j;
        this.h = Long.MIN_VALUE;
        this.i = AbstractC9046vU0.d(Boolean.valueOf(z), null, 2, null);
    }

    public final void a() {
        j(false);
        this.d.invoke();
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final long d() {
        return this.c;
    }

    public final Object e() {
        return this.e.getValue();
    }

    public final AbstractC8664u7 f() {
        return this.f;
    }

    public final boolean g() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final void h(long j) {
        this.h = j;
    }

    public final void i(long j) {
        this.g = j;
    }

    public final void j(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void k(Object obj) {
        this.e.setValue(obj);
    }

    public final void l(AbstractC8664u7 abstractC8664u7) {
        G10.g(abstractC8664u7, "<set-?>");
        this.f = abstractC8664u7;
    }
}
