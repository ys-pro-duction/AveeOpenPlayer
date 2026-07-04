package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.fK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C4515fK extends ZK {
    public final b a;
    public final C6564mc1 b;
    public final C6488mK c;

    /* JADX INFO: renamed from: com.daaw.fK$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.fK$b */
    public enum b {
        LESS_THAN("<"),
        LESS_THAN_OR_EQUAL("<="),
        EQUAL("=="),
        NOT_EQUAL("!="),
        GREATER_THAN(">"),
        GREATER_THAN_OR_EQUAL(">="),
        ARRAY_CONTAINS("array_contains"),
        ARRAY_CONTAINS_ANY("array_contains_any"),
        IN("in"),
        NOT_IN("not_in");

        public final String B;

        b(String str) {
            this.B = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.B;
        }
    }

    public C4515fK(C6488mK c6488mK, b bVar, C6564mc1 c6564mc1) {
        this.c = c6488mK;
        this.a = bVar;
        this.b = c6564mc1;
    }

    public static C4515fK f(C6488mK c6488mK, b bVar, C6564mc1 c6564mc1) {
        if (!c6488mK.w()) {
            return bVar == b.ARRAY_CONTAINS ? new C1655Na(c6488mK, c6564mc1) : bVar == b.IN ? new C3739cZ(c6488mK, c6564mc1) : bVar == b.ARRAY_CONTAINS_ANY ? new C1551Ma(c6488mK, c6564mc1) : bVar == b.NOT_IN ? new C0777Eo0(c6488mK, c6564mc1) : new C4515fK(c6488mK, bVar, c6564mc1);
        }
        if (bVar == b.IN) {
            return new N70(c6488mK, c6564mc1);
        }
        if (bVar == b.NOT_IN) {
            return new O70(c6488mK, c6564mc1);
        }
        AbstractC6557mb.d((bVar == b.ARRAY_CONTAINS || bVar == b.ARRAY_CONTAINS_ANY) ? false : true, bVar.toString() + "queries don't make sense on document keys", new Object[0]);
        return new M70(c6488mK, bVar, c6564mc1);
    }

    @Override // com.daaw.ZK
    public String a() {
        return g().g() + h().toString() + AbstractC0513Cc1.b(i());
    }

    @Override // com.daaw.ZK
    public List b() {
        return Collections.singletonList(this);
    }

    @Override // com.daaw.ZK
    public C6488mK c() {
        if (j()) {
            return g();
        }
        return null;
    }

    @Override // com.daaw.ZK
    public List d() {
        return Collections.singletonList(this);
    }

    @Override // com.daaw.ZK
    public boolean e(LC lc) {
        C6564mc1 c6564mc1E = lc.e(this.c);
        return this.a == b.NOT_EQUAL ? c6564mc1E != null && k(AbstractC0513Cc1.i(c6564mc1E, this.b)) : c6564mc1E != null && AbstractC0513Cc1.G(c6564mc1E) == AbstractC0513Cc1.G(this.b) && k(AbstractC0513Cc1.i(c6564mc1E, this.b));
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4515fK)) {
            C4515fK c4515fK = (C4515fK) obj;
            if (this.a == c4515fK.a && this.c.equals(c4515fK.c) && this.b.equals(c4515fK.b)) {
                return true;
            }
        }
        return false;
    }

    public C6488mK g() {
        return this.c;
    }

    public b h() {
        return this.a;
    }

    public int hashCode() {
        return ((((1147 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public C6564mc1 i() {
        return this.b;
    }

    public boolean j() {
        return Arrays.asList(b.LESS_THAN, b.LESS_THAN_OR_EQUAL, b.GREATER_THAN, b.GREATER_THAN_OR_EQUAL, b.NOT_EQUAL, b.NOT_IN).contains(this.a);
    }

    public boolean k(int i) {
        switch (a.a[this.a.ordinal()]) {
            case 1:
                return i < 0;
            case 2:
                return i <= 0;
            case 3:
                return i == 0;
            case 4:
                return i != 0;
            case 5:
                return i > 0;
            case 6:
                return i >= 0;
            default:
                throw AbstractC6557mb.a("Unknown FieldFilter operator: %s", this.a);
        }
    }

    public String toString() {
        return a();
    }
}
