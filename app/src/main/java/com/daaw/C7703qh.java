package com.daaw;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7703qh {
    public static final C7703qh a = new C7703qh();
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;

    /* JADX INFO: renamed from: com.daaw.qh$a */
    public static final class a {
        public static final a a = new a();

        public final int a(int i) {
            return SdkExtensions.getExtensionVersion(i);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        b = i >= 30 ? a.a.a(30) : 0;
        c = i >= 30 ? a.a.a(31) : 0;
        d = i >= 30 ? a.a.a(33) : 0;
        e = i >= 30 ? a.a.a(UtilsKt.MICROS_MULTIPLIER) : 0;
    }

    public static final boolean a(String str, String str2) {
        G10.g(str, "codename");
        G10.g(str2, "buildCodename");
        if (G10.c("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        G10.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        G10.f(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return true;
        }
        if (i < 30) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        G10.f(str, "CODENAME");
        return a("S", str);
    }
}
