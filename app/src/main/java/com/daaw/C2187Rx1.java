package com.daaw;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Rx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2187Rx1 implements TL2 {
    public final UK2 a;
    public final C7332pL2 b;
    public final ViewOnAttachStateChangeListenerC4418ey1 c;
    public final C2083Qx1 d;
    public final C8904ux1 e;
    public final C5265hy1 f;
    public final C2917Yx1 g;
    public final C1957Px1 h;

    public C2187Rx1(UK2 uk2, C7332pL2 c7332pL2, ViewOnAttachStateChangeListenerC4418ey1 viewOnAttachStateChangeListenerC4418ey1, C2083Qx1 c2083Qx1, C8904ux1 c8904ux1, C5265hy1 c5265hy1, C2917Yx1 c2917Yx1, C1957Px1 c1957Px1) {
        this.a = uk2;
        this.b = c7332pL2;
        this.c = viewOnAttachStateChangeListenerC4418ey1;
        this.d = c2083Qx1;
        this.e = c8904ux1;
        this.f = c5265hy1;
        this.g = c2917Yx1;
        this.h = c1957Px1;
    }

    public final void a(View view) {
        this.c.d(view);
    }

    public final Map b() {
        HashMap map = new HashMap();
        UK2 uk2 = this.a;
        C3013Zv1 c3013Zv1B = this.b.b();
        map.put("v", uk2.b());
        map.put("gms", Boolean.valueOf(this.a.c()));
        map.put("int", c3013Zv1B.L0());
        map.put("up", Boolean.valueOf(this.d.a()));
        map.put("t", new Throwable());
        C2917Yx1 c2917Yx1 = this.g;
        if (c2917Yx1 != null) {
            map.put("tcq", Long.valueOf(c2917Yx1.c()));
            map.put("tpq", Long.valueOf(this.g.g()));
            map.put("tcv", Long.valueOf(this.g.d()));
            map.put("tpv", Long.valueOf(this.g.h()));
            map.put("tchv", Long.valueOf(this.g.b()));
            map.put("tphv", Long.valueOf(this.g.f()));
            map.put("tcc", Long.valueOf(this.g.a()));
            map.put("tpc", Long.valueOf(this.g.e()));
        }
        return map;
    }

    @Override // com.daaw.TL2
    public final Map zza() {
        ViewOnAttachStateChangeListenerC4418ey1 viewOnAttachStateChangeListenerC4418ey1 = this.c;
        Map mapB = b();
        mapB.put("lts", Long.valueOf(viewOnAttachStateChangeListenerC4418ey1.a()));
        return mapB;
    }

    @Override // com.daaw.TL2
    public final Map zzb() {
        Map mapB = b();
        C3013Zv1 c3013Zv1A = this.b.a();
        mapB.put("gai", Boolean.valueOf(this.a.d()));
        mapB.put("did", c3013Zv1A.K0());
        mapB.put("dst", Integer.valueOf(c3013Zv1A.y0() - 1));
        mapB.put("doo", Boolean.valueOf(c3013Zv1A.v0()));
        C8904ux1 c8904ux1 = this.e;
        if (c8904ux1 != null) {
            mapB.put("nt", Long.valueOf(c8904ux1.a()));
        }
        C5265hy1 c5265hy1 = this.f;
        if (c5265hy1 != null) {
            mapB.put("vs", Long.valueOf(c5265hy1.c()));
            mapB.put("vf", Long.valueOf(this.f.b()));
        }
        return mapB;
    }

    @Override // com.daaw.TL2
    public final Map zzc() {
        C1957Px1 c1957Px1 = this.h;
        Map mapB = b();
        if (c1957Px1 != null) {
            mapB.put("vst", c1957Px1.a());
        }
        return mapB;
    }
}
