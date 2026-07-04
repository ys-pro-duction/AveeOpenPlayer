package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: loaded from: classes.dex */
public class FT {
    public static FT c;
    public final Context a;
    public volatile String b;

    public FT(Context context) {
        this.a = context.getApplicationContext();
    }

    public static FT a(Context context) {
        AbstractC7506py0.l(context);
        synchronized (FT.class) {
            try {
                if (c == null) {
                    AbstractC8822uh3.d(context);
                    c = new FT(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static final Qb3 d(PackageInfo packageInfo, Qb3... qb3Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC7687qd3 binderC7687qd3 = new BinderC7687qd3(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < qb3Arr.length; i++) {
            if (qb3Arr[i].equals(binderC7687qd3)) {
                return qb3Arr[i];
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? d(packageInfo2, AbstractC6307lg3.a) : d(packageInfo2, AbstractC6307lg3.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        return e(packageInfo, true) && ET.f(this.a);
    }

    public boolean c(int i) {
        Yr3 yr3C;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            yr3C = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    AbstractC7506py0.l(yr3C);
                    break;
                }
                yr3C = f(packagesForUid[i2], false, false);
                if (yr3C.a) {
                    break;
                }
                i2++;
            }
        } else {
            yr3C = Yr3.c("no pkgs");
        }
        yr3C.e();
        return yr3C.a;
    }

    public final Yr3 f(String str, boolean z, boolean z2) {
        Yr3 yr3C;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return Yr3.c("null pkg");
        }
        if (str.equals(this.b)) {
            return Yr3.b();
        }
        if (AbstractC8822uh3.e()) {
            yr3C = AbstractC8822uh3.b(str, ET.f(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean zF = ET.f(this.a);
                if (packageInfo == null) {
                    yr3C = Yr3.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        yr3C = Yr3.c("single cert required");
                    } else {
                        BinderC7687qd3 binderC7687qd3 = new BinderC7687qd3(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        Yr3 yr3A = AbstractC8822uh3.a(str2, binderC7687qd3, zF, false);
                        yr3C = (!yr3A.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !AbstractC8822uh3.a(str2, binderC7687qd3, false, true).a) ? yr3A : Yr3.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return Yr3.d("no pkg ".concat(str), e);
            }
        }
        if (yr3C.a) {
            this.b = str;
        }
        return yr3C;
    }
}
