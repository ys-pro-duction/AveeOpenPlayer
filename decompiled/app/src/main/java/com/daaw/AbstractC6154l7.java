package com.daaw;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: com.daaw.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6154l7 {
    public static final AbstractC8664u7 b(InterfaceC3626c71 interfaceC3626c71, Object obj) {
        if (obj == null) {
            return null;
        }
        return (AbstractC8664u7) interfaceC3626c71.a().invoke(obj);
    }

    public static final Y61 c(int i, int i2, InterfaceC4216eF interfaceC4216eF) {
        G10.g(interfaceC4216eF, "easing");
        return new Y61(i, i2, interfaceC4216eF);
    }

    public static /* synthetic */ Y61 d(int i, int i2, InterfaceC4216eF interfaceC4216eF, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            interfaceC4216eF = AbstractC4495fF.a();
        }
        return c(i, i2, interfaceC4216eF);
    }
}
