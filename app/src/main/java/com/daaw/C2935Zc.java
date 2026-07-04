package com.daaw;

import com.daaw.AbstractC7236p00;

/* JADX INFO: renamed from: com.daaw.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2935Zc extends AbstractC7236p00 {
    public final String a;
    public final long b;
    public final long c;

    /* JADX INFO: renamed from: com.daaw.Zc$b */
    public static final class b extends AbstractC7236p00.a {
        public String a;
        public Long b;
        public Long c;

        @Override // com.daaw.AbstractC7236p00.a
        public AbstractC7236p00 a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2935Zc(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC7236p00.a
        public AbstractC7236p00.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC7236p00.a
        public AbstractC7236p00.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC7236p00.a
        public AbstractC7236p00.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC7236p00
    public String b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC7236p00
    public long c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC7236p00
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7236p00) {
            AbstractC7236p00 abstractC7236p00 = (AbstractC7236p00) obj;
            if (this.a.equals(abstractC7236p00.b()) && this.b == abstractC7236p00.d() && this.c == abstractC7236p00.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        long j2 = this.c;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    public C2935Zc(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
