package com.daaw;

/* JADX INFO: renamed from: com.daaw.Zf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2948Zf0 extends AbstractC5801jt {
    public abstract AbstractC2948Zf0 k1();

    public final String l1() {
        AbstractC2948Zf0 abstractC2948Zf0K1;
        AbstractC2948Zf0 abstractC2948Zf0C = C7850rC.c();
        if (this == abstractC2948Zf0C) {
            return "Dispatchers.Main";
        }
        try {
            abstractC2948Zf0K1 = abstractC2948Zf0C.k1();
        } catch (UnsupportedOperationException unused) {
            abstractC2948Zf0K1 = null;
        }
        if (this == abstractC2948Zf0K1) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
