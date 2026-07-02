package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class JR1 {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public String c = null;
    public String d = null;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(-1);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(null);
    public final ConcurrentMap i = new ConcurrentHashMap(9);
    public final AtomicReference j = new AtomicReference(null);
    public final BlockingQueue k = new ArrayBlockingQueue(20);
    public final Object l = new Object();

    public static final boolean A(Context context) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.h0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzba.zzc().b(AbstractC9820yE1.i0)).intValue()) {
            return false;
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final Object B(String str, Object obj, HR1 hr1) {
        synchronized (this.j) {
            try {
                if (((InterfaceC9059vX1) this.j.get()) != null) {
                    try {
                        return hr1.a((InterfaceC9059vX1) this.j.get());
                    } catch (Exception unused) {
                        c(str, false);
                    }
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object C(String str, Context context) {
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.g.get(), null);
        } catch (Exception unused) {
            c(str, true);
            return null;
        }
    }

    public final Method D(Context context, String str) {
        Method method = (Method) this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            c(str, false);
            return null;
        }
    }

    public final ExecutorService E() {
        ExecutorService threadPoolExecutor;
        if (this.a.get() == null) {
            if (AbstractC2555Vl.a()) {
                threadPoolExecutor = AbstractC8172sM2.a().a(((Integer) zzba.zzc().b(AbstractC9820yE1.g0)).intValue(), new GR1(this), 2);
            } else {
                AbstractC7582qE1 abstractC7582qE1 = AbstractC9820yE1.g0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().b(abstractC7582qE1)).intValue(), ((Integer) zzba.zzc().b(abstractC7582qE1)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new GR1(this));
            }
            AbstractC8191sR1.a(this.a, null, threadPoolExecutor);
        }
        return (ExecutorService) this.a.get();
    }

    public final void a(Context context, String str, String str2) {
        if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method declaredMethod = (Method) this.i.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    this.i.put(str2, declaredMethod);
                } catch (Exception unused) {
                    c(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(this.g.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                c(str2, false);
            }
        }
    }

    public final void b(Context context, final String str, String str2, Bundle bundle) {
        if (z(context)) {
            final Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                AbstractC4274eT1.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (A(context)) {
                d("logEventInternal", new IR1() { // from class: com.daaw.yR1
                    @Override // com.daaw.IR1
                    public final void a(InterfaceC9059vX1 interfaceC9059vX1) {
                        interfaceC9059vX1.L1("am", str, bundle2);
                    }
                });
                return;
            }
            if (e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method declaredMethod = (Method) this.i.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        this.i.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        c("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.g.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    c("logEventInternal", true);
                }
            }
        }
    }

    public final void c(String str, boolean z) {
        if (this.e.get()) {
            return;
        }
        AbstractC4274eT1.zzj("Invoke Firebase method " + str + " error.");
        if (z) {
            AbstractC4274eT1.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.e.set(true);
        }
    }

    public final void d(final String str, final IR1 ir1) {
        synchronized (this.j) {
            try {
                FutureTask futureTask = new FutureTask(new Runnable() { // from class: com.daaw.AR1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.o(ir1, str);
                    }
                }, null);
                if (this.j.get() != null) {
                    futureTask.run();
                } else {
                    this.k.offer(futureTask);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                AbstractC8191sR1.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                c("getInstance", z);
                return false;
            }
        }
        return true;
    }

    public final String f(Context context) {
        if (!z(context)) {
            return null;
        }
        if (A(context)) {
            Long l = (Long) B("getAdEventId", null, new HR1() { // from class: com.daaw.DR1
                @Override // com.daaw.HR1
                public final Object a(InterfaceC9059vX1 interfaceC9059vX1) {
                    return Long.valueOf(interfaceC9059vX1.zzc());
                }
            });
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objC = C("generateEventId", context);
        if (objC != null) {
            return objC.toString();
        }
        return null;
    }

    public final String g(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.b) {
            try {
                String str = this.d;
                if (str != null) {
                    return str;
                }
                if (A(context)) {
                    this.d = (String) B("getAppIdOrigin", this.d, new HR1() { // from class: com.daaw.xR1
                        @Override // com.daaw.HR1
                        public final Object a(InterfaceC9059vX1 interfaceC9059vX1) {
                            return interfaceC9059vX1.zze();
                        }
                    });
                } else {
                    this.d = "fa";
                }
                return this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String h(final Context context) {
        if (!z(context)) {
            return null;
        }
        long jLongValue = ((Long) zzba.zzc().b(AbstractC9820yE1.f0)).longValue();
        if (A(context)) {
            try {
                return jLongValue < 0 ? (String) B("getAppInstanceId", null, ER1.a) : (String) E().submit(new Callable() { // from class: com.daaw.vR1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.k();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) C("getAppInstanceId", context);
        }
        try {
            return (String) E().submit(new Callable() { // from class: com.daaw.wR1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.l(context);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    public final String i(Context context) {
        if (!z(context)) {
            return "";
        }
        if (A(context)) {
            return (String) B("getCurrentScreenNameOrScreenClass", "", new HR1() { // from class: com.daaw.uR1
                @Override // com.daaw.HR1
                public final Object a(InterfaceC9059vX1 interfaceC9059vX1) {
                    String strZzh = interfaceC9059vX1.zzh();
                    if (strZzh != null) {
                        return strZzh;
                    }
                    String strZzg = interfaceC9059vX1.zzg();
                    return strZzg != null ? strZzg : "";
                }
            });
        }
        if (!e(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return "";
        }
        try {
            String str = (String) D(context, "getCurrentScreenName").invoke(this.g.get(), null);
            if (str == null) {
                str = (String) D(context, "getCurrentScreenClass").invoke(this.g.get(), null);
            }
            return str == null ? "" : str;
        } catch (Exception unused) {
            c("getCurrentScreenName", false);
            return "";
        }
    }

    public final String j(Context context) {
        if (!z(context)) {
            return null;
        }
        synchronized (this.b) {
            try {
                String str = this.c;
                if (str != null) {
                    return str;
                }
                if (A(context)) {
                    this.c = (String) B("getGmpAppId", this.c, new HR1() { // from class: com.daaw.CR1
                        @Override // com.daaw.HR1
                        public final Object a(InterfaceC9059vX1 interfaceC9059vX1) {
                            return interfaceC9059vX1.zzi();
                        }
                    });
                } else {
                    this.c = (String) C("getGmpAppId", context);
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ String k() {
        return (String) B("getAppInstanceId", null, ER1.a);
    }

    public final /* synthetic */ String l(Context context) {
        return (String) C("getAppInstanceId", context);
    }

    public final void m(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("beginAdUnitExposure", new IR1() { // from class: com.daaw.tR1
                    @Override // com.daaw.IR1
                    public final void a(InterfaceC9059vX1 interfaceC9059vX1) {
                        interfaceC9059vX1.p(str);
                    }
                });
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void n(Context context, final String str) {
        if (z(context)) {
            if (A(context)) {
                d("endAdUnitExposure", new IR1() { // from class: com.daaw.BR1
                    @Override // com.daaw.IR1
                    public final void a(InterfaceC9059vX1 interfaceC9059vX1) {
                        interfaceC9059vX1.zzn(str);
                    }
                });
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    public final /* synthetic */ void o(IR1 ir1, String str) {
        if (((InterfaceC9059vX1) this.j.get()) != null) {
            try {
                ir1.a((InterfaceC9059vX1) this.j.get());
            } catch (Exception unused) {
                c(str, false);
            }
        }
    }

    public final void p(Context context, String str) {
        b(context, "_aa", str, null);
    }

    public final void q(Context context, String str) {
        b(context, "_aq", str, null);
    }

    public final void r(Context context, String str) {
        b(context, "_ac", str, null);
    }

    public final void s(Context context, String str) {
        b(context, "_ai", str, null);
    }

    public final void t(Context context, String str, String str2, String str3, int i) {
        if (z(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            b(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
        }
    }

    public final void u(Context context, zzl zzlVar) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void v(Context context, zzff zzffVar) {
        KR1.d(context).b().d(zzffVar);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.m0)).booleanValue() && z(context) && A(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void w(final Bundle bundle) {
        d("setConsent", new IR1() { // from class: com.daaw.FR1
            @Override // com.daaw.IR1
            public final void a(InterfaceC9059vX1 interfaceC9059vX1) {
                interfaceC9059vX1.F(bundle);
            }
        });
    }

    public final void x(final Context context, final String str) {
        if (z(context) && (context instanceof Activity)) {
            if (A(context)) {
                d("setScreenName", new IR1() { // from class: com.daaw.zR1
                    @Override // com.daaw.IR1
                    public final void a(InterfaceC9059vX1 interfaceC9059vX1) {
                        Context context2 = context;
                        interfaceC9059vX1.i2(BinderC7744qp0.Z2(context2), str, context2.getPackageName());
                    }
                });
                return;
            }
            if (e(context, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
                Method declaredMethod = (Method) this.i.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        this.i.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        c("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(this.h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    c("setCurrentScreen", false);
                }
            }
        }
    }

    public final boolean y() {
        synchronized (this.l) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(android.content.Context r5) {
        /*
            r4 = this;
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.a0
            com.daaw.wE1 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.daaw.qE1 r0 = com.daaw.AbstractC9820yE1.k0
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.ads.internal.client.zzay.zzb()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.daaw.XS1.w(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.ads.internal.client.zzay.zzb()
            boolean r5 = com.daaw.XS1.x(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.daaw.AbstractC4274eT1.zzj(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.JR1.z(android.content.Context):boolean");
    }
}
