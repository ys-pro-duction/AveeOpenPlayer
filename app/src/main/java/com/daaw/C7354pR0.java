package com.daaw;

import android.graphics.Path;

/* JADX INFO: renamed from: com.daaw.pR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7354pR0 implements InterfaceC6921ns {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final H6 d;
    public final K6 e;
    public final boolean f;

    public C7354pR0(String str, boolean z, Path.FillType fillType, H6 h6, K6 k6, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = h6;
        this.e = k6;
        this.f = z2;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new XK(c4615ff0, abstractC9647xe, this);
    }

    public H6 b() {
        return this.d;
    }

    public Path.FillType c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public K6 e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
