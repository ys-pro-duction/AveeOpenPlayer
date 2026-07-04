package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Pj2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1902Pj2 {
    public final Context c;
    public final Executor d;
    public final C5680jT1 e;
    public final C9279wI2 g;
    public final String a = (String) AbstractC7586qF1.b.e();
    public final Map b = new HashMap();
    public final AtomicBoolean j = new AtomicBoolean();
    public final AtomicReference k = new AtomicReference(new Bundle());
    public final boolean f = ((Boolean) zzba.zzc().b(AbstractC9820yE1.V1)).booleanValue();
    public final boolean h = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Y1)).booleanValue();
    public final boolean i = ((Boolean) zzba.zzc().b(AbstractC9820yE1.X6)).booleanValue();

    public AbstractC1902Pj2(Executor executor, C5680jT1 c5680jT1, C9279wI2 c9279wI2, Context context) {
        this.d = executor;
        this.e = c5680jT1;
        this.g = c9279wI2;
        this.c = context;
    }

    public final void a(Map map, boolean z) {
        if (map.isEmpty()) {
            AbstractC4274eT1.zze("Empty paramMap.");
            return;
        }
        if (map.isEmpty()) {
            AbstractC4274eT1.zze("Empty or null paramMap.");
        } else {
            if (!this.j.getAndSet(true)) {
                final String str = (String) zzba.zzc().b(AbstractC9820yE1.H9);
                this.k.set(zzad.zza(this.c, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.daaw.Oj2
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        this.a.d(str, sharedPreferences, str2);
                    }
                }));
            }
            Bundle bundle = (Bundle) this.k.get();
            for (String str2 : bundle.keySet()) {
                map.put(str2, String.valueOf(bundle.get(str2)));
            }
        }
        final String strA = this.g.a(map);
        zze.zza(strA);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f) {
            if (!z || this.h) {
                if (!z2 || this.i) {
                    this.d.execute(new Runnable() { // from class: com.daaw.Nj2
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.B.e.zza(strA);
                        }
                    });
                }
            }
        }
    }

    public final String b(Map map) {
        return this.g.a(map);
    }

    public final ConcurrentHashMap c() {
        return new ConcurrentHashMap(this.b);
    }

    public final /* synthetic */ void d(String str, SharedPreferences sharedPreferences, String str2) {
        this.k.set(zzad.zzb(this.c, str));
    }

    public final void e(Map map) {
        a(map, true);
    }

    public final void f(Map map) {
        a(map, false);
    }
}
