package com.daaw;

import android.graphics.Canvas;

/* JADX INFO: renamed from: com.daaw.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3614c5 {
    public static final Canvas a = new Canvas();

    public static final InterfaceC6318lj a(InterfaceC5418iY interfaceC5418iY) {
        G10.g(interfaceC5418iY, "image");
        C3336b5 c3336b5 = new C3336b5();
        c3336b5.s(new Canvas(S5.b(interfaceC5418iY)));
        return c3336b5;
    }

    public static final Canvas c(InterfaceC6318lj interfaceC6318lj) {
        G10.g(interfaceC6318lj, "<this>");
        return ((C3336b5) interfaceC6318lj).r();
    }
}
