package com.daaw;

/* JADX INFO: renamed from: com.daaw.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4709fz {
    public static int a(InterfaceC4988gz interfaceC4988gz, float f) {
        float fO = interfaceC4988gz.O(f);
        if (Float.isInfinite(fO)) {
            return Integer.MAX_VALUE;
        }
        return AbstractC8261sh0.b(fO);
    }

    public static float b(InterfaceC4988gz interfaceC4988gz, int i) {
        return C6460mD.l(i / interfaceC4988gz.getDensity());
    }

    public static float c(InterfaceC4988gz interfaceC4988gz, long j) {
        if (U21.g(S21.g(j), U21.b.b())) {
            return S21.h(j) * interfaceC4988gz.J() * interfaceC4988gz.getDensity();
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public static float d(InterfaceC4988gz interfaceC4988gz, float f) {
        return f * interfaceC4988gz.getDensity();
    }

    public static long e(InterfaceC4988gz interfaceC4988gz, long j) {
        return j != AbstractC7576qD.a.a() ? BT0.a(interfaceC4988gz.O(AbstractC7576qD.f(j)), interfaceC4988gz.O(AbstractC7576qD.e(j))) : C9879yT0.b.a();
    }
}
