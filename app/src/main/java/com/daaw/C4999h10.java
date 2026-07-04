package com.daaw;

/* JADX INFO: renamed from: com.daaw.h10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4999h10 {
    public final String a;
    public final b b;
    public final long c;
    public final InterfaceC8921v10 d;
    public final InterfaceC8921v10 e;

    /* JADX INFO: renamed from: com.daaw.h10$a */
    public static final class a {
        public String a;
        public b b;
        public Long c;
        public InterfaceC8921v10 d;
        public InterfaceC8921v10 e;

        public C4999h10 a() {
            AbstractC7785qy0.o(this.a, "description");
            AbstractC7785qy0.o(this.b, "severity");
            AbstractC7785qy0.o(this.c, "timestampNanos");
            AbstractC7785qy0.u(this.d == null || this.e == null, "at least one of channelRef and subchannelRef must be null");
            return new C4999h10(this.a, this.b, this.c.longValue(), this.d, this.e);
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }

        public a d(InterfaceC8921v10 interfaceC8921v10) {
            this.e = interfaceC8921v10;
            return this;
        }

        public a e(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.daaw.h10$b */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4999h10) {
            C4999h10 c4999h10 = (C4999h10) obj;
            if (AbstractC8301sp0.a(this.a, c4999h10.a) && AbstractC8301sp0.a(this.b, c4999h10.b) && this.c == c4999h10.c && AbstractC8301sp0.a(this.d, c4999h10.d) && AbstractC8301sp0.a(this.e, c4999h10.e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC8301sp0.b(this.a, this.b, Long.valueOf(this.c), this.d, this.e);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("description", this.a).d("severity", this.b).c("timestampNanos", this.c).d("channelRef", this.d).d("subchannelRef", this.e).toString();
    }

    public C4999h10(String str, b bVar, long j, InterfaceC8921v10 interfaceC8921v10, InterfaceC8921v10 interfaceC8921v102) {
        this.a = str;
        this.b = (b) AbstractC7785qy0.o(bVar, "severity");
        this.c = j;
        this.d = interfaceC8921v10;
        this.e = interfaceC8921v102;
    }
}
