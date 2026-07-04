package com.daaw;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class N20 {
    public final C3541bp0 a;
    public final Collection b;
    public final boolean c;

    public N20(C3541bp0 c3541bp0, Collection collection, boolean z) {
        G10.g(c3541bp0, "nullabilityQualifier");
        G10.g(collection, "qualifierApplicabilityTypes");
        this.a = c3541bp0;
        this.b = collection;
        this.c = z;
    }

    public static /* synthetic */ N20 b(N20 n20, C3541bp0 c3541bp0, Collection collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            c3541bp0 = n20.a;
        }
        if ((i & 2) != 0) {
            collection = n20.b;
        }
        if ((i & 4) != 0) {
            z = n20.c;
        }
        return n20.a(c3541bp0, collection, z);
    }

    public final N20 a(C3541bp0 c3541bp0, Collection collection, boolean z) {
        G10.g(c3541bp0, "nullabilityQualifier");
        G10.g(collection, "qualifierApplicabilityTypes");
        return new N20(c3541bp0, collection, z);
    }

    public final boolean c() {
        return this.c;
    }

    public final C3541bp0 d() {
        return this.a;
    }

    public final Collection e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N20)) {
            return false;
        }
        N20 n20 = (N20) obj;
        return G10.c(this.a, n20.a) && G10.c(this.b, n20.b) && this.c == n20.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + AbstractC8813ug.a(this.c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.b + ", definitelyNotNull=" + this.c + ')';
    }

    public /* synthetic */ N20(C3541bp0 c3541bp0, Collection collection, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c3541bp0, collection, (i & 4) != 0 ? c3541bp0.c() == EnumC3262ap0.D : z);
    }
}
