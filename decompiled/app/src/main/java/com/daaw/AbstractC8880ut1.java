package com.daaw;

import android.util.Pair;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.ut1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8880ut1 {
    public static Pair a(InterfaceC1190In1 interfaceC1190In1) throws QT1, EOFException, InterruptedIOException {
        interfaceC1190In1.zzj();
        C8601tt1 c8601tt1D = d(1684108385, interfaceC1190In1, new C5900kE2(8));
        ((C9694xn1) interfaceC1190In1).m(8, false);
        return Pair.create(Long.valueOf(interfaceC1190In1.zzf()), Long.valueOf(c8601tt1D.b));
    }

    public static C6649mt1 b(InterfaceC1190In1 interfaceC1190In1) throws QT1, EOFException, InterruptedIOException {
        byte[] bArr;
        C5900kE2 c5900kE2 = new C5900kE2(16);
        C8601tt1 c8601tt1D = d(1718449184, interfaceC1190In1, c5900kE2);
        AbstractC6048km2.f(c8601tt1D.b >= 16);
        C9694xn1 c9694xn1 = (C9694xn1) interfaceC1190In1;
        c9694xn1.h(c5900kE2.i(), 0, 16, false);
        c5900kE2.g(0);
        int iS = c5900kE2.s();
        int iS2 = c5900kE2.s();
        int iR = c5900kE2.r();
        int iR2 = c5900kE2.r();
        int iS3 = c5900kE2.s();
        int iS4 = c5900kE2.s();
        int i = ((int) c8601tt1D.b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            c9694xn1.h(bArr, 0, i, false);
        } else {
            bArr = AbstractC9004vJ2.f;
        }
        byte[] bArr2 = bArr;
        ((C9694xn1) interfaceC1190In1).m((int) (interfaceC1190In1.zze() - interfaceC1190In1.zzf()), false);
        return new C6649mt1(iS, iS2, iR, iR2, iS3, iS4, bArr2);
    }

    public static boolean c(InterfaceC1190In1 interfaceC1190In1) {
        C5900kE2 c5900kE2 = new C5900kE2(8);
        int i = C8601tt1.a(interfaceC1190In1, c5900kE2).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((C9694xn1) interfaceC1190In1).h(c5900kE2.i(), 0, 4, false);
        c5900kE2.g(0);
        int iO = c5900kE2.o();
        if (iO == 1463899717) {
            return true;
        }
        AbstractC3305ay2.c("WavHeaderReader", "Unsupported form type: " + iO);
        return false;
    }

    public static C8601tt1 d(int i, InterfaceC1190In1 interfaceC1190In1, C5900kE2 c5900kE2) throws QT1, EOFException, InterruptedIOException {
        C8601tt1 c8601tt1A = C8601tt1.a(interfaceC1190In1, c5900kE2);
        while (true) {
            int i2 = c8601tt1A.a;
            if (i2 == i) {
                return c8601tt1A;
            }
            AbstractC3305ay2.f("WavHeaderReader", "Ignoring unknown WAV chunk: " + i2);
            long j = c8601tt1A.b + 8;
            if (j > 2147483647L) {
                throw QT1.c("Chunk is too large (~2GB+) to skip; id: " + c8601tt1A.a);
            }
            ((C9694xn1) interfaceC1190In1).m((int) j, false);
            c8601tt1A = C8601tt1.a(interfaceC1190In1, c5900kE2);
        }
    }
}
