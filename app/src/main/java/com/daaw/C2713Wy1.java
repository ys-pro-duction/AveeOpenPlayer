package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.Wy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2713Wy1 extends AbstractCallableC3025Zy1 {
    public final View i;

    public C2713Wy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, View view) {
        super(c2813Xx1, "0+zdyC6VPJhTjPaEoqOWHTMOFQN+wcQzU7Oc0uK1pdETw1P+GgKsW//19LiWUDiB", "beFEMZ/YBSUug4MSXb2BKymKiM6ZxOOlxExWa37jMlM=", c9733xv1, i, 57);
        this.i = view;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        if (this.i != null) {
            Boolean bool = (Boolean) zzba.zzc().b(AbstractC9820yE1.h3);
            Boolean bool2 = (Boolean) zzba.zzc().b(AbstractC9820yE1.aa);
            C3582by1 c3582by1 = new C3582by1((String) this.f.invoke(null, this.i, this.b.b().getResources().getDisplayMetrics(), bool, bool2));
            C2805Xv1 c2805Xv1M = C2909Yv1.M();
            c2805Xv1M.o(c3582by1.a.longValue());
            c2805Xv1M.r(c3582by1.b.longValue());
            c2805Xv1M.t(c3582by1.c.longValue());
            if (bool2.booleanValue()) {
                c2805Xv1M.p(c3582by1.e.longValue());
            }
            if (bool.booleanValue()) {
                c2805Xv1M.n(c3582by1.d.longValue());
            }
            this.e.Q((C2909Yv1) c2805Xv1M.j());
        }
    }
}
