package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.iT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5398iT {
    public static List a;
    public static boolean b;

    public static synchronized List a() {
        b = true;
        return a;
    }
}
