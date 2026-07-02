package com.daaw;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class SL2 {
    public static final HashMap g = new HashMap();
    public final Context a;
    public final TL2 b;
    public final SK2 c;
    public final NK2 d;
    public JL2 e;
    public final Object f = new Object();

    public SL2(Context context, TL2 tl2, SK2 sk2, NK2 nk2) {
        this.a = context;
        this.b = tl2;
        this.c = sk2;
        this.d = nk2;
    }

    public final VK2 a() {
        JL2 jl2;
        synchronized (this.f) {
            jl2 = this.e;
        }
        return jl2;
    }

    public final KL2 b() {
        synchronized (this.f) {
            try {
                JL2 jl2 = this.e;
                if (jl2 == null) {
                    return null;
                }
                return jl2.f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(KL2 kl2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                JL2 jl2 = new JL2(d(kl2).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.a, "msa-r", kl2.e(), null, new Bundle(), 2), kl2, this.b, this.c);
                if (!jl2.h()) {
                    throw new RL2(4000, "init failed");
                }
                int iE = jl2.e();
                if (iE != 0) {
                    throw new RL2(4001, "ci: " + iE);
                }
                synchronized (this.f) {
                    JL2 jl22 = this.e;
                    if (jl22 != null) {
                        try {
                            jl22.g();
                        } catch (RL2 e) {
                            this.c.c(e.a(), -1L, e);
                        }
                        this.e = jl2;
                    } else {
                        this.e = jl2;
                    }
                }
                this.c.d(3000, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new RL2(2004, e2);
            }
        } catch (RL2 e3) {
            this.c.c(e3.a(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.c.c(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }

    public final synchronized Class d(KL2 kl2) {
        try {
            String strV = kl2.a().V();
            HashMap map = g;
            Class cls = (Class) map.get(strV);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.d.a(kl2.c())) {
                    throw new RL2(2026, "VM did not pass signature verification");
                }
                try {
                    File fileB = kl2.b();
                    if (!fileB.exists()) {
                        fileB.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(kl2.c().getAbsolutePath(), fileB.getAbsolutePath(), null, this.a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strV, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new RL2(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new RL2(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new RL2(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new RL2(2026, e4);
            }
        } finally {
        }
    }
}
