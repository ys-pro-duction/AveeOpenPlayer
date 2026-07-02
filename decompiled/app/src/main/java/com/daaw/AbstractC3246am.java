package com.daaw;

/* JADX INFO: renamed from: com.daaw.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3246am extends ZX0 {

    /* JADX INFO: renamed from: com.daaw.am$a */
    public static abstract class a {
        public abstract AbstractC3246am a(b bVar, C2756Xj0 c2756Xj0);
    }

    /* JADX INFO: renamed from: com.daaw.am$b */
    public static final class b {
        public final C1168Ii a;
        public final int b;
        public final boolean c;

        /* JADX INFO: renamed from: com.daaw.am$b$a */
        public static final class a {
            public C1168Ii a = C1168Ii.k;
            public int b;
            public boolean c;

            public b a() {
                return new b(this.a, this.b, this.c);
            }

            public a b(C1168Ii c1168Ii) {
                this.a = (C1168Ii) AbstractC7785qy0.o(c1168Ii, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z) {
                this.c = z;
                return this;
            }

            public a d(int i) {
                this.b = i;
                return this;
            }
        }

        public b(C1168Ii c1168Ii, int i, boolean z) {
            this.a = (C1168Ii) AbstractC7785qy0.o(c1168Ii, "callOptions");
            this.b = i;
            this.c = z;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("callOptions", this.a).b("previousAttempts", this.b).e("isTransparentRetry", this.c).toString();
        }
    }

    public void j() {
    }

    public void l() {
    }

    public void k(C2756Xj0 c2756Xj0) {
    }

    public void m(C1971Qb c1971Qb, C2756Xj0 c2756Xj0) {
    }
}
