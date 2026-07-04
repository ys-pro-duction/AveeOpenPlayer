package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.uY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8775uY {
    public static final b j = new b(null);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final C2937Zc1 f;
    public final long g;
    public final int h;
    public final boolean i;

    /* JADX INFO: renamed from: com.daaw.uY$a */
    public static final class a {
        public final String a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList i;
        public C0238a j;
        public boolean k;

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, AbstractC2911Yw abstractC2911Yw) {
            this(str, f, f2, f3, f4, j, i, z);
        }

        public static /* synthetic */ a b(a aVar, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            if ((i & 8) != 0) {
                f3 = 0.0f;
            }
            if ((i & 16) != 0) {
                f4 = 1.0f;
            }
            if ((i & 32) != 0) {
                f5 = 1.0f;
            }
            if ((i & 64) != 0) {
                f6 = 0.0f;
            }
            if ((i & 128) != 0) {
                f7 = 0.0f;
            }
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                list = AbstractC3203ad1.e();
            }
            float f8 = f7;
            List list2 = list;
            float f9 = f5;
            float f10 = f6;
            float f11 = f4;
            float f12 = f2;
            return aVar.a(str, f, f12, f3, f11, f9, f10, f8, list2);
        }

        public final a a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            G10.g(str, "name");
            G10.g(list, "clipPathData");
            g();
            OV0.f(this.i, new C0238a(str, f, f2, f3, f4, f5, f6, f7, list, null, AdRequest.MAX_CONTENT_URL_LENGTH, null));
            return this;
        }

        public final a c(List list, int i, String str, AbstractC2117Rg abstractC2117Rg, float f, AbstractC2117Rg abstractC2117Rg2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            G10.g(list, "pathData");
            G10.g(str, "name");
            g();
            h().a().add(new C4317ed1(str, list, i, abstractC2117Rg, f, abstractC2117Rg2, f2, f3, i2, i3, f4, f5, f6, f7, null));
            return this;
        }

        public final C2937Zc1 d(C0238a c0238a) {
            return new C2937Zc1(c0238a.c(), c0238a.f(), c0238a.d(), c0238a.e(), c0238a.g(), c0238a.h(), c0238a.i(), c0238a.j(), c0238a.b(), c0238a.a());
        }

        public final C8775uY e() {
            g();
            while (OV0.c(this.i) > 1) {
                f();
            }
            C8775uY c8775uY = new C8775uY(this.a, this.b, this.c, this.d, this.e, d(this.j), this.f, this.g, this.h, null);
            this.k = true;
            return c8775uY;
        }

        public final a f() {
            g();
            h().a().add(d((C0238a) OV0.e(this.i)));
            return this;
        }

        public final void g() {
            if (this.k) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
        }

        public final C0238a h() {
            return (C0238a) OV0.d(this.i);
        }

        public a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.a = str;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
            this.g = i;
            this.h = z;
            ArrayList arrayListB = OV0.b(null, 1, null);
            this.i = arrayListB;
            C0238a c0238a = new C0238a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.j = c0238a;
            OV0.f(arrayListB, c0238a);
        }

        /* JADX INFO: renamed from: com.daaw.uY$a$a, reason: collision with other inner class name */
        public static final class C0238a {
            public String a;
            public float b;
            public float c;
            public float d;
            public float e;
            public float f;
            public float g;
            public float h;
            public List i;
            public List j;

            public C0238a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
                G10.g(str, "name");
                G10.g(list, "clipPathData");
                G10.g(list2, "children");
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = list2;
            }

            public final List a() {
                return this.j;
            }

            public final List b() {
                return this.i;
            }

            public final String c() {
                return this.a;
            }

            public final float d() {
                return this.c;
            }

            public final float e() {
                return this.d;
            }

            public final float f() {
                return this.b;
            }

            public final float g() {
                return this.e;
            }

            public final float h() {
                return this.f;
            }

            public final float i() {
                return this.g;
            }

            public final float j() {
                return this.h;
            }

            public /* synthetic */ C0238a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2, int i, AbstractC2911Yw abstractC2911Yw) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) != 0 ? 1.0f : f5, (i & 64) != 0 ? 0.0f : f6, (i & 128) != 0 ? 0.0f : f7, (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC3203ad1.e() : list, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2, AbstractC2911Yw abstractC2911Yw) {
            this((i2 & 1) != 0 ? "" : str, f, f2, f3, f4, (i2 & 32) != 0 ? C2559Vm.b.g() : j, (i2 & 64) != 0 ? C2323Tf.b.z() : i, (i2 & 128) != 0 ? false : z, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.uY$b */
    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ C8775uY(String str, float f, float f2, float f3, float f4, C2937Zc1 c2937Zc1, long j2, int i, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(str, f, f2, f3, f4, c2937Zc1, j2, i, z);
    }

    public final boolean a() {
        return this.i;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final C2937Zc1 e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8775uY)) {
            return false;
        }
        C8775uY c8775uY = (C8775uY) obj;
        return G10.c(this.a, c8775uY.a) && C6460mD.n(this.b, c8775uY.b) && C6460mD.n(this.c, c8775uY.c) && this.d == c8775uY.d && this.e == c8775uY.e && G10.c(this.f, c8775uY.f) && C2559Vm.o(this.g, c8775uY.g) && C2323Tf.G(this.h, c8775uY.h) && this.i == c8775uY.i;
    }

    public final int f() {
        return this.h;
    }

    public final long g() {
        return this.g;
    }

    public final float h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + C6460mD.o(this.b)) * 31) + C6460mD.o(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f.hashCode()) * 31) + C2559Vm.u(this.g)) * 31) + C2323Tf.H(this.h)) * 31) + AbstractC8813ug.a(this.i);
    }

    public final float i() {
        return this.d;
    }

    public C8775uY(String str, float f, float f2, float f3, float f4, C2937Zc1 c2937Zc1, long j2, int i, boolean z) {
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = c2937Zc1;
        this.g = j2;
        this.h = i;
        this.i = z;
    }
}
