package com.daaw;

/* JADX INFO: renamed from: com.daaw.xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9731xv extends AbstractC3838ct {
    public float a = -1.0f;

    @Override // com.daaw.AbstractC3838ct
    public void a(C9313wR0 c9313wR0, float f, float f2, float f3) {
        c9313wR0.o(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = f3;
        double d2 = f2;
        c9313wR0.m((float) (Math.sin(Math.toRadians(f)) * d * d2), (float) (Math.sin(Math.toRadians(90.0f - f)) * d * d2));
    }
}
