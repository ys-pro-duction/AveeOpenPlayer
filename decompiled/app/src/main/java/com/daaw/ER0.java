package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class ER0 {
    public final AbstractC2583Vs a;
    public final AbstractC2583Vs b;
    public final AbstractC2583Vs c;

    public ER0(AbstractC2583Vs abstractC2583Vs, AbstractC2583Vs abstractC2583Vs2, AbstractC2583Vs abstractC2583Vs3) {
        G10.g(abstractC2583Vs, "small");
        G10.g(abstractC2583Vs2, "medium");
        G10.g(abstractC2583Vs3, "large");
        this.a = abstractC2583Vs;
        this.b = abstractC2583Vs2;
        this.c = abstractC2583Vs3;
    }

    public final AbstractC2583Vs a() {
        return this.c;
    }

    public final AbstractC2583Vs b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ER0)) {
            return false;
        }
        ER0 er0 = (ER0) obj;
        return G10.c(this.a, er0.a) && G10.c(this.b, er0.b) && G10.c(this.c, er0.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }

    public /* synthetic */ ER0(AbstractC2583Vs abstractC2583Vs, AbstractC2583Vs abstractC2583Vs2, AbstractC2583Vs abstractC2583Vs3, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? AbstractC4805gK0.c(C6460mD.l(4)) : abstractC2583Vs, (i & 2) != 0 ? AbstractC4805gK0.c(C6460mD.l(4)) : abstractC2583Vs2, (i & 4) != 0 ? AbstractC4805gK0.c(C6460mD.l(0)) : abstractC2583Vs3);
    }
}
