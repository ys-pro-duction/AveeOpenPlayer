package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
public final class VG2 {
    public final AG2 a;
    public final TG2 b;
    public final C8148sG2 c;
    public C4506fH2 e;
    public int f = 1;
    public final ArrayDeque d = new ArrayDeque();

    public VG2(AG2 ag2, C8148sG2 c8148sG2, TG2 tg2) {
        this.a = ag2;
        this.c = c8148sG2;
        this.b = tg2;
        c8148sG2.b(new QG2(this));
    }

    public final synchronized InterfaceFutureC8236sc0 a(UG2 ug2) {
        this.f = 2;
        if (i()) {
            return null;
        }
        return this.e.a(ug2);
    }

    public final synchronized void e(UG2 ug2) {
        this.d.add(ug2);
    }

    public final /* synthetic */ void f() {
        synchronized (this) {
            this.f = 1;
            h();
        }
    }

    public final synchronized void h() {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.l6)).booleanValue() && !zzt.zzo().h().zzh().h()) {
            this.d.clear();
            return;
        }
        if (i()) {
            while (!this.d.isEmpty()) {
                UG2 ug2 = (UG2) this.d.pollFirst();
                if (ug2 == null || (ug2.zza() != null && this.a.a(ug2.zza()))) {
                    C4506fH2 c4506fH2 = new C4506fH2(this.a, this.b, ug2);
                    this.e = c4506fH2;
                    c4506fH2.d(new RG2(this, ug2));
                    return;
                }
            }
        }
    }

    public final synchronized boolean i() {
        return this.e == null;
    }
}
