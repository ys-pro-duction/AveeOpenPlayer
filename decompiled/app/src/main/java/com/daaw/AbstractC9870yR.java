package com.daaw;

/* JADX INFO: renamed from: com.daaw.yR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9870yR {
    public final AP a;
    public final String b;
    public final boolean c;
    public final C6607ml d;

    /* JADX INFO: renamed from: com.daaw.yR$a */
    public static final class a extends AbstractC9870yR {
        public static final a e = new a();

        public a() {
            super(YV0.A, "Function", false, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yR$b */
    public static final class b extends AbstractC9870yR {
        public static final b e = new b();

        public b() {
            super(YV0.x, "KFunction", true, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yR$c */
    public static final class c extends AbstractC9870yR {
        public static final c e = new c();

        public c() {
            super(YV0.x, "KSuspendFunction", true, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yR$d */
    public static final class d extends AbstractC9870yR {
        public static final d e = new d();

        public d() {
            super(YV0.s, "SuspendFunction", false, null);
        }
    }

    public AbstractC9870yR(AP ap, String str, boolean z, C6607ml c6607ml) {
        G10.g(ap, "packageFqName");
        G10.g(str, "classNamePrefix");
        this.a = ap;
        this.b = str;
        this.c = z;
        this.d = c6607ml;
    }

    public final String a() {
        return this.b;
    }

    public final AP b() {
        return this.a;
    }

    public final C2352Tm0 c(int i) {
        C2352Tm0 c2352Tm0L = C2352Tm0.l(this.b + i);
        G10.f(c2352Tm0L, "identifier(...)");
        return c2352Tm0L;
    }

    public String toString() {
        return this.a + '.' + this.b + 'N';
    }
}
