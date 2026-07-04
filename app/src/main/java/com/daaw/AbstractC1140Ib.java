package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1140Ib extends C1036Hb {
    public IW[] j;
    public GX[] k;
    public int l;

    public AbstractC1140Ib(GX[] gxArr, boolean z) {
        super(gxArr.length > 0 ? gxArr[0] : null, z);
        l(gxArr);
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public void a() {
        int i = 0;
        if (this.g) {
            int i2 = 0;
            while (true) {
                GX[] gxArr = this.k;
                if (i2 >= gxArr.length) {
                    break;
                }
                GX gx = gxArr[i2];
                if (gx != null) {
                    gx.a();
                }
                this.k[i2] = null;
                i2++;
            }
        }
        while (true) {
            IW[] iwArr = this.j;
            if (i >= iwArr.length) {
                return;
            }
            IW iw = iwArr[i];
            if (iw != null) {
                iw.a();
            }
            this.j[i] = null;
            i++;
        }
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public IW c(float f) {
        int iMin = Math.min(((int) (r0.length * f)) % this.k.length, this.l);
        if (iMin < 0) {
            return null;
        }
        return this.j[iMin];
    }

    @Override // com.daaw.C1036Hb, com.daaw.IW
    public abstract boolean g();

    @Override // com.daaw.C1036Hb
    public int i() {
        return this.k.length;
    }

    public GX j(int i) {
        return this.k[i];
    }

    public void k(int i, GX gx) {
        this.k[i] = gx;
        m(i);
    }

    public final void l(GX[] gxArr) {
        this.l = -1;
        this.k = gxArr;
        this.j = new IW[gxArr.length];
        for (int i = 0; i < gxArr.length; i++) {
            if (this.k[i] != null) {
                this.l = i;
            }
            this.j[i] = new a(this, i);
        }
    }

    public void m(int i) {
        this.l = Math.min(i, this.k.length - 1);
    }

    /* JADX INFO: renamed from: com.daaw.Ib$a */
    public static class a implements IW {
        public final AbstractC1140Ib a;
        public final int b;

        public a(AbstractC1140Ib abstractC1140Ib, int i) {
            this.a = abstractC1140Ib;
            this.b = i;
        }

        @Override // com.daaw.IW
        public float b(float f) {
            return this.a.b(f);
        }

        @Override // com.daaw.IW
        public IW c(float f) {
            return this.a.c(f);
        }

        @Override // com.daaw.IW
        public GX d() {
            return this.a.j(this.b);
        }

        @Override // com.daaw.IW
        public float e(float f) {
            return this.a.e(f);
        }

        @Override // com.daaw.IW
        public float f() {
            return this.a.f();
        }

        @Override // com.daaw.IW
        public boolean g() {
            return this.a.g();
        }

        @Override // com.daaw.IW
        public int getHeight() {
            return this.a.getHeight();
        }

        @Override // com.daaw.IW
        public int getWidth() {
            return this.a.getWidth();
        }

        @Override // com.daaw.IW
        public void a() {
        }
    }
}
