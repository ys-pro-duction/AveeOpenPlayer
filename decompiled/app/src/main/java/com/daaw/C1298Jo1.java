package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1298Jo1 implements InterfaceC6903no1 {
    public final long a;
    public final /* synthetic */ C1609Mo1 b;

    public C1298Jo1(C1609Mo1 c1609Mo1, long j) {
        this.b = c1609Mo1;
        this.a = j;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        C6345lo1 c6345lo1A = this.b.g[0].a(j);
        int i = 1;
        while (true) {
            C1609Mo1 c1609Mo1 = this.b;
            if (i >= c1609Mo1.g.length) {
                return c6345lo1A;
            }
            C6345lo1 c6345lo1A2 = c1609Mo1.g[i].a(j);
            if (c6345lo1A2.a.b < c6345lo1A.a.b) {
                c6345lo1A = c6345lo1A2;
            }
            i++;
        }
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
