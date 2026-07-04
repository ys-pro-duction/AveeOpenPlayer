package com.daaw;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class U80 {
    public static boolean a = false;
    public static boolean b = false;
    public static String[] c;
    public static long[] d;
    public static int e;
    public static int f;
    public static InterfaceC6857nf0 g;
    public static InterfaceC6578mf0 h;
    public static volatile C0452Bn0 i;
    public static volatile C9693xn0 j;

    public class a implements InterfaceC6578mf0 {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.daaw.InterfaceC6578mf0
        public File a() {
            return new File(this.a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (b) {
            int i2 = e;
            if (i2 == 20) {
                f++;
                return;
            }
            c[i2] = str;
            d[i2] = System.nanoTime();
            S41.a(str);
            e++;
        }
    }

    public static float b(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        }
        if (!b) {
            return 0.0f;
        }
        int i3 = e - 1;
        e = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(c[i3])) {
            S41.b();
            return (System.nanoTime() - d[e]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
    }

    public static C9693xn0 c(Context context) {
        C9693xn0 c9693xn0;
        Context applicationContext = context.getApplicationContext();
        C9693xn0 c9693xn02 = j;
        if (c9693xn02 != null) {
            return c9693xn02;
        }
        synchronized (C9693xn0.class) {
            try {
                c9693xn0 = j;
                if (c9693xn0 == null) {
                    InterfaceC6578mf0 aVar = h;
                    if (aVar == null) {
                        aVar = new a(applicationContext);
                    }
                    c9693xn0 = new C9693xn0(aVar);
                    j = c9693xn0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9693xn0;
    }

    public static C0452Bn0 d(Context context) {
        C0452Bn0 c0452Bn0;
        C0452Bn0 c0452Bn02 = i;
        if (c0452Bn02 != null) {
            return c0452Bn02;
        }
        synchronized (C0452Bn0.class) {
            try {
                c0452Bn0 = i;
                if (c0452Bn0 == null) {
                    C9693xn0 c9693xn0C = c(context);
                    InterfaceC6857nf0 c1020Gx = g;
                    if (c1020Gx == null) {
                        c1020Gx = new C1020Gx();
                    }
                    c0452Bn0 = new C0452Bn0(c9693xn0C, c1020Gx);
                    i = c0452Bn0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0452Bn0;
    }
}
