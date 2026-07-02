package com.google.android.material.carousel;

import com.daaw.AbstractC6991o7;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final float a;
    public final List b;
    public final int c;
    public final int d;

    public static final class b {
        public final float a;
        public c c;
        public c d;
        public final List b = new ArrayList();
        public int e = -1;
        public int f = -1;
        public float g = 0.0f;

        public b(float f) {
            this.a = f;
        }

        public static float f(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        public b a(float f, float f2, float f3) {
            return b(f, f2, f3, false);
        }

        public b b(float f, float f2, float f3, boolean z) {
            if (f3 <= 0.0f) {
                return this;
            }
            c cVar = new c(Float.MIN_VALUE, f, f2, f3);
            if (z) {
                if (this.c == null) {
                    this.c = cVar;
                    this.e = this.b.size();
                }
                if (this.f != -1 && this.b.size() - this.f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.c.d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.d = cVar;
                this.f = this.b.size();
            } else {
                if (this.c == null && cVar.d < this.g) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.d != null && cVar.d > this.g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.g = cVar.d;
            this.b.add(cVar);
            return this;
        }

        public b c(float f, float f2, float f3, int i) {
            return d(f, f2, f3, i, false);
        }

        public b d(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > 0.0f) {
                for (int i2 = 0; i2 < i; i2++) {
                    b((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        public a e() {
            if (this.c == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.b.size(); i++) {
                c cVar = (c) this.b.get(i);
                arrayList.add(new c(f(this.c.b, this.a, this.e, i), cVar.b, cVar.c, cVar.d));
            }
            return new a(this.a, arrayList, this.e, this.f);
        }
    }

    public static final class c {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public c(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public static c a(c cVar, c cVar2, float f) {
            return new c(AbstractC6991o7.a(cVar.a, cVar2.a, f), AbstractC6991o7.a(cVar.b, cVar2.b, f), AbstractC6991o7.a(cVar.c, cVar2.c, f), AbstractC6991o7.a(cVar.d, cVar2.d, f));
        }
    }

    public static a i(a aVar, a aVar2, float f) {
        if (aVar.d() != aVar2.d()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List listE = aVar.e();
        List listE2 = aVar2.e();
        if (listE.size() != listE2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar.e().size(); i++) {
            arrayList.add(c.a((c) listE.get(i), (c) listE2.get(i), f));
        }
        return new a(aVar.d(), arrayList, AbstractC6991o7.c(aVar.b(), aVar2.b(), f), AbstractC6991o7.c(aVar.g(), aVar2.g(), f));
    }

    public static a j(a aVar) {
        b bVar = new b(aVar.d());
        float f = aVar.c().b - (aVar.c().d / 2.0f);
        int size = aVar.e().size() - 1;
        while (size >= 0) {
            c cVar = (c) aVar.e().get(size);
            bVar.b((cVar.d / 2.0f) + f, cVar.c, cVar.d, size >= aVar.b() && size <= aVar.g());
            f += cVar.d;
            size--;
        }
        return bVar.e();
    }

    public c a() {
        return (c) this.b.get(this.c);
    }

    public int b() {
        return this.c;
    }

    public c c() {
        return (c) this.b.get(0);
    }

    public float d() {
        return this.a;
    }

    public List e() {
        return this.b;
    }

    public c f() {
        return (c) this.b.get(this.d);
    }

    public int g() {
        return this.d;
    }

    public c h() {
        return (c) this.b.get(r0.size() - 1);
    }

    public a(float f, List list, int i, int i2) {
        this.a = f;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = i;
        this.d = i2;
    }
}
