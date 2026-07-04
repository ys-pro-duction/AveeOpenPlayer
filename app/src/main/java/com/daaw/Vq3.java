package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Vq3 implements Fs3 {
    public long a;
    public long b;
    public Es3 c;
    public Vq3 d;

    public Vq3(long j, int i) {
        c(j, 65536);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.c.b;
        return (int) j2;
    }

    public final Vq3 b() {
        this.c = null;
        Vq3 vq3 = this.d;
        this.d = null;
        return vq3;
    }

    public final void c(long j, int i) {
        AbstractC6048km2.f(this.c == null);
        this.a = j;
        this.b = j + 65536;
    }

    @Override // com.daaw.Fs3
    public final Es3 zzc() {
        Es3 es3 = this.c;
        es3.getClass();
        return es3;
    }

    @Override // com.daaw.Fs3
    public final Fs3 zzd() {
        Vq3 vq3 = this.d;
        if (vq3 == null || vq3.c == null) {
            return null;
        }
        return vq3;
    }
}
