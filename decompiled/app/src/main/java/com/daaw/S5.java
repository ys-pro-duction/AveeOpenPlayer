package com.daaw;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import com.daaw.AbstractC5698jY;

/* JADX INFO: loaded from: classes.dex */
public abstract class S5 {
    public static final InterfaceC5418iY a(int i, int i2, int i3, boolean z, AbstractC4933gn abstractC4933gn) {
        Bitmap bitmapCreateBitmap;
        G10.g(abstractC4933gn, "colorSpace");
        Bitmap.Config configD = d(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = B8.c(i, i2, i3, z, abstractC4933gn);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configD);
            G10.f(bitmapCreateBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            bitmapCreateBitmap.setHasAlpha(z);
        }
        return new P5(bitmapCreateBitmap);
    }

    public static final Bitmap b(InterfaceC5418iY interfaceC5418iY) {
        G10.g(interfaceC5418iY, "<this>");
        if (interfaceC5418iY instanceof P5) {
            return ((P5) interfaceC5418iY).b();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final InterfaceC5418iY c(Bitmap bitmap) {
        G10.g(bitmap, "<this>");
        return new P5(bitmap);
    }

    public static final Bitmap.Config d(int i) {
        AbstractC5698jY.a aVar = AbstractC5698jY.a;
        if (AbstractC5698jY.g(i, aVar.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (AbstractC5698jY.g(i, aVar.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (AbstractC5698jY.g(i, aVar.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || !AbstractC5698jY.g(i, aVar.c())) ? (i2 < 26 || !AbstractC5698jY.g(i, aVar.d())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }
}
