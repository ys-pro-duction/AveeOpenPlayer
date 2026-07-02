package com.daaw;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PF2 {
    public final C4498fF2 a;
    public final C5622jF2 b;
    public final C6077kq2 c;
    public final C6487mJ2 d;
    public final TI2 e;
    public final L12 f;

    public PF2(C6077kq2 c6077kq2, C6487mJ2 c6487mJ2, C4498fF2 c4498fF2, C5622jF2 c5622jF2, L12 l12, TI2 ti2) {
        this.a = c4498fF2;
        this.b = c5622jF2;
        this.c = c6077kq2;
        this.d = c6487mJ2;
        this.f = l12;
        this.e = ti2;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), 2);
        }
    }

    public final void b(String str, int i) {
        if (!this.a.k0) {
            this.d.c(str, this.e);
        } else {
            this.c.j(new C6635mq2(zzt.zzB().a(), this.b.b, str, i));
        }
    }

    public final void c(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC7360pS2.r(((Boolean) zzba.zzc().b(AbstractC9820yE1.u9)).booleanValue() ? this.f.c(str, zzay.zze()) : AbstractC7360pS2.h(str), new OF2(this, i), AbstractC9322wT1.a);
        }
    }
}
