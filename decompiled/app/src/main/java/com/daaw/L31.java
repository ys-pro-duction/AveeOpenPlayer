package com.daaw;

import android.util.Pair;
import com.daaw.R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class L31 {
    public static final L31 a = new a();

    public static class a extends L31 {
        @Override // com.daaw.L31
        public int b(Object obj) {
            return -1;
        }

        @Override // com.daaw.L31
        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.L31
        public int h() {
            return 0;
        }

        @Override // com.daaw.L31
        public c m(int i, c cVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.daaw.L31
        public int n() {
            return 0;
        }
    }

    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public R2 f;

        public int a(int i) {
            return this.f.c[i].a;
        }

        public long b(int i, int i2) {
            R2.a aVar = this.f.c[i];
            if (aVar.a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f.a;
        }

        public int d(long j) {
            return this.f.a(j);
        }

        public int e(long j) {
            return this.f.b(j);
        }

        public long f(int i) {
            return this.f.b[i];
        }

        public long g() {
            return this.f.d;
        }

        public long h() {
            return AbstractC6025ki.b(this.d);
        }

        public long i() {
            return this.d;
        }

        public int j(int i) {
            return this.f.c[i].a();
        }

        public int k(int i, int i2) {
            return this.f.c[i].b(i2);
        }

        public long l() {
            return AbstractC6025ki.b(this.e);
        }

        public boolean m(int i) {
            return !this.f.c[i].c();
        }

        public boolean n(int i, int i2) {
            R2.a aVar = this.f.c[i];
            return (aVar.a == -1 || aVar.c[i2] == 0) ? false : true;
        }

        public b o(Object obj, Object obj2, int i, long j, long j2) {
            return p(obj, obj2, i, j, j2, R2.f);
        }

        public b p(Object obj, Object obj2, int i, long j, long j2, R2 r2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.f = r2;
            return this;
        }
    }

    public static final class c {
        public Object a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;

        public long a() {
            return AbstractC6025ki.b(this.h);
        }

        public long b() {
            return this.h;
        }

        public long c() {
            return AbstractC6025ki.b(this.i);
        }

        public long d() {
            return this.j;
        }

        public c e(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, int i2, long j5) {
            this.a = obj;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.h = j3;
            this.i = j4;
            this.f = i;
            this.g = i2;
            this.j = j5;
            return this;
        }
    }

    public int a(boolean z) {
        return o() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (o()) {
            return -1;
        }
        return n() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (k(i3, cVar).g != i) {
            return i + 1;
        }
        int iE = e(i3, i2, z);
        if (iE == -1) {
            return -1;
        }
        return k(iE, cVar).f;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == c(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == c(z) ? a(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public abstract int h();

    public final Pair i(c cVar, b bVar, int i, long j) {
        return j(cVar, bVar, i, j, 0L);
    }

    public final Pair j(c cVar, b bVar, int i, long j, long j2) {
        AbstractC7115ob.c(i, 0, n());
        m(i, cVar, false, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.f;
        long jD = cVar.d() + j;
        long jI = f(i2, bVar).i();
        while (jI != -9223372036854775807L && jD >= jI && i2 < cVar.g) {
            jD -= jI;
            i2++;
            jI = f(i2, bVar).i();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(jD));
    }

    public final c k(int i, c cVar) {
        return l(i, cVar, false);
    }

    public final c l(int i, c cVar, boolean z) {
        return m(i, cVar, z, 0L);
    }

    public abstract c m(int i, c cVar, boolean z, long j);

    public abstract int n();

    public final boolean o() {
        return n() == 0;
    }

    public final boolean p(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
