package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1249Jc0 extends C1036Hb {
    public float j;

    public C1249Jc0(GX gx, boolean z) {
        super(gx, z);
        this.j = 0.0f;
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float b(float f) {
        float f2 = this.j;
        if (f2 > 0.5f) {
            f2 = 0.5f - (f2 - 0.5f);
        }
        float f3 = f2 * 0.8f;
        return super.b((f * 0.2f) + f3 + f3);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public float e(float f) {
        return super.e(f);
    }

    @Override // com.daaw.C1036Hb
    public int i() {
        return 100;
    }

    public void j(float f) {
        this.j = (this.j + (f * 0.9f)) % 1.0f;
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public IW c(float f) {
        return this;
    }
}
