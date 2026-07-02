package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1036Hb implements IW {
    public static final JQ h = new a();
    public static final IW i = new b();
    public GX a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: com.daaw.Hb$a */
    public class a implements JQ {
    }

    public C1036Hb(GX gx, boolean z) {
        this.f = 1;
        this.a = gx;
        this.g = z;
        this.b = 0;
        this.c = 0;
        this.d = gx.getWidth();
        this.e = gx.getHeight();
        if (this.a.getHeight() < 1 || this.a.getWidth() < 1) {
            AbstractC0441Bk1.c("texture invalid dimensions");
        }
    }

    @Override // com.daaw.IW
    public void a() {
        GX gx;
        if (!this.g || (gx = this.a) == null) {
            return;
        }
        gx.a();
    }

    @Override // com.daaw.IW
    public float b(float f) {
        return (this.c / this.a.getHeight()) + ((this.e / this.a.getHeight()) * f);
    }

    @Override // com.daaw.IW
    public IW c(float f) {
        return h(this.a, this.b, this.c, this.d, this.e, false);
    }

    @Override // com.daaw.IW
    public GX d() {
        return this.a;
    }

    @Override // com.daaw.IW
    public float e(float f) {
        return (this.b / this.a.getWidth()) + ((this.d / this.a.getWidth()) * f);
    }

    @Override // com.daaw.IW
    public float f() {
        return 0.0f;
    }

    @Override // com.daaw.IW
    public boolean g() {
        return false;
    }

    @Override // com.daaw.IW
    public int getHeight() {
        return this.e;
    }

    @Override // com.daaw.IW
    public int getWidth() {
        return this.d;
    }

    public IW h(GX gx, int i2, int i3, int i4, int i5, boolean z) {
        return new C1036Hb(gx, i2, i3, i4, i5, z);
    }

    public int i() {
        return this.f;
    }

    public C1036Hb(GX gx, int i2, int i3, int i4, int i5, boolean z) {
        this.f = 1;
        this.a = gx;
        this.g = z;
        if (gx.getHeight() < 1 || gx.getWidth() < 1) {
            AbstractC0441Bk1.c("texture invalid dimensions");
        }
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    /* JADX INFO: renamed from: com.daaw.Hb$b */
    public static class b implements IW {
        @Override // com.daaw.IW
        public float b(float f) {
            return 1.0f;
        }

        @Override // com.daaw.IW
        public GX d() {
            return null;
        }

        @Override // com.daaw.IW
        public float e(float f) {
            return 1.0f;
        }

        @Override // com.daaw.IW
        public float f() {
            return 0.0f;
        }

        @Override // com.daaw.IW
        public boolean g() {
            return false;
        }

        @Override // com.daaw.IW
        public int getHeight() {
            return 1;
        }

        @Override // com.daaw.IW
        public int getWidth() {
            return 1;
        }

        @Override // com.daaw.IW
        public void a() {
        }

        @Override // com.daaw.IW
        public IW c(float f) {
            return this;
        }
    }
}
