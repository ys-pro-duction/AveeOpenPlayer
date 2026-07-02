package com.daaw;

import com.daaw.GC;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T30 implements GC.g {
    public static final Throwable a = a();

    public static Throwable a() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (Error e2) {
            return e2;
        } catch (RuntimeException e3) {
            return e3;
        }
    }
}
