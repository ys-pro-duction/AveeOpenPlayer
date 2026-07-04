package com.daaw;

import android.graphics.Color;
import com.daaw.AbstractC6977o40;

/* JADX INFO: renamed from: com.daaw.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4365en implements InterfaceC0409Bc1 {
    public static final C4365en a = new C4365en();

    @Override // com.daaw.InterfaceC0409Bc1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(AbstractC6977o40 abstractC6977o40, float f) {
        boolean z = abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY;
        if (z) {
            abstractC6977o40.c();
        }
        double dF = abstractC6977o40.F();
        double dF2 = abstractC6977o40.F();
        double dF3 = abstractC6977o40.F();
        double dF4 = abstractC6977o40.W() == AbstractC6977o40.b.NUMBER ? abstractC6977o40.F() : 1.0d;
        if (z) {
            abstractC6977o40.j();
        }
        if (dF <= 1.0d && dF2 <= 1.0d && dF3 <= 1.0d) {
            dF *= 255.0d;
            dF2 *= 255.0d;
            dF3 *= 255.0d;
            if (dF4 <= 1.0d) {
                dF4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dF4, (int) dF, (int) dF2, (int) dF3));
    }
}
