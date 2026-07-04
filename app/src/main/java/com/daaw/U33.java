package com.daaw;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class U33 {
    public static volatile U33 b;
    public static final U33 c = new U33(true);
    public final Map a = Collections.EMPTY_MAP;

    public U33(boolean z) {
    }

    public static U33 a() {
        return c;
    }

    public static U33 b() {
        U33 u33 = b;
        if (u33 != null) {
            return u33;
        }
        synchronized (U33.class) {
            try {
                U33 u332 = b;
                if (u332 != null) {
                    return u332;
                }
                U33 u33A = AbstractC3335b43.a(U33.class);
                b = u33A;
                return u33A;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC4170e43 c(U43 u43, int i) {
        AbstractC6314li0.a(this.a.get(new T33(u43, i)));
        return null;
    }
}
