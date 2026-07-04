package com.daaw;

/* JADX INFO: renamed from: com.daaw.hn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5214hn1 implements InterfaceC6903no1 {
    public final InterfaceC6052kn1 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public C5214hn1(InterfaceC6052kn1 interfaceC6052kn1, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = interfaceC6052kn1;
        this.b = j;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        C7182oo1 c7182oo1 = new C7182oo1(j, C5773jn1.f(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new C6345lo1(c7182oo1, c7182oo1);
    }

    public final long g(long j) {
        return this.a.a(j);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
