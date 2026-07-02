package com.daaw;

/* JADX INFO: renamed from: com.daaw.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6433m7 implements InterfaceC6258lW0 {
    public final InterfaceC3626c71 B;
    public final InterfaceC8007rm0 C;
    public AbstractC8664u7 D;
    public long E;
    public long F;
    public boolean G;

    public C6433m7(InterfaceC3626c71 interfaceC3626c71, Object obj, AbstractC8664u7 abstractC8664u7, long j, long j2, boolean z) {
        G10.g(interfaceC3626c71, "typeConverter");
        this.B = interfaceC3626c71;
        this.C = AbstractC9046vU0.d(obj, null, 2, null);
        AbstractC8664u7 abstractC8664u7A = abstractC8664u7 != null ? AbstractC8950v7.a(abstractC8664u7) : null;
        this.D = abstractC8664u7A == null ? AbstractC6712n7.c(interfaceC3626c71, obj) : abstractC8664u7A;
        this.E = j;
        this.F = j2;
        this.G = z;
    }

    public final long e() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC6258lW0
    public Object getValue() {
        return this.C.getValue();
    }

    public final long m() {
        return this.E;
    }

    public final InterfaceC3626c71 o() {
        return this.B;
    }

    public final AbstractC8664u7 p() {
        return this.D;
    }

    public final boolean q() {
        return this.G;
    }

    public final void r(long j) {
        this.F = j;
    }

    public final void s(long j) {
        this.E = j;
    }

    public final void t(boolean z) {
        this.G = z;
    }

    public void u(Object obj) {
        this.C.setValue(obj);
    }

    public final void v(AbstractC8664u7 abstractC8664u7) {
        G10.g(abstractC8664u7, "<set-?>");
        this.D = abstractC8664u7;
    }

    public /* synthetic */ C6433m7(InterfaceC3626c71 interfaceC3626c71, Object obj, AbstractC8664u7 abstractC8664u7, long j, long j2, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC3626c71, obj, (i & 4) != 0 ? null : abstractC8664u7, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
