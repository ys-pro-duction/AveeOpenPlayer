package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.ads.internal.client.zzba;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.wE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC9262wE1 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public Context g;
    public final Object a = new Object();
    public final ConditionVariable b = new ConditionVariable();
    public volatile boolean c = false;
    public volatile boolean d = false;
    public SharedPreferences e = null;
    public Bundle f = new Bundle();
    public JSONObject h = new JSONObject();

    public final Object b(final AbstractC7582qE1 abstractC7582qE1) {
        if (!this.b.block(5000L)) {
            synchronized (this.a) {
                try {
                    if (!this.d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.c || this.e == null) {
            synchronized (this.a) {
                if (this.c && this.e != null) {
                }
                return abstractC7582qE1.m();
            }
        }
        if (abstractC7582qE1.e() != 2) {
            return (abstractC7582qE1.e() == 1 && this.h.has(abstractC7582qE1.n())) ? abstractC7582qE1.a(this.h) : DE1.a(new CO2() { // from class: com.daaw.tE1
                @Override // com.daaw.CO2
                public final Object zza() {
                    return this.B.c(abstractC7582qE1);
                }
            });
        }
        Bundle bundle = this.f;
        return bundle == null ? abstractC7582qE1.m() : abstractC7582qE1.b(bundle);
    }

    public final /* synthetic */ Object c(AbstractC7582qE1 abstractC7582qE1) {
        return abstractC7582qE1.c(this.e);
    }

    public final /* synthetic */ String d() {
        return this.e.getString("flag_configuration", "{}");
    }

    public final void e(Context context) {
        if (this.c) {
            return;
        }
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                }
                Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                this.g = applicationContext;
                try {
                    this.f = C6878nj1.a(applicationContext).c(this.g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context contextD = ET.d(context);
                    if (contextD != null || (contextD = context.getApplicationContext()) != null) {
                        context = contextD;
                    }
                    if (context == null) {
                        return;
                    }
                    zzba.zzb();
                    SharedPreferences sharedPreferencesA = C8139sE1.a(context);
                    this.e = sharedPreferencesA;
                    if (sharedPreferencesA != null) {
                        sharedPreferencesA.registerOnSharedPreferenceChangeListener(this);
                    }
                    TF1.c(new C8983vE1(this));
                    f();
                    this.c = true;
                } finally {
                    this.d = false;
                    this.b.open();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        if (this.e == null) {
            return;
        }
        try {
            this.h = new JSONObject((String) DE1.a(new CO2() { // from class: com.daaw.uE1
                @Override // com.daaw.CO2
                public final Object zza() {
                    return this.B.d();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            f();
        }
    }
}
