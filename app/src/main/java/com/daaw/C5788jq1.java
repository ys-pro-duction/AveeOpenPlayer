package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.jq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5788jq1 extends AbstractC6706n53 {
    public Boolean b;
    public InterfaceC1613Mp1 c;
    public Boolean d;

    public C5788jq1(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.c = new InterfaceC1613Mp1() { // from class: com.daaw.np1
            @Override // com.daaw.InterfaceC1613Mp1
            public final String b(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return ((Long) AbstractC1311Jr2.f.a(null)).longValue();
    }

    public static final long e() {
        return ((Long) AbstractC1311Jr2.F.a(null)).longValue();
    }

    public final boolean A() {
        Boolean boolQ = q("google_analytics_adid_collection_enabled");
        return boolQ == null || boolQ.booleanValue();
    }

    public final boolean B(String str, C4388er2 c4388er2) {
        if (str == null) {
            return ((Boolean) c4388er2.a(null)).booleanValue();
        }
        String strB = this.c.b(str, c4388er2.b());
        return TextUtils.isEmpty(strB) ? ((Boolean) c4388er2.a(null)).booleanValue() : ((Boolean) c4388er2.a(Boolean.valueOf("1".equals(strB)))).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.c.b(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean boolQ = q("google_analytics_automatic_screen_reporting_enabled");
        return boolQ == null || boolQ.booleanValue();
    }

    public final boolean E() {
        this.a.a();
        Boolean boolQ = q("firebase_analytics_collection_deactivated");
        return boolQ != null && boolQ.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.c.b(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G() {
        if (this.b == null) {
            Boolean boolQ = q("app_measurement_lite");
            this.b = boolQ;
            if (boolQ == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.o();
    }

    public final boolean H() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        ApplicationInfo applicationInfo = this.a.v().getApplicationInfo();
                        String strA = AbstractC0717Dz0.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(strA)) {
                                z = true;
                            }
                            this.d = Boolean.valueOf(z);
                        }
                        if (this.d == null) {
                            this.d = Boolean.TRUE;
                            this.a.w().n().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.d.booleanValue();
    }

    public final String f(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC7506py0.l(str3);
            return str3;
        } catch (ClassNotFoundException e) {
            this.a.w().n().b("Could not find SystemProperties class", e);
            return "";
        } catch (IllegalAccessException e2) {
            this.a.w().n().b("Could not access SystemProperties.get()", e2);
            return "";
        } catch (NoSuchMethodException e3) {
            this.a.w().n().b("Could not find SystemProperties.get() method", e3);
            return "";
        } catch (InvocationTargetException e4) {
            this.a.w().n().b("SystemProperties.get() threw an exception", e4);
            return "";
        }
    }

    public final double g(String str, C4388er2 c4388er2) {
        if (str == null) {
            return ((Double) c4388er2.a(null)).doubleValue();
        }
        String strB = this.c.b(str, c4388er2.b());
        if (TextUtils.isEmpty(strB)) {
            return ((Double) c4388er2.a(null)).doubleValue();
        }
        try {
            return ((Double) c4388er2.a(Double.valueOf(Double.parseDouble(strB)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c4388er2.a(null)).doubleValue();
        }
    }

    public final int h(String str) {
        return l(str, AbstractC1311Jr2.J, 500, 2000);
    }

    public final int i() {
        return this.a.N().X(201500000, true) ? 100 : 25;
    }

    public final int j(String str) {
        return l(str, AbstractC1311Jr2.K, 25, 100);
    }

    public final int k(String str, C4388er2 c4388er2) {
        if (str == null) {
            return ((Integer) c4388er2.a(null)).intValue();
        }
        String strB = this.c.b(str, c4388er2.b());
        if (TextUtils.isEmpty(strB)) {
            return ((Integer) c4388er2.a(null)).intValue();
        }
        try {
            return ((Integer) c4388er2.a(Integer.valueOf(Integer.parseInt(strB)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c4388er2.a(null)).intValue();
        }
    }

    public final int l(String str, C4388er2 c4388er2, int i, int i2) {
        return Math.max(Math.min(k(str, c4388er2), i2), i);
    }

    public final long m() {
        this.a.a();
        return 79000L;
    }

    public final long n(String str, C4388er2 c4388er2) {
        if (str == null) {
            return ((Long) c4388er2.a(null)).longValue();
        }
        String strB = this.c.b(str, c4388er2.b());
        if (TextUtils.isEmpty(strB)) {
            return ((Long) c4388er2.a(null)).longValue();
        }
        try {
            return ((Long) c4388er2.a(Long.valueOf(Long.parseLong(strB)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c4388er2.a(null)).longValue();
        }
    }

    public final Bundle o() {
        try {
            if (this.a.v().getPackageManager() == null) {
                this.a.w().n().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = C6878nj1.a(this.a.v()).c(this.a.v().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            this.a.w().n().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.a.w().n().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean q(String str) {
        AbstractC7506py0.f(str);
        Bundle bundleO = o();
        if (bundleO == null) {
            this.a.w().n().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleO.containsKey(str)) {
            return Boolean.valueOf(bundleO.getBoolean(str));
        }
        return null;
    }

    public final String r() {
        return f("debug.firebase.analytics.app", "");
    }

    public final String s() {
        return f("debug.deferred.deeplink", "");
    }

    public final String t() {
        this.a.a();
        return "FA";
    }

    public final String u(String str, C4388er2 c4388er2) {
        return str == null ? (String) c4388er2.a(null) : (String) c4388er2.a(this.c.b(str, c4388er2.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.daaw.AbstractC7506py0.f(r4)
            android.os.Bundle r0 = r3.o()
            r1 = 0
            if (r0 != 0) goto L1d
            com.daaw.wU2 r4 = r3.a
            com.daaw.mz2 r4 = r4.w()
            com.daaw.dy2 r4 = r4.n()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.daaw.wU2 r0 = r3.a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.v()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.daaw.wU2 r0 = r3.a
            com.daaw.mz2 r0 = r0.w()
            com.daaw.dy2 r0 = r0.n()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5788jq1.y(java.lang.String):java.util.List");
    }

    public final void z(InterfaceC1613Mp1 interfaceC1613Mp1) {
        this.c = interfaceC1613Mp1;
    }
}
