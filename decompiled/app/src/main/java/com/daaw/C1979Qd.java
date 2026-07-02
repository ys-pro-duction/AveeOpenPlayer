package com.daaw;

import com.daaw.AbstractC2248Sm0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1979Qd {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public C1979Qd(List list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    public static byte[] a(C2584Vs0 c2584Vs0) {
        int iD = c2584Vs0.D();
        int iC = c2584Vs0.c();
        c2584Vs0.K(iD);
        return AbstractC9129vm.c(c2584Vs0.a, iC, iD);
    }

    public static C1979Qd b(C2584Vs0 c2584Vs0) throws C3000Zs0 {
        int i;
        int i2;
        float f;
        try {
            c2584Vs0.K(4);
            int iX = (c2584Vs0.x() & 3) + 1;
            if (iX == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iX2 = c2584Vs0.x() & 31;
            for (int i3 = 0; i3 < iX2; i3++) {
                arrayList.add(a(c2584Vs0));
            }
            int iX3 = c2584Vs0.x();
            for (int i4 = 0; i4 < iX3; i4++) {
                arrayList.add(a(c2584Vs0));
            }
            if (iX2 > 0) {
                AbstractC2248Sm0.b bVarI = AbstractC2248Sm0.i((byte[]) arrayList.get(0), iX, ((byte[]) arrayList.get(0)).length);
                int i5 = bVarI.b;
                int i6 = bVarI.c;
                f = bVarI.d;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new C1979Qd(arrayList, iX, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C3000Zs0("Error parsing AVC config", e);
        }
    }
}
