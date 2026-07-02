package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9916yc extends AbstractC1316Jt.e {
    public final String a;
    public final String b;
    public final long c;
    public final Long d;
    public final boolean e;
    public final AbstractC1316Jt.e.a f;
    public final AbstractC1316Jt.e.f g;
    public final AbstractC1316Jt.e.AbstractC0086e h;
    public final AbstractC1316Jt.e.c i;
    public final NY j;
    public final int k;

    /* JADX INFO: renamed from: com.daaw.yc$b */
    public static final class b extends AbstractC1316Jt.e.b {
        public String a;
        public String b;
        public Long c;
        public Long d;
        public Boolean e;
        public AbstractC1316Jt.e.a f;
        public AbstractC1316Jt.e.f g;
        public AbstractC1316Jt.e.AbstractC0086e h;
        public AbstractC1316Jt.e.c i;
        public NY j;
        public Integer k;

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.e == null) {
                str = str + " crashed";
            }
            if (this.f == null) {
                str = str + " app";
            }
            if (this.k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C9916yc(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b b(AbstractC1316Jt.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f = aVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b d(AbstractC1316Jt.e.c cVar) {
            this.i = cVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b e(Long l) {
            this.d = l;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b f(NY ny) {
            this.j = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b h(int i) {
            this.k = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b k(AbstractC1316Jt.e.AbstractC0086e abstractC0086e) {
            this.h = abstractC0086e;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b l(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.b
        public AbstractC1316Jt.e.b m(AbstractC1316Jt.e.f fVar) {
            this.g = fVar;
            return this;
        }

        public b() {
        }

        public b(AbstractC1316Jt.e eVar) {
            this.a = eVar.f();
            this.b = eVar.h();
            this.c = Long.valueOf(eVar.k());
            this.d = eVar.d();
            this.e = Boolean.valueOf(eVar.m());
            this.f = eVar.b();
            this.g = eVar.l();
            this.h = eVar.j();
            this.i = eVar.c();
            this.j = eVar.e();
            this.k = Integer.valueOf(eVar.g());
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public AbstractC1316Jt.e.a b() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public AbstractC1316Jt.e.c c() {
        return this.i;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public Long d() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public NY e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        Long l;
        AbstractC1316Jt.e.f fVar;
        AbstractC1316Jt.e.AbstractC0086e abstractC0086e;
        AbstractC1316Jt.e.c cVar;
        NY ny;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e) {
            AbstractC1316Jt.e eVar = (AbstractC1316Jt.e) obj;
            if (this.a.equals(eVar.f()) && this.b.equals(eVar.h()) && this.c == eVar.k() && ((l = this.d) != null ? l.equals(eVar.d()) : eVar.d() == null) && this.e == eVar.m() && this.f.equals(eVar.b()) && ((fVar = this.g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0086e = this.h) != null ? abstractC0086e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((ny = this.j) != null ? ny.equals(eVar.e()) : eVar.e() == null) && this.k == eVar.g()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public String f() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public int g() {
        return this.k;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.d;
        int iHashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        AbstractC1316Jt.e.f fVar = this.g;
        int iHashCode3 = (iHashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC1316Jt.e.AbstractC0086e abstractC0086e = this.h;
        int iHashCode4 = (iHashCode3 ^ (abstractC0086e == null ? 0 : abstractC0086e.hashCode())) * 1000003;
        AbstractC1316Jt.e.c cVar = this.i;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        NY ny = this.j;
        return ((iHashCode5 ^ (ny != null ? ny.hashCode() : 0)) * 1000003) ^ this.k;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public AbstractC1316Jt.e.AbstractC0086e j() {
        return this.h;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public long k() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public AbstractC1316Jt.e.f l() {
        return this.g;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public boolean m() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e
    public AbstractC1316Jt.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.d + ", crashed=" + this.e + ", app=" + this.f + ", user=" + this.g + ", os=" + this.h + ", device=" + this.i + ", events=" + this.j + ", generatorType=" + this.k + "}";
    }

    public C9916yc(String str, String str2, long j, Long l, boolean z, AbstractC1316Jt.e.a aVar, AbstractC1316Jt.e.f fVar, AbstractC1316Jt.e.AbstractC0086e abstractC0086e, AbstractC1316Jt.e.c cVar, NY ny, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = abstractC0086e;
        this.i = cVar;
        this.j = ny;
        this.k = i;
    }
}
