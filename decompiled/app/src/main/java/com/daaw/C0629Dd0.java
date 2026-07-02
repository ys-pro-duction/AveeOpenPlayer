package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629Dd0 {
    public static final C0629Dd0 c = new a().a();
    public final long a;
    public final b b;

    /* JADX INFO: renamed from: com.daaw.Dd0$a */
    public static final class a {
        public long a = 0;
        public b b = b.REASON_UNKNOWN;

        public C0629Dd0 a() {
            return new C0629Dd0(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Dd0$b */
    public enum b implements VA0 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        public final int B;

        b(int i) {
            this.B = i;
        }

        @Override // com.daaw.VA0
        public int b() {
            return this.B;
        }
    }

    public C0629Dd0(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }
}
