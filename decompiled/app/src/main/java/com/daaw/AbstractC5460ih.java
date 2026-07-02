package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C4312ec1;

/* JADX INFO: renamed from: com.daaw.ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5460ih implements KW, InterfaceC4856gX {
    public final C4312ec1.a[] a;
    public int b;
    public C2933Zb1 c;
    public GX[] d;
    public boolean e;
    public RH0 f;
    public a g;
    public a h;
    public a i;
    public a j;
    public int k;
    public PointF l;
    public PointF m;
    public final int n;
    public C1458Lc1 o;
    public C1458Lc1 p;
    public C1458Lc1 q;
    public C1458Lc1 r;
    public C1458Lc1 s;
    public C1458Lc1 t;
    public C1458Lc1 u;
    public C1458Lc1 v;

    /* JADX INFO: renamed from: com.daaw.ih$a */
    public static class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
    }

    public AbstractC5460ih(int i) {
        C4312ec1.a[] aVarArr = {new C4312ec1.a("Position", 3, 5126), new C4312ec1.a("TexCoord", 2, 5126), new C4312ec1.a("Color", 4, 5121)};
        this.a = aVarArr;
        this.b = 0;
        this.d = new GX[]{null, null};
        this.e = false;
        this.f = new RH0();
        this.g = new a();
        this.h = new a();
        this.i = new a();
        this.j = new a();
        this.l = new PointF();
        this.m = new PointF();
        this.o = new C1458Lc1(0.0f, 0.0f);
        this.p = new C1458Lc1(0.0f, 0.0f);
        this.q = new C1458Lc1(0.0f, 0.0f);
        this.r = new C1458Lc1(0.0f, 0.0f);
        this.s = new C1458Lc1(0.0f, 0.0f);
        this.t = new C1458Lc1(0.0f, 0.0f);
        this.u = new C1458Lc1(0.0f, 0.0f);
        this.v = new C1458Lc1(0.0f, 0.0f);
        int i2 = i * 3;
        this.n = i;
        int i3 = 0;
        for (C4312ec1.a aVar : aVarArr) {
            i3 += aVar.e;
        }
        this.c = new C2933Zb1(i2, i3);
    }

    public void A(a aVar, float[] fArr, int[] iArr, int i) {
        int i2 = i * 2;
        this.c.k(fArr[i2]);
        this.c.k(fArr[i2 + 1]);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(iArr[i]));
    }

    public void B(a aVar, float[] fArr, float f, float f2, int[] iArr, int i) {
        int i2 = i * 2;
        this.c.k(fArr[i2]);
        this.c.k(fArr[i2 + 1]);
        this.c.k(fArr[8]);
        this.c.k(f);
        this.c.k(f2);
        this.c.l(v(iArr[0]));
    }

    @Override // com.daaw.InterfaceC4856gX
    public void a() {
        this.c.g();
    }

    @Override // com.daaw.KW
    public void b(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2, C4312ec1 c4312ec1) {
        if (i((TH0) interfaceC9336wX, iw, 10, i2, c4312ec1)) {
            this.k = VT.t(i, 0);
            c1458Lc1.a = iw.e(c1458Lc1.a);
            c1458Lc1.b = iw.b(c1458Lc1.b);
            c1458Lc12.a = iw.e(c1458Lc12.a);
            c1458Lc12.b = iw.b(c1458Lc12.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = iw.f();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f9;
            a aVar3 = this.i;
            aVar3.d = 1.0f;
            aVar3.g = iw.f();
            a aVar4 = this.i;
            aVar4.h = this.k;
            aVar4.c = f9;
            a aVar5 = this.h;
            aVar5.a = f5;
            aVar5.b = f6;
            aVar5.e = c1458Lc1.a;
            aVar5.f = c1458Lc12.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = c1458Lc1.a;
            aVar6.f = c1458Lc1.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f7;
            aVar7.b = f8;
            aVar7.e = c1458Lc12.a;
            aVar7.f = c1458Lc12.b;
            x(aVar7);
            a aVar8 = this.h;
            aVar8.a = f7;
            aVar8.b = f8;
            aVar8.e = c1458Lc12.a;
            aVar8.f = c1458Lc12.b;
            x(aVar8);
            a aVar9 = this.h;
            aVar9.a = f;
            aVar9.b = f2;
            aVar9.e = c1458Lc1.a;
            aVar9.f = c1458Lc1.b;
            x(aVar9);
            a aVar10 = this.h;
            aVar10.a = f3;
            aVar10.b = f4;
            aVar10.e = c1458Lc12.a;
            aVar10.f = c1458Lc1.b;
            x(aVar10);
            float fSignum = Math.signum(((f - f3) * (f2 + f4)) + ((f3 - f7) * (f4 + f8)) + ((f7 - f) * (f8 + f2)));
            C1458Lc1 c1458Lc13 = this.s;
            c1458Lc13.a = -(f4 - f2);
            c1458Lc13.b = f3 - f;
            c1458Lc13.p();
            C1458Lc1 c1458Lc14 = this.t;
            c1458Lc14.a = -(f8 - f4);
            c1458Lc14.b = f7 - f3;
            c1458Lc14.p();
            C1458Lc1 c1458Lc15 = this.u;
            c1458Lc15.a = -(f6 - f8);
            c1458Lc15.b = f5 - f7;
            c1458Lc15.p();
            C1458Lc1 c1458Lc16 = this.v;
            c1458Lc16.a = -(f2 - f6);
            c1458Lc16.b = f - f5;
            c1458Lc16.p();
            C1458Lc1 c1458Lc17 = this.o;
            C1458Lc1 c1458Lc18 = this.s;
            float f10 = c1458Lc18.a;
            C1458Lc1 c1458Lc19 = this.v;
            c1458Lc17.a = f10 + c1458Lc19.a;
            c1458Lc17.b = c1458Lc18.b + c1458Lc19.b;
            float f11 = 1.5f * fSignum;
            c1458Lc17.n(c1458Lc18, f11);
            C1458Lc1 c1458Lc110 = this.p;
            C1458Lc1 c1458Lc111 = this.s;
            float f12 = c1458Lc111.a;
            C1458Lc1 c1458Lc112 = this.t;
            c1458Lc110.a = f12 + c1458Lc112.a;
            c1458Lc110.b = c1458Lc111.b + c1458Lc112.b;
            c1458Lc110.n(c1458Lc112, f11);
            C1458Lc1 c1458Lc113 = this.q;
            C1458Lc1 c1458Lc114 = this.t;
            float f13 = c1458Lc114.a;
            C1458Lc1 c1458Lc115 = this.u;
            c1458Lc113.a = f13 + c1458Lc115.a;
            c1458Lc113.b = c1458Lc114.b + c1458Lc115.b;
            c1458Lc113.n(c1458Lc115, f11);
            C1458Lc1 c1458Lc116 = this.r;
            C1458Lc1 c1458Lc117 = this.u;
            float f14 = c1458Lc117.a;
            C1458Lc1 c1458Lc118 = this.v;
            c1458Lc116.a = f14 + c1458Lc118.a;
            c1458Lc116.b = c1458Lc117.b + c1458Lc118.b;
            c1458Lc116.n(c1458Lc118, f11);
            C1458Lc1 c1458Lc119 = this.o;
            c1458Lc119.a = f - c1458Lc119.a;
            c1458Lc119.b = f2 - c1458Lc119.b;
            C1458Lc1 c1458Lc120 = this.p;
            c1458Lc120.a = f3 - c1458Lc120.a;
            c1458Lc120.b = f4 - c1458Lc120.b;
            C1458Lc1 c1458Lc121 = this.q;
            c1458Lc121.a = f7 - c1458Lc121.a;
            c1458Lc121.b = f8 - c1458Lc121.b;
            C1458Lc1 c1458Lc122 = this.r;
            c1458Lc122.a = f5 - c1458Lc122.a;
            c1458Lc122.b = f6 - c1458Lc122.b;
            a aVar11 = this.h;
            aVar11.a = f;
            aVar11.b = f2;
            aVar11.e = c1458Lc1.a;
            aVar11.f = c1458Lc1.b;
            x(aVar11);
            a aVar12 = this.h;
            aVar12.a = f3;
            aVar12.b = f4;
            aVar12.e = c1458Lc12.a;
            aVar12.f = c1458Lc1.b;
            x(aVar12);
            a aVar13 = this.i;
            C1458Lc1 c1458Lc123 = this.o;
            aVar13.a = c1458Lc123.a;
            aVar13.b = c1458Lc123.b;
            aVar13.e = c1458Lc1.a;
            aVar13.f = c1458Lc1.b;
            x(aVar13);
            a aVar14 = this.i;
            C1458Lc1 c1458Lc124 = this.o;
            aVar14.a = c1458Lc124.a;
            aVar14.b = c1458Lc124.b;
            aVar14.e = c1458Lc1.a;
            aVar14.f = c1458Lc1.b;
            x(aVar14);
            a aVar15 = this.h;
            aVar15.a = f3;
            aVar15.b = f4;
            aVar15.e = c1458Lc12.a;
            aVar15.f = c1458Lc1.b;
            x(aVar15);
            a aVar16 = this.i;
            C1458Lc1 c1458Lc125 = this.p;
            aVar16.a = c1458Lc125.a;
            aVar16.b = c1458Lc125.b;
            aVar16.e = c1458Lc12.a;
            aVar16.f = c1458Lc1.b;
            x(aVar16);
            a aVar17 = this.h;
            aVar17.a = f3;
            aVar17.b = f4;
            aVar17.e = c1458Lc1.a;
            aVar17.f = c1458Lc1.b;
            x(aVar17);
            a aVar18 = this.h;
            aVar18.a = f7;
            aVar18.b = f8;
            aVar18.e = c1458Lc12.a;
            aVar18.f = c1458Lc1.b;
            x(aVar18);
            a aVar19 = this.i;
            C1458Lc1 c1458Lc126 = this.p;
            aVar19.a = c1458Lc126.a;
            aVar19.b = c1458Lc126.b;
            aVar19.e = c1458Lc1.a;
            aVar19.f = c1458Lc1.b;
            x(aVar19);
            a aVar20 = this.i;
            C1458Lc1 c1458Lc127 = this.p;
            aVar20.a = c1458Lc127.a;
            aVar20.b = c1458Lc127.b;
            aVar20.e = c1458Lc1.a;
            aVar20.f = c1458Lc1.b;
            x(aVar20);
            a aVar21 = this.h;
            aVar21.a = f7;
            aVar21.b = f8;
            aVar21.e = c1458Lc12.a;
            aVar21.f = c1458Lc1.b;
            x(aVar21);
            a aVar22 = this.i;
            C1458Lc1 c1458Lc128 = this.q;
            aVar22.a = c1458Lc128.a;
            aVar22.b = c1458Lc128.b;
            aVar22.e = c1458Lc12.a;
            aVar22.f = c1458Lc1.b;
            x(aVar22);
            a aVar23 = this.h;
            aVar23.a = f7;
            aVar23.b = f8;
            aVar23.e = c1458Lc1.a;
            aVar23.f = c1458Lc1.b;
            x(aVar23);
            a aVar24 = this.h;
            aVar24.a = f5;
            aVar24.b = f6;
            aVar24.e = c1458Lc12.a;
            aVar24.f = c1458Lc1.b;
            x(aVar24);
            a aVar25 = this.i;
            C1458Lc1 c1458Lc129 = this.q;
            aVar25.a = c1458Lc129.a;
            aVar25.b = c1458Lc129.b;
            aVar25.e = c1458Lc1.a;
            aVar25.f = c1458Lc1.b;
            x(aVar25);
            a aVar26 = this.i;
            C1458Lc1 c1458Lc130 = this.q;
            aVar26.a = c1458Lc130.a;
            aVar26.b = c1458Lc130.b;
            aVar26.e = c1458Lc1.a;
            aVar26.f = c1458Lc1.b;
            x(aVar26);
            a aVar27 = this.h;
            aVar27.a = f5;
            aVar27.b = f6;
            aVar27.e = c1458Lc12.a;
            aVar27.f = c1458Lc1.b;
            x(aVar27);
            a aVar28 = this.i;
            C1458Lc1 c1458Lc131 = this.r;
            aVar28.a = c1458Lc131.a;
            aVar28.b = c1458Lc131.b;
            aVar28.e = c1458Lc12.a;
            aVar28.f = c1458Lc1.b;
            x(aVar28);
            a aVar29 = this.h;
            aVar29.a = f5;
            aVar29.b = f6;
            aVar29.e = c1458Lc1.a;
            aVar29.f = c1458Lc1.b;
            x(aVar29);
            a aVar30 = this.h;
            aVar30.a = f;
            aVar30.b = f2;
            aVar30.e = c1458Lc12.a;
            aVar30.f = c1458Lc1.b;
            x(aVar30);
            a aVar31 = this.i;
            C1458Lc1 c1458Lc132 = this.r;
            aVar31.a = c1458Lc132.a;
            aVar31.b = c1458Lc132.b;
            aVar31.e = c1458Lc1.a;
            aVar31.f = c1458Lc1.b;
            x(aVar31);
            a aVar32 = this.i;
            C1458Lc1 c1458Lc133 = this.r;
            aVar32.a = c1458Lc133.a;
            aVar32.b = c1458Lc133.b;
            aVar32.e = c1458Lc1.a;
            aVar32.f = c1458Lc1.b;
            x(aVar32);
            a aVar33 = this.h;
            aVar33.a = f;
            aVar33.b = f2;
            aVar33.e = c1458Lc12.a;
            aVar33.f = c1458Lc1.b;
            x(aVar33);
            a aVar34 = this.i;
            C1458Lc1 c1458Lc134 = this.o;
            aVar34.a = c1458Lc134.a;
            aVar34.b = c1458Lc134.b;
            aVar34.e = c1458Lc12.a;
            aVar34.f = c1458Lc1.b;
            x(aVar34);
            this.b += 10;
        }
    }

    @Override // com.daaw.KW
    public void c(InterfaceC9336wX interfaceC9336wX, IQ iq, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2, C4312ec1 c4312ec1) {
        TH0 th0;
        TH0 th02;
        float[] fArr;
        int[] iArr;
        float[] fArr2;
        int i3 = i;
        IW iw2 = iw;
        TH0 th03 = (TH0) interfaceC9336wX;
        float[] fArr3 = new float[8];
        int[] iArr2 = new int[4];
        float[] fArr4 = new float[8];
        c1458Lc1.a = iw2.e(c1458Lc1.a);
        c1458Lc1.b = iw2.b(c1458Lc1.b);
        c1458Lc12.a = iw2.e(c1458Lc12.a);
        c1458Lc12.b = iw2.b(c1458Lc12.b);
        a aVar = this.g;
        aVar.d = 1.0f;
        aVar.g = iw2.f();
        this.g.c = f;
        a aVar2 = this.h;
        aVar2.d = 1.0f;
        aVar2.g = iw2.f();
        this.h.c = f;
        a aVar3 = this.i;
        aVar3.d = 1.0f;
        aVar3.g = iw2.f();
        a aVar4 = this.i;
        aVar4.c = f;
        aVar4.d = 1.0f;
        aVar4.g = iw2.f();
        this.i.c = f;
        int i4 = this.n;
        int i5 = i4 - (i4 % 6);
        int i6 = 0;
        int i7 = 0;
        while (i7 < i3) {
            if ((i7 * 6) % i5 == 0) {
                th0 = th03;
                if (!i(th0, iw2, Math.min((i3 - i7) * 6, i5), i2, c4312ec1)) {
                    return;
                }
            } else {
                th0 = th03;
            }
            if (((Boolean) iq.c(Integer.valueOf(i7), fArr3, iArr2, fArr4)).booleanValue()) {
                a aVar5 = this.h;
                aVar5.e = c1458Lc1.a;
                aVar5.f = c1458Lc12.b;
                A(aVar5, fArr3, iArr2, 2);
                a aVar6 = this.h;
                aVar6.e = c1458Lc1.a;
                aVar6.f = c1458Lc1.b;
                A(aVar6, fArr3, iArr2, i6);
                a aVar7 = this.h;
                aVar7.e = c1458Lc12.a;
                aVar7.f = c1458Lc12.b;
                A(aVar7, fArr3, iArr2, 3);
                a aVar8 = this.h;
                aVar8.e = c1458Lc12.a;
                aVar8.f = c1458Lc12.b;
                A(aVar8, fArr3, iArr2, 3);
                a aVar9 = this.h;
                aVar9.e = c1458Lc1.a;
                aVar9.f = c1458Lc1.b;
                A(aVar9, fArr3, iArr2, i6);
                a aVar10 = this.h;
                aVar10.e = c1458Lc12.a;
                aVar10.f = c1458Lc1.b;
                A(aVar10, fArr3, iArr2, 1);
                a aVar11 = this.g;
                aVar11.h = iArr2[i6];
                this.h.h = iArr2[1];
                this.i.h = iArr2[3];
                this.j.h = iArr2[2];
                float f2 = fArr3[i6];
                float f3 = fArr3[1];
                float f4 = fArr3[2];
                float f5 = fArr3[3];
                th02 = th0;
                float f6 = fArr3[6];
                float f7 = fArr3[7];
                float f8 = fArr3[4];
                fArr = fArr3;
                float f9 = fArr[5];
                iArr = iArr2;
                C1458Lc1 c1458Lc13 = this.o;
                fArr2 = fArr4;
                c1458Lc13.a = f2 - fArr4[0];
                c1458Lc13.b = f3 - fArr2[1];
                C1458Lc1 c1458Lc14 = this.p;
                c1458Lc14.a = f4 - fArr2[2];
                c1458Lc14.b = f5 - fArr2[3];
                C1458Lc1 c1458Lc15 = this.q;
                c1458Lc15.a = f6 - fArr2[4];
                c1458Lc15.b = f7 - fArr2[5];
                C1458Lc1 c1458Lc16 = this.r;
                c1458Lc16.a = f8 - fArr2[6];
                c1458Lc16.b = f9 - fArr2[7];
                aVar11.a = f2;
                aVar11.b = f3;
                aVar11.e = c1458Lc1.a;
                aVar11.f = c1458Lc1.b;
                x(aVar11);
                a aVar12 = this.h;
                aVar12.a = f4;
                aVar12.b = f5;
                aVar12.e = c1458Lc12.a;
                aVar12.f = c1458Lc1.b;
                x(aVar12);
                a aVar13 = this.g;
                C1458Lc1 c1458Lc17 = this.o;
                aVar13.a = c1458Lc17.a;
                aVar13.b = c1458Lc17.b;
                aVar13.e = c1458Lc1.a;
                aVar13.f = c1458Lc1.b;
                z(aVar13, 0);
                a aVar14 = this.g;
                C1458Lc1 c1458Lc18 = this.o;
                aVar14.a = c1458Lc18.a;
                aVar14.b = c1458Lc18.b;
                aVar14.e = c1458Lc1.a;
                aVar14.f = c1458Lc1.b;
                z(aVar14, 0);
                a aVar15 = this.h;
                aVar15.a = f4;
                aVar15.b = f5;
                aVar15.e = c1458Lc12.a;
                aVar15.f = c1458Lc1.b;
                x(aVar15);
                a aVar16 = this.h;
                C1458Lc1 c1458Lc19 = this.p;
                aVar16.a = c1458Lc19.a;
                aVar16.b = c1458Lc19.b;
                aVar16.e = c1458Lc12.a;
                aVar16.f = c1458Lc1.b;
                z(aVar16, 0);
                a aVar17 = this.i;
                aVar17.a = f6;
                aVar17.b = f7;
                aVar17.e = c1458Lc1.a;
                aVar17.f = c1458Lc1.b;
                x(aVar17);
                a aVar18 = this.j;
                aVar18.a = f8;
                aVar18.b = f9;
                aVar18.e = c1458Lc12.a;
                aVar18.f = c1458Lc1.b;
                x(aVar18);
                a aVar19 = this.i;
                C1458Lc1 c1458Lc110 = this.q;
                aVar19.a = c1458Lc110.a;
                aVar19.b = c1458Lc110.b;
                aVar19.e = c1458Lc1.a;
                aVar19.f = c1458Lc1.b;
                z(aVar19, 0);
                a aVar20 = this.i;
                C1458Lc1 c1458Lc111 = this.q;
                aVar20.a = c1458Lc111.a;
                aVar20.b = c1458Lc111.b;
                aVar20.e = c1458Lc1.a;
                aVar20.f = c1458Lc1.b;
                z(aVar20, 0);
                a aVar21 = this.j;
                aVar21.a = f8;
                aVar21.b = f9;
                aVar21.e = c1458Lc12.a;
                aVar21.f = c1458Lc1.b;
                x(aVar21);
                a aVar22 = this.j;
                C1458Lc1 c1458Lc112 = this.r;
                aVar22.a = c1458Lc112.a;
                aVar22.b = c1458Lc112.b;
                aVar22.e = c1458Lc12.a;
                aVar22.f = c1458Lc1.b;
                z(aVar22, 0);
                this.b += 6;
            } else {
                th02 = th0;
                fArr = fArr3;
                iArr = iArr2;
                fArr2 = fArr4;
            }
            i7++;
            i3 = i;
            iw2 = iw;
            th03 = th02;
            fArr3 = fArr;
            iArr2 = iArr;
            fArr4 = fArr2;
            i6 = 0;
        }
    }

    @Override // com.daaw.KW
    public void e(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, IW iw, int i2) {
        k(interfaceC9336wX, f, f2, f3, f4, f5, f6, f7, f8, f9, i, c1458Lc1, c1458Lc12, new RH0(i2, iw, (C4312ec1) null, (InterfaceC6129l2) null), false);
    }

    public C4312ec1 g(C4880gc1 c4880gc1) {
        return new C4312ec1(this.c, c4880gc1, this.a);
    }

    public boolean h(TH0 th0, int i, RH0 rh0, boolean z) {
        if (w() - ((this.c.i() * 3) * i) < 0 || !this.f.b(rh0)) {
            z = true;
        }
        if (z) {
            q(th0, this.f);
        }
        this.f.a(rh0);
        if (w() - ((this.c.i() * 3) * i) >= 0) {
            return true;
        }
        AbstractC0441Bk1.c("buffer too small");
        return false;
    }

    public boolean i(TH0 th0, IW iw, int i, int i2, C4312ec1 c4312ec1) {
        return h(th0, i, new RH0(i2, iw, c4312ec1, (InterfaceC6129l2) null), false);
    }

    public void j(TH0 th0, HQ hq, HQ hq2, HQ hq3, HQ hq4, int i, float f, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        int i2;
        int i3 = hq2 != null ? 4 : 2;
        if (hq3 != null) {
            i3 += 2;
        }
        if (hq4 != null) {
            i3 += 2;
        }
        int i4 = i3;
        float[] fArr = new float[9];
        int[] iArr = new int[1];
        c1458Lc1.a = rh0.i(c1458Lc1.a);
        c1458Lc1.b = rh0.j(c1458Lc1.b);
        c1458Lc12.a = rh0.i(c1458Lc12.a);
        c1458Lc12.b = rh0.j(c1458Lc12.b);
        a aVar = this.h;
        aVar.d = 1.0f;
        aVar.g = rh0.k();
        this.h.c = f;
        fArr[8] = f;
        int i5 = this.n;
        int i6 = i5 - (i5 % i4);
        boolean z = false;
        int i7 = 0;
        while (i7 < i) {
            if ((i7 * i4) % i6 == 0 && !h(th0, Math.min((i - i7) * i4, i6), rh0, z)) {
                return;
            }
            if (((Boolean) hq.j(Integer.valueOf(i7), fArr, iArr)).booleanValue()) {
                i2 = i7;
                B(this.h, fArr, c1458Lc1.a, c1458Lc12.b, iArr, 2);
                B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                B(this.h, fArr, c1458Lc12.a, c1458Lc1.b, iArr, 1);
                if (hq2 != null) {
                    hq2.j(Integer.valueOf(i2), fArr, iArr);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc12.b, iArr, 2);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc1.b, iArr, 1);
                }
                if (hq3 != null) {
                    hq3.j(Integer.valueOf(i2), fArr, iArr);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc12.b, iArr, 2);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc1.b, iArr, 1);
                }
                if (hq4 != null) {
                    hq4.j(Integer.valueOf(i2), fArr, iArr);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc12.b, iArr, 2);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc12.b, iArr, 3);
                    B(this.h, fArr, c1458Lc1.a, c1458Lc1.b, iArr, 0);
                    B(this.h, fArr, c1458Lc12.a, c1458Lc1.b, iArr, 1);
                }
                this.b += i4;
            } else {
                i2 = i7;
            }
            i7 = i2 + 1;
            z = false;
        }
    }

    public void k(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0, boolean z) {
        TH0 th0 = (TH0) interfaceC9336wX;
        if (h(th0, 2, rh0, z)) {
            c1458Lc1.a = rh0.i(c1458Lc1.a);
            c1458Lc1.b = rh0.j(c1458Lc1.b);
            c1458Lc12.a = rh0.i(c1458Lc12.a);
            c1458Lc12.b = rh0.j(c1458Lc12.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = rh0.k();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f9;
            aVar2.a = f5;
            aVar2.b = f6;
            aVar2.e = c1458Lc1.a;
            aVar2.f = c1458Lc12.b;
            x(aVar2);
            a aVar3 = this.h;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = c1458Lc1.a;
            aVar3.f = c1458Lc1.b;
            x(aVar3);
            a aVar4 = this.h;
            aVar4.a = f7;
            aVar4.b = f8;
            aVar4.e = c1458Lc12.a;
            aVar4.f = c1458Lc12.b;
            x(aVar4);
            a aVar5 = this.h;
            aVar5.a = f7;
            aVar5.b = f8;
            aVar5.e = c1458Lc12.a;
            aVar5.f = c1458Lc12.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = c1458Lc1.a;
            aVar6.f = c1458Lc1.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f3;
            aVar7.b = f4;
            aVar7.e = c1458Lc12.a;
            aVar7.f = c1458Lc1.b;
            x(aVar7);
            this.b += 2;
            if (z) {
                h(th0, 0, rh0, z);
            }
        }
    }

    public void l(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        k(interfaceC9336wX, f, f2, f3, f4, f7, f8, f5, f6, f9, i, c1458Lc1, c1458Lc12, rh0, false);
    }

    public void m(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0, boolean z) {
        k(interfaceC9336wX, f, f2, f3, f4, f7, f8, f5, f6, f9, i, c1458Lc1, c1458Lc12, rh0, z);
    }

    public void n(TH0 th0, float f, float f2, float f3, float f4, float f5, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0, boolean z) {
        if (h(th0, 2, rh0, z)) {
            c1458Lc1.a = rh0.i(c1458Lc1.a);
            c1458Lc1.b = rh0.j(c1458Lc1.b);
            c1458Lc12.a = rh0.i(c1458Lc12.a);
            c1458Lc12.b = rh0.j(c1458Lc12.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = rh0.k();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f3;
            aVar2.a = f;
            float f6 = f5 + f2;
            aVar2.b = f6;
            aVar2.e = c1458Lc1.a;
            aVar2.f = c1458Lc12.b;
            x(aVar2);
            a aVar3 = this.h;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = c1458Lc1.a;
            aVar3.f = c1458Lc1.b;
            x(aVar3);
            a aVar4 = this.h;
            float f7 = f4 + f;
            aVar4.a = f7;
            aVar4.b = f6;
            aVar4.e = c1458Lc12.a;
            aVar4.f = c1458Lc12.b;
            x(aVar4);
            a aVar5 = this.h;
            aVar5.a = f7;
            aVar5.b = f6;
            aVar5.e = c1458Lc12.a;
            aVar5.f = c1458Lc12.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = c1458Lc1.a;
            aVar6.f = c1458Lc1.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f7;
            aVar7.b = f2;
            aVar7.e = c1458Lc12.a;
            aVar7.f = c1458Lc1.b;
            x(aVar7);
            this.b += 2;
            if (z) {
                h(th0, 2, rh0, z);
            }
        }
    }

    public void o(InterfaceC9336wX interfaceC9336wX, float f, float f2, float f3, float f4, float f5, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0, boolean z) {
        float f6 = f2 + f5;
        float f7 = f + f4;
        m(interfaceC9336wX, f, f6, f7, f6, f7, f2, f, f2, f3, i, c1458Lc1, c1458Lc12, rh0, z);
    }

    public void p(TH0 th0) {
        RH0 rh0 = new RH0();
        if (q(th0, this.f)) {
            this.f.a(rh0);
        }
    }

    public final boolean q(TH0 th0, RH0 rh0) {
        if (this.e) {
            return false;
        }
        this.e = true;
        if (this.b > 0) {
            th0.k();
            this.c.h();
            t(th0, rh0);
            this.b = 0;
        }
        this.c.f();
        this.e = false;
        return true;
    }

    public void r(TH0 th0) {
        p(th0);
    }

    public void s(TH0 th0) {
        this.b = 0;
        this.c.f();
        this.f.h();
    }

    public final void t(TH0 th0, RH0 rh0) {
        C4312ec1 c4312ec1S = rh0.c;
        if (c4312ec1S == null) {
            c4312ec1S = th0.u.s();
        }
        th0.e(rh0.a);
        int iD = rh0.d();
        while (true) {
            iD--;
            if (iD < 0) {
                th0.T(rh0.g());
                c4312ec1S.a(th0, rh0.d, rh0);
                c4312ec1S.b(4, 0, this.b * 3);
                c4312ec1S.d(th0);
                return;
            }
            GLES20.glActiveTexture(33984 + iD);
            GX gxC = rh0.c(iD);
            if (gxC == null || !gxC.b().k()) {
                GLES20.glBindTexture(3553, 0);
            } else {
                gxC.b().c();
            }
        }
    }

    public void u(TH0 th0, RectF rectF, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0, AX ax) {
        TH0 th02 = th0;
        RH0 rh02 = rh0;
        int i2 = ax.i(rectF);
        int i3 = i2 - 1;
        ax.e(false, i3, i2, rectF, 0.0f, this.l, this.m);
        int i4 = i3;
        PointF pointF = this.l;
        float f = pointF.x;
        float f2 = pointF.y;
        c1458Lc1.a = rh02.i(c1458Lc1.a);
        c1458Lc1.b = rh02.j(c1458Lc1.b);
        c1458Lc12.a = rh02.i(c1458Lc12.a);
        float fJ = rh02.j(c1458Lc12.b);
        c1458Lc12.b = fJ;
        float f3 = c1458Lc1.a;
        float f4 = c1458Lc12.a;
        float f5 = (f3 + f4) * 0.5f;
        float f6 = (c1458Lc1.b + fJ) * 0.5f;
        float fWidth = (f4 - f3) * (1.0f / rectF.width());
        float fHeight = (c1458Lc12.b - c1458Lc1.b) * (1.0f / rectF.height());
        a aVar = this.h;
        aVar.d = 1.0f;
        aVar.g = rh02.k();
        a aVar2 = this.h;
        aVar2.h = i;
        aVar2.c = 0.0f;
        boolean z = false;
        int i5 = 0;
        while (i5 < i2) {
            int i6 = this.n;
            if (i5 % i6 == 0 && !h(th02, Math.min(i2 - i5, i6), rh02, z)) {
                return;
            }
            float f7 = f6;
            float f8 = f;
            float f9 = fHeight;
            int i7 = i4;
            float f10 = f2;
            ax.e(false, i5, i2, rectF, 0.0f, this.l, this.m);
            a aVar3 = this.h;
            aVar3.a = f8;
            aVar3.b = f10;
            aVar3.e = ((f8 - rectF.centerX()) * fWidth) + f5;
            this.h.f = ((f10 - rectF.centerY()) * f9) + f5;
            x(this.h);
            this.h.a = rectF.centerX();
            this.h.b = rectF.centerY();
            a aVar4 = this.h;
            aVar4.e = f5;
            aVar4.f = f7;
            x(aVar4);
            a aVar5 = this.h;
            PointF pointF2 = this.l;
            float f11 = pointF2.x;
            aVar5.a = f11;
            aVar5.b = pointF2.y;
            aVar5.e = ((f11 - rectF.centerX()) * fWidth) + f5;
            this.h.f = ((this.l.y - rectF.centerY()) * f9) + f5;
            x(this.h);
            this.b++;
            PointF pointF3 = this.l;
            f = pointF3.x;
            f2 = pointF3.y;
            i5++;
            fHeight = f9;
            f6 = f7;
            i4 = i7;
            z = false;
        }
        float f12 = fHeight;
        int i8 = i4;
        if (th02.H()) {
            int iT = VT.t(i, 0);
            ax.e(false, i8, i2, rectF, 0.0f, this.l, this.m);
            PointF pointF4 = this.l;
            float f13 = pointF4.x;
            float f14 = pointF4.y;
            PointF pointF5 = this.m;
            float f15 = (pointF5.x * (-1.5f)) + f13;
            float f16 = (pointF5.y * (-1.5f)) + f14;
            int i9 = this.n;
            int i10 = i9 - (i9 % 2);
            float f17 = f15;
            int i11 = 0;
            while (i11 < i2) {
                if ((i11 * 2) % i10 == 0 && !h(th02, Math.min((i2 - i11) * 2, i10), rh02, false)) {
                    return;
                }
                float f18 = f16;
                float f19 = f17;
                float f20 = f13;
                int i12 = i10;
                ax.e(false, i11, i2, rectF, 0.0f, this.l, this.m);
                PointF pointF6 = this.l;
                float f21 = pointF6.x;
                PointF pointF7 = this.m;
                f17 = (pointF7.x * (-1.5f)) + f21;
                f16 = (pointF7.y * (-1.5f)) + pointF6.y;
                a aVar6 = this.h;
                aVar6.a = f20;
                aVar6.b = f14;
                aVar6.e = ((f20 - rectF.centerX()) * fWidth) + f5;
                this.h.f = ((f14 - rectF.centerY()) * f12) + f5;
                a aVar7 = this.h;
                aVar7.h = i;
                x(aVar7);
                a aVar8 = this.h;
                PointF pointF8 = this.l;
                float f22 = pointF8.x;
                aVar8.a = f22;
                aVar8.b = pointF8.y;
                aVar8.e = ((f22 - rectF.centerX()) * fWidth) + f5;
                this.h.f = ((this.l.y - rectF.centerY()) * f12) + f5;
                a aVar9 = this.h;
                aVar9.h = i;
                x(aVar9);
                a aVar10 = this.h;
                aVar10.a = f17;
                aVar10.b = f16;
                aVar10.e = ((f17 - rectF.centerX()) * fWidth) + f5;
                this.h.f = ((f16 - rectF.centerY()) * f12) + f5;
                a aVar11 = this.h;
                aVar11.h = iT;
                x(aVar11);
                x(this.h);
                a aVar12 = this.h;
                aVar12.a = f19;
                aVar12.b = f18;
                aVar12.e = ((f19 - rectF.centerX()) * fWidth) + f5;
                this.h.f = ((f18 - rectF.centerY()) * f12) + f5;
                a aVar13 = this.h;
                aVar13.h = iT;
                x(aVar13);
                a aVar14 = this.h;
                aVar14.a = f20;
                aVar14.b = f14;
                aVar14.e = ((f20 - rectF.centerX()) * fWidth) + f5;
                this.h.f = ((f14 - rectF.centerY()) * f12) + f5;
                a aVar15 = this.h;
                aVar15.h = i;
                x(aVar15);
                this.b += 2;
                PointF pointF9 = this.l;
                f13 = pointF9.x;
                f14 = pointF9.y;
                i11++;
                th02 = th0;
                rh02 = rh0;
                i10 = i12;
            }
        }
    }

    public final int v(int i) {
        return ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
    }

    public final int w() {
        return this.c.m();
    }

    public void x(a aVar) {
        this.c.k(aVar.a);
        this.c.k(aVar.b);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(aVar.h));
    }

    public void y(a aVar, float f, float f2, float f3, int[] iArr, int i) {
        this.c.k(f);
        this.c.k(f2);
        this.c.k(f3);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(iArr[i]));
    }

    public void z(a aVar, int i) {
        this.c.k(aVar.a);
        this.c.k(aVar.b);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(VT.t(aVar.h, i)));
    }
}
