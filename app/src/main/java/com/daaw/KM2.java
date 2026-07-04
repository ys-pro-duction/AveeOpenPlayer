package com.daaw;

import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
public final class KM2 extends AbstractC4251eN2 {
    public IBinder a;
    public String b;
    public int c;
    public float d;
    public int e;
    public String f;
    public byte g;

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 a(String str) {
        this.f = str;
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 b(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 c(int i) {
        this.g = (byte) (this.g | 8);
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 d(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 e(float f) {
        this.d = f;
        this.g = (byte) (this.g | 4);
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 f(boolean z) {
        this.g = (byte) (this.g | 1);
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 g(IBinder iBinder) {
        if (iBinder == null) {
            throw new NullPointerException("Null windowToken");
        }
        this.a = iBinder;
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC4251eN2 h(int i) {
        this.e = i;
        this.g = (byte) (this.g | 16);
        return this;
    }

    @Override // com.daaw.AbstractC4251eN2
    public final AbstractC5377iN2 i() {
        IBinder iBinder;
        if (this.g == 31 && (iBinder = this.a) != null) {
            return new MM2(iBinder, false, this.b, this.c, this.d, 0, null, this.e, null, this.f, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" windowToken");
        }
        if ((this.g & 1) == 0) {
            sb.append(" stableSessionToken");
        }
        if ((this.g & 2) == 0) {
            sb.append(" layoutGravity");
        }
        if ((this.g & 4) == 0) {
            sb.append(" layoutVerticalMargin");
        }
        if ((this.g & 8) == 0) {
            sb.append(" displayMode");
        }
        if ((this.g & 16) == 0) {
            sb.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
