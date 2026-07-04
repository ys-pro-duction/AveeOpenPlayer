package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ts1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2377Ts1 implements InterfaceC6619mn1 {
    public final C5916kI2 a;
    public final C5900kE2 b = new C5900kE2();
    public final int c;

    public C2377Ts1(int i, C5916kI2 c5916kI2, int i2) {
        this.c = i;
        this.a = c5916kI2;
    }

    @Override // com.daaw.InterfaceC6619mn1
    public final C6340ln1 a(InterfaceC1190In1 interfaceC1190In1, long j) {
        int iA;
        int iA2;
        long jZzf = interfaceC1190In1.zzf();
        int iMin = (int) Math.min(112800L, interfaceC1190In1.zzd() - jZzf);
        this.b.d(iMin);
        ((C9694xn1) interfaceC1190In1).h(this.b.i(), 0, iMin, false);
        C5900kE2 c5900kE2 = this.b;
        int iM = c5900kE2.m();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (c5900kE2.j() >= 188 && (iA2 = (iA = AbstractC4686ft1.a(c5900kE2.i(), c5900kE2.l(), iM)) + 188) <= iM) {
            long jB = AbstractC4686ft1.b(c5900kE2, iA, this.c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.a.b(jB);
                if (jB2 > j) {
                    return j3 == -9223372036854775807L ? C6340ln1.d(jB2, jZzf) : C6340ln1.e(jZzf + j4);
                }
                j4 = iA;
                if (100000 + jB2 > j) {
                    return C6340ln1.e(jZzf + j4);
                }
                j3 = jB2;
            }
            c5900kE2.g(iA2);
            j2 = iA2;
        }
        return j3 != -9223372036854775807L ? C6340ln1.f(j3, jZzf + j2) : C6340ln1.d;
    }

    @Override // com.daaw.InterfaceC6619mn1
    public final void zzb() {
        byte[] bArr = AbstractC9004vJ2.f;
        int length = bArr.length;
        this.b.e(bArr, 0);
    }
}
