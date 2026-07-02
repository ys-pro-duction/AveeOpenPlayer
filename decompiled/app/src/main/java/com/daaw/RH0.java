package com.daaw;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RH0 {
    public int a;
    public GX[] b;
    public C4312ec1 c;
    public InterfaceC6129l2 d;
    public IW e;
    public int f;
    public boolean[] g;

    public RH0(int i, IW iw, C4312ec1 c4312ec1, InterfaceC6129l2 interfaceC6129l2) {
        this(i, iw, c4312ec1, interfaceC6129l2, 1);
    }

    public void a(RH0 rh0) {
        this.a = rh0.a;
        this.c = rh0.c;
        this.d = rh0.d;
        int i = 0;
        int i2 = 0;
        while (true) {
            GX[] gxArr = this.b;
            if (i2 >= gxArr.length) {
                break;
            }
            gxArr[i2] = rh0.b[i2];
            i2++;
        }
        this.f = rh0.f;
        while (true) {
            boolean[] zArr = this.g;
            if (i >= zArr.length) {
                this.e = rh0.e;
                return;
            } else {
                zArr[i] = rh0.g[i];
                i++;
            }
        }
    }

    public boolean b(RH0 rh0) {
        if (rh0.a != this.a || rh0.f != this.f || !AbstractC0405Bb1.g(rh0.c, this.c) || !AbstractC0405Bb1.g(rh0.d, this.d)) {
            return false;
        }
        int i = 0;
        while (true) {
            GX[] gxArr = this.b;
            if (i >= gxArr.length) {
                return true;
            }
            if (!AbstractC0405Bb1.g(gxArr[i], rh0.b[i])) {
                return false;
            }
            i++;
        }
    }

    public GX c(int i) {
        return this.b[i];
    }

    public int d() {
        return this.b.length;
    }

    public boolean e(int i) {
        return this.g[i];
    }

    public IW f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public void h() {
        this.d = null;
        this.c = null;
        this.a = 0;
        int i = 0;
        while (true) {
            GX[] gxArr = this.b;
            if (i >= gxArr.length) {
                break;
            }
            gxArr[i] = null;
            i++;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.g;
            if (i2 >= zArr.length) {
                this.e = C1036Hb.i;
                this.f = 2;
                return;
            } else {
                zArr[i2] = false;
                i2++;
            }
        }
    }

    public float i(float f) {
        return this.e.e(f);
    }

    public float j(float f) {
        return this.e.b(f);
    }

    public float k() {
        return this.e.f();
    }

    public RH0(int i, IW iw, C4312ec1 c4312ec1, InterfaceC6129l2 interfaceC6129l2, int i2) {
        GX[] gxArr = {null, null};
        this.b = gxArr;
        this.g = new boolean[]{false, false};
        this.a = i;
        gxArr[0] = iw != null ? iw.d() : null;
        this.b[1] = null;
        this.c = c4312ec1;
        this.d = interfaceC6129l2;
        this.f = i2;
        this.g[0] = iw != null && iw.g();
        boolean[] zArr = this.g;
        zArr[1] = zArr[0];
        this.e = iw == null ? C1036Hb.i : iw;
    }

    public RH0(int i, IW[] iwArr, C4312ec1 c4312ec1, InterfaceC6129l2 interfaceC6129l2) {
        this(i, iwArr, c4312ec1, interfaceC6129l2, 1);
    }

    public RH0(int i, IW[] iwArr, C4312ec1 c4312ec1, InterfaceC6129l2 interfaceC6129l2, int i2) {
        this.b = new GX[]{null, null};
        boolean[] zArr = {false, false};
        this.g = zArr;
        this.a = i;
        this.c = c4312ec1;
        this.d = interfaceC6129l2;
        this.f = i2;
        IW iw = iwArr[0];
        zArr[0] = iw != null && iw.g();
        boolean[] zArr2 = this.g;
        IW iw2 = iwArr[1];
        zArr2[1] = iw2 != null && iw2.g();
        ArrayList arrayList = new ArrayList();
        for (IW iw3 : iwArr) {
            if (iw3 != null) {
                arrayList.add(iw3.d());
            } else {
                arrayList.add(null);
            }
        }
        this.b = (GX[]) arrayList.toArray(new GX[0]);
        IW iw4 = iwArr[0];
        this.e = iw4 == null ? C1036Hb.i : iw4;
    }

    public RH0() {
        this.b = new GX[]{null, null};
        this.g = new boolean[]{false, false};
        h();
    }
}
