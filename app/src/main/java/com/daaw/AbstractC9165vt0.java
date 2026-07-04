package com.daaw;

/* JADX INFO: renamed from: com.daaw.vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9165vt0 {
    public final boolean a;
    public final boolean b;

    /* JADX INFO: renamed from: com.daaw.vt0$a */
    public static final class a extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            boolean z3 = false;
            super(z3, z3, 3, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(aVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(aVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(aVar.e)) && this.f == aVar.f && this.g == aVar.g && G10.c(Float.valueOf(this.h), Float.valueOf(aVar.h)) && G10.c(Float.valueOf(this.i), Float.valueOf(aVar.i));
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
            boolean z = this.f;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iFloatToIntBits + r1) * 31;
            boolean z2 = this.g;
            return ((((i + (z2 ? 1 : z2)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartX=" + this.h + ", arcStartY=" + this.i + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$b */
    public static final class b extends AbstractC9165vt0 {
        public static final b c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z = false;
            super(z, z, 3, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$c */
    public static final class c extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(cVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(cVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(cVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(cVar.f)) && G10.c(Float.valueOf(this.g), Float.valueOf(cVar.g)) && G10.c(Float.valueOf(this.h), Float.valueOf(cVar.h));
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ", x3=" + this.g + ", y3=" + this.h + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$d */
    public static final class d extends AbstractC9165vt0 {
        public final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && G10.c(Float.valueOf(this.c), Float.valueOf(((d) obj).c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.c + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$e */
    public static final class e extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(eVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(eVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "LineTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$f */
    public static final class f extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(fVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(fVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "MoveTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$g */
    public static final class g extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public g(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(gVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(gVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(gVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(gVar.f));
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$h */
    public static final class h extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public h(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(hVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(hVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(hVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(hVar.f));
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.c + ", y1=" + this.d + ", x2=" + this.e + ", y2=" + this.f + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$i */
    public static final class i extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        public i(float f, float f2) {
            super(false, true, true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(iVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(iVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.c + ", y=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$j */
    public static final class j extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final boolean f;
        public final boolean g;
        public final float h;
        public final float i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            boolean z3 = false;
            super(z3, z3, 3, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = z;
            this.g = z2;
            this.h = f4;
            this.i = f5;
        }

        public final float c() {
            return this.h;
        }

        public final float d() {
            return this.i;
        }

        public final float e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(jVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(jVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(jVar.e)) && this.f == jVar.f && this.g == jVar.g && G10.c(Float.valueOf(this.h), Float.valueOf(jVar.h)) && G10.c(Float.valueOf(this.i), Float.valueOf(jVar.i));
        }

        public final float f() {
            return this.e;
        }

        public final float g() {
            return this.d;
        }

        public final boolean h() {
            return this.f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public int hashCode() {
            int iFloatToIntBits = ((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31;
            boolean z = this.f;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iFloatToIntBits + r1) * 31;
            boolean z2 = this.g;
            return ((((i + (z2 ? 1 : z2)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i);
        }

        public final boolean i() {
            return this.g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.c + ", verticalEllipseRadius=" + this.d + ", theta=" + this.e + ", isMoreThanHalf=" + this.f + ", isPositiveArc=" + this.g + ", arcStartDx=" + this.h + ", arcStartDy=" + this.i + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$k */
    public static final class k extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public final float g;
        public final float h;

        public k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = f5;
            this.h = f6;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(kVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(kVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(kVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(kVar.f)) && G10.c(Float.valueOf(this.g), Float.valueOf(kVar.g)) && G10.c(Float.valueOf(this.h), Float.valueOf(kVar.h));
        }

        public final float f() {
            return this.d;
        }

        public final float g() {
            return this.f;
        }

        public final float h() {
            return this.h;
        }

        public int hashCode() {
            return (((((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ", dx3=" + this.g + ", dy3=" + this.h + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$l */
    public static final class l extends AbstractC9165vt0 {
        public final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && G10.c(Float.valueOf(this.c), Float.valueOf(((l) obj).c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.c + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$m */
    public static final class m extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(mVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(mVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$n */
    public static final class n extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f, float f2) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(nVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(nVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$o */
    public static final class o extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public o(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(oVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(oVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(oVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(oVar.f));
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$p */
    public static final class p extends AbstractC9165vt0 {
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public p(float f, float f2, float f3, float f4) {
            super(true, false, 2, null);
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.e;
        }

        public final float e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(pVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(pVar.d)) && G10.c(Float.valueOf(this.e), Float.valueOf(pVar.e)) && G10.c(Float.valueOf(this.f), Float.valueOf(pVar.f));
        }

        public final float f() {
            return this.f;
        }

        public int hashCode() {
            return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.c + ", dy1=" + this.d + ", dx2=" + this.e + ", dy2=" + this.f + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$q */
    public static final class q extends AbstractC9165vt0 {
        public final float c;
        public final float d;

        public q(float f, float f2) {
            super(false, true, true ? 1 : 0, null);
            this.c = f;
            this.d = f2;
        }

        public final float c() {
            return this.c;
        }

        public final float d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return G10.c(Float.valueOf(this.c), Float.valueOf(qVar.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(qVar.d));
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$r */
    public static final class r extends AbstractC9165vt0 {
        public final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && G10.c(Float.valueOf(this.c), Float.valueOf(((r) obj).c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.c + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.vt0$s */
    public static final class s extends AbstractC9165vt0 {
        public final float c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f) {
            boolean z = false;
            super(z, z, 3, null);
            this.c = f;
        }

        public final float c() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && G10.c(Float.valueOf(this.c), Float.valueOf(((s) obj).c));
        }

        public int hashCode() {
            return Float.floatToIntBits(this.c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.c + ')';
        }
    }

    public /* synthetic */ AbstractC9165vt0(boolean z, boolean z2, AbstractC2911Yw abstractC2911Yw) {
        this(z, z2);
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public AbstractC9165vt0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ AbstractC9165vt0(boolean z, boolean z2, int i2, AbstractC2911Yw abstractC2911Yw) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, null);
    }
}
