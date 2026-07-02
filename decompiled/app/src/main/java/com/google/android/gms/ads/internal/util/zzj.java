package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC7028oF1;
import com.daaw.AbstractC7494pv0;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.C3641cA1;
import com.daaw.C6243lS1;
import com.daaw.InterfaceFutureC8236sc0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements zzg {
    public boolean b;
    public InterfaceFutureC8236sc0 d;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public String i;
    public String j;
    public final Object a = new Object();
    public final List c = new ArrayList();
    public C3641cA1 e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public String m = "-1";
    public String n = "-1";
    public int o = -1;
    public C6243lS1 p = new C6243lS1("", 0);
    public long q = 0;
    public long r = 0;
    public int s = -1;
    public int t = 0;
    public Set u = Collections.EMPTY_SET;
    public JSONObject v = new JSONObject();
    public boolean w = true;
    public boolean x = true;
    public String y = null;
    public String z = "";
    public boolean A = false;
    public String B = "";
    public int C = -1;
    public int D = -1;
    public long E = 0;

    public final /* synthetic */ void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.a) {
            try {
                this.f = sharedPreferences;
                this.g = editorEdit;
                if (AbstractC7494pv0.g()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                this.h = this.f.getBoolean("use_https", this.h);
                this.w = this.f.getBoolean("content_url_opted_out", this.w);
                this.i = this.f.getString("content_url_hashes", this.i);
                this.k = this.f.getBoolean("gad_idless", this.k);
                this.x = this.f.getBoolean("content_vertical_opted_out", this.x);
                this.j = this.f.getString("content_vertical_hashes", this.j);
                this.t = this.f.getInt("version_code", this.t);
                this.p = new C6243lS1(this.f.getString("app_settings_json", this.p.c()), this.f.getLong("app_settings_last_update_ms", this.p.a()));
                this.q = this.f.getLong("app_last_background_time_ms", this.q);
                this.s = this.f.getInt("request_in_session_count", this.s);
                this.r = this.f.getLong("first_ad_req_time_ms", this.r);
                this.u = this.f.getStringSet("never_pool_slots", this.u);
                this.y = this.f.getString("display_cutout", this.y);
                this.C = this.f.getInt("app_measurement_npa", this.C);
                this.D = this.f.getInt("sd_app_measure_npa", this.D);
                this.E = this.f.getLong("sd_app_measure_npa_ts", this.E);
                this.z = this.f.getString("inspector_info", this.z);
                this.A = this.f.getBoolean("linked_device", this.A);
                this.B = this.f.getString("linked_ad_unit", this.B);
                this.l = this.f.getString("IABTCF_gdprApplies", this.l);
                this.n = this.f.getString("IABTCF_PurposeConsents", this.n);
                this.m = this.f.getString("IABTCF_TCString", this.m);
                this.o = this.f.getInt("gad_has_consent_for_cookies", this.o);
                try {
                    this.v = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
                } catch (JSONException e) {
                    AbstractC4274eT1.zzk("Could not convert native advanced settings to json object", e);
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.d;
        if (interfaceFutureC8236sc0 == null || interfaceFutureC8236sc0.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AbstractC4274eT1.zzk("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            AbstractC4274eT1.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            AbstractC4274eT1.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            AbstractC4274eT1.zzh("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void c() {
        AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzA(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
            b();
            synchronized (this.a) {
                try {
                    if (this.B.equals(str)) {
                        return;
                    }
                    this.B = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzB(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
            b();
            synchronized (this.a) {
                try {
                    if (this.A == z) {
                        return;
                    }
                    this.A = z;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzC(String str) {
        b();
        synchronized (this.a) {
            try {
                if (TextUtils.equals(this.y, str)) {
                    return;
                }
                this.y = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzD(long j) {
        b();
        synchronized (this.a) {
            try {
                if (this.r == j) {
                    return;
                }
                this.r = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzE(int i) {
        b();
        synchronized (this.a) {
            try {
                this.o = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzF(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.b()
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L43
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L3a
            r1 = 2
            goto L3b
        L3a:
            r1 = -1
        L3b:
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L48
            if (r1 == r3) goto L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r6 = move-exception
            goto L6e
        L45:
            r5.n = r7     // Catch: java.lang.Throwable -> L43
            goto L4d
        L48:
            r5.m = r7     // Catch: java.lang.Throwable -> L43
            goto L4d
        L4b:
            r5.l = r7     // Catch: java.lang.Throwable -> L43
        L4d:
            android.content.SharedPreferences$Editor r1 = r5.g     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L69
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L5f
            android.content.SharedPreferences$Editor r7 = r5.g     // Catch: java.lang.Throwable -> L43
            r7.remove(r6)     // Catch: java.lang.Throwable -> L43
            goto L64
        L5f:
            android.content.SharedPreferences$Editor r1 = r5.g     // Catch: java.lang.Throwable -> L43
            r1.putString(r6, r7)     // Catch: java.lang.Throwable -> L43
        L64:
            android.content.SharedPreferences$Editor r6 = r5.g     // Catch: java.lang.Throwable -> L43
            r6.apply()     // Catch: java.lang.Throwable -> L43
        L69:
            r5.c()     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzF(java.lang.String, java.lang.String):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzG(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue()) {
            b();
            synchronized (this.a) {
                try {
                    if (this.z.equals(str)) {
                        return;
                    }
                    this.z = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.g.apply();
                    }
                    c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzH(boolean z) {
        b();
        synchronized (this.a) {
            try {
                if (z == this.k) {
                    return;
                }
                this.k = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzI(boolean z) {
        b();
        synchronized (this.a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.E9)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", com.google.android.gms.ads.internal.zzt.zzB().a());
        r1.put(r2, r3);
        r7.v.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        com.daaw.AbstractC4274eT1.zzk("Could not update native advanced settings", r8);
     */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzJ(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.b()
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.v     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8d
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = 0
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L49
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L46
            if (r10 == 0) goto L44
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto L42
            goto L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L44:
            r2 = r4
            goto L49
        L46:
            int r4 = r4 + 1
            goto L1d
        L49:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            java.lang.String r9 = "timestamp_ms"
            com.daaw.im r10 = com.google.android.gms.ads.internal.zzt.zzB()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            long r4 = r10.a()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            org.json.JSONObject r9 = r7.v     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6e
            goto L74
        L6e:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            com.daaw.AbstractC4274eT1.zzk(r9, r8)     // Catch: java.lang.Throwable -> L14
        L74:
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L88
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.v     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L88:
            r7.c()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzJ(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzK(int i) {
        b();
        synchronized (this.a) {
            try {
                if (this.s == i) {
                    return;
                }
                this.s = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzL(int i) {
        b();
        synchronized (this.a) {
            try {
                if (this.D == i) {
                    return;
                }
                this.D = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzM(long j) {
        b();
        synchronized (this.a) {
            try {
                if (this.E == j) {
                    return;
                }
                this.E = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzN() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.w;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzO() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.x;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzP() {
        boolean z;
        b();
        synchronized (this.a) {
            z = this.A;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzQ() {
        boolean z;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.t0)).booleanValue()) {
            return false;
        }
        b();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final boolean zzR() {
        b();
        synchronized (this.a) {
            try {
                SharedPreferences sharedPreferences = this.f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zza() {
        int i;
        b();
        synchronized (this.a) {
            i = this.t;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzb() {
        int i;
        b();
        synchronized (this.a) {
            i = this.o;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final int zzc() {
        int i;
        b();
        synchronized (this.a) {
            i = this.s;
        }
        return i;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzd() {
        long j;
        b();
        synchronized (this.a) {
            j = this.q;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zze() {
        long j;
        b();
        synchronized (this.a) {
            j = this.r;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final long zzf() {
        long j;
        b();
        synchronized (this.a) {
            j = this.E;
        }
        return j;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C3641cA1 zzg() {
        if (!this.b) {
            return null;
        }
        if ((zzN() && zzO()) || !((Boolean) AbstractC7028oF1.b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.e == null) {
                    this.e = new C3641cA1();
                }
                this.e.e();
                AbstractC4274eT1.zzi("start fetching content...");
                return this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C6243lS1 zzh() {
        C6243lS1 c6243lS1;
        b();
        synchronized (this.a) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.Ia)).booleanValue() && this.p.j()) {
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c6243lS1 = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6243lS1;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final C6243lS1 zzi() {
        C6243lS1 c6243lS1;
        synchronized (this.a) {
            c6243lS1 = this.p;
        }
        return c6243lS1;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzj() {
        String str;
        b();
        synchronized (this.a) {
            str = this.i;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzk() {
        String str;
        b();
        synchronized (this.a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzl() {
        String str;
        b();
        synchronized (this.a) {
            str = this.B;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzm() {
        String str;
        b();
        synchronized (this.a) {
            str = this.y;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    @Override // com.google.android.gms.ads.internal.util.zzg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String zzn(java.lang.String r6) {
        /*
            r5 = this;
            r5.b()
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch: java.lang.Throwable -> L44
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L30
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L26
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L1c
            goto L3a
        L1c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 1
            goto L3b
        L26:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 0
            goto L3b
        L30:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L3a
            r6 = 2
            goto L3b
        L3a:
            r6 = -1
        L3b:
            if (r6 == 0) goto L4e
            if (r6 == r4) goto L4a
            if (r6 == r3) goto L46
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            r6 = 0
            return r6
        L44:
            r6 = move-exception
            goto L52
        L46:
            java.lang.String r6 = r5.n     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r6
        L4a:
            java.lang.String r6 = r5.m     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r6
        L4e:
            java.lang.String r6 = r5.l     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r6
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzn(java.lang.String):java.lang.String");
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final String zzo() {
        String str;
        b();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final JSONObject zzp() {
        JSONObject jSONObject;
        b();
        synchronized (this.a) {
            jSONObject = this.v;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzq(Runnable runnable) {
        this.c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzr(final Context context) {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return;
                }
                final String str = "admob";
                this.d = AbstractC9322wT1.a.Z0(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.zzi
                    public final /* synthetic */ Context zzb;
                    public final /* synthetic */ String zzc = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a(this.zzb, this.zzc);
                    }
                });
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzs() {
        b();
        synchronized (this.a) {
            try {
                this.v = new JSONObject();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzt(long j) {
        b();
        synchronized (this.a) {
            try {
                if (this.q == j) {
                    return;
                }
                this.q = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzu(String str) {
        b();
        synchronized (this.a) {
            try {
                long jA = com.google.android.gms.ads.internal.zzt.zzB().a();
                if (str != null && !str.equals(this.p.c())) {
                    this.p = new C6243lS1(str, jA);
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", jA);
                        this.g.apply();
                    }
                    c();
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.p.g(jA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzv(int i) {
        b();
        synchronized (this.a) {
            try {
                if (this.t == i) {
                    return;
                }
                this.t = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzw(String str) {
        b();
        synchronized (this.a) {
            try {
                if (str.equals(this.i)) {
                    return;
                }
                this.i = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzx(boolean z) {
        b();
        synchronized (this.a) {
            try {
                if (this.w == z) {
                    return;
                }
                this.w = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzy(String str) {
        b();
        synchronized (this.a) {
            try {
                if (str.equals(this.j)) {
                    return;
                }
                this.j = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzg
    public final void zzz(boolean z) {
        b();
        synchronized (this.a) {
            try {
                if (this.x == z) {
                    return;
                }
                this.x = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
