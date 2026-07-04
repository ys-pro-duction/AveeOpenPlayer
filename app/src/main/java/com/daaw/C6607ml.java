package com.daaw;

/* JADX INFO: renamed from: com.daaw.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6607ml {
    public static final a d = new a(null);
    public final AP a;
    public final AP b;
    public final boolean c;

    /* JADX INFO: renamed from: com.daaw.ml$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ C6607ml b(a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.a(str, z);
        }

        public final C6607ml a(String str, boolean z) {
            String strS;
            String str2;
            G10.g(str, "string");
            int iL = BY0.L(str, '`', 0, false, 6, null);
            if (iL == -1) {
                iL = str.length();
            }
            int iS = BY0.S(str, "/", iL, false, 4, null);
            if (iS == -1) {
                strS = AY0.s(str, "`", "", false, 4, null);
                str2 = "";
            } else {
                String strSubstring = str.substring(0, iS);
                G10.f(strSubstring, "substring(...)");
                String strR = AY0.r(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = str.substring(iS + 1);
                G10.f(strSubstring2, "substring(...)");
                strS = AY0.s(strSubstring2, "`", "", false, 4, null);
                str2 = strR;
            }
            return new C6607ml(new AP(str2), new AP(strS), z);
        }

        public final C6607ml c(AP ap) {
            G10.g(ap, "topLevelFqName");
            AP apE = ap.e();
            G10.f(apE, "parent(...)");
            C2352Tm0 c2352Tm0G = ap.g();
            G10.f(c2352Tm0G, "shortName(...)");
            return new C6607ml(apE, c2352Tm0G);
        }

        public a() {
        }
    }

    public C6607ml(AP ap, AP ap2, boolean z) {
        G10.g(ap, "packageFqName");
        G10.g(ap2, "relativeClassName");
        this.a = ap;
        this.b = ap2;
        this.c = z;
        ap2.d();
    }

    public static final String c(AP ap) {
        String strB = ap.b();
        G10.f(strB, "asString(...)");
        if (!BY0.y(strB, '/', false, 2, null)) {
            return strB;
        }
        return '`' + strB + '`';
    }

    public static final C6607ml k(AP ap) {
        return d.c(ap);
    }

    public final AP a() {
        if (this.a.d()) {
            return this.b;
        }
        return new AP(this.a.b() + '.' + this.b.b());
    }

    public final String b() {
        if (this.a.d()) {
            return c(this.b);
        }
        StringBuilder sb = new StringBuilder();
        String strB = this.a.b();
        G10.f(strB, "asString(...)");
        sb.append(AY0.r(strB, '.', '/', false, 4, null));
        sb.append("/");
        sb.append(c(this.b));
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public final C6607ml d(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        AP ap = this.a;
        AP apC = this.b.c(c2352Tm0);
        G10.f(apC, "child(...)");
        return new C6607ml(ap, apC, this.c);
    }

    public final C6607ml e() {
        AP apE = this.b.e();
        G10.f(apE, "parent(...)");
        if (apE.d()) {
            return null;
        }
        return new C6607ml(this.a, apE, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6607ml)) {
            return false;
        }
        C6607ml c6607ml = (C6607ml) obj;
        return G10.c(this.a, c6607ml.a) && G10.c(this.b, c6607ml.b) && this.c == c6607ml.c;
    }

    public final AP f() {
        return this.a;
    }

    public final AP g() {
        return this.b;
    }

    public final C2352Tm0 h() {
        C2352Tm0 c2352Tm0G = this.b.g();
        G10.f(c2352Tm0G, "shortName(...)");
        return c2352Tm0G;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + AbstractC8813ug.a(this.c);
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return !this.b.e().d();
    }

    public String toString() {
        if (!this.a.d()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6607ml(AP ap, C2352Tm0 c2352Tm0) {
        G10.g(ap, "packageFqName");
        G10.g(c2352Tm0, "topLevelName");
        AP apK = AP.k(c2352Tm0);
        G10.f(apK, "topLevel(...)");
        this(ap, apK, false);
    }
}
