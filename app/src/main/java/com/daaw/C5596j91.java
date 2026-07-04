package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.j91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5596j91 {
    public final O21 a;
    public final O21 b;
    public final O21 c;
    public final O21 d;
    public final O21 e;
    public final O21 f;
    public final O21 g;
    public final O21 h;
    public final O21 i;
    public final O21 j;
    public final O21 k;
    public final O21 l;
    public final O21 m;

    public C5596j91(O21 o21, O21 o212, O21 o213, O21 o214, O21 o215, O21 o216, O21 o217, O21 o218, O21 o219, O21 o2110, O21 o2111, O21 o2112, O21 o2113) {
        G10.g(o21, "h1");
        G10.g(o212, "h2");
        G10.g(o213, "h3");
        G10.g(o214, "h4");
        G10.g(o215, "h5");
        G10.g(o216, "h6");
        G10.g(o217, "subtitle1");
        G10.g(o218, "subtitle2");
        G10.g(o219, "body1");
        G10.g(o2110, "body2");
        G10.g(o2111, "button");
        G10.g(o2112, "caption");
        G10.g(o2113, "overline");
        this.a = o21;
        this.b = o212;
        this.c = o213;
        this.d = o214;
        this.e = o215;
        this.f = o216;
        this.g = o217;
        this.h = o218;
        this.i = o219;
        this.j = o2110;
        this.k = o2111;
        this.l = o2112;
        this.m = o2113;
    }

    public final O21 a() {
        return this.i;
    }

    public final O21 b() {
        return this.j;
    }

    public final O21 c() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5596j91)) {
            return false;
        }
        C5596j91 c5596j91 = (C5596j91) obj;
        return G10.c(this.a, c5596j91.a) && G10.c(this.b, c5596j91.b) && G10.c(this.c, c5596j91.c) && G10.c(this.d, c5596j91.d) && G10.c(this.e, c5596j91.e) && G10.c(this.f, c5596j91.f) && G10.c(this.g, c5596j91.g) && G10.c(this.h, c5596j91.h) && G10.c(this.i, c5596j91.i) && G10.c(this.j, c5596j91.j) && G10.c(this.k, c5596j91.k) && G10.c(this.l, c5596j91.l) && G10.c(this.m, c5596j91.m);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }

    public /* synthetic */ C5596j91(AbstractC7898rO abstractC7898rO, O21 o21, O21 o212, O21 o213, O21 o214, O21 o215, O21 o216, O21 o217, O21 o218, O21 o219, O21 o2110, O21 o2111, O21 o2112, O21 o2113, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? AbstractC7898rO.C.a() : abstractC7898rO, (i & 2) != 0 ? new O21(0L, T21.d(96), SO.C.b(), null, null, null, null, T21.b(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o21, (i & 4) != 0 ? new O21(0L, T21.d(60), SO.C.b(), null, null, null, null, T21.b(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o212, (i & 8) != 0 ? new O21(0L, T21.d(48), SO.C.d(), null, null, null, null, T21.d(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o213, (i & 16) != 0 ? new O21(0L, T21.d(34), SO.C.d(), null, null, null, null, T21.b(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o214, (i & 32) != 0 ? new O21(0L, T21.d(24), SO.C.d(), null, null, null, null, T21.d(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o215, (i & 64) != 0 ? new O21(0L, T21.d(20), SO.C.c(), null, null, null, null, T21.b(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o216, (i & 128) != 0 ? new O21(0L, T21.d(16), SO.C.d(), null, null, null, null, T21.b(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o217, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new O21(0L, T21.d(14), SO.C.c(), null, null, null, null, T21.b(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o218, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new O21(0L, T21.d(16), SO.C.d(), null, null, null, null, T21.b(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o219, (i & 1024) != 0 ? new O21(0L, T21.d(14), SO.C.d(), null, null, null, null, T21.b(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o2110, (i & 2048) != 0 ? new O21(0L, T21.d(14), SO.C.c(), null, null, null, null, T21.b(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o2111, (i & 4096) != 0 ? new O21(0L, T21.d(12), SO.C.d(), null, null, null, null, T21.b(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o2112, (i & 8192) != 0 ? new O21(0L, T21.d(10), SO.C.d(), null, null, null, null, T21.b(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : o2113);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5596j91(AbstractC7898rO abstractC7898rO, O21 o21, O21 o212, O21 o213, O21 o214, O21 o215, O21 o216, O21 o217, O21 o218, O21 o219, O21 o2110, O21 o2111, O21 o2112, O21 o2113) {
        this(AbstractC5878k91.c(o21, abstractC7898rO), AbstractC5878k91.c(o212, abstractC7898rO), AbstractC5878k91.c(o213, abstractC7898rO), AbstractC5878k91.c(o214, abstractC7898rO), AbstractC5878k91.c(o215, abstractC7898rO), AbstractC5878k91.c(o216, abstractC7898rO), AbstractC5878k91.c(o217, abstractC7898rO), AbstractC5878k91.c(o218, abstractC7898rO), AbstractC5878k91.c(o219, abstractC7898rO), AbstractC5878k91.c(o2110, abstractC7898rO), AbstractC5878k91.c(o2111, abstractC7898rO), AbstractC5878k91.c(o2112, abstractC7898rO), AbstractC5878k91.c(o2113, abstractC7898rO));
        G10.g(abstractC7898rO, "defaultFontFamily");
        G10.g(o21, "h1");
        G10.g(o212, "h2");
        G10.g(o213, "h3");
        G10.g(o214, "h4");
        G10.g(o215, "h5");
        G10.g(o216, "h6");
        G10.g(o217, "subtitle1");
        G10.g(o218, "subtitle2");
        G10.g(o219, "body1");
        G10.g(o2110, "body2");
        G10.g(o2111, "button");
        G10.g(o2112, "caption");
        G10.g(o2113, "overline");
    }
}
