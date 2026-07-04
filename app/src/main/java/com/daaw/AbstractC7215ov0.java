package com.daaw;

import android.os.Build;

/* JADX INFO: renamed from: com.daaw.ov0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7215ov0 {
    public static final InterfaceC6099kv0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new C6657mv0() : new C6936nv0();
    }

    public static final String b(String str, SO so) {
        G10.g(str, "name");
        G10.g(so, "fontWeight");
        int iO = so.o() / 100;
        if (iO >= 0 && iO < 2) {
            return str + "-thin";
        }
        if (2 <= iO && iO < 4) {
            return str + "-light";
        }
        if (iO == 4) {
            return str;
        }
        if (iO == 5) {
            return str + "-medium";
        }
        if ((6 <= iO && iO < 8) || 8 > iO || iO >= 11) {
            return str;
        }
        return str + "-black";
    }
}
