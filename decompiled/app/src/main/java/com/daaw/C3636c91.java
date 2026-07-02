package com.daaw;

/* JADX INFO: renamed from: com.daaw.c91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3636c91 {
    public final AbstractC7898rO a;
    public final SO b;
    public final int c;
    public final int d;
    public final Object e;

    public /* synthetic */ C3636c91(AbstractC7898rO abstractC7898rO, SO so, int i, int i2, Object obj, AbstractC2911Yw abstractC2911Yw) {
        this(abstractC7898rO, so, i, i2, obj);
    }

    public static /* synthetic */ C3636c91 b(C3636c91 c3636c91, AbstractC7898rO abstractC7898rO, SO so, int i, int i2, Object obj, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            abstractC7898rO = c3636c91.a;
        }
        if ((i3 & 2) != 0) {
            so = c3636c91.b;
        }
        if ((i3 & 4) != 0) {
            i = c3636c91.c;
        }
        if ((i3 & 8) != 0) {
            i2 = c3636c91.d;
        }
        if ((i3 & 16) != 0) {
            obj = c3636c91.e;
        }
        Object obj3 = obj;
        int i4 = i;
        return c3636c91.a(abstractC7898rO, so, i4, i2, obj3);
    }

    public final C3636c91 a(AbstractC7898rO abstractC7898rO, SO so, int i, int i2, Object obj) {
        G10.g(so, "fontWeight");
        return new C3636c91(abstractC7898rO, so, i, i2, obj, null);
    }

    public final AbstractC7898rO c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3636c91)) {
            return false;
        }
        C3636c91 c3636c91 = (C3636c91) obj;
        return G10.c(this.a, c3636c91.a) && G10.c(this.b, c3636c91.b) && PO.f(this.c, c3636c91.c) && QO.e(this.d, c3636c91.d) && G10.c(this.e, c3636c91.e);
    }

    public final SO f() {
        return this.b;
    }

    public int hashCode() {
        AbstractC7898rO abstractC7898rO = this.a;
        int iHashCode = (((((((abstractC7898rO == null ? 0 : abstractC7898rO.hashCode()) * 31) + this.b.hashCode()) * 31) + PO.g(this.c)) * 31) + QO.f(this.d)) * 31;
        Object obj = this.e;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) PO.h(this.c)) + ", fontSynthesis=" + ((Object) QO.i(this.d)) + ", resourceLoaderCacheKey=" + this.e + ')';
    }

    public C3636c91(AbstractC7898rO abstractC7898rO, SO so, int i, int i2, Object obj) {
        this.a = abstractC7898rO;
        this.b = so;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }
}
