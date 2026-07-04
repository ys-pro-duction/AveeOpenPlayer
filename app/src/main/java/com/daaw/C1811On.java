package com.daaw;

/* JADX INFO: renamed from: com.daaw.On, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1811On {
    public final Object a;
    public final AbstractC2751Xi b;
    public final NQ c;
    public final Object d;
    public final Throwable e;

    public C1811On(Object obj, AbstractC2751Xi abstractC2751Xi, NQ nq, Object obj2, Throwable th) {
        this.a = obj;
        this.b = abstractC2751Xi;
        this.c = nq;
        this.d = obj2;
        this.e = th;
    }

    public static /* synthetic */ C1811On b(C1811On c1811On, Object obj, AbstractC2751Xi abstractC2751Xi, NQ nq, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c1811On.a;
        }
        if ((i & 2) != 0) {
            abstractC2751Xi = c1811On.b;
        }
        if ((i & 4) != 0) {
            nq = c1811On.c;
        }
        if ((i & 8) != 0) {
            obj2 = c1811On.d;
        }
        if ((i & 16) != 0) {
            th = c1811On.e;
        }
        Throwable th2 = th;
        NQ nq2 = nq;
        return c1811On.a(obj, abstractC2751Xi, nq2, obj2, th2);
    }

    public final C1811On a(Object obj, AbstractC2751Xi abstractC2751Xi, NQ nq, Object obj2, Throwable th) {
        return new C1811On(obj, abstractC2751Xi, nq, obj2, th);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(C4067dj c4067dj, Throwable th) {
        AbstractC2751Xi abstractC2751Xi = this.b;
        if (abstractC2751Xi != null) {
            c4067dj.j(abstractC2751Xi, th);
        }
        NQ nq = this.c;
        if (nq != null) {
            c4067dj.k(nq, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1811On)) {
            return false;
        }
        C1811On c1811On = (C1811On) obj;
        return G10.c(this.a, c1811On.a) && G10.c(this.b, c1811On.b) && G10.c(this.c, c1811On.c) && G10.c(this.d, c1811On.d) && G10.c(this.e, c1811On.e);
    }

    public int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2751Xi abstractC2751Xi = this.b;
        int iHashCode2 = (iHashCode + (abstractC2751Xi == null ? 0 : abstractC2751Xi.hashCode())) * 31;
        NQ nq = this.c;
        int iHashCode3 = (iHashCode2 + (nq == null ? 0 : nq.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C1811On(Object obj, AbstractC2751Xi abstractC2751Xi, NQ nq, Object obj2, Throwable th, int i, AbstractC2911Yw abstractC2911Yw) {
        this(obj, (i & 2) != 0 ? null : abstractC2751Xi, (i & 4) != 0 ? null : nq, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
