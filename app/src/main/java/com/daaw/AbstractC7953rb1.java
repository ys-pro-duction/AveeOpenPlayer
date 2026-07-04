package com.daaw;

/* JADX INFO: renamed from: com.daaw.rb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7953rb1 {
    public static b a = null;
    public static boolean b = false;

    /* JADX INFO: renamed from: com.daaw.rb1$b */
    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public Class[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class a() {
        int i;
        b bVarB = b();
        if (bVarB == null) {
            return null;
        }
        Class[] classContext = bVarB.getClassContext();
        String name = AbstractC7953rb1.class.getName();
        int i2 = 0;
        while (i2 < classContext.length && !name.equals(classContext[i2].getName())) {
            i2++;
        }
        if (i2 >= classContext.length || (i = i2 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i];
    }

    public static b b() {
        b bVar = a;
        if (bVar != null) {
            return bVar;
        }
        if (b) {
            return null;
        }
        b bVarE = e();
        a = bVarE;
        b = true;
        return bVarE;
    }

    public static final void c(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void d(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static b e() {
        try {
            return new b();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean f(String str) {
        String strG = g(str);
        if (strG == null) {
            return false;
        }
        return strG.equalsIgnoreCase("true");
    }

    public static String g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
