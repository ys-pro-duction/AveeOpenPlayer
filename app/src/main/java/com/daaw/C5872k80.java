package com.daaw;

/* JADX INFO: renamed from: com.daaw.k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5872k80 {
    public final C2030Qk0 a;
    public final AbstractC8072s00 b;

    public C5872k80(C2030Qk0 c2030Qk0, AbstractC8072s00 abstractC8072s00) {
        G10.g(c2030Qk0, "module");
        G10.g(abstractC8072s00, "factory");
        this.a = c2030Qk0;
        this.b = abstractC8072s00;
    }

    public final AbstractC8072s00 a() {
        return this.b;
    }

    public final C2030Qk0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5872k80)) {
            return false;
        }
        C5872k80 c5872k80 = (C5872k80) obj;
        return G10.c(this.a, c5872k80.a) && G10.c(this.b, c5872k80.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.a + ", factory=" + this.b + ')';
    }
}
