package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class GU0 extends AbstractC2117Rg {
    public final long c;

    public /* synthetic */ GU0(long j, AbstractC2911Yw abstractC2911Yw) {
        this(j);
    }

    @Override // com.daaw.AbstractC2117Rg
    public void a(long j, InterfaceC8595ts0 interfaceC8595ts0, float f) {
        long jM;
        G10.g(interfaceC8595ts0, "p");
        interfaceC8595ts0.c(1.0f);
        if (f == 1.0f) {
            jM = this.c;
        } else {
            long j2 = this.c;
            jM = C2559Vm.m(j2, C2559Vm.p(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        interfaceC8595ts0.t(jM);
        if (interfaceC8595ts0.j() != null) {
            interfaceC8595ts0.i(null);
        }
    }

    public final long b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GU0) && C2559Vm.o(this.c, ((GU0) obj).c);
    }

    public int hashCode() {
        return C2559Vm.u(this.c);
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) C2559Vm.v(this.c)) + ')';
    }

    public GU0(long j) {
        super(null);
        this.c = j;
    }
}
