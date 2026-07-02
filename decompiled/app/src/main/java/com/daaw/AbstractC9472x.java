package com.daaw;

/* JADX INFO: renamed from: com.daaw.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9472x extends C3889d40 implements U30, InterfaceC1416Ks, InterfaceC7484pt {
    public final InterfaceC4684ft D;

    public AbstractC9472x(InterfaceC4684ft interfaceC4684ft, boolean z, boolean z2) {
        super(z2);
        if (z) {
            d0((U30) interfaceC4684ft.a(U30.k));
        }
        this.D = interfaceC4684ft.U(this);
    }

    @Override // com.daaw.C3889d40
    public String B() {
        return AbstractC8054rw.a(this) + " was cancelled";
    }

    public void R0(Object obj) {
        q(obj);
    }

    public final void U0(EnumC8599tt enumC8599tt, Object obj, InterfaceC3429bR interfaceC3429bR) {
        enumC8599tt.c(interfaceC3429bR, obj, this);
    }

    @Override // com.daaw.C3889d40
    public final void c0(Throwable th) {
        AbstractC6926nt.a(this.D, th);
    }

    @Override // com.daaw.C3889d40, com.daaw.U30
    public boolean d() {
        return super.d();
    }

    @Override // com.daaw.InterfaceC1416Ks
    public final InterfaceC4684ft getContext() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC7484pt
    public InterfaceC4684ft i() {
        return this.D;
    }

    @Override // com.daaw.C3889d40
    public String m0() {
        String strB = AbstractC4963gt.b(this.D);
        if (strB == null) {
            return super.m0();
        }
        return '\"' + strB + "\":" + super.m0();
    }

    @Override // com.daaw.C3889d40
    public final void v0(Object obj) {
        if (!(obj instanceof C2041Qn)) {
            T0(obj);
        } else {
            C2041Qn c2041Qn = (C2041Qn) obj;
            S0(c2041Qn.a, c2041Qn.a());
        }
    }

    @Override // com.daaw.InterfaceC1416Ks
    public final void x(Object obj) {
        Object objK0 = k0(AbstractC2459Un.d(obj, null, 1, null));
        if (objK0 == AbstractC4167e40.b) {
            return;
        }
        R0(objK0);
    }

    public void T0(Object obj) {
    }

    public void S0(Throwable th, boolean z) {
    }
}
