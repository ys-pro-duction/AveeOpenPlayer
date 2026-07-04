package com.daaw;

/* JADX INFO: renamed from: com.daaw.n71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C6714n71 {
    public final Z71 a;
    public final I80 b;
    public final I80 c;

    public C6714n71(Z71 z71, I80 i80, I80 i802) {
        G10.g(z71, "typeParameter");
        G10.g(i80, "inProjection");
        G10.g(i802, "outProjection");
        this.a = z71;
        this.b = i80;
        this.c = i802;
    }

    public final I80 a() {
        return this.b;
    }

    public final I80 b() {
        return this.c;
    }

    public final Z71 c() {
        return this.a;
    }

    public final boolean d() {
        return J80.a.b(this.b, this.c);
    }
}
