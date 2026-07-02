package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class OE1 {
    public final Map a = new HashMap();
    public final VE1 b;

    public OE1(VE1 ve1) {
        this.b = ve1;
    }

    public final VE1 a() {
        return this.b;
    }

    public final void b(String str, NE1 ne1) {
        this.a.put(str, ne1);
    }

    public final void c(String str, String str2, long j) {
        NE1 ne1 = (NE1) this.a.get(str2);
        String[] strArr = {str};
        if (ne1 != null) {
            this.b.e(ne1, j, strArr);
        }
        this.a.put(str, new NE1(j, null, null));
    }
}
