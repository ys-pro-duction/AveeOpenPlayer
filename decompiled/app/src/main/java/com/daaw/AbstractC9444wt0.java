package com.daaw;

import com.daaw.AbstractC9165vt0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9444wt0 {
    public static final List a(char c, float[] fArr) {
        G10.g(fArr, "args");
        if (c == 'z' || c == 'Z') {
            return AbstractC1496Lm.e(AbstractC9165vt0.b.c);
        }
        if (c == 'm') {
            F00 f00P = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(f00P, 10));
            Iterator it = f00P.iterator();
            while (it.hasNext()) {
                int iB = ((A00) it).b();
                float[] fArrM = AbstractC5152hb.m(fArr, iB, iB + 2);
                Object nVar = new AbstractC9165vt0.n(fArrM[0], fArrM[1]);
                if (iB > 0) {
                    nVar = new AbstractC9165vt0.m(fArrM[0], fArrM[1]);
                }
                arrayList.add(nVar);
            }
            return arrayList;
        }
        if (c == 'M') {
            F00 f00P2 = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(f00P2, 10));
            Iterator it2 = f00P2.iterator();
            while (it2.hasNext()) {
                int iB2 = ((A00) it2).b();
                float[] fArrM2 = AbstractC5152hb.m(fArr, iB2, iB2 + 2);
                Object fVar = new AbstractC9165vt0.f(fArrM2[0], fArrM2[1]);
                if (iB2 > 0) {
                    fVar = new AbstractC9165vt0.e(fArrM2[0], fArrM2[1]);
                }
                arrayList2.add(fVar);
            }
            return arrayList2;
        }
        if (c == 'l') {
            F00 f00P3 = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList3 = new ArrayList(AbstractC1703Nm.v(f00P3, 10));
            Iterator it3 = f00P3.iterator();
            while (it3.hasNext()) {
                int iB3 = ((A00) it3).b();
                float[] fArrM3 = AbstractC5152hb.m(fArr, iB3, iB3 + 2);
                arrayList3.add(new AbstractC9165vt0.m(fArrM3[0], fArrM3[1]));
            }
            return arrayList3;
        }
        if (c == 'L') {
            F00 f00P4 = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList4 = new ArrayList(AbstractC1703Nm.v(f00P4, 10));
            Iterator it4 = f00P4.iterator();
            while (it4.hasNext()) {
                int iB4 = ((A00) it4).b();
                float[] fArrM4 = AbstractC5152hb.m(fArr, iB4, iB4 + 2);
                arrayList4.add(new AbstractC9165vt0.e(fArrM4[0], fArrM4[1]));
            }
            return arrayList4;
        }
        if (c == 'h') {
            F00 f00P5 = AbstractC8417tE0.p(new H00(0, fArr.length - 1), 1);
            ArrayList arrayList5 = new ArrayList(AbstractC1703Nm.v(f00P5, 10));
            Iterator it5 = f00P5.iterator();
            while (it5.hasNext()) {
                int iB5 = ((A00) it5).b();
                arrayList5.add(new AbstractC9165vt0.l(AbstractC5152hb.m(fArr, iB5, iB5 + 1)[0]));
            }
            return arrayList5;
        }
        if (c == 'H') {
            F00 f00P6 = AbstractC8417tE0.p(new H00(0, fArr.length - 1), 1);
            ArrayList arrayList6 = new ArrayList(AbstractC1703Nm.v(f00P6, 10));
            Iterator it6 = f00P6.iterator();
            while (it6.hasNext()) {
                int iB6 = ((A00) it6).b();
                arrayList6.add(new AbstractC9165vt0.d(AbstractC5152hb.m(fArr, iB6, iB6 + 1)[0]));
            }
            return arrayList6;
        }
        if (c == 'v') {
            F00 f00P7 = AbstractC8417tE0.p(new H00(0, fArr.length - 1), 1);
            ArrayList arrayList7 = new ArrayList(AbstractC1703Nm.v(f00P7, 10));
            Iterator it7 = f00P7.iterator();
            while (it7.hasNext()) {
                int iB7 = ((A00) it7).b();
                arrayList7.add(new AbstractC9165vt0.r(AbstractC5152hb.m(fArr, iB7, iB7 + 1)[0]));
            }
            return arrayList7;
        }
        if (c == 'V') {
            F00 f00P8 = AbstractC8417tE0.p(new H00(0, fArr.length - 1), 1);
            ArrayList arrayList8 = new ArrayList(AbstractC1703Nm.v(f00P8, 10));
            Iterator it8 = f00P8.iterator();
            while (it8.hasNext()) {
                int iB8 = ((A00) it8).b();
                arrayList8.add(new AbstractC9165vt0.s(AbstractC5152hb.m(fArr, iB8, iB8 + 1)[0]));
            }
            return arrayList8;
        }
        if (c == 'c') {
            F00 f00P9 = AbstractC8417tE0.p(new H00(0, fArr.length - 6), 6);
            ArrayList arrayList9 = new ArrayList(AbstractC1703Nm.v(f00P9, 10));
            Iterator it9 = f00P9.iterator();
            while (it9.hasNext()) {
                int iB9 = ((A00) it9).b();
                float[] fArrM5 = AbstractC5152hb.m(fArr, iB9, iB9 + 6);
                arrayList9.add(new AbstractC9165vt0.k(fArrM5[0], fArrM5[1], fArrM5[2], fArrM5[3], fArrM5[4], fArrM5[5]));
            }
            return arrayList9;
        }
        if (c == 'C') {
            F00 f00P10 = AbstractC8417tE0.p(new H00(0, fArr.length - 6), 6);
            ArrayList arrayList10 = new ArrayList(AbstractC1703Nm.v(f00P10, 10));
            Iterator it10 = f00P10.iterator();
            while (it10.hasNext()) {
                int iB10 = ((A00) it10).b();
                float[] fArrM6 = AbstractC5152hb.m(fArr, iB10, iB10 + 6);
                arrayList10.add(new AbstractC9165vt0.c(fArrM6[0], fArrM6[1], fArrM6[2], fArrM6[3], fArrM6[4], fArrM6[5]));
            }
            return arrayList10;
        }
        if (c == 's') {
            F00 f00P11 = AbstractC8417tE0.p(new H00(0, fArr.length - 4), 4);
            ArrayList arrayList11 = new ArrayList(AbstractC1703Nm.v(f00P11, 10));
            Iterator it11 = f00P11.iterator();
            while (it11.hasNext()) {
                int iB11 = ((A00) it11).b();
                float[] fArrM7 = AbstractC5152hb.m(fArr, iB11, iB11 + 4);
                arrayList11.add(new AbstractC9165vt0.p(fArrM7[0], fArrM7[1], fArrM7[2], fArrM7[3]));
            }
            return arrayList11;
        }
        if (c == 'S') {
            F00 f00P12 = AbstractC8417tE0.p(new H00(0, fArr.length - 4), 4);
            ArrayList arrayList12 = new ArrayList(AbstractC1703Nm.v(f00P12, 10));
            Iterator it12 = f00P12.iterator();
            while (it12.hasNext()) {
                int iB12 = ((A00) it12).b();
                float[] fArrM8 = AbstractC5152hb.m(fArr, iB12, iB12 + 4);
                arrayList12.add(new AbstractC9165vt0.h(fArrM8[0], fArrM8[1], fArrM8[2], fArrM8[3]));
            }
            return arrayList12;
        }
        if (c == 'q') {
            F00 f00P13 = AbstractC8417tE0.p(new H00(0, fArr.length - 4), 4);
            ArrayList arrayList13 = new ArrayList(AbstractC1703Nm.v(f00P13, 10));
            Iterator it13 = f00P13.iterator();
            while (it13.hasNext()) {
                int iB13 = ((A00) it13).b();
                float[] fArrM9 = AbstractC5152hb.m(fArr, iB13, iB13 + 4);
                arrayList13.add(new AbstractC9165vt0.o(fArrM9[0], fArrM9[1], fArrM9[2], fArrM9[3]));
            }
            return arrayList13;
        }
        if (c == 'Q') {
            F00 f00P14 = AbstractC8417tE0.p(new H00(0, fArr.length - 4), 4);
            ArrayList arrayList14 = new ArrayList(AbstractC1703Nm.v(f00P14, 10));
            Iterator it14 = f00P14.iterator();
            while (it14.hasNext()) {
                int iB14 = ((A00) it14).b();
                float[] fArrM10 = AbstractC5152hb.m(fArr, iB14, iB14 + 4);
                arrayList14.add(new AbstractC9165vt0.g(fArrM10[0], fArrM10[1], fArrM10[2], fArrM10[3]));
            }
            return arrayList14;
        }
        if (c == 't') {
            F00 f00P15 = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList15 = new ArrayList(AbstractC1703Nm.v(f00P15, 10));
            Iterator it15 = f00P15.iterator();
            while (it15.hasNext()) {
                int iB15 = ((A00) it15).b();
                float[] fArrM11 = AbstractC5152hb.m(fArr, iB15, iB15 + 2);
                arrayList15.add(new AbstractC9165vt0.q(fArrM11[0], fArrM11[1]));
            }
            return arrayList15;
        }
        if (c == 'T') {
            F00 f00P16 = AbstractC8417tE0.p(new H00(0, fArr.length - 2), 2);
            ArrayList arrayList16 = new ArrayList(AbstractC1703Nm.v(f00P16, 10));
            Iterator it16 = f00P16.iterator();
            while (it16.hasNext()) {
                int iB16 = ((A00) it16).b();
                float[] fArrM12 = AbstractC5152hb.m(fArr, iB16, iB16 + 2);
                arrayList16.add(new AbstractC9165vt0.i(fArrM12[0], fArrM12[1]));
            }
            return arrayList16;
        }
        if (c == 'a') {
            F00 f00P17 = AbstractC8417tE0.p(new H00(0, fArr.length - 7), 7);
            ArrayList arrayList17 = new ArrayList(AbstractC1703Nm.v(f00P17, 10));
            Iterator it17 = f00P17.iterator();
            while (it17.hasNext()) {
                int iB17 = ((A00) it17).b();
                float[] fArrM13 = AbstractC5152hb.m(fArr, iB17, iB17 + 7);
                arrayList17.add(new AbstractC9165vt0.j(fArrM13[0], fArrM13[1], fArrM13[2], Float.compare(fArrM13[3], 0.0f) != 0, Float.compare(fArrM13[4], 0.0f) != 0, fArrM13[5], fArrM13[6]));
            }
            return arrayList17;
        }
        if (c != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c);
        }
        F00 f00P18 = AbstractC8417tE0.p(new H00(0, fArr.length - 7), 7);
        ArrayList arrayList18 = new ArrayList(AbstractC1703Nm.v(f00P18, 10));
        Iterator it18 = f00P18.iterator();
        while (it18.hasNext()) {
            int iB18 = ((A00) it18).b();
            float[] fArrM14 = AbstractC5152hb.m(fArr, iB18, iB18 + 7);
            arrayList18.add(new AbstractC9165vt0.a(fArrM14[0], fArrM14[1], fArrM14[2], Float.compare(fArrM14[3], 0.0f) != 0, Float.compare(fArrM14[4], 0.0f) != 0, fArrM14[5], fArrM14[6]));
        }
        return arrayList18;
    }
}
