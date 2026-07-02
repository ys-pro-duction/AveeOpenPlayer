package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class EB2 implements Runnable {
    public final InterfaceC8968vA2 B;
    public final int C;
    public final Throwable D;
    public final byte[] E;
    public final String F;
    public final Map G;

    public /* synthetic */ EB2(String str, InterfaceC8968vA2 interfaceC8968vA2, int i, Throwable th, byte[] bArr, Map map, AbstractC3089aB2 abstractC3089aB2) {
        AbstractC7506py0.l(interfaceC8968vA2);
        this.B = interfaceC8968vA2;
        this.C = i;
        this.D = th;
        this.E = bArr;
        this.F = str;
        this.G = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.a(this.F, this.C, this.D, this.E, this.G);
    }
}
