package com.daaw;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.qu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7770qu1 {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = AbstractC7770qu1.class.getName();

    public static void a(String str, Object... objArr) {
        e(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        e(str, objArr);
    }

    public static void c(Throwable th, String str, Object... objArr) {
        e(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        if (a) {
            e(str, objArr);
        }
    }

    public static String e(String str, Object... objArr) {
        String str2;
        String str3 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            }
            if (!stackTrace[i].getClassName().equals(b)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                str2 = strSubstring.substring(strSubstring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            }
            i++;
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str3);
    }
}
