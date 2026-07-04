package com.daaw;

import android.graphics.PointF;
import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.Yw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2912Yw0 implements InterfaceC0409Bc1 {
    public static final C2912Yw0 a = new C2912Yw0();

    @Override // com.daaw.InterfaceC0409Bc1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(AbstractC6977o40 abstractC6977o40, float f) {
        AbstractC6977o40.b bVarW = abstractC6977o40.W();
        if (bVarW == AbstractC6977o40.b.BEGIN_ARRAY) {
            return AbstractC8936v40.e(abstractC6977o40, f);
        }
        if (bVarW == AbstractC6977o40.b.BEGIN_OBJECT) {
            return AbstractC8936v40.e(abstractC6977o40, f);
        }
        if (bVarW == AbstractC6977o40.b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC6977o40.F()) * f, ((float) abstractC6977o40.F()) * f);
            while (abstractC6977o40.o()) {
                abstractC6977o40.q0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarW);
    }
}
