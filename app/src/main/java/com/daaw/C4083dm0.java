package com.daaw;

/* JADX INFO: renamed from: com.daaw.dm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4083dm0 implements LC {
    public final TC b;
    public b c;
    public CU0 d;
    public CU0 e;
    public C7465pp0 f;
    public a g;

    /* JADX INFO: renamed from: com.daaw.dm0$a */
    public enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* JADX INFO: renamed from: com.daaw.dm0$b */
    public enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    public C4083dm0(TC tc) {
        this.b = tc;
        this.e = CU0.C;
    }

    public static C4083dm0 p(TC tc, CU0 cu0, C7465pp0 c7465pp0) {
        return new C4083dm0(tc).l(cu0, c7465pp0);
    }

    public static C4083dm0 q(TC tc) {
        b bVar = b.INVALID;
        CU0 cu0 = CU0.C;
        return new C4083dm0(tc, bVar, cu0, cu0, new C7465pp0(), a.SYNCED);
    }

    public static C4083dm0 r(TC tc, CU0 cu0) {
        return new C4083dm0(tc).m(cu0);
    }

    public static C4083dm0 s(TC tc, CU0 cu0) {
        return new C4083dm0(tc).n(cu0);
    }

    @Override // com.daaw.LC
    public C4083dm0 a() {
        return new C4083dm0(this.b, this.c, this.d, this.e, this.f.clone(), this.g);
    }

    @Override // com.daaw.LC
    public boolean b() {
        return this.c.equals(b.FOUND_DOCUMENT);
    }

    @Override // com.daaw.LC
    public boolean c() {
        return this.g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // com.daaw.LC
    public boolean d() {
        return this.g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    @Override // com.daaw.LC
    public C6564mc1 e(C6488mK c6488mK) {
        return h().i(c6488mK);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4083dm0.class != obj.getClass()) {
            return false;
        }
        C4083dm0 c4083dm0 = (C4083dm0) obj;
        if (this.b.equals(c4083dm0.b) && this.d.equals(c4083dm0.d) && this.c.equals(c4083dm0.c) && this.g.equals(c4083dm0.g)) {
            return this.f.equals(c4083dm0.f);
        }
        return false;
    }

    @Override // com.daaw.LC
    public boolean f() {
        return d() || c();
    }

    @Override // com.daaw.LC
    public CU0 g() {
        return this.e;
    }

    @Override // com.daaw.LC
    public TC getKey() {
        return this.b;
    }

    @Override // com.daaw.LC
    public C7465pp0 h() {
        return this.f;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // com.daaw.LC
    public boolean i() {
        return this.c.equals(b.NO_DOCUMENT);
    }

    @Override // com.daaw.LC
    public boolean j() {
        return this.c.equals(b.UNKNOWN_DOCUMENT);
    }

    @Override // com.daaw.LC
    public CU0 k() {
        return this.d;
    }

    public C4083dm0 l(CU0 cu0, C7465pp0 c7465pp0) {
        this.d = cu0;
        this.c = b.FOUND_DOCUMENT;
        this.f = c7465pp0;
        this.g = a.SYNCED;
        return this;
    }

    public C4083dm0 m(CU0 cu0) {
        this.d = cu0;
        this.c = b.NO_DOCUMENT;
        this.f = new C7465pp0();
        this.g = a.SYNCED;
        return this;
    }

    public C4083dm0 n(CU0 cu0) {
        this.d = cu0;
        this.c = b.UNKNOWN_DOCUMENT;
        this.f = new C7465pp0();
        this.g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public boolean o() {
        return !this.c.equals(b.INVALID);
    }

    public C4083dm0 t() {
        this.g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.b + ", version=" + this.d + ", readTime=" + this.e + ", type=" + this.c + ", documentState=" + this.g + ", value=" + this.f + '}';
    }

    public C4083dm0 u() {
        this.g = a.HAS_LOCAL_MUTATIONS;
        this.d = CU0.C;
        return this;
    }

    public C4083dm0 v(CU0 cu0) {
        this.e = cu0;
        return this;
    }

    public C4083dm0(TC tc, b bVar, CU0 cu0, CU0 cu02, C7465pp0 c7465pp0, a aVar) {
        this.b = tc;
        this.d = cu0;
        this.e = cu02;
        this.c = bVar;
        this.g = aVar;
        this.f = c7465pp0;
    }
}
