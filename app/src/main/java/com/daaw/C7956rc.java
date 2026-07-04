package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7956rc extends AbstractC1316Jt {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final AbstractC1316Jt.e h;
    public final AbstractC1316Jt.d i;
    public final AbstractC1316Jt.a j;

    /* JADX INFO: renamed from: com.daaw.rc$b */
    public static final class b extends AbstractC1316Jt.b {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public AbstractC1316Jt.e g;
        public AbstractC1316Jt.d h;
        public AbstractC1316Jt.a i;

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C7956rc(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, this.i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b b(AbstractC1316Jt.a aVar) {
            this.i = aVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.e = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b g(AbstractC1316Jt.d dVar) {
            this.h = dVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b h(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.b
        public AbstractC1316Jt.b j(AbstractC1316Jt.e eVar) {
            this.g = eVar;
            return this;
        }

        public b() {
        }

        public b(AbstractC1316Jt abstractC1316Jt) {
            this.a = abstractC1316Jt.j();
            this.b = abstractC1316Jt.f();
            this.c = Integer.valueOf(abstractC1316Jt.i());
            this.d = abstractC1316Jt.g();
            this.e = abstractC1316Jt.d();
            this.f = abstractC1316Jt.e();
            this.g = abstractC1316Jt.k();
            this.h = abstractC1316Jt.h();
            this.i = abstractC1316Jt.c();
        }
    }

    @Override // com.daaw.AbstractC1316Jt
    public AbstractC1316Jt.a c() {
        return this.j;
    }

    @Override // com.daaw.AbstractC1316Jt
    public String d() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1316Jt
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        AbstractC1316Jt.e eVar;
        AbstractC1316Jt.d dVar;
        AbstractC1316Jt.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt) {
            AbstractC1316Jt abstractC1316Jt = (AbstractC1316Jt) obj;
            if (this.b.equals(abstractC1316Jt.j()) && this.c.equals(abstractC1316Jt.f()) && this.d == abstractC1316Jt.i() && this.e.equals(abstractC1316Jt.g()) && this.f.equals(abstractC1316Jt.d()) && this.g.equals(abstractC1316Jt.e()) && ((eVar = this.h) != null ? eVar.equals(abstractC1316Jt.k()) : abstractC1316Jt.k() == null) && ((dVar = this.i) != null ? dVar.equals(abstractC1316Jt.h()) : abstractC1316Jt.h() == null) && ((aVar = this.j) != null ? aVar.equals(abstractC1316Jt.c()) : abstractC1316Jt.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt
    public String f() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt
    public String g() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt
    public AbstractC1316Jt.d h() {
        return this.i;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        AbstractC1316Jt.e eVar = this.h;
        int iHashCode2 = (iHashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC1316Jt.d dVar = this.i;
        int iHashCode3 = (iHashCode2 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC1316Jt.a aVar = this.j;
        return iHashCode3 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // com.daaw.AbstractC1316Jt
    public int i() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt
    public String j() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt
    public AbstractC1316Jt.e k() {
        return this.h;
    }

    @Override // com.daaw.AbstractC1316Jt
    public AbstractC1316Jt.b l() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + ", appExitInfo=" + this.j + "}";
    }

    public C7956rc(String str, String str2, int i, String str3, String str4, String str5, AbstractC1316Jt.e eVar, AbstractC1316Jt.d dVar, AbstractC1316Jt.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = eVar;
        this.i = dVar;
        this.j = aVar;
    }
}
