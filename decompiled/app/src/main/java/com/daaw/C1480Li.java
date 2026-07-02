package com.daaw;

/* JADX INFO: renamed from: com.daaw.Li, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1480Li {
    public static final a f = new a(null);
    public static final C2352Tm0 g;
    public static final AP h;
    public final AP a;
    public final AP b;
    public final C2352Tm0 c;
    public final C6607ml d;
    public final AP e;

    /* JADX INFO: renamed from: com.daaw.Li$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    static {
        C2352Tm0 c2352Tm0 = C7091oV0.m;
        g = c2352Tm0;
        AP apK = AP.k(c2352Tm0);
        G10.f(apK, "topLevel(...)");
        h = apK;
    }

    public C1480Li(AP ap, AP ap2, C2352Tm0 c2352Tm0, C6607ml c6607ml, AP ap3) {
        this.a = ap;
        this.b = ap2;
        this.c = c2352Tm0;
        this.d = c6607ml;
        this.e = ap3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1480Li)) {
            return false;
        }
        C1480Li c1480Li = (C1480Li) obj;
        return G10.c(this.a, c1480Li.a) && G10.c(this.b, c1480Li.b) && G10.c(this.c, c1480Li.c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.a.hashCode()) * 31;
        AP ap = this.b;
        return ((iHashCode + (ap != null ? ap.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String strB = this.a.b();
        G10.f(strB, "asString(...)");
        sb.append(AY0.r(strB, '.', '/', false, 4, null));
        sb.append("/");
        AP ap = this.b;
        if (ap != null) {
            sb.append(ap);
            sb.append(".");
        }
        sb.append(this.c);
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1480Li(AP ap, C2352Tm0 c2352Tm0) {
        this(ap, null, c2352Tm0, null, null);
        G10.g(ap, "packageName");
        G10.g(c2352Tm0, "callableName");
    }
}
