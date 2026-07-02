package com.daaw;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.pl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7447pl2 implements InterfaceC2140Rl2, InterfaceC2866Yk2 {
    public final C9685xl2 a;
    public final C2246Sl2 b;
    public final C2970Zk2 c;
    public final C6043kl2 d;
    public final C2762Xk2 e;
    public final BinderC1702Nl2 f;
    public final String g;
    public final String h;
    public JSONObject m;
    public boolean p;
    public int q;
    public boolean r;
    public final Map i = new HashMap();
    public final Map j = new HashMap();
    public final Map k = new HashMap();
    public String l = "{}";
    public long n = Long.MAX_VALUE;
    public EnumC6331ll2 o = EnumC6331ll2.NONE;
    public EnumC7168ol2 s = EnumC7168ol2.UNKNOWN;
    public long t = 0;

    public C7447pl2(C9685xl2 c9685xl2, C2246Sl2 c2246Sl2, C2970Zk2 c2970Zk2, Context context, zzcaz zzcazVar, C6043kl2 c6043kl2, BinderC1702Nl2 binderC1702Nl2, String str) {
        this.a = c9685xl2;
        this.b = c2246Sl2;
        this.c = c2970Zk2;
        this.e = new C2762Xk2(context);
        this.g = zzcazVar.B;
        this.h = str;
        this.d = c6043kl2;
        this.f = binderC1702Nl2;
        zzt.zzs().zzg(this);
    }

    public final EnumC6331ll2 a() {
        return this.o;
    }

    public final synchronized InterfaceFutureC8236sc0 b(String str) {
        BT1 bt1;
        try {
            bt1 = new BT1();
            if (this.j.containsKey(str)) {
                bt1.b((C4080dl2) this.j.get(str));
            } else {
                if (!this.k.containsKey(str)) {
                    this.k.put(str, new ArrayList());
                }
                ((List) this.k.get(str)).add(bt1);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bt1;
    }

    public final synchronized String c() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue() && p()) {
            if (this.n < zzt.zzB().a() / 1000) {
                this.l = "{}";
                this.n = Long.MAX_VALUE;
                return "";
            }
            if (this.l.equals("{}")) {
                return "";
            }
            return this.l;
        }
        return "";
    }

    public final synchronized String d() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.p);
            jSONObject.put("gesture", this.o);
            if (this.n > zzt.zzB().a() / 1000) {
                jSONObject.put("networkExtras", this.l);
                jSONObject.put("networkExtrasExpirationSecs", this.n);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.h)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.h);
                }
                jSONObject.put("internalSdkVersion", this.g);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.d.a());
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f9)).booleanValue()) {
                    String strM = zzt.zzo().m();
                    if (!TextUtils.isEmpty(strM)) {
                        jSONObject.put("plugin", strM);
                    }
                }
                if (this.n < zzt.zzB().a() / 1000) {
                    this.l = "{}";
                }
                jSONObject.put("networkExtras", this.l);
                jSONObject.put("adSlots", s());
                jSONObject.put("appInfo", this.e.a());
                String strC = zzt.zzo().h().zzh().c();
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject.put("cld", new JSONObject(strC));
                }
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.V8)).booleanValue() && (jSONObject2 = this.m) != null) {
                    AbstractC4274eT1.zze("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.m);
                }
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
                    jSONObject.put("openAction", this.s);
                    jSONObject.put("gesture", this.o);
                }
            } catch (JSONException e) {
                zzt.zzo().t(e, "Inspector.toJson");
                AbstractC4274eT1.zzk("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void f(String str, C4080dl2 c4080dl2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue() && p()) {
            if (this.q >= ((Integer) zzba.zzc().b(AbstractC9820yE1.H8)).intValue()) {
                AbstractC4274eT1.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.i.containsKey(str)) {
                this.i.put(str, new ArrayList());
            }
            this.q++;
            ((List) this.i.get(str)).add(c4080dl2);
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.d9)).booleanValue()) {
                String strA = c4080dl2.a();
                this.j.put(strA, c4080dl2);
                if (this.k.containsKey(strA)) {
                    List list = (List) this.k.get(strA);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((BT1) it.next()).b(c4080dl2);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void g() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue() && zzt.zzo().h().zzP()) {
                t();
                return;
            }
            String strZzo = zzt.zzo().h().zzo();
            if (TextUtils.isEmpty(strZzo)) {
                return;
            }
            try {
                if (new JSONObject(strZzo).optBoolean("isTestMode", false)) {
                    t();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void h(zzda zzdaVar, EnumC7168ol2 enumC7168ol2) {
        if (!p()) {
            try {
                zzdaVar.zze(AbstractC5908kG2.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                AbstractC4274eT1.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.F8)).booleanValue()) {
            this.s = enumC7168ol2;
            this.a.d(zzdaVar, new C4802gJ1(this), new TI1(this.f));
            return;
        } else {
            try {
                zzdaVar.zze(AbstractC5908kG2.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                AbstractC4274eT1.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void i(String str, long j) {
        this.l = str;
        this.n = j;
        u();
    }

    public final synchronized void j(long j) {
        this.t += j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.r
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.t()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.p
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.y()
            return
        L15:
            boolean r2 = r1.p()
            if (r2 != 0) goto L1e
            r1.x()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7447pl2.k(boolean):void");
    }

    public final void l(EnumC6331ll2 enumC6331ll2) {
        v(enumC6331ll2, true);
    }

    public final synchronized void m(JSONObject jSONObject) {
        this.m = jSONObject;
    }

    public final void n(boolean z) {
        if (!this.r && z) {
            t();
        }
        w(z, true);
    }

    public final boolean o() {
        return this.m != null;
    }

    public final synchronized boolean p() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.U8)).booleanValue()) {
            return this.p || zzt.zzs().zzl();
        }
        return this.p;
    }

    public final synchronized boolean q() {
        return this.p;
    }

    public final boolean r() {
        return this.t < ((Long) zzba.zzc().b(AbstractC9820yE1.a9)).longValue();
    }

    public final synchronized JSONObject s() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.i.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (C4080dl2 c4080dl2 : (List) entry.getValue()) {
                    if (c4080dl2.f()) {
                        jSONArray.put(c4080dl2.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void t() {
        this.r = true;
        this.d.c();
        this.a.b(this);
        this.b.c(this);
        this.c.c(this);
        this.f.c3(this);
        z(zzt.zzo().h().zzo());
    }

    public final void u() {
        zzt.zzo().h().zzG(d());
    }

    public final synchronized void v(EnumC6331ll2 enumC6331ll2, boolean z) {
        try {
            if (this.o == enumC6331ll2) {
                return;
            }
            if (p()) {
                x();
            }
            this.o = enumC6331ll2;
            if (p()) {
                y();
            }
            if (z) {
                u();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:16:0x002a, B:21:0x0039, B:17:0x002e, B:19:0x0034), top: B:28:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void w(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.p     // Catch: java.lang.Throwable -> L28
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.p = r2     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2e
            com.daaw.qE1 r2 = com.daaw.AbstractC9820yE1.U8     // Catch: java.lang.Throwable -> L28
            com.daaw.wE1 r0 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L28
            java.lang.Object r2 = r0.b(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L28
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto L2a
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzt.zzs()     // Catch: java.lang.Throwable -> L28
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L2e
            goto L2a
        L28:
            r2 = move-exception
            goto L40
        L2a:
            r1.y()     // Catch: java.lang.Throwable -> L28
            goto L37
        L2e:
            boolean r2 = r1.p()     // Catch: java.lang.Throwable -> L28
            if (r2 != 0) goto L37
            r1.x()     // Catch: java.lang.Throwable -> L28
        L37:
            if (r3 == 0) goto L3e
            r1.u()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r1)
            return
        L3e:
            monitor-exit(r1)
            return
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7447pl2.w(boolean, boolean):void");
    }

    public final synchronized void x() {
        EnumC6331ll2 enumC6331ll2 = EnumC6331ll2.NONE;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 1) {
            this.b.a();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.a();
        }
    }

    public final synchronized void y() {
        EnumC6331ll2 enumC6331ll2 = EnumC6331ll2.NONE;
        int iOrdinal = this.o.ordinal();
        if (iOrdinal == 1) {
            this.b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            w(jSONObject.optBoolean("isTestMode", false), false);
            v((EnumC6331ll2) Enum.valueOf(EnumC6331ll2.class, jSONObject.optString("gesture", "NONE")), false);
            this.l = jSONObject.optString("networkExtras", "{}");
            this.n = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }
}
