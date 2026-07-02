package com.daaw;

import com.google.android.gms.internal.ads.zzby;
import java.io.EOFException;

/* JADX INFO: renamed from: com.daaw.fo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4661fo1 {
    public final C5900kE2 a = new C5900kE2(10);

    public final zzby a(InterfaceC1190In1 interfaceC1190In1, InterfaceC2155Rp1 interfaceC2155Rp1) throws Throwable {
        zzby zzbyVarA = null;
        int i = 0;
        while (true) {
            try {
                ((C9694xn1) interfaceC1190In1).h(this.a.i(), 0, 10, false);
                this.a.g(0);
                if (this.a.w() != 4801587) {
                    break;
                }
                this.a.h(3);
                int iT = this.a.t();
                int i2 = iT + 10;
                if (zzbyVarA == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.i(), 0, bArr, 0, 10);
                    ((C9694xn1) interfaceC1190In1).h(bArr, 10, iT, false);
                    zzbyVarA = AbstractC2365Tp1.a(bArr, i2, interfaceC2155Rp1, new C9704xp1());
                } else {
                    ((C9694xn1) interfaceC1190In1).l(iT, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        interfaceC1190In1.zzj();
        ((C9694xn1) interfaceC1190In1).l(i, false);
        return zzbyVarA;
    }
}
