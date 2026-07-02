package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.uh3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8822uh3 {
    public static volatile InterfaceC4382eq1 e;
    public static Context g;
    public static final Ze3 a = new BinderC8415tD2(Qb3.I("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    public static final Ze3 b = new BinderC9877yS2(Qb3.I("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    public static final Ze3 c = new BinderC6437m73(Qb3.I("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    public static final Ze3 d = new BinderC5430ia3(Qb3.I("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    public static final Object f = new Object();

    public static Yr3 a(String str, Qb3 qb3, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, qb3, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static Yr3 b(String str, boolean z, boolean z2, boolean z3) {
        return g(str, z, false, false, true);
    }

    public static /* synthetic */ String c(boolean z, String str, Qb3 qb3) {
        String str2 = (z || !f(str, qb3, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = AbstractC9782y6.b("SHA-256");
        AbstractC7506py0.l(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, RV.a(messageDigestB.digest(qb3.Z2())), Boolean.valueOf(z), "12451000.false");
    }

    public static synchronized void d(Context context) {
        if (g == null) {
            if (context != null) {
                g = context.getApplicationContext();
            }
        }
    }

    public static boolean e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            h();
            zZzi = e.zzi();
        } catch (RemoteException | DynamiteModule.a unused) {
            zZzi = false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return zZzi;
    }

    public static Yr3 f(final String str, final Qb3 qb3, final boolean z, boolean z2) {
        try {
            h();
            AbstractC7506py0.l(g);
            try {
                return e.F1(new zzs(str, qb3, z, z2), BinderC7744qp0.Z2(g.getPackageManager())) ? Yr3.b() : new Hq3(new Callable() { // from class: com.daaw.Xn2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC8822uh3.c(z, str, qb3);
                    }
                }, null);
            } catch (RemoteException e2) {
                return Yr3.d("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            return Yr3.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.IBinder, com.daaw.rX] */
    public static Yr3 g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Yr3 yr3D;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC7506py0.l(g);
            try {
                h();
                zzo zzoVar = new zzo(str, z, false, BinderC7744qp0.Z2(g), false, true);
                try {
                    zzq zzqVarZ0 = z4 ? e.Z0(zzoVar) : e.p1(zzoVar);
                    if (zzqVarZ0.m()) {
                        yr3D = Yr3.f(zzqVarZ0.p());
                    } else {
                        String strE = zzqVarZ0.e();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZ0.s() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strE == null) {
                            strE = "error checking package certificate";
                        }
                        yr3D = Yr3.g(zzqVarZ0.p(), zzqVarZ0.s(), strE, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    yr3D = Yr3.d("module call", e2);
                }
            } catch (DynamiteModule.a e3) {
                yr3D = Yr3.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return yr3D;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void h() {
        if (e != null) {
            return;
        }
        AbstractC7506py0.l(g);
        synchronized (f) {
            try {
                if (e == null) {
                    e = AbstractBinderC1821Op1.G(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
