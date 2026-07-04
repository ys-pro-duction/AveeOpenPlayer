package com.daaw;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public class LT implements InterfaceC6921ns {
    public final RT a;
    public final Path.FillType b;
    public final J6 c;
    public final K6 d;
    public final O6 e;
    public final O6 f;
    public final String g;
    public final I6 h;
    public final I6 i;
    public final boolean j;

    public LT(String str, RT rt, Path.FillType fillType, J6 j6, K6 k6, O6 o6, O6 o62, I6 i6, I6 i62, boolean z) {
        this.a = rt;
        this.b = fillType;
        this.c = j6;
        this.d = k6;
        this.e = o6;
        this.f = o62;
        this.g = str;
        this.h = i6;
        this.i = i62;
        this.j = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new MT(c4615ff0, abstractC9647xe, this);
    }

    public O6 b() {
        return this.f;
    }

    public Path.FillType c() {
        return this.b;
    }

    public J6 d() {
        return this.c;
    }

    public RT e() {
        return this.a;
    }

    public String f() {
        return this.g;
    }

    public K6 g() {
        return this.d;
    }

    public O6 h() {
        return this.e;
    }

    public boolean i() {
        return this.j;
    }
}
