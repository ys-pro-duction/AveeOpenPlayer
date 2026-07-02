package com.daaw;

/* JADX INFO: renamed from: com.daaw.wN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9297wN0 extends CI {
    public final int E;
    public final int F;
    public final long G;
    public final String H;
    public ExecutorC7205ot I = k1();

    public AbstractC9297wN0(int i, int i2, long j, String str) {
        this.E = i;
        this.F = i2;
        this.G = j;
        this.H = str;
    }

    @Override // com.daaw.AbstractC5801jt
    public void g1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        ExecutorC7205ot.F(this.I, runnable, null, false, 6, null);
    }

    @Override // com.daaw.AbstractC5801jt
    public void h1(InterfaceC4684ft interfaceC4684ft, Runnable runnable) {
        ExecutorC7205ot.F(this.I, runnable, null, true, 2, null);
    }

    public final ExecutorC7205ot k1() {
        return new ExecutorC7205ot(this.E, this.F, this.G, this.H);
    }

    public final void l1(Runnable runnable, InterfaceC7799r11 interfaceC7799r11, boolean z) {
        this.I.s(runnable, interfaceC7799r11, z);
    }
}
