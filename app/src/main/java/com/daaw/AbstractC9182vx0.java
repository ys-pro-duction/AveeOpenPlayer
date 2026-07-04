package com.daaw;

/* JADX INFO: renamed from: com.daaw.vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9182vx0 {
    public InterfaceC7002o90 B;
    public boolean C;

    public final long d() {
        InterfaceC7002o90 interfaceC7002o90 = this.B;
        return interfaceC7002o90 != null ? interfaceC7002o90.d() : I00.b.a();
    }

    public abstract boolean f0();

    public final InterfaceC7002o90 h0() {
        return this.B;
    }

    public boolean i0() {
        return false;
    }

    public final boolean j0() {
        return this.C;
    }

    public abstract void k0();

    public abstract void l0(C4134dx0 c4134dx0, EnumC4702fx0 enumC4702fx0, long j);

    public final void m0(boolean z) {
        this.C = z;
    }

    public final void n0(InterfaceC7002o90 interfaceC7002o90) {
        this.B = interfaceC7002o90;
    }
}
