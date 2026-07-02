package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.daaw.vG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8992vG2 {
    public final int b;
    public final int c;
    public final LinkedList a = new LinkedList();
    public final XG2 d = new XG2();

    public C8992vG2(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.d.a();
    }

    public final int b() {
        i();
        return this.a.size();
    }

    public final long c() {
        return this.d.b();
    }

    public final long d() {
        return this.d.c();
    }

    public final IG2 e() {
        this.d.f();
        i();
        if (this.a.isEmpty()) {
            return null;
        }
        IG2 ig2 = (IG2) this.a.remove();
        if (ig2 != null) {
            this.d.h();
        }
        return ig2;
    }

    public final WG2 f() {
        return this.d.d();
    }

    public final String g() {
        return this.d.e();
    }

    public final boolean h(IG2 ig2) {
        this.d.f();
        i();
        if (this.a.size() == this.b) {
            return false;
        }
        this.a.add(ig2);
        return true;
    }

    public final void i() {
        while (!this.a.isEmpty()) {
            if (zzt.zzB().a() - ((IG2) this.a.getFirst()).d < this.c) {
                return;
            }
            this.d.g();
            this.a.remove();
        }
    }
}
