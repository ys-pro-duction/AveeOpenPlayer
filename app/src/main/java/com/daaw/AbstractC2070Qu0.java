package com.daaw;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Qu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2070Qu0 {
    public static final Logger a = Logger.getLogger(AbstractC2070Qu0.class.getName());
    public static final InterfaceC0476Bt0 b = b();

    /* JADX INFO: renamed from: com.daaw.Qu0$b */
    public static final class b implements InterfaceC0476Bt0 {
        public b() {
        }
    }

    public static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    public static InterfaceC0476Bt0 b() {
        return new b();
    }

    public static boolean c(String str) {
        return str == null || str.isEmpty();
    }

    public static long d() {
        return System.nanoTime();
    }
}
