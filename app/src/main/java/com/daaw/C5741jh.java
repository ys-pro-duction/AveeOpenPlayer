package com.daaw;

import com.daaw.AbstractC5460ih;

/* JADX INFO: renamed from: com.daaw.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5741jh extends AbstractC5460ih {
    public float A;
    public AbstractC5460ih.a w;
    public C1458Lc1 x;
    public C1458Lc1 y;
    public float z;

    public C5741jh(int i) {
        super(i);
        this.w = new AbstractC5460ih.a();
        this.x = new C1458Lc1(0.0f, 0.0f);
        this.y = new C1458Lc1(0.0f, 0.0f);
    }

    @Override // com.daaw.KW
    public void d(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        if (h((TH0) interfaceC9336wX, 4, rh0, false)) {
            c1458Lc1.a = rh0.i(c1458Lc1.a);
            c1458Lc1.b = rh0.j(c1458Lc1.b);
            c1458Lc12.a = rh0.i(c1458Lc12.a);
            rh0.j(c1458Lc12.b);
            c1458Lc12.b = 0.0f;
            C1458Lc1 c1458Lc13 = this.x;
            c1458Lc13.a = (f + f5) * 0.5f;
            c1458Lc13.b = (f2 + f6) * 0.5f;
            C1458Lc1 c1458Lc14 = this.y;
            c1458Lc14.a = (f3 + f7) * 0.5f;
            c1458Lc14.b = (f4 + f8) * 0.5f;
            float fL = C1458Lc1.l(f - f5, f2 - f6) * 0.5f * 0.0234375f;
            float fL2 = C1458Lc1.l(f3 - f7, f4 - f8) * 0.5f * 0.0234375f;
            AbstractC5460ih.a aVar = this.w;
            aVar.d = 1.0f;
            aVar.g = rh0.k();
            AbstractC5460ih.a aVar2 = this.w;
            aVar2.h = i;
            aVar2.c = f9;
            C1458Lc1 c1458Lc15 = this.x;
            aVar2.a = c1458Lc15.a;
            aVar2.b = c1458Lc15.b;
            aVar2.e = c1458Lc1.a;
            aVar2.f = c1458Lc12.b + fL;
            x(aVar2);
            AbstractC5460ih.a aVar3 = this.w;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = c1458Lc1.a;
            aVar3.f = c1458Lc1.b;
            x(aVar3);
            AbstractC5460ih.a aVar4 = this.w;
            C1458Lc1 c1458Lc16 = this.y;
            aVar4.a = c1458Lc16.a;
            aVar4.b = c1458Lc16.b;
            aVar4.e = c1458Lc12.a;
            aVar4.f = c1458Lc12.b + fL2;
            x(aVar4);
            AbstractC5460ih.a aVar5 = this.w;
            C1458Lc1 c1458Lc17 = this.y;
            aVar5.a = c1458Lc17.a;
            aVar5.b = c1458Lc17.b;
            aVar5.e = c1458Lc12.a;
            aVar5.f = c1458Lc12.b + fL2;
            x(aVar5);
            AbstractC5460ih.a aVar6 = this.w;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = c1458Lc1.a;
            aVar6.f = c1458Lc1.b;
            x(aVar6);
            AbstractC5460ih.a aVar7 = this.w;
            aVar7.a = f3;
            aVar7.b = f4;
            aVar7.e = c1458Lc12.a;
            aVar7.f = c1458Lc1.b;
            x(aVar7);
            AbstractC5460ih.a aVar8 = this.w;
            aVar8.a = f5;
            aVar8.b = f6;
            aVar8.e = c1458Lc1.a;
            aVar8.f = c1458Lc1.b;
            x(aVar8);
            AbstractC5460ih.a aVar9 = this.w;
            C1458Lc1 c1458Lc18 = this.x;
            aVar9.a = c1458Lc18.a;
            aVar9.b = c1458Lc18.b;
            aVar9.e = c1458Lc1.a;
            aVar9.f = c1458Lc12.b + fL;
            x(aVar9);
            AbstractC5460ih.a aVar10 = this.w;
            aVar10.a = f7;
            aVar10.b = f8;
            aVar10.e = c1458Lc12.a;
            aVar10.f = c1458Lc1.b;
            x(aVar10);
            AbstractC5460ih.a aVar11 = this.w;
            aVar11.a = f7;
            aVar11.b = f8;
            aVar11.e = c1458Lc12.a;
            aVar11.f = c1458Lc1.b;
            x(aVar11);
            AbstractC5460ih.a aVar12 = this.w;
            C1458Lc1 c1458Lc19 = this.x;
            aVar12.a = c1458Lc19.a;
            aVar12.b = c1458Lc19.b;
            aVar12.e = c1458Lc1.a;
            aVar12.f = c1458Lc12.b + fL;
            x(aVar12);
            AbstractC5460ih.a aVar13 = this.w;
            C1458Lc1 c1458Lc110 = this.y;
            aVar13.a = c1458Lc110.a;
            aVar13.b = c1458Lc110.b;
            aVar13.e = c1458Lc12.a;
            aVar13.f = c1458Lc12.b + fL2;
            x(aVar13);
            this.b += 4;
        }
    }

    @Override // com.daaw.KW
    public void f(InterfaceC9336wX interfaceC9336wX, HQ hq, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        int i2;
        TH0 th0 = (TH0) interfaceC9336wX;
        float[] fArr = new float[8];
        char c = 4;
        int[] iArr = new int[4];
        c1458Lc1.a = rh0.i(c1458Lc1.a);
        c1458Lc1.b = rh0.j(c1458Lc1.b);
        c1458Lc12.a = rh0.i(c1458Lc12.a);
        rh0.j(c1458Lc12.b);
        c1458Lc12.b = 0.0f;
        AbstractC5460ih.a aVar = this.w;
        aVar.d = 1.0f;
        aVar.g = rh0.k();
        this.w.c = f;
        int i3 = this.n;
        int i4 = i3 - (i3 % 4);
        int i5 = 0;
        while (i5 < i) {
            if ((i5 * 4) % i4 == 0 && !h(th0, Math.min((i - i5) * 4, i4), rh0, false)) {
                return;
            }
            if (((Boolean) hq.j(Integer.valueOf(i5), fArr, iArr)).booleanValue()) {
                C1458Lc1 c1458Lc13 = this.x;
                float f2 = fArr[0];
                float f3 = fArr[c];
                c1458Lc13.a = (f2 + f3) * 0.5f;
                float f4 = fArr[1];
                float f5 = fArr[5];
                c1458Lc13.b = (f4 + f5) * 0.5f;
                C1458Lc1 c1458Lc14 = this.y;
                c1458Lc14.a = (fArr[2] + fArr[6]) * 0.5f;
                c1458Lc14.b = (fArr[3] + fArr[7]) * 0.5f;
                float fL = C1458Lc1.l(f2 - f3, f4 - f5);
                float fL2 = C1458Lc1.l(fArr[2] - fArr[6], fArr[3] - fArr[7]) * 0.5f;
                float f6 = fL * 0.5f * 0.0234375f;
                this.z = f6;
                this.A = fL2 * 0.0234375f;
                int i6 = i5;
                AbstractC5460ih.a aVar2 = this.w;
                aVar2.e = c1458Lc1.a;
                aVar2.f = c1458Lc12.b + f6;
                C1458Lc1 c1458Lc15 = this.x;
                i2 = i6;
                y(aVar2, c1458Lc15.a, c1458Lc15.b, aVar2.c, iArr, 2);
                AbstractC5460ih.a aVar3 = this.w;
                aVar3.e = c1458Lc1.a;
                aVar3.f = c1458Lc1.b;
                A(aVar3, fArr, iArr, 0);
                AbstractC5460ih.a aVar4 = this.w;
                aVar4.e = c1458Lc12.a;
                aVar4.f = c1458Lc12.b + this.A;
                C1458Lc1 c1458Lc16 = this.y;
                y(aVar4, c1458Lc16.a, c1458Lc16.b, aVar4.c, iArr, 3);
                AbstractC5460ih.a aVar5 = this.w;
                aVar5.e = c1458Lc12.a;
                aVar5.f = c1458Lc12.b + this.A;
                C1458Lc1 c1458Lc17 = this.y;
                y(aVar5, c1458Lc17.a, c1458Lc17.b, aVar5.c, iArr, 3);
                AbstractC5460ih.a aVar6 = this.w;
                aVar6.e = c1458Lc1.a;
                aVar6.f = c1458Lc1.b;
                A(aVar6, fArr, iArr, 0);
                AbstractC5460ih.a aVar7 = this.w;
                aVar7.e = c1458Lc12.a;
                aVar7.f = c1458Lc1.b;
                A(aVar7, fArr, iArr, 1);
                AbstractC5460ih.a aVar8 = this.w;
                aVar8.e = c1458Lc1.a;
                aVar8.f = c1458Lc1.b;
                A(aVar8, fArr, iArr, 2);
                AbstractC5460ih.a aVar9 = this.w;
                aVar9.e = c1458Lc1.a;
                aVar9.f = c1458Lc12.b + this.z;
                C1458Lc1 c1458Lc18 = this.x;
                y(aVar9, c1458Lc18.a, c1458Lc18.b, aVar9.c, iArr, 0);
                AbstractC5460ih.a aVar10 = this.w;
                aVar10.e = c1458Lc12.a;
                aVar10.f = c1458Lc1.b;
                A(aVar10, fArr, iArr, 3);
                AbstractC5460ih.a aVar11 = this.w;
                aVar11.e = c1458Lc12.a;
                aVar11.f = c1458Lc1.b;
                A(aVar11, fArr, iArr, 3);
                AbstractC5460ih.a aVar12 = this.w;
                aVar12.e = c1458Lc1.a;
                aVar12.f = c1458Lc12.b + this.z;
                C1458Lc1 c1458Lc19 = this.x;
                y(aVar12, c1458Lc19.a, c1458Lc19.b, aVar12.c, iArr, 0);
                AbstractC5460ih.a aVar13 = this.w;
                aVar13.e = c1458Lc12.a;
                aVar13.f = c1458Lc12.b + this.A;
                C1458Lc1 c1458Lc110 = this.y;
                y(aVar13, c1458Lc110.a, c1458Lc110.b, aVar13.c, iArr, 1);
                this.b += 4;
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
            c = 4;
        }
    }
}
