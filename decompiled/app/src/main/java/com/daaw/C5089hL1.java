package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.hL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5089hL1 {
    public final Object a = new Object();
    public final Object b = new Object();
    public C9011vL1 c;
    public C9011vL1 d;

    public static final Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final C9011vL1 a(Context context, zzcaz zzcazVar, WI2 wi2) {
        C9011vL1 c9011vL1;
        synchronized (this.a) {
            try {
                if (this.c == null) {
                    this.c = new C9011vL1(c(context), zzcazVar, (String) zzba.zzc().b(AbstractC9820yE1.a), wi2);
                }
                c9011vL1 = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9011vL1;
    }

    public final C9011vL1 b(Context context, zzcaz zzcazVar, WI2 wi2) {
        C9011vL1 c9011vL1;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    this.d = new C9011vL1(c(context), zzcazVar, (String) LF1.b.e(), wi2);
                }
                c9011vL1 = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c9011vL1;
    }
}
