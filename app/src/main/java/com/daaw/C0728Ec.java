package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0728Ec extends AbstractC1316Jt.e.d.a.b {
    public final NY a;
    public final AbstractC1316Jt.e.d.a.b.c b;
    public final AbstractC1316Jt.a c;
    public final AbstractC1316Jt.e.d.a.b.AbstractC0079d d;
    public final NY e;

    /* JADX INFO: renamed from: com.daaw.Ec$b */
    public static final class b extends AbstractC1316Jt.e.d.a.b.AbstractC0077b {
        public NY a;
        public AbstractC1316Jt.e.d.a.b.c b;
        public AbstractC1316Jt.a c;
        public AbstractC1316Jt.e.d.a.b.AbstractC0079d d;
        public NY e;

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b a() {
            String str = "";
            if (this.d == null) {
                str = " signal";
            }
            if (this.e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C0728Ec(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b.AbstractC0077b b(AbstractC1316Jt.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b.AbstractC0077b c(NY ny) {
            if (ny == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = ny;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b.AbstractC0077b d(AbstractC1316Jt.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b.AbstractC0077b e(AbstractC1316Jt.e.d.a.b.AbstractC0079d abstractC0079d) {
            if (abstractC0079d == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = abstractC0079d;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.a.b.AbstractC0077b
        public AbstractC1316Jt.e.d.a.b.AbstractC0077b f(NY ny) {
            this.a = ny;
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b
    public AbstractC1316Jt.a b() {
        return this.c;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b
    public NY c() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b
    public AbstractC1316Jt.e.d.a.b.c d() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b
    public AbstractC1316Jt.e.d.a.b.AbstractC0079d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.a.b) {
            AbstractC1316Jt.e.d.a.b bVar = (AbstractC1316Jt.e.d.a.b) obj;
            NY ny = this.a;
            if (ny != null ? ny.equals(bVar.f()) : bVar.f() == null) {
                AbstractC1316Jt.e.d.a.b.c cVar = this.b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    AbstractC1316Jt.a aVar = this.c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.a.b
    public NY f() {
        return this.a;
    }

    public int hashCode() {
        NY ny = this.a;
        int iHashCode = ((ny == null ? 0 : ny.hashCode()) ^ 1000003) * 1000003;
        AbstractC1316Jt.e.d.a.b.c cVar = this.b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC1316Jt.a aVar = this.c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    public C0728Ec(NY ny, AbstractC1316Jt.e.d.a.b.c cVar, AbstractC1316Jt.a aVar, AbstractC1316Jt.e.d.a.b.AbstractC0079d abstractC0079d, NY ny2) {
        this.a = ny;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0079d;
        this.e = ny2;
    }
}
