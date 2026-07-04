package com.daaw;

/* JADX INFO: renamed from: com.daaw.Br1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0469Br1 implements InterfaceC1206Ir1 {
    public final C1102Hr1 a;
    public final long b;
    public final long c;
    public final AbstractC1725Nr1 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public C0469Br1(AbstractC1725Nr1 abstractC1725Nr1, long j, long j2, long j3, long j4, boolean z) {
        AbstractC6048km2.d(j >= 0 && j2 > j);
        this.d = abstractC1725Nr1;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new C1102Hr1();
    }

    @Override // com.daaw.InterfaceC1206Ir1
    public final void a(long j) {
        this.h = Math.max(0L, Math.min(j, this.f - 1));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    @Override // com.daaw.InterfaceC1206Ir1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(com.daaw.InterfaceC1190In1 r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0469Br1.b(com.daaw.In1):long");
    }

    @Override // com.daaw.InterfaceC1206Ir1
    public final /* bridge */ /* synthetic */ InterfaceC6903no1 zze() {
        AbstractC8033rr1 abstractC8033rr1 = null;
        if (this.f != 0) {
            return new C0365Ar1(this, abstractC8033rr1);
        }
        return null;
    }
}
