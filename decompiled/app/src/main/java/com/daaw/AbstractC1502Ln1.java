package com.daaw;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.daaw.Ln1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1502Ln1 {
    public static int a(InterfaceC1190In1 interfaceC1190In1, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int iG = interfaceC1190In1.g(bArr, i + i3, i2 - i3);
            if (iG == -1) {
                break;
            }
            i3 += iG;
        }
        return i3;
    }

    public static void b(boolean z, String str) throws QT1 {
        if (!z) {
            throw QT1.a(str, null);
        }
    }

    public static boolean c(InterfaceC1190In1 interfaceC1190In1, byte[] bArr, int i, int i2, boolean z) throws EOFException {
        try {
            return interfaceC1190In1.h(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean d(InterfaceC1190In1 interfaceC1190In1, byte[] bArr, int i, int i2) throws InterruptedIOException {
        try {
            ((C9694xn1) interfaceC1190In1).f(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC1190In1 interfaceC1190In1, int i) throws InterruptedIOException {
        try {
            ((C9694xn1) interfaceC1190In1).m(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
