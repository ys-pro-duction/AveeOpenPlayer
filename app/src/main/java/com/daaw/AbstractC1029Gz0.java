package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1029Gz0 {
    public static final QE0 a(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh, EnumC8599tt enumC8599tt, NQ nq, InterfaceC3429bR interfaceC3429bR) {
        C1133Hz0 c1133Hz0 = new C1133Hz0(AbstractC4963gt.e(interfaceC7484pt, interfaceC4684ft), AbstractC6035kk.b(i, enumC5182hh, null, 4, null));
        if (nq != null) {
            c1133Hz0.E0(nq);
        }
        c1133Hz0.U0(enumC8599tt, c1133Hz0, interfaceC3429bR);
        return c1133Hz0;
    }

    public static /* synthetic */ QE0 b(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh, EnumC8599tt enumC8599tt, NQ nq, InterfaceC3429bR interfaceC3429bR, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4684ft = C5905kG.B;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            enumC5182hh = EnumC5182hh.SUSPEND;
        }
        if ((i2 & 8) != 0) {
            enumC8599tt = EnumC8599tt.DEFAULT;
        }
        if ((i2 & 16) != 0) {
            nq = null;
        }
        NQ nq2 = nq;
        return a(interfaceC7484pt, interfaceC4684ft, i, enumC5182hh, enumC8599tt, nq2, interfaceC3429bR);
    }
}
