package com.daaw;

import com.daaw.C9992yr0;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;

/* JADX INFO: loaded from: classes4.dex */
public class PS0 {
    public static int n = 20;
    public static final String o = null;
    public static String p;
    public int a = n;
    public boolean b = false;
    public DateFormat c = null;
    public boolean d = true;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;
    public String i = "System.err";
    public C9992yr0 j = null;
    public boolean k = false;
    public String l = "WARN";
    public final Properties m = new Properties();

    public static /* synthetic */ InputStream a() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader != null ? contextClassLoader.getResourceAsStream("simplelogger.properties") : ClassLoader.getSystemResourceAsStream("simplelogger.properties");
    }

    public static C9992yr0 b(String str, boolean z) {
        if ("System.err".equalsIgnoreCase(str)) {
            return z ? new C9992yr0(C9992yr0.b.CACHED_SYS_ERR) : new C9992yr0(C9992yr0.b.SYS_ERR);
        }
        if ("System.out".equalsIgnoreCase(str)) {
            return z ? new C9992yr0(C9992yr0.b.CACHED_SYS_OUT) : new C9992yr0(C9992yr0.b.SYS_OUT);
        }
        try {
            return new C9992yr0(new PrintStream(new FileOutputStream(str)));
        } catch (FileNotFoundException e) {
            AbstractC7953rb1.d("Could not open [" + str + "]. Defaulting to System.err", e);
            return new C9992yr0(C9992yr0.b.SYS_ERR);
        }
    }

    public static int h(String str) {
        if ("trace".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("debug".equalsIgnoreCase(str)) {
            return 10;
        }
        if ("info".equalsIgnoreCase(str)) {
            return 20;
        }
        if ("warn".equalsIgnoreCase(str)) {
            return 30;
        }
        if ("error".equalsIgnoreCase(str)) {
            return 40;
        }
        return "off".equalsIgnoreCase(str) ? 50 : 20;
    }

    public boolean c(String str, boolean z) {
        String strD = d(str);
        return strD == null ? z : "true".equalsIgnoreCase(strD);
    }

    public String d(String str) {
        String property;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        return property == null ? this.m.getProperty(str) : property;
    }

    public String e(String str, String str2) {
        String strD = d(str);
        return strD == null ? str2 : strD;
    }

    public void f() {
        g();
        String strE = e("org.slf4j.simpleLogger.defaultLogLevel", null);
        if (strE != null) {
            this.a = h(strE);
        }
        this.f = c("org.slf4j.simpleLogger.showLogName", true);
        this.g = c("org.slf4j.simpleLogger.showShortLogName", false);
        this.b = c("org.slf4j.simpleLogger.showDateTime", false);
        this.d = c("org.slf4j.simpleLogger.showThreadName", true);
        this.e = c("org.slf4j.simpleLogger.showThreadId", false);
        p = e("org.slf4j.simpleLogger.dateTimeFormat", o);
        this.h = c("org.slf4j.simpleLogger.levelInBrackets", false);
        this.l = e("org.slf4j.simpleLogger.warnLevelString", "WARN");
        this.i = e("org.slf4j.simpleLogger.logFile", this.i);
        boolean zC = c("org.slf4j.simpleLogger.cacheOutputStream", false);
        this.k = zC;
        this.j = b(this.i, zC);
        if (p != null) {
            try {
                this.c = new SimpleDateFormat(p);
            } catch (IllegalArgumentException e) {
                AbstractC7953rb1.d("Bad date format in simplelogger.properties; will output relative time", e);
            }
        }
    }

    public final void g() {
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction() { // from class: com.daaw.OS0
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return PS0.a();
            }
        });
        try {
            if (inputStream != null) {
                try {
                    this.m.load(inputStream);
                    inputStream.close();
                } catch (IOException unused) {
                    inputStream.close();
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        } catch (IOException unused3) {
        }
    }
}
