package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897Fs0 {
    public final InterfaceC0793Es0 a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public float f;
    public float g;

    public C0897Fs0(InterfaceC0793Es0 interfaceC0793Es0, int i, int i2, int i3, int i4, float f, float f2) {
        G10.g(interfaceC0793Es0, "paragraph");
        this.a = interfaceC0793Es0;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final float a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.c - this.b;
    }

    public final InterfaceC0793Es0 e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0897Fs0)) {
            return false;
        }
        C0897Fs0 c0897Fs0 = (C0897Fs0) obj;
        return G10.c(this.a, c0897Fs0.a) && this.b == c0897Fs0.b && this.c == c0897Fs0.c && this.d == c0897Fs0.d && this.e == c0897Fs0.e && G10.c(Float.valueOf(this.f), Float.valueOf(c0897Fs0.f)) && G10.c(Float.valueOf(this.g), Float.valueOf(c0897Fs0.g));
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public final float h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final C3103aF0 i(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "<this>");
        return c3103aF0.n(AbstractC0460Bp0.a(0.0f, this.f));
    }

    public final int j(int i) {
        return i + this.b;
    }

    public final int k(int i) {
        return i + this.d;
    }

    public final float l(float f) {
        return f + this.f;
    }

    public final long m(long j) {
        return AbstractC0460Bp0.a(C9982yp0.l(j), C9982yp0.m(j) - this.f);
    }

    public final int n(int i) {
        return AbstractC8417tE0.l(i, this.b, this.c) - this.b;
    }

    public final int o(int i) {
        return i - this.d;
    }

    public final float p(float f) {
        return f - this.f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
