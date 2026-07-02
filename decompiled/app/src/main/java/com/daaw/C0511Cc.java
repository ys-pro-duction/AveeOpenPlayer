package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Cc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0511Cc extends AbstractC1316Jt.e.d {
    public final long a;
    public final String b;
    public final AbstractC1316Jt.e.d.a c;
    public final AbstractC1316Jt.e.d.c d;
    public final AbstractC1316Jt.e.d.AbstractC0085d e;

    /* JADX INFO: renamed from: com.daaw.Cc$b */
    public static final class b extends AbstractC1316Jt.e.d.b {
        public Long a;
        public String b;
        public AbstractC1316Jt.e.d.a c;
        public AbstractC1316Jt.e.d.c d;
        public AbstractC1316Jt.e.d.AbstractC0085d e;

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C0511Cc(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d.b b(AbstractC1316Jt.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.c = aVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d.b c(AbstractC1316Jt.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.d = cVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d.b d(AbstractC1316Jt.e.d.AbstractC0085d abstractC0085d) {
            this.e = abstractC0085d;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d.b e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.b
        public AbstractC1316Jt.e.d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.b = str;
            return this;
        }

        public b() {
        }

        public b(AbstractC1316Jt.e.d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public AbstractC1316Jt.e.d.a b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public AbstractC1316Jt.e.d.c c() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public AbstractC1316Jt.e.d.AbstractC0085d d() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        AbstractC1316Jt.e.d.AbstractC0085d abstractC0085d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d) {
            AbstractC1316Jt.e.d dVar = (AbstractC1316Jt.e.d) obj;
            if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c()) && ((abstractC0085d = this.e) != null ? abstractC0085d.equals(dVar.d()) : dVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public String f() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d
    public AbstractC1316Jt.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.a;
        int iHashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        AbstractC1316Jt.e.d.AbstractC0085d abstractC0085d = this.e;
        return (abstractC0085d == null ? 0 : abstractC0085d.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }

    public C0511Cc(long j, String str, AbstractC1316Jt.e.d.a aVar, AbstractC1316Jt.e.d.c cVar, AbstractC1316Jt.e.d.AbstractC0085d abstractC0085d) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0085d;
    }
}
