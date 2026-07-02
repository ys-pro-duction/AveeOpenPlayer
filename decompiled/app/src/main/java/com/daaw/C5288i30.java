package com.daaw;

/* JADX INFO: renamed from: com.daaw.i30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5288i30 {
    public static final a d = new a(null);
    public static final C5288i30 e = new C5288i30(EnumC5076hI0.F, null, null, 6, null);
    public final EnumC5076hI0 a;
    public final S80 b;
    public final EnumC5076hI0 c;

    /* JADX INFO: renamed from: com.daaw.i30$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C5288i30 a() {
            return C5288i30.e;
        }

        public a() {
        }
    }

    public C5288i30(EnumC5076hI0 enumC5076hI0, S80 s80, EnumC5076hI0 enumC5076hI02) {
        G10.g(enumC5076hI0, "reportLevelBefore");
        G10.g(enumC5076hI02, "reportLevelAfter");
        this.a = enumC5076hI0;
        this.b = s80;
        this.c = enumC5076hI02;
    }

    public final EnumC5076hI0 b() {
        return this.c;
    }

    public final EnumC5076hI0 c() {
        return this.a;
    }

    public final S80 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5288i30)) {
            return false;
        }
        C5288i30 c5288i30 = (C5288i30) obj;
        return this.a == c5288i30.a && G10.c(this.b, c5288i30.b) && this.c == c5288i30.c;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        S80 s80 = this.b;
        return ((iHashCode + (s80 == null ? 0 : s80.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public /* synthetic */ C5288i30(EnumC5076hI0 enumC5076hI0, S80 s80, EnumC5076hI0 enumC5076hI02, int i, AbstractC2911Yw abstractC2911Yw) {
        this(enumC5076hI0, (i & 2) != 0 ? new S80(1, 0) : s80, (i & 4) != 0 ? enumC5076hI0 : enumC5076hI02);
    }
}
