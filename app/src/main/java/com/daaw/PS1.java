package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class PS1 {
    public final String g;
    public final zzg h;
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    public int i = 0;
    public int j = 0;
    public int k = 0;

    public PS1(String str, zzg zzgVar) {
        this.g = str;
        this.h = zzgVar;
    }

    public final int a() {
        int i;
        synchronized (this.f) {
            i = this.k;
        }
        return i;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                bundle = new Bundle();
                if (!this.h.zzQ()) {
                    bundle.putString("session_id", this.g);
                }
                bundle.putLong("basets", this.b);
                bundle.putLong("currts", this.a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.c);
                bundle.putInt("preqs_in_session", this.d);
                bundle.putLong("time_in_session", this.e);
                bundle.putInt("pclick", this.i);
                bundle.putInt("pimp", this.j);
                Context contextA = TP1.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    AbstractC4274eT1.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z = true;
                        } else {
                            AbstractC4274eT1.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        AbstractC4274eT1.zzj("Fail to fetch AdActivity theme");
                        AbstractC4274eT1.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f) {
            this.i++;
        }
    }

    public final void d() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }

    public final void g(zzl zzlVar, long j) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                long jZzd = this.h.zzd();
                long jA = zzt.zzB().a();
                if (this.b == -1) {
                    if (jA - jZzd > ((Long) zzba.zzc().b(AbstractC9820yE1.S0)).longValue()) {
                        this.d = -1;
                    } else {
                        this.d = this.h.zzc();
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.q3)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.c++;
                int i = this.d + 1;
                this.d = i;
                if (i == 0) {
                    this.e = 0L;
                    this.h.zzD(jA);
                } else {
                    this.e = jA - this.h.zze();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f) {
            this.k++;
        }
    }

    public final void i() {
        if (((Boolean) IF1.a.e()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}
