package com.daaw;

/* JADX INFO: renamed from: com.daaw.oR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7077oR2 {
    public static final C7077oR2 c;
    public static final C7077oR2 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (AbstractC9873yR2.E) {
            d = null;
            c = null;
        } else {
            d = new C7077oR2(false, null);
            c = new C7077oR2(true, null);
        }
    }

    public C7077oR2(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}
