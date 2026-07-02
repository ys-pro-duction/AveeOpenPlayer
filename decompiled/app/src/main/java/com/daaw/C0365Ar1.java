package com.daaw;

import java.math.BigInteger;

/* JADX INFO: renamed from: com.daaw.Ar1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0365Ar1 implements InterfaceC6903no1 {
    public final /* synthetic */ C0469Br1 a;

    public /* synthetic */ C0365Ar1(C0469Br1 c0469Br1, AbstractC8033rr1 abstractC8033rr1) {
        this.a = c0469Br1;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        C0469Br1 c0469Br1 = this.a;
        long jF = c0469Br1.d.f(j);
        long j2 = c0469Br1.b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jF);
        C0469Br1 c0469Br12 = this.a;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(c0469Br12.c - c0469Br12.b)).divide(BigInteger.valueOf(this.a.f)).longValue();
        C7182oo1 c7182oo1 = new C7182oo1(j, Math.max(this.a.b, Math.min(jLongValue - 30000, r0.c - 1)));
        return new C6345lo1(c7182oo1, c7182oo1);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        C0469Br1 c0469Br1 = this.a;
        return c0469Br1.d.e(c0469Br1.f);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return true;
    }
}
