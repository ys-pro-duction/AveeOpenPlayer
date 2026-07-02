package com.daaw;

/* JADX INFO: renamed from: com.daaw.vt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9166vt1 implements InterfaceC6903no1 {
    public final C6649mt1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public C9166vt1(C6649mt1 c6649mt1, int i, long j, long j2) {
        this.a = c6649mt1;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) c6649mt1.d);
        this.d = j3;
        this.e = c(j3);
    }

    private final long c(long j) {
        return AbstractC9004vJ2.D(j * ((long) this.b), 1000000L, this.a.c);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        long jMax = Math.max(0L, Math.min((((long) this.a.c) * j) / (((long) this.b) * 1000000), this.d - 1));
        long j2 = ((long) this.a.d) * jMax;
        long jC = c(jMax);
        C7182oo1 c7182oo1 = new C7182oo1(jC, this.c + j2);
        if (jC >= j || jMax == this.d - 1) {
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        long j3 = jMax + 1;
        return new C6345lo1(c7182oo1, new C7182oo1(c(j3), this.c + (j3 * ((long) this.a.d))));
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
