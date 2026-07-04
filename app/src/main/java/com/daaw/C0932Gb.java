package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0932Gb extends AbstractC1140Ib {
    public C0932Gb(GX[] gxArr, boolean z) {
        super(gxArr, z);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float b(float f) {
        return super.b(1.0f - f);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float e(float f) {
        return super.e(f);
    }

    @Override // com.daaw.AbstractC1140Ib, com.daaw.C1036Hb, com.daaw.IW
    public boolean g() {
        return true;
    }

    @Override // com.daaw.C1036Hb
    public IW h(GX gx, int i, int i2, int i3, int i4, boolean z) {
        return new C0828Fb(gx, i, i2, i3, i4, z);
    }
}
