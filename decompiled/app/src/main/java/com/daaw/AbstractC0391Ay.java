package com.daaw;

import com.daaw.InterfaceC4684ft;

/* JADX INFO: renamed from: com.daaw.Ay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0391Ay {
    public static final Object a(long j, InterfaceC1416Ks interfaceC1416Ks) {
        if (j <= 0) {
            return G91.a;
        }
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        if (j < Long.MAX_VALUE) {
            b(c4067dj.getContext()).N(j, c4067dj);
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    public static final InterfaceC10301zy b(InterfaceC4684ft interfaceC4684ft) {
        InterfaceC4684ft.b bVarA = interfaceC4684ft.a(InterfaceC1727Ns.e);
        InterfaceC10301zy interfaceC10301zy = bVarA instanceof InterfaceC10301zy ? (InterfaceC10301zy) bVarA : null;
        return interfaceC10301zy == null ? AbstractC5259hx.a() : interfaceC10301zy;
    }
}
