package com.daaw;

import com.daaw.J11;

/* JADX INFO: renamed from: com.daaw.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5302i6 {
    public static final InterfaceC0793Es0 a(InterfaceC1105Hs0 interfaceC1105Hs0, int i, boolean z, long j) {
        G10.g(interfaceC1105Hs0, "paragraphIntrinsics");
        return new C4176e6((C4744g6) interfaceC1105Hs0, i, z, j, null);
    }

    public static final int d(C9206w21 c9206w21, int i) {
        int iH = c9206w21.h();
        for (int i2 = 0; i2 < iH; i2++) {
            if (c9206w21.g(i2) > i) {
                return i2;
            }
        }
        return c9206w21.h();
    }

    public static final int e(J11 j11) {
        J11.a aVar = J11.b;
        if (j11 == null ? false : J11.j(j11.m(), aVar.d())) {
            return 3;
        }
        if (j11 == null ? false : J11.j(j11.m(), aVar.e())) {
            return 4;
        }
        if (j11 == null ? false : J11.j(j11.m(), aVar.a())) {
            return 2;
        }
        if (j11 == null ? false : J11.j(j11.m(), aVar.f())) {
            return 0;
        }
        return j11 == null ? false : J11.j(j11.m(), aVar.b()) ? 1 : 0;
    }
}
