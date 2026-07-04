package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class TI2 implements Runnable {
    public final WI2 C;
    public String D;
    public String E;
    public C8988vF2 F;
    public zze G;
    public Future H;
    public final List B = new ArrayList();
    public int I = 2;

    public TI2(WI2 wi2) {
        this.C = wi2;
    }

    public final synchronized TI2 a(EI2 ei2) {
        try {
            if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
                List list = this.B;
                ei2.zzi();
                list.add(ei2);
                Future future = this.H;
                if (future != null) {
                    future.cancel(false);
                }
                this.H = AbstractC9322wT1.d.schedule(this, ((Integer) zzba.zzc().b(AbstractC9820yE1.y8)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized TI2 b(String str) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue() && SI2.e(str)) {
            this.D = str;
        }
        return this;
    }

    public final synchronized TI2 c(zze zzeVar) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            this.G = zzeVar;
        }
        return this;
    }

    public final synchronized TI2 d(ArrayList arrayList) {
        try {
            if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.I = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.I = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.I = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.I = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.I = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.I = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized TI2 e(String str) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            this.E = str;
        }
        return this;
    }

    public final synchronized TI2 f(C8988vF2 c8988vF2) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            this.F = c8988vF2;
        }
        return this;
    }

    public final synchronized void g() {
        try {
            if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
                Future future = this.H;
                if (future != null) {
                    future.cancel(false);
                }
                for (EI2 ei2 : this.B) {
                    int i = this.I;
                    if (i != 2) {
                        ei2.b(i);
                    }
                    if (!TextUtils.isEmpty(this.D)) {
                        ei2.a(this.D);
                    }
                    if (!TextUtils.isEmpty(this.E) && !ei2.zzk()) {
                        ei2.l(this.E);
                    }
                    C8988vF2 c8988vF2 = this.F;
                    if (c8988vF2 != null) {
                        ei2.c(c8988vF2);
                    } else {
                        zze zzeVar = this.G;
                        if (zzeVar != null) {
                            ei2.d(zzeVar);
                        }
                    }
                    this.C.b(ei2.zzl());
                }
                this.B.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized TI2 h(int i) {
        if (((Boolean) AbstractC7307pF1.c.e()).booleanValue()) {
            this.I = i;
        }
        return this;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        g();
    }
}
