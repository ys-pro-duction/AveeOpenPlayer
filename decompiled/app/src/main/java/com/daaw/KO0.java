package com.daaw;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public class KO0 implements InterfaceC10173zX, InterfaceC5414iX {
    public float[] a = new float[2];
    public float b = 0.0f;
    public float c = 0.0f;
    public float[] d = new float[2];
    public int e = 11;
    public int f = 8;
    public final float g = 300.0f;
    public final float h = 0.9f;
    public final float i = 0.01f;
    public float j = 1000.0f;
    public float k = 0.0f;
    public float l = 1.0f;
    public EX m = new a();

    public class a implements EX {
        public a() {
        }

        @Override // com.daaw.EX
        public float get(int i) {
            return KO0.this.a[i];
        }

        @Override // com.daaw.EX
        public int size() {
            return KO0.this.a.length;
        }
    }

    @Override // com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        t(c2591Vu.s("inputSize", 11));
        u(c2591Vu.s("sampleOutCountPower", 8));
    }

    @Override // com.daaw.InterfaceC5414iX
    public float c() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC10173zX
    public EX f(int i, int i2, int i3, EX ex) {
        return this.m;
    }

    @Override // com.daaw.InterfaceC5414iX
    public float j() {
        return 0.0f;
    }

    @Override // com.daaw.InterfaceC10173zX
    public void p(InterfaceC9336wX interfaceC9336wX, InterfaceC8635u10 interfaceC8635u10) {
        FX ls0;
        int size;
        int iMin = Math.min(Math.max(1 << this.e, 32), 16384);
        int iMin2 = Math.min(Math.max(1 << this.f, 8), AdRequest.MAX_CONTENT_URL_LENGTH);
        com.daaw.avee.comp.playback.a aVarJ = interfaceC8635u10.j(iMin);
        int i = 4;
        int i2 = 0;
        if (aVarJ != null) {
            ls0 = aVarJ.l();
            size = ls0.size();
            float[] fArr = this.d;
            fArr[0] = 0.0f;
            fArr[1] = aVarJ.e;
            this.b = aVarJ.g;
        } else {
            ls0 = new LS0((short) 0, 4);
            float[] fArr2 = this.d;
            fArr2[0] = 0.0f;
            fArr2[1] = 1000.0f;
            this.b = 0.0f;
            size = 4;
        }
        if (size < 4) {
            ls0 = new LS0((short) 0, 4);
        } else {
            i = size;
        }
        if (this.a.length != iMin2) {
            this.a = new float[iMin2];
        }
        v(this.d);
        float length = i / this.a.length;
        int i3 = 0;
        while (true) {
            float[] fArr3 = this.a;
            if (i3 >= fArr3.length) {
                break;
            }
            fArr3[i3] = fArr3[i3] * 0.4f * 1.0f;
            i3++;
        }
        this.c = 0.0f;
        if (length <= 1.0f) {
            while (i2 < this.a.length) {
                float fD = ls0.get(r5) * GE.d((int) Math.floor(i2 * length), i, 0.8f) * 0.00390625f;
                float f = this.l;
                float f2 = fD * f * 100.0f;
                this.c = Math.max(this.c, f * f2);
                float[] fArr4 = this.a;
                float f3 = fArr4[i2] + f2;
                fArr4[i2] = f3;
                fArr4[i2] = f3 * 0.5f;
                i2++;
            }
            return;
        }
        for (int i4 = 0; i4 < i; i4++) {
            float fD2 = ls0.get(i4) * GE.d(i4, i, 0.8f) * 0.00390625f;
            float f4 = this.l;
            float f5 = fD2 * f4 * 100.0f;
            this.c = Math.max(this.c, f4 * f5);
            int iFloor = (int) Math.floor(i4 / length);
            float[] fArr5 = this.a;
            if (iFloor < fArr5.length) {
                fArr5[iFloor] = fArr5[iFloor] + f5;
            }
        }
        while (true) {
            float[] fArr6 = this.a;
            if (i2 >= fArr6.length) {
                return;
            }
            fArr6[i2] = fArr6[i2] / length;
            i2++;
        }
    }

    @Override // com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        c2591Vu.Y("inputSize", this.e, "Performance", 5, 13);
        c2591Vu.Y("sampleOutCountPower", this.f, "Waveform", 3, 9);
    }

    public void t(int i) {
        this.e = i;
    }

    public void u(int i) {
        this.f = i;
    }

    public final void v(float[] fArr) {
        float f = (this.k * 0.100000024f) + (fArr[0] * 0.9f);
        this.k = f;
        float f2 = fArr[1];
        float f3 = this.j;
        if (f2 > f3) {
            this.j = (f3 * 0.100000024f) + (f2 * 0.9f);
        } else {
            this.j = (f3 * 0.99f) + (f2 * 0.01f);
        }
        float f4 = this.j - f;
        this.l = f4;
        if (f4 < 1.0f) {
            this.l = 1.0f;
        }
        this.l = 300.0f / this.l;
    }
}
