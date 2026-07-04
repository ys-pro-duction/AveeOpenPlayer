package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: renamed from: com.daaw.Fi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0856Fi {
    public final C0752Ei a;
    public final C0752Ei b;
    public final C0752Ei c;
    public final C0752Ei d;
    public final C0752Ei e;
    public final C0752Ei f;
    public final C0752Ei g;
    public final Paint h;

    public C0856Fi(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC2744Xg0.d(context, JC0.t, com.google.android.material.datepicker.a.class.getCanonicalName()), WD0.y2);
        this.a = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.B2, 0));
        this.g = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.z2, 0));
        this.b = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.A2, 0));
        this.c = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.C2, 0));
        ColorStateList colorStateListA = AbstractC4336eh0.a(context, typedArrayObtainStyledAttributes, WD0.D2);
        this.d = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.F2, 0));
        this.e = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.E2, 0));
        this.f = C0752Ei.a(context, typedArrayObtainStyledAttributes.getResourceId(WD0.G2, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
