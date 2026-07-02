package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.lf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6302lf3 {
    public C8762uU2 a;
    public List b;
    public List c;
    public long d;
    public final /* synthetic */ C8812uf3 e;

    public /* synthetic */ C6302lf3(C8812uf3 c8812uf3, AbstractC5454if3 abstractC5454if3) {
        this.e = c8812uf3;
    }

    public static final long b(C6507mO2 c6507mO2) {
        return ((c6507mO2.E() / 1000) / 60) / 60;
    }

    public final boolean a(long j, C6507mO2 c6507mO2) {
        AbstractC7506py0.l(c6507mO2);
        if (this.c == null) {
            this.c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.c.isEmpty() && b((C6507mO2) this.c.get(0)) != b(c6507mO2)) {
            return false;
        }
        long jB = this.d + ((long) c6507mO2.b());
        this.e.U();
        if (jB >= Math.max(0, ((Integer) AbstractC1311Jr2.k.a(null)).intValue())) {
            return false;
        }
        this.d = jB;
        this.c.add(c6507mO2);
        this.b.add(Long.valueOf(j));
        int size = this.c.size();
        this.e.U();
        return size < Math.max(1, ((Integer) AbstractC1311Jr2.l.a(null)).intValue());
    }
}
