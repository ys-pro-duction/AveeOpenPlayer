package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class RO1 implements ZO1 {
    public static final Object f = new Object();
    public static ZO1 g;
    public static ZO1 h;
    public final Context b;
    public final ExecutorService d;
    public final zzcaz e;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public RO1(Context context, zzcaz zzcazVar) {
        AbstractC8172sM2.a();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = zzcazVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:13:0x0035, B:14:0x003c), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.ZO1 c(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.daaw.RO1.f
            monitor-enter(r0)
            com.daaw.ZO1 r1 = com.daaw.RO1.g     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L3c
            com.daaw.iF1 r1 = com.daaw.KF1.e     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L35
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.B7     // Catch: java.lang.Throwable -> L33
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.daaw.RO1 r1 = new com.daaw.RO1     // Catch: java.lang.Throwable -> L33
            com.google.android.gms.internal.ads.zzcaz r2 = com.google.android.gms.internal.ads.zzcaz.e()     // Catch: java.lang.Throwable -> L33
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L33
            com.daaw.RO1.g = r1     // Catch: java.lang.Throwable -> L33
            goto L3c
        L33:
            r3 = move-exception
            goto L40
        L35:
            com.daaw.SO1 r3 = new com.daaw.SO1     // Catch: java.lang.Throwable -> L33
            r3.<init>()     // Catch: java.lang.Throwable -> L33
            com.daaw.RO1.g = r3     // Catch: java.lang.Throwable -> L33
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            com.daaw.ZO1 r3 = com.daaw.RO1.g
            return r3
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RO1.c(android.content.Context):com.daaw.ZO1");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: all -> 0x004e, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:22:0x0052, B:23:0x0053, B:24:0x0062, B:25:0x0069, B:14:0x0039, B:15:0x0040), top: B:32:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.ZO1 d(android.content.Context r4, com.google.android.gms.internal.ads.zzcaz r5) {
        /*
            java.lang.Object r0 = com.daaw.RO1.f
            monitor-enter(r0)
            com.daaw.ZO1 r1 = com.daaw.RO1.h     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L69
            com.daaw.iF1 r1 = com.daaw.KF1.e     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.e()     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L62
            com.daaw.qE1 r1 = com.daaw.AbstractC9820yE1.B7     // Catch: java.lang.Throwable -> L4e
            com.daaw.wE1 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L4e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L62
            com.daaw.RO1 r1 = new com.daaw.RO1     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4e
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L53
            java.lang.Object r5 = r1.a     // Catch: java.lang.Throwable -> L4e
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L4e
            java.util.WeakHashMap r2 = r1.c     // Catch: java.lang.Throwable -> L50
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L50
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L50
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L4e
            com.daaw.QO1 r2 = new com.daaw.QO1     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L4e
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r4 = move-exception
            goto L6d
        L50:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L50
            throw r4     // Catch: java.lang.Throwable -> L4e
        L53:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L4e
            com.daaw.PO1 r5 = new com.daaw.PO1     // Catch: java.lang.Throwable -> L4e
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L4e
            com.daaw.RO1.h = r1     // Catch: java.lang.Throwable -> L4e
            goto L69
        L62:
            com.daaw.SO1 r4 = new com.daaw.SO1     // Catch: java.lang.Throwable -> L4e
            r4.<init>()     // Catch: java.lang.Throwable -> L4e
            com.daaw.RO1.h = r4     // Catch: java.lang.Throwable -> L4e
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            com.daaw.ZO1 r4 = com.daaw.RO1.h
            return r4
        L6d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4e
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.RO1.d(android.content.Context, com.google.android.gms.internal.ads.zzcaz):com.daaw.ZO1");
    }

    public static String e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String f(Throwable th) {
        return BO2.c(XS1.j(e(th)));
    }

    @Override // com.daaw.ZO1
    public final void a(Throwable th, String str) {
        b(th, str, 1.0f);
    }

    @Override // com.daaw.ZO1
    public final void b(Throwable th, String str, float f2) {
        Throwable th2;
        String packageName;
        Handler handler = XS1.b;
        boolean zG = false;
        if (((Boolean) KF1.f.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (XS1.s(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String strE = e(th);
        String strF = ((Boolean) zzba.zzc().b(AbstractC9820yE1.A8)).booleanValue() ? f(th) : "";
        double d = f2;
        double dRandom = Math.random();
        int i = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (dRandom < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                zG = C6878nj1.a(this.b).g();
            } catch (Throwable th4) {
                AbstractC4274eT1.zzh("Error fetching instant app info", th4);
            }
            try {
                packageName = this.b.getPackageName();
            } catch (Throwable unused) {
                AbstractC4274eT1.zzj("Cannot obtain package name, proceeding.");
                packageName = "unknown";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zG)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (!str3.startsWith(str2)) {
                str3 = str2 + " " + str3;
            }
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", str3).appendQueryParameter("js", this.e.B).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strE).appendQueryParameter("eids", TextUtils.join(",", zzba.zza().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "575948185").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(KF1.c.e())).appendQueryParameter("gmscv", String.valueOf(C9599xT.f().a(this.b))).appendQueryParameter("lite", true != this.e.F ? "0" : "1");
            if (!TextUtils.isEmpty(strF)) {
                builderAppendQueryParameter2.appendQueryParameter("hash", strF);
            }
            arrayList2.add(builderAppendQueryParameter2.toString());
            for (final String str4 : arrayList2) {
                final C5680jT1 c5680jT1 = new C5680jT1(null);
                this.d.execute(new Runnable() { // from class: com.daaw.OO1
                    @Override // java.lang.Runnable
                    public final void run() {
                        c5680jT1.zza(str4);
                    }
                });
            }
        }
    }

    public final void g(Thread thread, Throwable th) {
        if (th != null) {
            boolean zS = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zS |= XS1.s(stackTraceElement.getClassName());
                    zEquals |= RO1.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zS || zEquals) {
                return;
            }
            b(th, "", 1.0f);
        }
    }
}
