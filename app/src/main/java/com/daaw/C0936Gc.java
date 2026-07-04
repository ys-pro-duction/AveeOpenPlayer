package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Gc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0936Gc extends AbstractC1316Jt.e.d.a.b.c {
    public final String a;
    public final String b;
    public final NY c;
    public final AbstractC1316Jt.e.d.a.b.c d;
    public final int e;

    /* JADX INFO: renamed from: com.daaw.Gc$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.c.AbstractC0078a {
        public String a;
        public String b;
        public NY c;
        public AbstractC1316Jt.e.d.a.b.c d;
        public Integer e;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C0936Gc(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c.AbstractC0078a b(AbstractC1316Jt.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c.AbstractC0078a c(NY ny) {
            if (ny == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c.AbstractC0078a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c.AbstractC0078a e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c.AbstractC0078a
        public AbstractC1316Jt.e.d.a.b.c.AbstractC0078a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.a = str;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c
    public AbstractC1316Jt.e.d.a.b.c b() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c
    public NY c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC1316Jt.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b.c) {
            AbstractC1316Jt.e.d.a.b.c cVar2 = (AbstractC1316Jt.e.d.a.b.c) obj;
            if (this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        AbstractC1316Jt.e.d.a.b.c cVar = this.d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    public C0936Gc(String str, String str2, NY ny, AbstractC1316Jt.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = ny;
        this.d = cVar;
        this.e = i;
    }
}
