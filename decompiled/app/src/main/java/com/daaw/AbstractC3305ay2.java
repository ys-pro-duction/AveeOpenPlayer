package com.daaw;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: renamed from: com.daaw.ay2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3305ay2 {
    public static final Object a = new Object();
    public static final InterfaceC10300zx2 b = InterfaceC10300zx2.a;

    public static String a(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        return str + "\n  " + strReplace.replace("\n", "\n  ") + "\n";
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            a(str2, null);
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            a(str2, null);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            a(str2, th);
        }
    }

    public static void e(String str, String str2) {
        synchronized (a) {
            a(str2, null);
        }
    }

    public static void f(String str, String str2) {
        synchronized (a) {
            a(str2, null);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (a) {
            a(str2, th);
        }
    }
}
