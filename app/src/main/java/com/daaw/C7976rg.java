package com.daaw;

import com.daaw.C4954gr0;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7976rg {
    public final boolean a;
    public final List b;

    public C7976rg(List list, boolean z) {
        this.b = list;
        this.a = z;
    }

    public final int a(List list, LC lc) {
        int i;
        AbstractC6557mb.d(this.b.size() <= list.size(), "Bound has more components than query's orderBy", new Object[0]);
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            C4954gr0 c4954gr0 = (C4954gr0) list.get(i3);
            C6564mc1 c6564mc1 = (C6564mc1) this.b.get(i3);
            if (c4954gr0.b.equals(C6488mK.C)) {
                AbstractC6557mb.d(AbstractC0513Cc1.B(c6564mc1), "Bound has a non-key value where the key path is being used %s", c6564mc1);
                i = TC.k(c6564mc1.t0()).compareTo(lc.getKey());
            } else {
                C6564mc1 c6564mc1E = lc.e(c4954gr0.c());
                AbstractC6557mb.d(c6564mc1E != null, "Field should exist since document matched the orderBy already.", new Object[0]);
                i = AbstractC0513Cc1.i(c6564mc1, c6564mc1E);
            }
            if (c4954gr0.b().equals(C4954gr0.a.DESCENDING)) {
                i *= -1;
            }
            i2 = i;
            if (i2 != 0) {
                return i2;
            }
        }
        return i2;
    }

    public List b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public String d() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C6564mc1 c6564mc1 : this.b) {
            if (!z) {
                sb.append(",");
            }
            sb.append(AbstractC0513Cc1.b(c6564mc1));
            z = false;
        }
        return sb.toString();
    }

    public boolean e(List list, LC lc) {
        int iA = a(list, lc);
        return this.a ? iA >= 0 : iA > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7976rg.class == obj.getClass()) {
            C7976rg c7976rg = (C7976rg) obj;
            if (this.a == c7976rg.a && this.b.equals(c7976rg.b)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(List list, LC lc) {
        int iA = a(list, lc);
        return this.a ? iA <= 0 : iA < 0;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bound(inclusive=");
        sb.append(this.a);
        sb.append(", position=");
        for (int i = 0; i < this.b.size(); i++) {
            if (i > 0) {
                sb.append(" and ");
            }
            sb.append(AbstractC0513Cc1.b((C6564mc1) this.b.get(i)));
        }
        sb.append(")");
        return sb.toString();
    }
}
