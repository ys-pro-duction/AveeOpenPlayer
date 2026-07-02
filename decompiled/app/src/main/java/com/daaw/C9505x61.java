package com.daaw;

import android.text.Layout;

/* JADX INFO: renamed from: com.daaw.x61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9505x61 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public C9505x61 m;
    public Layout.Alignment n;

    public C9505x61 a(C9505x61 c9505x61) {
        return l(c9505x61, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public int h() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.n;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.c;
    }

    public final C9505x61 l(C9505x61 c9505x61, boolean z) {
        if (c9505x61 != null) {
            if (!this.c && c9505x61.c) {
                q(c9505x61.b);
            }
            if (this.h == -1) {
                this.h = c9505x61.h;
            }
            if (this.i == -1) {
                this.i = c9505x61.i;
            }
            if (this.a == null) {
                this.a = c9505x61.a;
            }
            if (this.f == -1) {
                this.f = c9505x61.f;
            }
            if (this.g == -1) {
                this.g = c9505x61.g;
            }
            if (this.n == null) {
                this.n = c9505x61.n;
            }
            if (this.j == -1) {
                this.j = c9505x61.j;
                this.k = c9505x61.k;
            }
            if (z && !this.e && c9505x61.e) {
                o(c9505x61.d);
            }
        }
        return this;
    }

    public boolean m() {
        return this.f == 1;
    }

    public boolean n() {
        return this.g == 1;
    }

    public C9505x61 o(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public C9505x61 p(boolean z) {
        AbstractC7115ob.f(this.m == null);
        this.h = z ? 1 : 0;
        return this;
    }

    public C9505x61 q(int i) {
        AbstractC7115ob.f(this.m == null);
        this.b = i;
        this.c = true;
        return this;
    }

    public C9505x61 r(String str) {
        AbstractC7115ob.f(this.m == null);
        this.a = str;
        return this;
    }

    public C9505x61 s(float f) {
        this.k = f;
        return this;
    }

    public C9505x61 t(int i) {
        this.j = i;
        return this;
    }

    public C9505x61 u(String str) {
        this.l = str;
        return this;
    }

    public C9505x61 v(boolean z) {
        AbstractC7115ob.f(this.m == null);
        this.i = z ? 1 : 0;
        return this;
    }

    public C9505x61 w(boolean z) {
        AbstractC7115ob.f(this.m == null);
        this.f = z ? 1 : 0;
        return this;
    }

    public C9505x61 x(Layout.Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public C9505x61 y(boolean z) {
        AbstractC7115ob.f(this.m == null);
        this.g = z ? 1 : 0;
        return this;
    }
}
