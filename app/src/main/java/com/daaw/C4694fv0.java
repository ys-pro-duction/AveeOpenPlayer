package com.daaw;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.fv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4694fv0 extends AJ0 {
    public /* synthetic */ C4694fv0(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, AbstractC2911Yw abstractC2911Yw) {
        this(z, f, interfaceC6258lW0);
    }

    @Override // com.daaw.AJ0
    public JJ0 b(Z00 z00, boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, InterfaceC5781jp interfaceC5781jp, int i) {
        View ej0;
        G10.g(z00, "interactionSource");
        G10.g(interfaceC6258lW0, "color");
        G10.g(interfaceC6258lW02, "rippleAlpha");
        interfaceC5781jp.e(331259447);
        ViewGroup viewGroupC = c(interfaceC5781jp, (i >> 15) & 14);
        interfaceC5781jp.e(1643267286);
        if (viewGroupC.isInEditMode()) {
            interfaceC5781jp.e(-3686552);
            boolean zP = interfaceC5781jp.P(z00) | interfaceC5781jp.P(this);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                C0347An c0347An = new C0347An(z, f, interfaceC6258lW0, interfaceC6258lW02, null);
                interfaceC5781jp.H(c0347An);
                objF = c0347An;
            }
            interfaceC5781jp.L();
            C0347An c0347An2 = (C0347An) objF;
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            return c0347An2;
        }
        interfaceC5781jp.L();
        int childCount = viewGroupC.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                ej0 = null;
                break;
            }
            ej0 = viewGroupC.getChildAt(i2);
            if (ej0 instanceof EJ0) {
                break;
            }
            i2++;
        }
        if (ej0 == null) {
            Context context = viewGroupC.getContext();
            G10.f(context, "view.context");
            ej0 = new EJ0(context);
            viewGroupC.addView(ej0);
        }
        interfaceC5781jp.e(-3686095);
        boolean zP2 = interfaceC5781jp.P(z00) | interfaceC5781jp.P(this) | interfaceC5781jp.P(ej0);
        Object objF2 = interfaceC5781jp.f();
        if (zP2 || objF2 == InterfaceC5781jp.a.a()) {
            C7822r6 c7822r6 = new C7822r6(z, f, interfaceC6258lW0, interfaceC6258lW02, (EJ0) ej0, null);
            interfaceC5781jp.H(c7822r6);
            objF2 = c7822r6;
        }
        interfaceC5781jp.L();
        C7822r6 c7822r62 = (C7822r6) objF2;
        interfaceC5781jp.L();
        return c7822r62;
    }

    public final ViewGroup c(InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(-1737891121);
        Object objO = interfaceC5781jp.O(B5.i());
        while (!(objO instanceof ViewGroup)) {
            ViewParent parent = ((View) objO).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objO + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            G10.f(parent, "parent");
            objO = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objO;
        interfaceC5781jp.L();
        return viewGroup;
    }

    public C4694fv0(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0) {
        super(z, f, interfaceC6258lW0, null);
    }
}
