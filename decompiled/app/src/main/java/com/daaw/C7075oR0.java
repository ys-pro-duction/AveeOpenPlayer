package com.daaw;

import android.graphics.PointF;
import com.daaw.AbstractC6977o40;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.oR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7075oR0 implements InterfaceC0409Bc1 {
    public static final C7075oR0 a = new C7075oR0();
    public static final AbstractC6977o40.a b = AbstractC6977o40.a.a("c", "v", "i", "o");

    @Override // com.daaw.InterfaceC0409Bc1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6796nR0 a(AbstractC6977o40 abstractC6977o40, float f) {
        if (abstractC6977o40.W() == AbstractC6977o40.b.BEGIN_ARRAY) {
            abstractC6977o40.c();
        }
        abstractC6977o40.d();
        List listF = null;
        List listF2 = null;
        List listF3 = null;
        boolean zS = false;
        while (abstractC6977o40.o()) {
            int iO0 = abstractC6977o40.o0(b);
            if (iO0 == 0) {
                zS = abstractC6977o40.s();
            } else if (iO0 == 1) {
                listF = AbstractC8936v40.f(abstractC6977o40, f);
            } else if (iO0 == 2) {
                listF2 = AbstractC8936v40.f(abstractC6977o40, f);
            } else if (iO0 != 3) {
                abstractC6977o40.p0();
                abstractC6977o40.q0();
            } else {
                listF3 = AbstractC8936v40.f(abstractC6977o40, f);
            }
        }
        abstractC6977o40.l();
        if (abstractC6977o40.W() == AbstractC6977o40.b.END_ARRAY) {
            abstractC6977o40.j();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new C6796nR0(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = listF.size();
        PointF pointF = (PointF) listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listF.get(i);
            int i2 = i - 1;
            arrayList.add(new C1527Lu(AbstractC9678xk0.a((PointF) listF.get(i2), (PointF) listF3.get(i2)), AbstractC9678xk0.a(pointF2, (PointF) listF2.get(i)), pointF2));
        }
        if (zS) {
            PointF pointF3 = (PointF) listF.get(0);
            int i3 = size - 1;
            arrayList.add(new C1527Lu(AbstractC9678xk0.a((PointF) listF.get(i3), (PointF) listF3.get(i3)), AbstractC9678xk0.a(pointF3, (PointF) listF2.get(0)), pointF3));
        }
        return new C6796nR0(pointF, zS, arrayList);
    }
}
