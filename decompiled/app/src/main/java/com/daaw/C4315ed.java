package com.daaw;

import com.daaw.AbstractC0348An0;

/* JADX INFO: renamed from: com.daaw.ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4315ed extends AbstractC0348An0 {
    public final AbstractC0348An0.c a;
    public final AbstractC0348An0.b b;

    /* JADX INFO: renamed from: com.daaw.ed$b */
    public static final class b extends AbstractC0348An0.a {
        public AbstractC0348An0.c a;
        public AbstractC0348An0.b b;

        @Override // com.daaw.AbstractC0348An0.a
        public AbstractC0348An0 a() {
            return new C4315ed(this.a, this.b);
        }

        @Override // com.daaw.AbstractC0348An0.a
        public AbstractC0348An0.a b(AbstractC0348An0.b bVar) {
            this.b = bVar;
            return this;
        }

        @Override // com.daaw.AbstractC0348An0.a
        public AbstractC0348An0.a c(AbstractC0348An0.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    @Override // com.daaw.AbstractC0348An0
    public AbstractC0348An0.b b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC0348An0
    public AbstractC0348An0.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0348An0) {
            AbstractC0348An0 abstractC0348An0 = (AbstractC0348An0) obj;
            AbstractC0348An0.c cVar = this.a;
            if (cVar != null ? cVar.equals(abstractC0348An0.c()) : abstractC0348An0.c() == null) {
                AbstractC0348An0.b bVar = this.b;
                if (bVar != null ? bVar.equals(abstractC0348An0.b()) : abstractC0348An0.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC0348An0.c cVar = this.a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0348An0.b bVar = this.b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }

    public C4315ed(AbstractC0348An0.c cVar, AbstractC0348An0.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }
}
