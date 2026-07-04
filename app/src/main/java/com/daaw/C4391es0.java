package com.daaw;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: renamed from: com.daaw.es0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4391es0 {
    public final Context a;

    public C4391es0(Context context) {
        this.a = context;
    }

    public int a(String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    public int b(String str, String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo c(String str, int i) {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    public CharSequence d(String str) {
        Context context = this.a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public C0689Ds0 e(String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(str, 0);
        return C0689Ds0.a(this.a.getPackageManager().getApplicationLabel(applicationInfo), this.a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    public PackageInfo f(String str, int i) {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC9195w00.a(this.a);
        }
        if (!AbstractC7494pv0.i() || (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean h(int i, String str) {
        if (AbstractC7494pv0.d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager == null) {
                    throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
                }
                appOpsManager.checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
