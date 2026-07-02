package com.daaw;

/* JADX INFO: renamed from: com.daaw.ac0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3197ac0 {
    public static final b c;
    public static final C3197ac0 d;
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: com.daaw.ac0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C3197ac0 a() {
            return C3197ac0.d;
        }

        public b() {
        }
    }

    static {
        AbstractC2911Yw abstractC2911Yw = null;
        c = new b(abstractC2911Yw);
        d = new C3197ac0(a.a.a(), c.a.a(), abstractC2911Yw);
    }

    public /* synthetic */ C3197ac0(int i, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(i, i2);
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3197ac0)) {
            return false;
        }
        C3197ac0 c3197ac0 = (C3197ac0) obj;
        return a.c(this.a, c3197ac0.a) && c.c(this.b, c3197ac0.b);
    }

    public int hashCode() {
        return (a.d(this.a) * 31) + c.d(this.b);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.e(this.a)) + ", trim=" + ((Object) c.g(this.b)) + ')';
    }

    public C3197ac0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* JADX INFO: renamed from: com.daaw.ac0$a */
    public static final class a {
        public static final C0148a a = new C0148a(null);
        public static final int b = b(0);
        public static final int c = b(50);
        public static final int d = b(-1);
        public static final int e = b(100);

        /* JADX INFO: renamed from: com.daaw.ac0$a$a, reason: collision with other inner class name */
        public static final class C0148a {
            public /* synthetic */ C0148a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final int a() {
                return a.d;
            }

            public C0148a() {
            }
        }

        public static int b(int i) {
            if ((i < 0 || i >= 101) && i != -1) {
                throw new IllegalStateException("topRatio should be in [0..100] range or -1");
            }
            return i;
        }

        public static final boolean c(int i, int i2) {
            return i == i2;
        }

        public static String e(int i) {
            if (i == b) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (i == c) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (i == d) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (i == e) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + i + ')';
        }

        public static int d(int i) {
            return i;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ac0$c */
    public static final class c {
        public static final a a = new a(null);
        public static final int b = b(1);
        public static final int c = b(16);
        public static final int d = b(17);
        public static final int e = b(0);

        /* JADX INFO: renamed from: com.daaw.ac0$c$a */
        public static final class a {
            public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            public final int a() {
                return c.d;
            }

            public a() {
            }
        }

        public static final boolean c(int i, int i2) {
            return i == i2;
        }

        public static final boolean e(int i) {
            return (i & 1) > 0;
        }

        public static final boolean f(int i) {
            return (i & 16) > 0;
        }

        public static String g(int i) {
            return i == b ? "LineHeightStyle.Trim.FirstLineTop" : i == c ? "LineHeightStyle.Trim.LastLineBottom" : i == d ? "LineHeightStyle.Trim.Both" : i == e ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public static int b(int i) {
            return i;
        }

        public static int d(int i) {
            return i;
        }
    }
}
