package com.daaw;

import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class LW {
    public static Method a;

    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    public static class b {
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        try {
            return a.a((Locale) a.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return a.a(locale);
        }
    }
}
