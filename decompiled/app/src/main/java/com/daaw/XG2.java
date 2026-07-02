package com.daaw;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: loaded from: classes3.dex */
public final class XG2 {
    public final long a;
    public long c;
    public final WG2 b = new WG2();
    public int d = 0;
    public int e = 0;
    public int f = 0;

    public XG2() {
        long jA = zzt.zzB().a();
        this.a = jA;
        this.c = jA;
    }

    public final int a() {
        return this.d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.c;
    }

    public final WG2 d() {
        WG2 wg2 = this.b;
        WG2 wg2Clone = wg2.clone();
        wg2.B = false;
        wg2.C = 0;
        return wg2Clone;
    }

    public final String e() {
        return "Created: " + this.a + " Last accessed: " + this.c + " Accesses: " + this.d + "\nEntries retrieved: Valid: " + this.e + " Stale: " + this.f;
    }

    public final void f() {
        this.c = zzt.zzB().a();
        this.d++;
    }

    public final void g() {
        this.f++;
        this.b.C++;
    }

    public final void h() {
        this.e++;
        this.b.B = true;
    }
}
