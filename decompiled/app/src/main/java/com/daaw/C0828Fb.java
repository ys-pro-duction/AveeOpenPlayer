package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0828Fb extends C1036Hb {
    public C0828Fb(GX gx, boolean z) {
        super(gx, z);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float b(float f) {
        return super.b(1.0f - f);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float e(float f) {
        return super.e(f);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public boolean g() {
        return true;
    }

    @Override // com.daaw.C1036Hb
    public IW h(GX gx, int i, int i2, int i3, int i4, boolean z) {
        return new C0828Fb(gx, i, i2, i3, i4, z);
    }

    public C0828Fb(GX gx, int i, int i2, int i3, int i4, boolean z) {
        super(gx, i, i2, i3, i4, z);
    }
}
