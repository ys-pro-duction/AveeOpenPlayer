package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0407Bc extends AbstractC1316Jt.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: com.daaw.Bc$b */
    public static final class b extends AbstractC1316Jt.e.c.a {
        public Integer a;
        public String b;
        public Integer c;
        public Long d;
        public Long e;
        public Boolean f;
        public Integer g;
        public String h;
        public String i;

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " model";
            }
            if (this.c == null) {
                str = str + " cores";
            }
            if (this.d == null) {
                str = str + " ram";
            }
            if (this.e == null) {
                str = str + " diskSpace";
            }
            if (this.f == null) {
                str = str + " simulator";
            }
            if (this.g == null) {
                str = str + " state";
            }
            if (this.h == null) {
                str = str + " manufacturer";
            }
            if (this.i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C0407Bc(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a d(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.h = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.i = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a h(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.c.a
        public AbstractC1316Jt.e.c.a j(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public int b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public int c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public long d() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.c) {
            AbstractC1316Jt.e.c cVar = (AbstractC1316Jt.e.c) obj;
            if (this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.d == cVar.h() && this.e == cVar.d() && this.f == cVar.j() && this.g == cVar.i() && this.h.equals(cVar.e()) && this.i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public String f() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public String g() {
        return this.i;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public long h() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public int i() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1316Jt.e.c
    public boolean j() {
        return this.f;
    }

    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }

    public C0407Bc(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }
}
