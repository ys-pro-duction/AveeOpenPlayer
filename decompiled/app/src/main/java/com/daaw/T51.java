package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class T51 {
    public static final b l = new b(G31.a);
    public final G31 a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public c g;
    public long h;
    public long i;
    public final InterfaceC4610fe0 j;
    public volatile long k;

    public static final class b {
        public final G31 a;

        public b(G31 g31) {
            this.a = g31;
        }

        public T51 a() {
            return new T51(this.a);
        }
    }

    public interface c {
    }

    public static b a() {
        return l;
    }

    public void b() {
        this.f++;
    }

    public void c() {
        this.b++;
        this.c = this.a.a();
    }

    public void d() {
        this.j.a(1L);
        this.k = this.a.a();
    }

    public void e(int i) {
        if (i == 0) {
            return;
        }
        this.h += (long) i;
        this.i = this.a.a();
    }

    public void f(boolean z) {
        if (z) {
            this.d++;
        } else {
            this.e++;
        }
    }

    public void g(c cVar) {
        this.g = (c) AbstractC7785qy0.n(cVar);
    }

    public T51(G31 g31) {
        this.j = AbstractC4889ge0.a();
        this.a = g31;
    }
}
