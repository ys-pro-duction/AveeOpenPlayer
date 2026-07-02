package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Hb3 extends AD2 {
    public volatile C5715jb3 c;
    public volatile C5715jb3 d;
    public C5715jb3 e;
    public final Map f;
    public Activity g;
    public volatile boolean h;
    public volatile C5715jb3 i;
    public C5715jb3 j;
    public boolean k;
    public final Object l;

    public Hb3(C9327wU2 c9327wU2) {
        super(c9327wU2);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ void t(Hb3 hb3, Bundle bundle, C5715jb3 c5715jb3, C5715jb3 c5715jb32, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        hb3.k(c5715jb3, c5715jb32, j, true, hb3.a.N().x0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long jB = this.a.p().b();
        if (!this.a.z().D()) {
            this.c = null;
            this.a.x().z(new RunnableC9915yb3(this, jB));
        } else {
            C5715jb3 c5715jb3F = F(activity);
            this.d = this.c;
            this.c = null;
            this.a.x().z(new Bb3(this, c5715jb3F, jB));
        }
    }

    public final void B(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (this.a.z().D()) {
                    this.i = null;
                    this.a.x().z(new Eb3(this));
                }
            }
        }
        if (!this.a.z().D()) {
            this.c = this.i;
            this.a.x().z(new RunnableC9078vb3(this));
        } else {
            G(activity, F(activity), false);
            C8114s82 c8114s82Y = this.a.y();
            c8114s82Y.a.x().z(new RunnableC8474tS1(c8114s82Y, c8114s82Y.a.p().b()));
        }
    }

    public final void C(Activity activity, Bundle bundle) {
        C5715jb3 c5715jb3;
        if (!this.a.z().D() || bundle == null || (c5715jb3 = (C5715jb3) this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c5715jb3.c);
        bundle2.putString("name", c5715jb3.a);
        bundle2.putString("referrer_name", c5715jb3.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1 <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        if (r1 <= 100) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Hb3.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Hb3.E(android.os.Bundle, long):void");
    }

    public final C5715jb3 F(Activity activity) {
        AbstractC7506py0.l(activity);
        C5715jb3 c5715jb3 = (C5715jb3) this.f.get(activity);
        if (c5715jb3 == null) {
            C5715jb3 c5715jb32 = new C5715jb3(null, q(activity.getClass(), "Activity"), this.a.N().t0());
            this.f.put(activity, c5715jb32);
            c5715jb3 = c5715jb32;
        }
        return this.i != null ? this.i : c5715jb3;
    }

    public final void G(Activity activity, C5715jb3 c5715jb3, boolean z) {
        C5715jb3 c5715jb32;
        C5715jb3 c5715jb33 = this.c == null ? this.d : this.c;
        if (c5715jb3.b == null) {
            c5715jb32 = new C5715jb3(c5715jb3.a, activity != null ? q(activity.getClass(), "Activity") : null, c5715jb3.c, c5715jb3.e, c5715jb3.f);
        } else {
            c5715jb32 = c5715jb3;
        }
        this.d = this.c;
        this.c = c5715jb32;
        this.a.x().z(new RunnableC8234sb3(this, c5715jb32, c5715jb33, this.a.p().b(), z));
    }

    @Override // com.daaw.AD2
    public final boolean j() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.daaw.C5715jb3 r15, com.daaw.C5715jb3 r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Hb3.k(com.daaw.jb3, com.daaw.jb3, long, boolean, android.os.Bundle):void");
    }

    public final void l(C5715jb3 c5715jb3, boolean z, long j) {
        this.a.y().j(this.a.p().b());
        if (!this.a.M().f.d(c5715jb3 != null && c5715jb3.d, z, j) || c5715jb3 == null) {
            return;
        }
        c5715jb3.d = false;
    }

    public final C5715jb3 n() {
        return this.c;
    }

    public final C5715jb3 o(boolean z) {
        e();
        d();
        if (!z) {
            return this.e;
        }
        C5715jb3 c5715jb3 = this.e;
        return c5715jb3 != null ? c5715jb3 : this.j;
    }

    public final String q(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str2.length();
        this.a.z();
        if (length2 <= 100) {
            return str2;
        }
        this.a.z();
        return str2.substring(0, 100);
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new C5715jb3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.l) {
            try {
                if (activity == this.g) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.a.z().D()) {
            this.f.remove(activity);
        }
    }
}
