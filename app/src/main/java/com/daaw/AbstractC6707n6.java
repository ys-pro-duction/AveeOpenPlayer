package com.daaw;

import android.os.Build;

/* JADX INFO: renamed from: com.daaw.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6707n6 {
    public static final InterfaceC3291av0 a() {
        return Build.VERSION.SDK_INT >= 24 ? new Z5() : new V5();
    }
}
