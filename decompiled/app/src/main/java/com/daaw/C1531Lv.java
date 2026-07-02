package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1531Lv implements InterfaceC1428Kv {
    public final C2133Rk a;
    public final long b;

    public C1531Lv(C2133Rk c2133Rk, long j) {
        this.a = c2133Rk;
        this.b = j;
    }

    @Override // com.daaw.InterfaceC1428Kv
    public long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // com.daaw.InterfaceC1428Kv
    public long c(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // com.daaw.InterfaceC1428Kv
    public C7859rE0 d(long j) {
        return new C7859rE0(null, this.a.c[(int) j], r1.b[r8]);
    }

    @Override // com.daaw.InterfaceC1428Kv
    public long e(long j, long j2) {
        return this.a.a(j + this.b);
    }

    @Override // com.daaw.InterfaceC1428Kv
    public boolean f() {
        return true;
    }

    @Override // com.daaw.InterfaceC1428Kv
    public long g() {
        return 0L;
    }

    @Override // com.daaw.InterfaceC1428Kv
    public int h(long j) {
        return this.a.a;
    }
}
