package com.daaw;

/* JADX INFO: renamed from: com.daaw.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2583Vs implements InterfaceC5391iR0 {
    public final InterfaceC3281at a;
    public final InterfaceC3281at b;
    public final InterfaceC3281at c;
    public final InterfaceC3281at d;

    public AbstractC2583Vs(InterfaceC3281at interfaceC3281at, InterfaceC3281at interfaceC3281at2, InterfaceC3281at interfaceC3281at3, InterfaceC3281at interfaceC3281at4) {
        G10.g(interfaceC3281at, "topStart");
        G10.g(interfaceC3281at2, "topEnd");
        G10.g(interfaceC3281at3, "bottomEnd");
        G10.g(interfaceC3281at4, "bottomStart");
        this.a = interfaceC3281at;
        this.b = interfaceC3281at2;
        this.c = interfaceC3281at3;
        this.d = interfaceC3281at4;
    }

    @Override // com.daaw.InterfaceC5391iR0
    public final AbstractC8869ur0 a(long j, EnumC7560q90 enumC7560q90, InterfaceC4988gz interfaceC4988gz) {
        G10.g(enumC7560q90, "layoutDirection");
        G10.g(interfaceC4988gz, "density");
        float fA = this.a.a(j, interfaceC4988gz);
        float fA2 = this.b.a(j, interfaceC4988gz);
        float fA3 = this.c.a(j, interfaceC4988gz);
        float fA4 = this.d.a(j, interfaceC4988gz);
        float fH = C9879yT0.h(j);
        float f = fA + fA4;
        if (f > fH) {
            float f2 = fH / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fH) {
            float f4 = fH / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f) {
            return d(j, fA, fA2, fA3, fA4, enumC7560q90);
        }
        throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
    }

    public final AbstractC2583Vs b(InterfaceC3281at interfaceC3281at) {
        G10.g(interfaceC3281at, "all");
        return c(interfaceC3281at, interfaceC3281at, interfaceC3281at, interfaceC3281at);
    }

    public abstract AbstractC2583Vs c(InterfaceC3281at interfaceC3281at, InterfaceC3281at interfaceC3281at2, InterfaceC3281at interfaceC3281at3, InterfaceC3281at interfaceC3281at4);

    public abstract AbstractC8869ur0 d(long j, float f, float f2, float f3, float f4, EnumC7560q90 enumC7560q90);

    public final InterfaceC3281at e() {
        return this.c;
    }

    public final InterfaceC3281at f() {
        return this.d;
    }

    public final InterfaceC3281at g() {
        return this.b;
    }

    public final InterfaceC3281at h() {
        return this.a;
    }
}
