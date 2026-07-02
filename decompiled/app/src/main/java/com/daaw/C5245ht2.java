package com.daaw;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ht2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5245ht2 {
    public final InterfaceC5485im a;
    public final C5522it2 b;
    public final C6487mJ2 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final boolean e = ((Boolean) zzba.zzc().b(AbstractC9820yE1.O6)).booleanValue();
    public final C3553br2 f;
    public boolean g;
    public long h;
    public long i;

    public C5245ht2(InterfaceC5485im interfaceC5485im, C5522it2 c5522it2, C3553br2 c3553br2, C6487mJ2 c6487mJ2) {
        this.a = interfaceC5485im;
        this.b = c5522it2;
        this.f = c3553br2;
        this.c = c6487mJ2;
    }

    public final synchronized long a() {
        return this.h;
    }

    public final synchronized InterfaceFutureC8236sc0 f(C9267wF2 c9267wF2, C4498fF2 c4498fF2, InterfaceFutureC8236sc0 interfaceFutureC8236sc0, C5361iJ2 c5361iJ2) {
        C5622jF2 c5622jF2 = c9267wF2.b.b;
        long jB = this.a.b();
        String str = c4498fF2.y;
        if (str != null) {
            this.d.put(c4498fF2, new C4966gt2(str, c4498fF2.h0, 7, 0L, null));
            AbstractC7360pS2.r(interfaceFutureC8236sc0, new C4687ft2(this, jB, c5622jF2, c4498fF2, str, c5361iJ2, c9267wF2), AbstractC9322wT1.f);
        }
        return interfaceFutureC8236sc0;
    }

    public final synchronized String g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                C4966gt2 c4966gt2 = (C4966gt2) ((Map.Entry) it.next()).getValue();
                if (c4966gt2.c != Integer.MAX_VALUE) {
                    arrayList.add(c4966gt2.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void i(C4498fF2 c4498fF2) {
        try {
            this.h = this.a.b() - this.i;
            if (c4498fF2 != null) {
                this.f.e(c4498fF2);
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j() {
        this.h = this.a.b() - this.i;
    }

    public final synchronized void k(List list) {
        this.i = this.a.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4498fF2 c4498fF2 = (C4498fF2) it.next();
            if (!TextUtils.isEmpty(c4498fF2.y)) {
                this.d.put(c4498fF2, new C4966gt2(c4498fF2.y, c4498fF2.h0, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void l() {
        this.i = this.a.b();
    }

    public final synchronized void m(C4498fF2 c4498fF2) {
        C4966gt2 c4966gt2 = (C4966gt2) this.d.get(c4498fF2);
        if (c4966gt2 == null || this.g) {
            return;
        }
        c4966gt2.c = 8;
    }

    public final synchronized boolean q(C4498fF2 c4498fF2) {
        C4966gt2 c4966gt2 = (C4966gt2) this.d.get(c4498fF2);
        if (c4966gt2 == null) {
            return false;
        }
        return c4966gt2.c == 8;
    }
}
