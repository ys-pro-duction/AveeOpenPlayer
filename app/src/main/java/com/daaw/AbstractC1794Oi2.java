package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.daaw.Oi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1794Oi2 implements InterfaceC6028ki2 {
    public C3503bh2 b;
    public C3503bh2 c;
    public C3503bh2 d;
    public C3503bh2 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public AbstractC1794Oi2() {
        ByteBuffer byteBuffer = InterfaceC6028ki2.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.d = c3503bh2;
        this.e = c3503bh2;
        this.b = c3503bh2;
        this.c = c3503bh2;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final C3503bh2 a(C3503bh2 c3503bh2) {
        this.d = c3503bh2;
        this.e = c(c3503bh2);
        return zzg() ? this.e : C3503bh2.e;
    }

    public abstract C3503bh2 c(C3503bh2 c3503bh2);

    public final ByteBuffer d(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public final boolean h() {
        return this.g.hasRemaining();
    }

    @Override // com.daaw.InterfaceC6028ki2
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC6028ki2.a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzc() {
        this.g = InterfaceC6028ki2.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzd() {
        this.h = true;
        f();
    }

    @Override // com.daaw.InterfaceC6028ki2
    public final void zzf() {
        zzc();
        this.f = InterfaceC6028ki2.a;
        C3503bh2 c3503bh2 = C3503bh2.e;
        this.d = c3503bh2;
        this.e = c3503bh2;
        this.b = c3503bh2;
        this.c = c3503bh2;
        g();
    }

    @Override // com.daaw.InterfaceC6028ki2
    public boolean zzg() {
        return this.e != C3503bh2.e;
    }

    @Override // com.daaw.InterfaceC6028ki2
    public boolean zzh() {
        return this.h && this.g == InterfaceC6028ki2.a;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }
}
