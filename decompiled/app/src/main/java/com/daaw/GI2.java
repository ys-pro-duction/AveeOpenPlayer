package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class GI2 implements EI2 {
    public final Context a;
    public final int o;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int p = 2;
    public int q = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public boolean m = false;
    public boolean n = false;

    public GI2(Context context, int i) {
        this.a = context;
        this.o = i;
    }

    public final synchronized GI2 A(boolean z) {
        this.d = z;
        return this;
    }

    public final synchronized GI2 B(Throwable th) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.A8)).booleanValue()) {
            this.k = RO1.f(th);
            this.j = (String) C10140zO2.c(TN2.b('\n')).d(RO1.e(th)).iterator().next();
        }
        return this;
    }

    public final synchronized GI2 C() {
        Configuration configuration;
        this.e = zzt.zzq().zzn(this.a);
        Resources resources = this.a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.q = i;
        this.b = zzt.zzB().b();
        this.n = true;
        return this;
    }

    public final synchronized GI2 D() {
        this.c = zzt.zzB().b();
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 a(String str) {
        z(str);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 b(int i) {
        n(i);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 c(C8988vF2 c8988vF2) {
        w(c8988vF2);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 d(zze zzeVar) {
        v(zzeVar);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 e(Throwable th) {
        B(th);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 l(String str) {
        y(str);
        return this;
    }

    public final synchronized GI2 n(int i) {
        this.p = i;
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 o(String str) {
        x(str);
        return this;
    }

    public final synchronized GI2 v(zze zzeVar) {
        try {
            IBinder iBinder = zzeVar.zze;
            if (iBinder == null) {
                return this;
            }
            K62 k62 = (K62) iBinder;
            String strZzk = k62.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.f = strZzk;
            }
            String strZzi = k62.zzi();
            if (!TextUtils.isEmpty(strZzi)) {
                this.g = strZzi;
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r2.g = r0.d0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.daaw.GI2 w(com.daaw.C8988vF2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.daaw.jF2 r0 = r3.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L12
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L14
            com.daaw.jF2 r0 = r3.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.b     // Catch: java.lang.Throwable -> L12
            r2.f = r0     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r3 = move-exception
            goto L34
        L14:
            java.util.List r3 = r3.a     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L12
        L1a:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L32
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L12
            com.daaw.fF2 r0 = (com.daaw.C4498fF2) r0     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.d0     // Catch: java.lang.Throwable -> L12
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L1a
            java.lang.String r3 = r0.d0     // Catch: java.lang.Throwable -> L12
            r2.g = r3     // Catch: java.lang.Throwable -> L12
        L32:
            monitor-exit(r2)
            return r2
        L34:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.GI2.w(com.daaw.vF2):com.daaw.GI2");
    }

    public final synchronized GI2 x(String str) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.A8)).booleanValue()) {
            this.l = str;
        }
        return this;
    }

    public final synchronized GI2 y(String str) {
        this.h = str;
        return this;
    }

    public final synchronized GI2 z(String str) {
        this.i = str;
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 zzf(boolean z) {
        A(z);
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 zzh() {
        C();
        return this;
    }

    @Override // com.daaw.EI2
    public final /* bridge */ /* synthetic */ EI2 zzi() {
        D();
        return this;
    }

    @Override // com.daaw.EI2
    public final synchronized boolean zzj() {
        return this.n;
    }

    @Override // com.daaw.EI2
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // com.daaw.EI2
    public final synchronized II2 zzl() {
        try {
            HI2 hi2 = null;
            if (this.m) {
                return null;
            }
            this.m = true;
            if (!this.n) {
                C();
            }
            if (this.c < 0) {
                D();
            }
            return new II2(this, hi2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
