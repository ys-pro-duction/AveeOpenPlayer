package com.daaw;

/* JADX INFO: renamed from: com.daaw.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1779Of extends AbstractC9718xs0 {
    public final InterfaceC5418iY g;
    public final long h;
    public final long i;
    public int j;
    public final long k;
    public float l;
    public C2871Ym m;

    public /* synthetic */ C1779Of(InterfaceC5418iY interfaceC5418iY, long j, long j2, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC5418iY, j, j2);
    }

    @Override // com.daaw.AbstractC9718xs0
    public boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // com.daaw.AbstractC9718xs0
    public boolean b(C2871Ym c2871Ym) {
        this.m = c2871Ym;
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1779Of)) {
            return false;
        }
        C1779Of c1779Of = (C1779Of) obj;
        return G10.c(this.g, c1779Of.g) && D00.e(this.h, c1779Of.h) && I00.e(this.i, c1779Of.i) && AbstractC3405bL.d(this.j, c1779Of.j);
    }

    @Override // com.daaw.AbstractC9718xs0
    public long h() {
        return J00.b(this.k);
    }

    public int hashCode() {
        return (((((this.g.hashCode() * 31) + D00.h(this.h)) * 31) + I00.h(this.i)) * 31) + AbstractC3405bL.e(this.j);
    }

    @Override // com.daaw.AbstractC9718xs0
    public void j(OD od) {
        G10.g(od, "<this>");
        ND.e(od, this.g, this.h, this.i, 0L, J00.a(AbstractC8261sh0.b(C9879yT0.i(od.a())), AbstractC8261sh0.b(C9879yT0.g(od.a()))), this.l, null, this.m, 0, this.j, 328, null);
    }

    public final long k(long j, long j2) {
        if (D00.f(j) < 0 || D00.g(j) < 0 || I00.g(j2) < 0 || I00.f(j2) < 0 || I00.g(j2) > this.g.getWidth() || I00.f(j2) > this.g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j2;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.g + ", srcOffset=" + ((Object) D00.i(this.h)) + ", srcSize=" + ((Object) I00.i(this.i)) + ", filterQuality=" + ((Object) AbstractC3405bL.f(this.j)) + ')';
    }

    public /* synthetic */ C1779Of(InterfaceC5418iY interfaceC5418iY, long j, long j2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC5418iY, (i & 2) != 0 ? D00.b.a() : j, (i & 4) != 0 ? J00.a(interfaceC5418iY.getWidth(), interfaceC5418iY.getHeight()) : j2, null);
    }

    public C1779Of(InterfaceC5418iY interfaceC5418iY, long j, long j2) {
        this.g = interfaceC5418iY;
        this.h = j;
        this.i = j2;
        this.j = AbstractC3405bL.a.a();
        this.k = k(j, j2);
        this.l = 1.0f;
    }
}
