package com.daaw;

import com.daaw.InterfaceC1727Ns;

/* JADX INFO: renamed from: com.daaw.vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC9104vh {
    public static final InterfaceC8062ry a(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, EnumC8599tt enumC8599tt, InterfaceC3429bR interfaceC3429bR) {
        InterfaceC4684ft interfaceC4684ftE = AbstractC4963gt.e(interfaceC7484pt, interfaceC4684ft);
        C8341sy r90 = enumC8599tt.g() ? new R90(interfaceC4684ftE, interfaceC3429bR) : new C8341sy(interfaceC4684ftE, true);
        r90.U0(enumC8599tt, r90, interfaceC3429bR);
        return r90;
    }

    public static /* synthetic */ InterfaceC8062ry b(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, EnumC8599tt enumC8599tt, InterfaceC3429bR interfaceC3429bR, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4684ft = C5905kG.B;
        }
        if ((i & 2) != 0) {
            enumC8599tt = EnumC8599tt.DEFAULT;
        }
        return AbstractC8539th.a(interfaceC7484pt, interfaceC4684ft, enumC8599tt, interfaceC3429bR);
    }

    public static final U30 c(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, EnumC8599tt enumC8599tt, InterfaceC3429bR interfaceC3429bR) {
        InterfaceC4684ft interfaceC4684ftE = AbstractC4963gt.e(interfaceC7484pt, interfaceC4684ft);
        UV0 c5712jb0 = enumC8599tt.g() ? new C5712jb0(interfaceC4684ftE, interfaceC3429bR) : new UV0(interfaceC4684ftE, true);
        c5712jb0.U0(enumC8599tt, c5712jb0, interfaceC3429bR);
        return c5712jb0;
    }

    public static /* synthetic */ U30 d(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, EnumC8599tt enumC8599tt, InterfaceC3429bR interfaceC3429bR, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4684ft = C5905kG.B;
        }
        if ((i & 2) != 0) {
            enumC8599tt = EnumC8599tt.DEFAULT;
        }
        return AbstractC8539th.c(interfaceC7484pt, interfaceC4684ft, enumC8599tt, interfaceC3429bR);
    }

    public static final Object e(InterfaceC4684ft interfaceC4684ft, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        Object objV0;
        InterfaceC4684ft context = interfaceC1416Ks.getContext();
        InterfaceC4684ft interfaceC4684ftD = AbstractC4963gt.d(context, interfaceC4684ft);
        AbstractC3053a40.i(interfaceC4684ftD);
        if (interfaceC4684ftD == context) {
            ON0 on0 = new ON0(interfaceC4684ftD, interfaceC1416Ks);
            objV0 = A91.b(on0, on0, interfaceC3429bR);
        } else {
            InterfaceC1727Ns.b bVar = InterfaceC1727Ns.e;
            if (G10.c(interfaceC4684ftD.a(bVar), context.a(bVar))) {
                C10078z91 c10078z91 = new C10078z91(interfaceC4684ftD, interfaceC1416Ks);
                InterfaceC4684ft context2 = c10078z91.getContext();
                Object objC = AbstractC5010h31.c(context2, null);
                try {
                    Object objB = A91.b(c10078z91, c10078z91, interfaceC3429bR);
                    AbstractC5010h31.a(context2, objC);
                    objV0 = objB;
                } catch (Throwable th) {
                    AbstractC5010h31.a(context2, objC);
                    throw th;
                }
            } else {
                C6735nC c6735nC = new C6735nC(interfaceC4684ftD, interfaceC1416Ks);
                AbstractC4913gj.d(interfaceC3429bR, c6735nC, c6735nC, null, 4, null);
                objV0 = c6735nC.V0();
            }
        }
        if (objV0 == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objV0;
    }
}
