package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C30 {
    public static final B30 a(C81 c81, boolean z, boolean z2, Z71 z71) {
        G10.g(c81, "<this>");
        return new B30(c81, null, z2, z, z71 != null ? AbstractC9588xQ0.c(z71) : null, null, 34, null);
    }

    public static /* synthetic */ B30 b(C81 c81, boolean z, boolean z2, Z71 z71, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z71 = null;
        }
        return a(c81, z, z2, z71);
    }
}
