package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.BinderC0397Az1;
import com.daaw.C7447pl2;
import com.daaw.EnumC7168ol2;
import com.daaw.InterfaceFutureC8236sc0;
import com.daaw.MA1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {
    public final Object a = new Object();
    public String b = "";
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public String f = "";
    public C7447pl2 g;

    public static final String c(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzp().zzc(context, str2));
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0Zzb = new zzbq(context).zzb(0, str, map, null);
        try {
            return (String) interfaceFutureC8236sc0Zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.E4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            AbstractC4274eT1.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            interfaceFutureC8236sc0Zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            AbstractC4274eT1.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            interfaceFutureC8236sc0Zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            AbstractC4274eT1.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    public final void a(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzt.zza.post(new MA1(this, context, str, z, z2));
        } else {
            AbstractC4274eT1.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean b(Context context, String str, String str2) {
        String strC = c(context, d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.B4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strC)) {
            AbstractC4274eT1.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strC.trim());
            String strOptString = jSONObject.optString("gct");
            this.f = jSONObject.optString("status");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
                boolean z = "0".equals(this.f) || "2".equals(this.f);
                zzf(z);
                zzg zzgVarH = com.google.android.gms.ads.internal.zzt.zzo().h();
                if (!z) {
                    str = "";
                }
                zzgVarH.zzA(str);
            }
            synchronized (this.a) {
                this.c = strOptString;
            }
            return true;
        } catch (JSONException e) {
            AbstractC4274eT1.zzk("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.net.Uri d(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.a
            monitor-enter(r0)
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            r3 = 1
            byte[] r1 = com.daaw.AbstractC7656qX.d(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2b
            goto L32
        L29:
            r5 = move-exception
            goto L7d
        L2b:
            java.lang.String r1 = "Error reading from internal storage."
            com.daaw.AbstractC4274eT1.zze(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = ""
        L32:
            r4.b = r2     // Catch: java.lang.Throwable -> L29
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L66
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L29
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L29
            r4.b = r1     // Catch: java.lang.Throwable -> L29
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.write(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            r5.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L60
            goto L66
        L60:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.daaw.AbstractC4274eT1.zzh(r1, r5)     // Catch: java.lang.Throwable -> L29
        L66:
            java.lang.String r5 = r4.b     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.d(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final C7447pl2 zza() {
        return this.g;
    }

    public final String zzb() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public final void zzc(Context context) {
        C7447pl2 c7447pl2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue() || (c7447pl2 = this.g) == null) {
            return;
        }
        c7447pl2.h(new BinderC0397Az1(this, context), EnumC7168ol2.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzt.zzT(context, d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.A4), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.D4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzp();
        zzt.zzK(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.a) {
            try {
                this.e = z;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzo().h().zzB(z);
                    C7447pl2 c7447pl2 = this.g;
                    if (c7447pl2 != null) {
                        c7447pl2.k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(C7447pl2 c7447pl2) {
        this.g = c7447pl2;
    }

    public final void zzh(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strC = c(context, d(context, (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.C4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strC)) {
            AbstractC4274eT1.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strC.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
                zzg zzgVarH = com.google.android.gms.ads.internal.zzt.zzo().h();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarH.zzA(str);
            }
            return zEquals;
        } catch (JSONException e) {
            AbstractC4274eT1.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.a) {
            z = this.e;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        AbstractC4274eT1.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
