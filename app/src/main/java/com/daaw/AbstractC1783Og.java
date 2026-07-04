package com.daaw;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.Og, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1783Og {
    public static final InterfaceC1160Ig b(InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-1031410916);
        View view = (View) interfaceC5781jp.O(B5.i());
        interfaceC5781jp.e(1157296644);
        boolean zP = interfaceC5781jp.P(view);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = new C3057a5(view);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C3057a5 c3057a5 = (C3057a5) objF;
        interfaceC5781jp.L();
        return c3057a5;
    }

    public static final Rect c(C3103aF0 c3103aF0) {
        return new Rect((int) c3103aF0.f(), (int) c3103aF0.i(), (int) c3103aF0.g(), (int) c3103aF0.c());
    }
}
