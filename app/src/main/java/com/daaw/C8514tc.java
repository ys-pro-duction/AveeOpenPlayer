package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.tc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8514tc extends AbstractC1316Jt.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final NY i;

    /* JADX INFO: renamed from: com.daaw.tc$b */
    public static final class b extends AbstractC1316Jt.a.b {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;
        public NY i;

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a a() {
            String str = "";
            if (this.a == null) {
                str = " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.d == null) {
                str = str + " importance";
            }
            if (this.e == null) {
                str = str + " pss";
            }
            if (this.f == null) {
                str = str + " rss";
            }
            if (this.g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C8514tc(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b b(NY ny) {
            this.i = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b f(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b i(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.a.b
        public AbstractC1316Jt.a.b j(String str) {
            this.h = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public NY b() {
        return this.i;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public int c() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public int d() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        NY ny;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.a) {
            AbstractC1316Jt.a aVar = (AbstractC1316Jt.a) obj;
            if (this.a == aVar.d() && this.b.equals(aVar.e()) && this.c == aVar.g() && this.d == aVar.c() && this.e == aVar.f() && this.f == aVar.h() && this.g == aVar.i() && ((str = this.h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((ny = this.i) != null ? ny.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public long f() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public int g() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        NY ny = this.i;
        return iHashCode2 ^ (ny != null ? ny.hashCode() : 0);
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public long i() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1316Jt.a
    public String j() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }

    public C8514tc(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, NY ny) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = ny;
    }
}
