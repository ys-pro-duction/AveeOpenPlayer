package com.daaw;

/* JADX INFO: renamed from: com.daaw.kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6050kn implements Y11 {
    public final long b;

    public /* synthetic */ C6050kn(long j, AbstractC2911Yw abstractC2911Yw) {
        this(j);
    }

    @Override // com.daaw.Y11
    public long a() {
        return this.b;
    }

    @Override // com.daaw.Y11
    public /* synthetic */ Y11 b(Y11 y11) {
        return X11.a(this, y11);
    }

    @Override // com.daaw.Y11
    public /* synthetic */ Y11 c(LQ lq) {
        return X11.b(this, lq);
    }

    @Override // com.daaw.Y11
    public AbstractC2117Rg d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6050kn) && C2559Vm.o(this.b, ((C6050kn) obj).b);
    }

    public int hashCode() {
        return C2559Vm.u(this.b);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) C2559Vm.v(this.b)) + ')';
    }

    public C6050kn(long j) {
        this.b = j;
        if (j == C2559Vm.b.g()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.");
        }
    }
}
