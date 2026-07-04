package com.daaw;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J73 extends M73 implements InterfaceC2697Wu1 {
    public InterfaceC2801Xu1 J;
    public final String K = "moov";

    public J73(String str) {
    }

    @Override // com.daaw.InterfaceC2697Wu1
    public final void a(InterfaceC2801Xu1 interfaceC2801Xu1) {
        this.J = interfaceC2801Xu1;
    }

    @Override // com.daaw.InterfaceC2697Wu1
    public final void d(N73 n73, ByteBuffer byteBuffer, long j, InterfaceC2385Tu1 interfaceC2385Tu1) {
        n73.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.C = n73;
        this.E = n73.zzb();
        n73.e(n73.zzb() + j);
        this.F = n73.zzb();
        this.B = interfaceC2385Tu1;
    }

    @Override // com.daaw.InterfaceC2697Wu1
    public final String zza() {
        return this.K;
    }
}
