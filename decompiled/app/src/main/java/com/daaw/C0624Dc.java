package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0624Dc extends AbstractC1316Jt.e.d.a {
    public final AbstractC1316Jt.e.d.a.b a;
    public final NY b;
    public final NY c;
    public final Boolean d;
    public final int e;

    /* JADX INFO: renamed from: com.daaw.Dc$b */
    public static final class b extends AbstractC1316Jt.e.d.a.AbstractC0074a {
        public AbstractC1316Jt.e.d.a.b a;
        public NY b;
        public NY c;
        public Boolean d;
        public Integer e;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C0624Dc(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a.AbstractC0074a b(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a.AbstractC0074a c(NY ny) {
            this.b = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a.AbstractC0074a d(AbstractC1316Jt.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = bVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a.AbstractC0074a e(NY ny) {
            this.c = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.AbstractC0074a
        public AbstractC1316Jt.e.d.a.AbstractC0074a f(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public b() {
        }

        public b(AbstractC1316Jt.e.d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.e();
            this.d = aVar.b();
            this.e = Integer.valueOf(aVar.f());
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public Boolean b() {
        return this.d;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public NY c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public AbstractC1316Jt.e.d.a.b d() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public NY e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        NY ny;
        NY ny2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a) {
            AbstractC1316Jt.e.d.a aVar = (AbstractC1316Jt.e.d.a) obj;
            if (this.a.equals(aVar.d()) && ((ny = this.b) != null ? ny.equals(aVar.c()) : aVar.c() == null) && ((ny2 = this.c) != null ? ny2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.e == aVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public int f() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a
    public AbstractC1316Jt.e.d.a.AbstractC0074a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        NY ny = this.b;
        int iHashCode2 = (iHashCode ^ (ny == null ? 0 : ny.hashCode())) * 1000003;
        NY ny2 = this.c;
        int iHashCode3 = (iHashCode2 ^ (ny2 == null ? 0 : ny2.hashCode())) * 1000003;
        Boolean bool = this.d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", uiOrientation=" + this.e + "}";
    }

    public C0624Dc(AbstractC1316Jt.e.d.a.b bVar, NY ny, NY ny2, Boolean bool, int i) {
        this.a = bVar;
        this.b = ny;
        this.c = ny2;
        this.d = bool;
        this.e = i;
    }
}
