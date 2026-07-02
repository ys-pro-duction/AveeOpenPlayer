package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class A80 implements RU0 {
    public final C9349wa0 b;

    public A80(C9349wa0 c9349wa0) {
        G10.g(c9349wa0, "packageFragment");
        this.b = c9349wa0;
    }

    @Override // com.daaw.RU0
    public SU0 a() {
        SU0 su0 = SU0.a;
        G10.f(su0, "NO_SOURCE_FILE");
        return su0;
    }

    public String toString() {
        return this.b + ": " + this.b.O0().keySet();
    }
}
