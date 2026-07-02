package com.daaw;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.wU2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9327wU2 implements InterfaceC5027h63 {
    public static volatile C9327wU2 H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final long G;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final C8292sn1 f;
    public final C5788jq1 g;
    public final C5634jI2 h;
    public final C6675mz2 i;
    public final KS2 j;
    public final C7134oe3 k;
    public final Pf3 l;
    public final C7779qw2 m;
    public final InterfaceC5485im n;
    public final Hb3 o;
    public final Oa3 p;
    public final C8114s82 q;
    public final C3195ab3 r;
    public final String s;
    public C5254hv2 t;
    public C7129od3 u;
    public C5812jv1 v;
    public C3006Zt2 w;
    public Boolean y;
    public long z;
    public boolean x = false;
    public final AtomicInteger F = new AtomicInteger(0);

    public C9327wU2(U83 u83) {
        Bundle bundle;
        AbstractC7506py0.l(u83);
        Context context = u83.a;
        C8292sn1 c8292sn1 = new C8292sn1(context);
        this.f = c8292sn1;
        AbstractC2470Up2.a = c8292sn1;
        this.a = context;
        this.b = u83.b;
        this.c = u83.c;
        this.d = u83.d;
        this.e = u83.h;
        this.A = u83.e;
        this.s = u83.j;
        this.D = true;
        zzcl zzclVar = u83.g;
        if (zzclVar != null && (bundle = zzclVar.H) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzclVar.H.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        AbstractC6556ma3.d(context);
        InterfaceC5485im interfaceC5485imD = C2599Vw.d();
        this.n = interfaceC5485imD;
        Long l = u83.i;
        this.G = l != null ? l.longValue() : interfaceC5485imD.a();
        this.g = new C5788jq1(this);
        C5634jI2 c5634jI2 = new C5634jI2(this);
        c5634jI2.h();
        this.h = c5634jI2;
        C6675mz2 c6675mz2 = new C6675mz2(this);
        c6675mz2.h();
        this.i = c6675mz2;
        Pf3 pf3 = new Pf3(this);
        pf3.h();
        this.l = pf3;
        this.m = new C7779qw2(new Q83(u83, this));
        this.q = new C8114s82(this);
        Hb3 hb3 = new Hb3(this);
        hb3.f();
        this.o = hb3;
        Oa3 oa3 = new Oa3(this);
        oa3.f();
        this.p = oa3;
        C7134oe3 c7134oe3 = new C7134oe3(this);
        c7134oe3.f();
        this.k = c7134oe3;
        C3195ab3 c3195ab3 = new C3195ab3(this);
        c3195ab3.h();
        this.r = c3195ab3;
        KS2 ks2 = new KS2(this);
        ks2.h();
        this.j = ks2;
        zzcl zzclVar2 = u83.g;
        boolean z = zzclVar2 == null || zzclVar2.C == 0;
        if (context.getApplicationContext() instanceof Application) {
            Oa3 oa3I = I();
            if (oa3I.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) oa3I.a.a.getApplicationContext();
                if (oa3I.c == null) {
                    oa3I.c = new La3(oa3I);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(oa3I.c);
                    application.registerActivityLifecycleCallbacks(oa3I.c);
                    oa3I.a.w().s().a("Registered activity lifecycle callback");
                }
            }
        } else {
            w().t().a("Application context is not an Application");
        }
        ks2.z(new ST2(this, u83));
    }

    public static C9327wU2 H(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.F == null || zzclVar.G == null)) {
            zzclVar = new zzcl(zzclVar.B, zzclVar.C, zzclVar.D, zzclVar.E, null, null, zzclVar.H, null);
        }
        AbstractC7506py0.l(context);
        AbstractC7506py0.l(context.getApplicationContext());
        if (H == null) {
            synchronized (C9327wU2.class) {
                try {
                    if (H == null) {
                        H = new C9327wU2(new U83(context, zzclVar, l));
                    }
                } finally {
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.H) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC7506py0.l(H);
            H.A = Boolean.valueOf(zzclVar.H.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC7506py0.l(H);
        return H;
    }

    public static /* bridge */ /* synthetic */ void b(C9327wU2 c9327wU2, U83 u83) {
        c9327wU2.x().d();
        c9327wU2.g.t();
        C5812jv1 c5812jv1 = new C5812jv1(c9327wU2);
        c5812jv1.h();
        c9327wU2.v = c5812jv1;
        C3006Zt2 c3006Zt2 = new C3006Zt2(c9327wU2, u83.f);
        c3006Zt2.f();
        c9327wU2.w = c3006Zt2;
        C5254hv2 c5254hv2 = new C5254hv2(c9327wU2);
        c5254hv2.f();
        c9327wU2.t = c5254hv2;
        C7129od3 c7129od3 = new C7129od3(c9327wU2);
        c7129od3.f();
        c9327wU2.u = c7129od3;
        c9327wU2.l.i();
        c9327wU2.h.i();
        c9327wU2.w.g();
        C4140dy2 c4140dy2R = c9327wU2.w().r();
        c9327wU2.g.m();
        c4140dy2R.b("App measurement initialized, version", 79000L);
        c9327wU2.w().r().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strO = c3006Zt2.o();
        if (TextUtils.isEmpty(c9327wU2.b)) {
            if (c9327wU2.N().U(strO)) {
                c9327wU2.w().r().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c9327wU2.w().r().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strO)));
            }
        }
        c9327wU2.w().m().a("Debug-level message logging enabled");
        if (c9327wU2.E != c9327wU2.F.get()) {
            c9327wU2.w().n().c("Not all components initialized", Integer.valueOf(c9327wU2.E), Integer.valueOf(c9327wU2.F.get()));
        }
        c9327wU2.x = true;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(AbstractC6706n53 abstractC6706n53) {
        if (abstractC6706n53 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(AD2 ad2) {
        if (ad2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!ad2.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(ad2.getClass())));
        }
    }

    public static final void t(F53 f53) {
        if (f53 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!f53.j()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f53.getClass())));
        }
    }

    public final C5812jv1 A() {
        t(this.v);
        return this.v;
    }

    public final C3006Zt2 B() {
        s(this.w);
        return this.w;
    }

    public final C5254hv2 C() {
        s(this.t);
        return this.t;
    }

    public final C7779qw2 D() {
        return this.m;
    }

    public final C6675mz2 E() {
        C6675mz2 c6675mz2 = this.i;
        if (c6675mz2 == null || !c6675mz2.j()) {
            return null;
        }
        return c6675mz2;
    }

    public final C5634jI2 F() {
        r(this.h);
        return this.h;
    }

    public final KS2 G() {
        return this.j;
    }

    public final Oa3 I() {
        s(this.p);
        return this.p;
    }

    public final C3195ab3 J() {
        t(this.r);
        return this.r;
    }

    public final Hb3 K() {
        s(this.o);
        return this.o;
    }

    public final C7129od3 L() {
        s(this.u);
        return this.u;
    }

    public final C7134oe3 M() {
        s(this.k);
        return this.k;
    }

    public final Pf3 N() {
        r(this.l);
        return this.l;
    }

    public final String O() {
        return this.b;
    }

    public final String P() {
        return this.c;
    }

    public final String Q() {
        return this.d;
    }

    public final String R() {
        return this.s;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final C8292sn1 a() {
        return this.f;
    }

    public final void c() {
        this.F.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void d(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9327wU2.d(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void e() {
        this.E++;
    }

    public final void f() {
        x().d();
        t(J());
        String strO = B().o();
        Pair pairL = F().l(strO);
        if (!this.g.A() || ((Boolean) pairL.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairL.first)) {
            w().m().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        C3195ab3 c3195ab3J = J();
        c3195ab3J.g();
        ConnectivityManager connectivityManager = (ConnectivityManager) c3195ab3J.a.a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            w().t().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        Pf3 pf3N = N();
        B().a.g.m();
        URL urlO = pf3N.o(79000L, strO, (String) pairL.first, F().t.a() - 1);
        if (urlO != null) {
            C3195ab3 c3195ab3J2 = J();
            C7085oT2 c7085oT2 = new C7085oT2(this);
            c3195ab3J2.d();
            c3195ab3J2.g();
            AbstractC7506py0.l(urlO);
            AbstractC7506py0.l(c7085oT2);
            c3195ab3J2.a.x().y(new Xa3(c3195ab3J2, strO, urlO, null, null, c7085oT2));
        }
    }

    public final void g(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final void h(boolean z) {
        x().d();
        this.D = z;
    }

    public final void i(zzcl zzclVar) {
        C3633c83 c3633c83;
        x().d();
        C3633c83 c3633c83M = F().m();
        int iA = c3633c83M.a();
        C5788jq1 c5788jq1 = this.g;
        C9327wU2 c9327wU2 = c5788jq1.a;
        Boolean boolQ = c5788jq1.q("google_analytics_default_allow_ad_storage");
        C5788jq1 c5788jq12 = this.g;
        C9327wU2 c9327wU22 = c5788jq12.a;
        Boolean boolQ2 = c5788jq12.q("google_analytics_default_allow_analytics_storage");
        if (!(boolQ == null && boolQ2 == null) && F().t(-10)) {
            c3633c83 = new C3633c83(boolQ, boolQ2, -10);
        } else {
            if (!TextUtils.isEmpty(B().q()) && (iA == 0 || iA == 30 || iA == 10 || iA == 30 || iA == 30 || iA == 40)) {
                I().F(new C3633c83(null, null, -10), this.G);
            } else if (TextUtils.isEmpty(B().q()) && zzclVar != null && zzclVar.H != null && F().t(30)) {
                c3633c83 = C3633c83.b(zzclVar.H, 30);
                if (!c3633c83.l()) {
                }
            }
            c3633c83 = null;
        }
        if (c3633c83 != null) {
            I().F(c3633c83, this.G);
            c3633c83M = c3633c83;
        }
        I().J(c3633c83M);
        if (F().e.a() == 0) {
            w().s().b("Persisting first open", Long.valueOf(this.G));
            F().e.b(this.G);
        }
        I().l.c();
        if (n()) {
            if (!TextUtils.isEmpty(B().q()) || !TextUtils.isEmpty(B().n())) {
                Pf3 pf3N = N();
                String strQ = B().q();
                C5634jI2 c5634jI2F = F();
                c5634jI2F.d();
                String string = c5634jI2F.k().getString("gmp_app_id", null);
                String strN = B().n();
                C5634jI2 c5634jI2F2 = F();
                c5634jI2F2.d();
                if (pf3N.d0(strQ, string, strN, c5634jI2F2.k().getString("admob_app_id", null))) {
                    w().r().a("Rechecking which service to use due to a GMP App Id change");
                    C5634jI2 c5634jI2F3 = F();
                    c5634jI2F3.d();
                    Boolean boolN = c5634jI2F3.n();
                    SharedPreferences.Editor editorEdit = c5634jI2F3.k().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolN != null) {
                        c5634jI2F3.o(boolN);
                    }
                    C().m();
                    this.u.Q();
                    this.u.P();
                    F().e.b(this.G);
                    F().g.b(null);
                }
                C5634jI2 c5634jI2F4 = F();
                String strQ2 = B().q();
                c5634jI2F4.d();
                SharedPreferences.Editor editorEdit2 = c5634jI2F4.k().edit();
                editorEdit2.putString("gmp_app_id", strQ2);
                editorEdit2.apply();
                C5634jI2 c5634jI2F5 = F();
                String strN2 = B().n();
                c5634jI2F5.d();
                SharedPreferences.Editor editorEdit3 = c5634jI2F5.k().edit();
                editorEdit3.putString("admob_app_id", strN2);
                editorEdit3.apply();
            }
            if (!F().m().j(EnumC9512x73.ANALYTICS_STORAGE)) {
                F().g.b(null);
            }
            I().C(F().g.a());
            C7443pk3.b();
            if (this.g.B(null, AbstractC1311Jr2.g0)) {
                try {
                    N().a.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().u.a())) {
                        w().t().a("Remote config removed with active feature rollouts");
                        F().u.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().q()) || !TextUtils.isEmpty(B().n())) {
                boolean zK = k();
                if (!F().r() && !this.g.E()) {
                    F().q(!zK);
                }
                if (zK) {
                    I().f0();
                }
                M().e.a();
                L().S(new AtomicReference());
                L().s(F().x.a());
            }
        } else if (k()) {
            if (!N().T("android.permission.INTERNET")) {
                w().n().a("App is missing INTERNET permission");
            }
            if (!N().T("android.permission.ACCESS_NETWORK_STATE")) {
                w().n().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!C6878nj1.a(this.a).g() && !this.g.G()) {
                if (!Pf3.a0(this.a)) {
                    w().n().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!Pf3.b0(this.a, false)) {
                    w().n().a("AppMeasurementService not registered/enabled");
                }
            }
            w().n().a("Uploading is not possible. App measurement disabled");
        }
        F().n.a(true);
    }

    public final boolean j() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean k() {
        return u() == 0;
    }

    public final boolean l() {
        x().d();
        return this.D;
    }

    public final boolean m() {
        return TextUtils.isEmpty(this.b);
    }

    public final boolean n() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        x().d();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (!bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
            this.z = this.n.b();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(N().T("android.permission.INTERNET") && N().T("android.permission.ACCESS_NETWORK_STATE") && (C6878nj1.a(this.a).g() || this.g.G() || (Pf3.a0(this.a) && Pf3.b0(this.a, false))));
            this.y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!N().M(B().q(), B().n()) && TextUtils.isEmpty(B().n())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    public final boolean o() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final InterfaceC5485im p() {
        return this.n;
    }

    public final int u() {
        x().d();
        if (this.g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        x().d();
        if (!this.D) {
            return 8;
        }
        Boolean boolN = F().n();
        if (boolN != null) {
            return boolN.booleanValue() ? 0 : 3;
        }
        C5788jq1 c5788jq1 = this.g;
        C8292sn1 c8292sn1 = c5788jq1.a.f;
        Boolean boolQ = c5788jq1.q("firebase_analytics_collection_enabled");
        if (boolQ != null) {
            return boolQ.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final Context v() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final C6675mz2 w() {
        t(this.i);
        return this.i;
    }

    @Override // com.daaw.InterfaceC5027h63
    public final KS2 x() {
        t(this.j);
        return this.j;
    }

    public final C8114s82 y() {
        C8114s82 c8114s82 = this.q;
        if (c8114s82 != null) {
            return c8114s82;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C5788jq1 z() {
        return this.g;
    }
}
