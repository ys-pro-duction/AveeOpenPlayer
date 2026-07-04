package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1040Hc extends AbstractC1316Jt.e.d.a.b.AbstractC0079d {
    public final String a;
    public final String b;
    public final long c;

    /* JADX INFO: renamed from: com.daaw.Hc$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a {
        public String a;
        public String b;
        public Long c;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a
        public AbstractC1316Jt.e.d.a.b.AbstractC0079d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C1040Hc(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a
        public AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a
        public AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a
        public AbstractC1316Jt.e.d.a.b.AbstractC0079d.AbstractC0080a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d
    public long b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d
    public String c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0079d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b.AbstractC0079d) {
            AbstractC1316Jt.e.d.a.b.AbstractC0079d abstractC0079d = (AbstractC1316Jt.e.d.a.b.AbstractC0079d) obj;
            if (this.a.equals(abstractC0079d.d()) && this.b.equals(abstractC0079d.c()) && this.c == abstractC0079d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return iHashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    public C1040Hc(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
