package com.daaw;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* JADX INFO: renamed from: com.daaw.Ph, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1891Ph {
    public static final C1891Ph a = new C1891Ph();

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
