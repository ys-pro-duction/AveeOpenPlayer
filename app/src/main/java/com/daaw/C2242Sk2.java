package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzblg;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzcaz;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.Sk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2242Sk2 {
    public final Context f;
    public final WeakReference g;
    public final C8826ui2 h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final C2132Rj2 l;
    public final zzcaz m;
    public final C7118ob2 o;
    public final WI2 p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final BT1 e = new BT1();
    public final Map n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = zzt.zzB().b();

    public C2242Sk2(Executor executor, Context context, WeakReference weakReference, Executor executor2, C8826ui2 c8826ui2, ScheduledExecutorService scheduledExecutorService, C2132Rj2 c2132Rj2, zzcaz zzcazVar, C7118ob2 c7118ob2, WI2 wi2) {
        this.h = c8826ui2;
        this.f = context;
        this.g = weakReference;
        this.i = executor2;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = c2132Rj2;
        this.m = zzcazVar;
        this.o = c7118ob2;
        this.p = wi2;
        v("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void j(final C2242Sk2 c2242Sk2, String str) {
        BinderC2136Rk2 binderC2136Rk2;
        BinderC2136Rk2 binderC2136Rk22;
        int i = 5;
        final EI2 ei2A = DI2.a(c2242Sk2.f, 5);
        ei2A.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final EI2 ei2A2 = DI2.a(c2242Sk2.f, i);
                ei2A2.zzh();
                ei2A2.l(next);
                final Object obj = new Object();
                final BT1 bt1 = new BT1();
                InterfaceFutureC8236sc0 interfaceFutureC8236sc0O = AbstractC7360pS2.o(bt1, ((Long) zzba.zzc().b(AbstractC9820yE1.M1)).longValue(), TimeUnit.SECONDS, c2242Sk2.k);
                c2242Sk2.l.c(next);
                c2242Sk2.o.o(next);
                final long jB = zzt.zzB().b();
                interfaceFutureC8236sc0O.g(new Runnable() { // from class: com.daaw.Jk2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.q(obj, bt1, next, jB, ei2A2);
                    }
                }, c2242Sk2.i);
                arrayList.add(interfaceFutureC8236sc0O);
                BinderC2136Rk2 binderC2136Rk23 = new BinderC2136Rk2(c2242Sk2, obj, next, jB, ei2A2, bt1);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    binderC2136Rk2 = binderC2136Rk23;
                                    try {
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        binderC2136Rk23 = binderC2136Rk2;
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            BinderC2136Rk2 binderC2136Rk24 = binderC2136Rk23;
                            arrayList2.add(new zzblq(strOptString, bundle));
                            i2++;
                            binderC2136Rk23 = binderC2136Rk24;
                        }
                    } catch (JSONException unused2) {
                    }
                    binderC2136Rk2 = binderC2136Rk23;
                } else {
                    binderC2136Rk2 = binderC2136Rk23;
                }
                c2242Sk2.v(next, false, "", 0);
                try {
                    final C4502fG2 c4502fG2C = c2242Sk2.h.c(next, new JSONObject());
                    Executor executor = c2242Sk2.j;
                    final BinderC2136Rk2 binderC2136Rk25 = binderC2136Rk2;
                    try {
                        Runnable runnable = new Runnable() { // from class: com.daaw.Nk2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.B.n(next, binderC2136Rk25, c4502fG2C, arrayList2);
                            }
                        };
                        binderC2136Rk22 = binderC2136Rk25;
                        try {
                            executor.execute(runnable);
                        } catch (KF2 unused3) {
                            try {
                                binderC2136Rk22.a("Failed to create Adapter.");
                            } catch (RemoteException e) {
                                AbstractC4274eT1.zzh("", e);
                            }
                        }
                    } catch (KF2 unused4) {
                        binderC2136Rk22 = binderC2136Rk25;
                    }
                } catch (KF2 unused5) {
                    binderC2136Rk22 = binderC2136Rk2;
                }
                i = 5;
            }
            AbstractC7360pS2.a(arrayList).a(new Callable() { // from class: com.daaw.Kk2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.f(ei2A);
                    return null;
                }
            }, c2242Sk2.i);
        } catch (JSONException e2) {
            zze.zzb("Malformed CLD response", e2);
            c2242Sk2.o.zza("MalformedJson");
            c2242Sk2.l.a("MalformedJson");
            c2242Sk2.e.c(e2);
            zzt.zzo().u(e2, "AdapterInitializer.updateAdapterStatus");
            WI2 wi2 = c2242Sk2.p;
            ei2A.e(e2);
            ei2A.zzf(false);
            wi2.b(ei2A.zzl());
        }
    }

    public final /* synthetic */ Object f(EI2 ei2) {
        this.e.b(Boolean.TRUE);
        ei2.zzf(true);
        this.p.b(ei2.zzl());
        return null;
    }

    public final List g() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.n.keySet()) {
            zzblg zzblgVar = (zzblg) this.n.get(str);
            arrayList.add(new zzblg(str, zzblgVar.C, zzblgVar.D, zzblgVar.E));
        }
        return arrayList;
    }

    public final void l() {
        this.q = false;
    }

    public final /* synthetic */ void m() {
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                v("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (zzt.zzB().b() - this.d));
                this.l.b("com.google.android.gms.ads.MobileAds", "timeout");
                this.o.a("com.google.android.gms.ads.MobileAds", "timeout");
                this.e.c(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void n(String str, VJ1 vj1, C4502fG2 c4502fG2, List list) {
        if (str != "com.google.ads.mediation.admob.AdMobAdapter") {
            if (str != null) {
                try {
                    try {
                        if (!str.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                        }
                    } catch (RemoteException e) {
                        throw new GO2(e);
                    } catch (KF2 unused) {
                        vj1.a("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
                        return;
                    }
                } catch (RemoteException e2) {
                    AbstractC4274eT1.zzh("", e2);
                    return;
                }
            }
            Context context = (Context) this.g.get();
            if (context == null) {
                context = this.f;
            }
            c4502fG2.n(context, vj1, list);
            return;
        }
        vj1.zzf();
    }

    public final /* synthetic */ void o(final BT1 bt1) {
        this.i.execute(new Runnable() { // from class: com.daaw.Ik2
            @Override // java.lang.Runnable
            public final void run() {
                String strC = zzt.zzo().h().zzh().c();
                boolean zIsEmpty = TextUtils.isEmpty(strC);
                BT1 bt12 = bt1;
                if (zIsEmpty) {
                    bt12.c(new Exception());
                } else {
                    bt12.b(strC);
                }
            }
        });
    }

    public final /* synthetic */ void p() {
        this.l.e();
        this.o.zze();
        this.b = true;
    }

    public final /* synthetic */ void q(Object obj, BT1 bt1, String str, long j, EI2 ei2) {
        synchronized (obj) {
            try {
                if (!bt1.isDone()) {
                    v(str, false, "Timeout.", (int) (zzt.zzB().b() - j));
                    this.l.b(str, "timeout");
                    this.o.a(str, "timeout");
                    WI2 wi2 = this.p;
                    ei2.o("Timeout");
                    ei2.zzf(false);
                    wi2.b(ei2.zzl());
                    bt1.b(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (!((Boolean) HF1.a.e()).booleanValue()) {
            if (this.m.D >= ((Integer) zzba.zzc().b(AbstractC9820yE1.L1)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.f();
                        this.o.zzf();
                        this.e.g(new Runnable() { // from class: com.daaw.Ok2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.B.p();
                            }
                        }, this.i);
                        this.a = true;
                        InterfaceFutureC8236sc0 interfaceFutureC8236sc0U = u();
                        this.k.schedule(new Runnable() { // from class: com.daaw.Hk2
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.B.m();
                            }
                        }, ((Long) zzba.zzc().b(AbstractC9820yE1.N1)).longValue(), TimeUnit.SECONDS);
                        AbstractC7360pS2.r(interfaceFutureC8236sc0U, new C2032Qk2(this), this.i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        v("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.e.b(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final void s(final YJ1 yj1) {
        this.e.g(new Runnable() { // from class: com.daaw.Mk2
            @Override // java.lang.Runnable
            public final void run() {
                C2242Sk2 c2242Sk2 = this.B;
                try {
                    yj1.W1(c2242Sk2.g());
                } catch (RemoteException e) {
                    AbstractC4274eT1.zzh("", e);
                }
            }
        }, this.j);
    }

    public final boolean t() {
        return this.b;
    }

    public final synchronized InterfaceFutureC8236sc0 u() {
        String strC = zzt.zzo().h().zzh().c();
        if (!TextUtils.isEmpty(strC)) {
            return AbstractC7360pS2.h(strC);
        }
        final BT1 bt1 = new BT1();
        zzt.zzo().h().zzq(new Runnable() { // from class: com.daaw.Lk2
            @Override // java.lang.Runnable
            public final void run() {
                this.B.o(bt1);
            }
        });
        return bt1;
    }

    public final void v(String str, boolean z, String str2, int i) {
        this.n.put(str, new zzblg(str, z, i, str2));
    }
}
