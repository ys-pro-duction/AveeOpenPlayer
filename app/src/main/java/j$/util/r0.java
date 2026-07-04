package j$.util;

import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r0 {
    public static final boolean a = ((Boolean) AccessController.doPrivileged(new q0(0))).booleanValue();

    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
