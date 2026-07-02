package com.daaw;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.jc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5718jc1 extends AbstractC3328b31 {
    public C6102kw d;

    public C5718jc1(int i, int i2, int i3, int i4, boolean z) {
        this.d = new C6102kw();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.a = iArr[0];
        this.b = Math.min(i, 4096);
        this.c = Math.min(i2, 4096);
        c();
        f(i3);
        i(i4);
        j(6408, null);
        if (z && AbstractC0405Bb1.c(i) && AbstractC0405Bb1.c(i2)) {
            GLES20.glGenerateMipmap(e());
        }
    }

    public static int[] n(int i, int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, i);
        return iArr;
    }

    public void finalize() throws Throwable {
        super.finalize();
        this.d.a(new KQ() { // from class: com.daaw.ic1
            @Override // com.daaw.KQ
            public final Object a() {
                return this.a.o();
            }
        });
    }

    public C5718jc1 m() {
        if (k()) {
            return this;
        }
        a();
        AbstractC0441Bk1.c("Texture is not valid");
        return null;
    }

    public final /* synthetic */ Boolean o() {
        return Boolean.valueOf(!k());
    }

    public void p(int i, Bitmap bitmap) {
        c();
        h();
        GLUtils.texImage2D(e(), 0, bitmap, 0);
    }

    public C5718jc1(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this(Bitmap.createBitmap(n(i, i2 * i3), 0, i2, i2, i3, Bitmap.Config.ARGB_8888), i4, i5, i6, z);
    }

    public C5718jc1(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        this(bitmap, i, i2, i3, z, 0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public C5718jc1(Bitmap bitmap, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        Bitmap.Config config;
        this.d = new C6102kw();
        this.b = i6;
        this.c = i7;
        GLES20.glEnable(e());
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.a = iArr[0];
        c();
        g(i, i2);
        i(i3);
        if (bitmap != null) {
            Bitmap.Config config2 = bitmap.getConfig();
            if (config2 != Bitmap.Config.ARGB_4444 && config2 != (config = Bitmap.Config.ARGB_8888) && config2 != Bitmap.Config.RGB_565) {
                int[] iArrN = n(-32768, this.b * this.c);
                int i8 = this.b;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArrN, 0, i8, i8, this.c, config);
                p(6408, bitmapCreateBitmap);
                bitmapCreateBitmap.recycle();
            } else {
                p(6408, bitmap);
            }
        }
        if (z && AbstractC0405Bb1.c(this.b) && AbstractC0405Bb1.c(this.c)) {
            GLES20.glGenerateMipmap(e());
        }
    }
}
