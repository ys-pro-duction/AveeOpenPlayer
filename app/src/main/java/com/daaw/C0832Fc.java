package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0832Fc extends AbstractC1316Jt.e.d.a.b.AbstractC0075a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    /* JADX INFO: renamed from: com.daaw.Fc$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a {
        public Long a;
        public Long b;
        public String c;
        public String d;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a
        public AbstractC1316Jt.e.d.a.b.AbstractC0075a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C0832Fc(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a
        public AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a
        public AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a
        public AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a
        public AbstractC1316Jt.e.d.a.b.AbstractC0075a.AbstractC0076a e(String str) {
            this.d = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a
    public long b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a
    public String c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a
    public long d() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0075a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b.AbstractC0075a) {
            AbstractC1316Jt.e.d.a.b.AbstractC0075a abstractC0075a = (AbstractC1316Jt.e.d.a.b.AbstractC0075a) obj;
            if (this.a == abstractC0075a.b() && this.b == abstractC0075a.d() && this.c.equals(abstractC0075a.c()) && ((str = this.d) != null ? str.equals(abstractC0075a.e()) : abstractC0075a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    public C0832Fc(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
