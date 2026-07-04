package com.daaw;

/* JADX INFO: renamed from: com.daaw.sE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8138sE0 {
    public static final void a(boolean z, Number number) {
        G10.g(number, "step");
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }

    public static InterfaceC7449pm b(float f, float f2) {
        return new C7170om(f, f2);
    }
}
