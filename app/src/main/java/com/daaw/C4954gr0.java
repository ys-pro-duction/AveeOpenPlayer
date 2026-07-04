package com.daaw;

/* JADX INFO: renamed from: com.daaw.gr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4954gr0 {
    public final a a;
    public final C6488mK b;

    /* JADX INFO: renamed from: com.daaw.gr0$a */
    public enum a {
        ASCENDING(1),
        DESCENDING(-1);

        public final int B;

        a(int i) {
            this.B = i;
        }

        public int a() {
            return this.B;
        }
    }

    public C4954gr0(a aVar, C6488mK c6488mK) {
        this.a = aVar;
        this.b = c6488mK;
    }

    public static C4954gr0 d(a aVar, C6488mK c6488mK) {
        return new C4954gr0(aVar, c6488mK);
    }

    public int a(LC lc, LC lc2) {
        int iA;
        int i;
        if (this.b.equals(C6488mK.C)) {
            iA = this.a.a();
            i = lc.getKey().compareTo(lc2.getKey());
        } else {
            C6564mc1 c6564mc1E = lc.e(this.b);
            C6564mc1 c6564mc1E2 = lc2.e(this.b);
            AbstractC6557mb.d((c6564mc1E == null || c6564mc1E2 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            iA = this.a.a();
            i = AbstractC0513Cc1.i(c6564mc1E, c6564mc1E2);
        }
        return iA * i;
    }

    public a b() {
        return this.a;
    }

    public C6488mK c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4954gr0)) {
            C4954gr0 c4954gr0 = (C4954gr0) obj;
            if (this.a == c4954gr0.a && this.b.equals(c4954gr0.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == a.ASCENDING ? "" : "-");
        sb.append(this.b.g());
        return sb.toString();
    }
}
