package com.daaw;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class WO0 implements AX {
    public float g;
    public String[] i;
    public boolean j;
    public float a = 1.0f;
    public C1477Lh0 b = new C1477Lh0("{ArtistOrTitle}", 1.0f, 1.0f);
    public RectF c = new RectF();
    public C1458Lc1 d = new C1458Lc1(0.0f, 0.0f);
    public C9398wk e = C9398wk.d();
    public a[] f = new a[0];
    public int h = 0;

    public class a {
        public C1458Lc1[] c;
        public C1458Lc1[] d;
        public float g;
        public List a = new ArrayList();
        public List b = new ArrayList();
        public C1458Lc1 e = new C1458Lc1(10000.0f, 10000.0f);
        public C1458Lc1 f = new C1458Lc1(-10000.0f, -10000.0f);

        public a(int i) {
            this.c = new C1458Lc1[i];
            this.d = new C1458Lc1[i];
        }

        public void a() {
            this.b = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                this.b.add(Integer.valueOf(c(((Integer) this.a.get(i)).intValue())));
            }
            C1458Lc1[] c1458Lc1Arr = this.d;
            if (c1458Lc1Arr.length > 0) {
                if (Float.isNaN(c1458Lc1Arr[0].a) || this.d[0].k() < 1.0E-5f) {
                    int iB = b(0);
                    C1458Lc1[] c1458Lc1Arr2 = this.d;
                    C1458Lc1 c1458Lc1 = c1458Lc1Arr2[0];
                    C1458Lc1 c1458Lc12 = c1458Lc1Arr2[iB];
                    c1458Lc1.a = c1458Lc12.a;
                    c1458Lc1.b = c1458Lc12.b;
                }
            }
        }

        public int b(int i) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                if (((Integer) this.a.get(i2)).intValue() == i) {
                    return ((Integer) this.b.get(i2)).intValue();
                }
            }
            return ((i + r0.length) - 1) % this.c.length;
        }

        public int c(int i) {
            int length;
            int i2 = 0;
            while (true) {
                if (i2 >= this.a.size() - 1) {
                    length = this.c.length;
                    break;
                }
                if (((Integer) this.a.get(i2)).intValue() == i) {
                    length = ((Integer) this.a.get(i2 + 1)).intValue();
                    break;
                }
                i2++;
            }
            return length - 1;
        }

        public float d() {
            return this.g;
        }
    }

    public WO0(String[] strArr, boolean z) {
        this.i = strArr;
        this.j = z;
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        this.a = c2591Vu.p("radius", this.a);
    }

    public final void c(C9398wk c9398wk, String[] strArr, int i) {
        if (this.j) {
            j(c9398wk, strArr, i);
        } else {
            s(c9398wk, strArr, i);
        }
    }

    @Override // com.daaw.AX
    public void d(InterfaceC9336wX interfaceC9336wX) {
        String strK = this.b.k(interfaceC9336wX.b().a());
        this.h = this.e.n((strK == null || strK.length() < 1) ? 'X' : strK.charAt(0));
    }

    @Override // com.daaw.AX
    public int e(boolean z, int i, int i2, RectF rectF, float f, PointF pointF, PointF pointF2) {
        a[] aVarArr = this.f;
        if (aVarArr.length == 0 || aVarArr[0].c.length != i2) {
            c(this.e, this.i, i2);
        }
        int i3 = this.h;
        a[] aVarArr2 = this.f;
        a aVar = i3 < aVarArr2.length ? aVarArr2[i3] : aVarArr2[0];
        if (aVar != null) {
            C1458Lc1[] c1458Lc1Arr = aVar.c;
            if (c1458Lc1Arr.length != 0) {
                C1458Lc1 c1458Lc1 = c1458Lc1Arr[i];
                C1458Lc1 c1458Lc12 = aVar.d[i];
                RectF rectF2 = this.c;
                C1458Lc1 c1458Lc13 = aVar.e;
                rectF2.left = c1458Lc13.a;
                rectF2.top = c1458Lc13.b;
                C1458Lc1 c1458Lc14 = aVar.f;
                rectF2.right = c1458Lc14.a;
                rectF2.bottom = c1458Lc14.b;
                C1458Lc1 c1458Lc15 = this.d;
                c1458Lc15.a = c1458Lc12.b;
                c1458Lc15.b = -c1458Lc12.a;
                if (rectF2.width() > this.c.height()) {
                    pointF.x = (c1458Lc1.a - this.c.centerX()) / this.c.width();
                    pointF.y = (c1458Lc1.b - this.c.centerY()) / this.c.width();
                } else {
                    pointF.x = (c1458Lc1.a - this.c.centerX()) / this.c.height();
                    pointF.y = (c1458Lc1.b - this.c.centerY()) / this.c.height();
                }
                float fWidth = (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
                pointF.x = rectF.centerX() + (pointF.x * fWidth);
                pointF.y = rectF.centerY() + (pointF.y * fWidth);
                C1458Lc1 c1458Lc16 = this.d;
                pointF2.x = -c1458Lc16.a;
                pointF2.y = -c1458Lc16.b;
                return aVar.b(i);
            }
        }
        pointF2.x = 1.0f;
        pointF2.y = 0.0f;
        pointF.x = rectF.centerX();
        pointF.y = rectF.centerY();
        return -1;
    }

    @Override // com.daaw.AX
    public int i(RectF rectF) {
        return 2;
    }

    public final void j(C9398wk c9398wk, String[] strArr, int i) {
        String[] strArr2 = strArr;
        int i2 = 1;
        if (c9398wk.a() != strArr2.length) {
            AbstractC0441Bk1.c("charSet count don't match");
        }
        this.f = new a[Math.min(c9398wk.a(), strArr2.length)];
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.f.length) {
            this.g = f;
            arrayList.clear();
            List listC = AbstractC9851yM0.c(strArr2[i4]);
            if (listC.size() <= 0) {
                a aVar = new a(i3);
                aVar.a();
                this.f[i4] = aVar;
            } else {
                int i5 = 0;
                do {
                    float fA = ((MO0) listC.get(i5)).a();
                    arrayList.add(Float.valueOf(fA));
                    this.g += fA;
                    i5 += i2;
                } while (i5 < listC.size());
                a aVar2 = new a(i);
                float f2 = this.g / i;
                aVar2.a.add(Integer.valueOf(i3));
                int i6 = 0;
                int i7 = 0;
                float f3 = 0.0f;
                while (true) {
                    if (i6 >= i) {
                        break;
                    }
                    float f4 = i6 * f2;
                    float fA2 = f3 + ((MO0) listC.get(i7)).a();
                    if (f4 > fA2) {
                        i7++;
                        if (i7 >= listC.size()) {
                            AbstractC0441Bk1.c("could get all points on path");
                            break;
                        } else {
                            aVar2.a.add(Integer.valueOf(i6));
                            f3 = fA2;
                        }
                    } else {
                        ((MO0) listC.get(i7)).b(f4 - f3, fArr, fArr2);
                        aVar2.g = this.g;
                        aVar2.c[i6] = new C1458Lc1(fArr[0], fArr[1]);
                        aVar2.d[i6] = new C1458Lc1(fArr2[0], fArr2[1]);
                        aVar2.d[i6].o();
                        C1458Lc1 c1458Lc1 = aVar2.e;
                        float f5 = c1458Lc1.a;
                        C1458Lc1 c1458Lc12 = aVar2.c[i6];
                        float f6 = c1458Lc12.a;
                        if (f5 > f6) {
                            c1458Lc1.a = f6;
                        }
                        float f7 = c1458Lc1.b;
                        float f8 = c1458Lc12.b;
                        if (f7 > f8) {
                            c1458Lc1.b = f8;
                        }
                        C1458Lc1 c1458Lc13 = aVar2.f;
                        float f9 = c1458Lc13.a;
                        float f10 = c1458Lc12.a;
                        if (f9 < f10) {
                            c1458Lc13.a = f10;
                        }
                        float f11 = c1458Lc13.b;
                        float f12 = c1458Lc12.b;
                        if (f11 < f12) {
                            c1458Lc13.b = f12;
                        }
                        i6++;
                    }
                }
                aVar2.a();
                this.f[i4] = aVar2;
            }
            i4++;
            strArr2 = strArr;
            i2 = 1;
            f = 0.0f;
            i3 = 0;
        }
    }

    @Override // com.daaw.AX
    public float k(RectF rectF, int i) {
        a[] aVarArr = this.f;
        if (aVarArr.length == 0 || aVarArr[0].c.length != i) {
            c(this.e, this.i, i);
        }
        int i2 = this.h;
        a[] aVarArr2 = this.f;
        a aVar = i2 < aVarArr2.length ? aVarArr2[i2] : null;
        if (aVar == null) {
            return 1.0f;
        }
        RectF rectF2 = this.c;
        C1458Lc1 c1458Lc1 = aVar.e;
        rectF2.left = c1458Lc1.a;
        rectF2.top = c1458Lc1.b;
        C1458Lc1 c1458Lc12 = aVar.f;
        rectF2.right = c1458Lc12.a;
        rectF2.bottom = c1458Lc12.b;
        return (aVar.d() / (this.c.width() > this.c.height() ? this.c.width() : this.c.height())) * (rectF.width() < rectF.height() ? rectF.width() : rectF.height()) * 0.5f * this.a;
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.Q("radius", this.a, "misc", 0.1f, 3.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.graphics.PathMeasure] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void s(C9398wk c9398wk, String[] strArr, int i) {
        if (c9398wk.a() != strArr.length) {
            AbstractC0441Bk1.c("charSet count don't match");
        }
        this.f = new a[Math.min(c9398wk.a(), strArr.length)];
        ?? pathMeasure = new PathMeasure();
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        float[] fArr = {0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f};
        ?? r9 = 0;
        int i2 = 0;
        while (i2 < this.f.length) {
            this.g = f;
            arrayList.clear();
            Path pathD = AbstractC10130zM0.d(strArr[i2]);
            pathMeasure.setPath(pathD, r9);
            do {
                float length = pathMeasure.getLength();
                arrayList.add(Float.valueOf(length));
                this.g += length;
            } while (pathMeasure.nextContour());
            a aVar = new a(i);
            pathMeasure.setPath(pathD, r9);
            float f2 = this.g / i;
            aVar.a.add(Integer.valueOf((int) r9));
            int i3 = 0;
            float f3 = 0.0f;
            while (true) {
                if (i3 >= i) {
                    break;
                }
                float f4 = i3 * f2;
                float length2 = f3 + pathMeasure.getLength();
                if (f4 <= length2) {
                    pathMeasure.getPosTan(f4 - f3, fArr, fArr2);
                    aVar.g = this.g;
                    aVar.c[i3] = new C1458Lc1(fArr[r9 == true ? 1 : 0], fArr[1]);
                    aVar.d[i3] = new C1458Lc1(fArr2[0], fArr2[1]);
                    aVar.d[i3].o();
                    C1458Lc1 c1458Lc1 = aVar.e;
                    float f5 = c1458Lc1.a;
                    C1458Lc1 c1458Lc12 = aVar.c[i3];
                    float f6 = c1458Lc12.a;
                    if (f5 > f6) {
                        c1458Lc1.a = f6;
                    }
                    float f7 = c1458Lc1.b;
                    float f8 = c1458Lc12.b;
                    if (f7 > f8) {
                        c1458Lc1.b = f8;
                    }
                    C1458Lc1 c1458Lc13 = aVar.f;
                    float f9 = c1458Lc13.a;
                    float f10 = c1458Lc12.a;
                    if (f9 < f10) {
                        c1458Lc13.a = f10;
                    }
                    float f11 = c1458Lc13.b;
                    float f12 = c1458Lc12.b;
                    if (f11 < f12) {
                        c1458Lc13.b = f12;
                    }
                    i3++;
                    r9 = 0;
                } else if (!pathMeasure.nextContour()) {
                    AbstractC0441Bk1.c("could get all points on path");
                    break;
                } else {
                    aVar.a.add(Integer.valueOf(i3));
                    f3 = length2;
                }
            }
            aVar.a();
            this.f[i2] = aVar;
            i2++;
            f = 0.0f;
            r9 = 0;
        }
    }
}
