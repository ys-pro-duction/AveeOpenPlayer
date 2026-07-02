package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.Wo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2673Wo1 implements InterfaceC6619mn1 {
    public final C2461Un1 a;
    public final int b;
    public final C1917Pn1 c = new C1917Pn1();

    public /* synthetic */ C2673Wo1(C2461Un1 c2461Un1, int i, AbstractC2569Vo1 abstractC2569Vo1) {
        this.a = c2461Un1;
        this.b = i;
    }

    @Override // com.daaw.InterfaceC6619mn1
    public final C6340ln1 a(InterfaceC1190In1 interfaceC1190In1, long j) throws EOFException, InterruptedIOException {
        int i = this.a.c;
        long jZzf = interfaceC1190In1.zzf();
        long jB = b(interfaceC1190In1);
        long jZze = interfaceC1190In1.zze();
        ((C9694xn1) interfaceC1190In1).l(Math.max(6, i), false);
        long jB2 = b(interfaceC1190In1);
        return (jB > j || jB2 <= j) ? jB2 <= j ? C6340ln1.f(jB2, interfaceC1190In1.zze()) : C6340ln1.d(jB, jZzf) : C6340ln1.e(jZze);
    }

    public final long b(InterfaceC1190In1 interfaceC1190In1) throws EOFException, InterruptedIOException {
        while (interfaceC1190In1.zze() < interfaceC1190In1.zzd() - 6) {
            C2461Un1 c2461Un1 = this.a;
            int i = this.b;
            C1917Pn1 c1917Pn1 = this.c;
            long jZze = interfaceC1190In1.zze();
            byte[] bArr = new byte[2];
            C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
            c9694xn1.h(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                interfaceC1190In1.zzj();
                c9694xn1.l((int) (jZze - interfaceC1190In1.zzf()), false);
            } else {
                C5900kE2 c5900kE2 = new C5900kE2(16);
                System.arraycopy(bArr, 0, c5900kE2.i(), 0, 2);
                c5900kE2.f(AbstractC1502Ln1.a(interfaceC1190In1, c5900kE2.i(), 2, 14));
                interfaceC1190In1.zzj();
                c9694xn1.l((int) (jZze - interfaceC1190In1.zzf()), false);
                if (AbstractC2043Qn1.c(c5900kE2, c2461Un1, i, c1917Pn1)) {
                    break;
                }
            }
            c9694xn1.l(1, false);
        }
        if (interfaceC1190In1.zze() < interfaceC1190In1.zzd() - 6) {
            return this.c.a;
        }
        ((C9694xn1) interfaceC1190In1).l((int) (interfaceC1190In1.zzd() - interfaceC1190In1.zze()), false);
        return this.a.j;
    }

    @Override // com.daaw.InterfaceC6619mn1
    public final /* synthetic */ void zzb() {
    }
}
