package com.daaw;

/* JADX INFO: renamed from: com.daaw.d21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3880d21 {
    public static final D7 a(C3601c21 c3601c21) {
        G10.g(c3601c21, "<this>");
        return c3601c21.a().j(c3601c21.b());
    }

    public static final D7 b(C3601c21 c3601c21, int i) {
        G10.g(c3601c21, "<this>");
        return c3601c21.a().subSequence(G21.h(c3601c21.b()), Math.min(G21.h(c3601c21.b()) + i, c3601c21.c().length()));
    }

    public static final D7 c(C3601c21 c3601c21, int i) {
        G10.g(c3601c21, "<this>");
        return c3601c21.a().subSequence(Math.max(0, G21.i(c3601c21.b()) - i), G21.i(c3601c21.b()));
    }
}
