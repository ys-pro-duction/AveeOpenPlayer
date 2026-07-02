package com.daaw;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AU1 {
    public static volatile AU1 b;
    public static final AU1 c = new AU1(true);
    public final Map a = Collections.EMPTY_MAP;

    public AU1(boolean z) {
    }

    public static AU1 a() {
        AU1 au1 = b;
        if (au1 != null) {
            return au1;
        }
        synchronized (AU1.class) {
            try {
                AU1 au12 = b;
                if (au12 != null) {
                    return au12;
                }
                AU1 au1A = AbstractC9625xZ1.a(AU1.class);
                b = au1A;
                return au1A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC9486x22 b(InterfaceC7467pp2 interfaceC7467pp2, int i) {
        AbstractC6314li0.a(this.a.get(new TT1(interfaceC7467pp2, i)));
        return null;
    }
}
