package com.daaw;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class I73 implements InterfaceC2697Wu1 {
    public static final T73 K = T73.b(I73.class);
    public final String B;
    public InterfaceC2801Xu1 C;
    public ByteBuffer F;
    public long G;
    public N73 I;
    public long H = -1;
    public ByteBuffer J = null;
    public boolean E = true;
    public boolean D = true;

    public I73(String str) {
        this.B = str;
    }

    @Override // com.daaw.InterfaceC2697Wu1
    public final void a(InterfaceC2801Xu1 interfaceC2801Xu1) {
        this.C = interfaceC2801Xu1;
    }

    public final synchronized void b() {
        try {
            if (this.E) {
                return;
            }
            try {
                T73 t73 = K;
                String str = this.B;
                t73.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.F = this.I.k(this.G, this.H);
                this.E = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract void c(ByteBuffer byteBuffer);

    @Override // com.daaw.InterfaceC2697Wu1
    public final void d(N73 n73, ByteBuffer byteBuffer, long j, InterfaceC2385Tu1 interfaceC2385Tu1) {
        this.G = n73.zzb();
        byteBuffer.remaining();
        this.H = j;
        this.I = n73;
        n73.e(n73.zzb() + j);
        this.E = false;
        this.D = false;
        e();
    }

    public final synchronized void e() {
        try {
            b();
            T73 t73 = K;
            String str = this.B;
            t73.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.F;
            if (byteBuffer != null) {
                this.D = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.J = byteBuffer.slice();
                }
                this.F = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC2697Wu1
    public final String zza() {
        return this.B;
    }
}
