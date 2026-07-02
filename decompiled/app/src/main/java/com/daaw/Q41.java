package com.daaw;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class Q41 {
    public static final Q41 a = new Q41();

    public final Object a(String str) {
        G10.g(str, "name");
        Trace.beginSection(str);
        return null;
    }

    public final void b(Object obj) {
        Trace.endSection();
    }
}
