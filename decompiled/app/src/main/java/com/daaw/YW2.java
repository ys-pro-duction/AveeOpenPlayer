package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class YW2 {
    public final Map a;
    public final Map b;

    public /* synthetic */ YW2(Map map, Map map2, XW2 xw2) {
        this.a = map;
        this.b = map2;
    }

    public static WW2 a() {
        return new WW2(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r3) throws GeneralSecurityException {
        Object obj = this.a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
