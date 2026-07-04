package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1248Jc extends AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* JADX INFO: renamed from: com.daaw.Jc$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C1248Jc(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a
        public AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b.AbstractC0084a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b
    public String b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b
    public int c() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b
    public long d() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b) {
            AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b abstractC0083b = (AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b) obj;
            if (this.a == abstractC0083b.e() && this.b.equals(abstractC0083b.f()) && ((str = this.c) != null ? str.equals(abstractC0083b.b()) : abstractC0083b.b() == null) && this.d == abstractC0083b.d() && this.e == abstractC0083b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0081e.AbstractC0083b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int iHashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }

    public C1248Jc(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }
}
