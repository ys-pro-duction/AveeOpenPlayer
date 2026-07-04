package com.daaw;

import com.google.android.gms.internal.ads.zzby;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Rn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2147Rn1 {
    public static zzby a(InterfaceC1190In1 interfaceC1190In1, boolean z) throws Throwable {
        zzby zzbyVarA = new C4661fo1().a(interfaceC1190In1, z ? null : AbstractC2365Tp1.a);
        if (zzbyVarA == null || zzbyVarA.a() == 0) {
            return null;
        }
        return zzbyVarA;
    }

    public static C2357Tn1 b(C5900kE2 c5900kE2) {
        c5900kE2.h(1);
        int iW = c5900kE2.w();
        long jL = c5900kE2.l();
        long j = iW;
        int i = iW / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jB = c5900kE2.B();
            if (jB == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jB;
            jArrCopyOf2[i2] = c5900kE2.B();
            c5900kE2.h(2);
            i2++;
        }
        c5900kE2.h((int) ((jL + j) - ((long) c5900kE2.l())));
        return new C2357Tn1(jArrCopyOf, jArrCopyOf2);
    }
}
