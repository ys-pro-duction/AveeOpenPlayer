package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class UW2 {
    public static final Logger a = Logger.getLogger(UW2.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static Boolean a() {
        try {
            int i = Conscrypt.a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return b.get();
    }
}
