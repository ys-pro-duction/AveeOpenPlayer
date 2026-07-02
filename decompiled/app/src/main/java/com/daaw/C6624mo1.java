package com.daaw;

/* JADX INFO: renamed from: com.daaw.mo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6624mo1 implements InterfaceC6903no1 {
    public final long a;
    public final C6345lo1 b;

    public C6624mo1(long j, long j2) {
        this.a = j;
        C7182oo1 c7182oo1 = j2 == 0 ? C7182oo1.c : new C7182oo1(0L, j2);
        this.b = new C6345lo1(c7182oo1, c7182oo1);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        return this.b;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return false;
    }
}
