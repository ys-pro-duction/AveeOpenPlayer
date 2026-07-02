package com.daaw;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class B8 {
    public static final B8 a = new B8();

    public static final AbstractC4933gn a(Bitmap bitmap) {
        AbstractC4933gn abstractC4933gnB;
        G10.g(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC4933gnB = b(colorSpace)) == null) ? C5490in.a.r() : abstractC4933gnB;
    }

    public static final AbstractC4933gn b(ColorSpace colorSpace) {
        G10.g(colorSpace, "<this>");
        return G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB)) ? C5490in.a.r() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.ACES)) ? C5490in.a.a() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG)) ? C5490in.a.b() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? C5490in.a.c() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020)) ? C5490in.a.d() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.BT709)) ? C5490in.a.e() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? C5490in.a.f() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? C5490in.a.g() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3)) ? C5490in.a.i() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? C5490in.a.j() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? C5490in.a.k() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? C5490in.a.l() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? C5490in.a.m() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? C5490in.a.n() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? C5490in.a.p() : G10.c(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? C5490in.a.q() : C5490in.a.r();
    }

    public static final Bitmap c(int i, int i2, int i3, boolean z, AbstractC4933gn abstractC4933gn) {
        G10.g(abstractC4933gn, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, S5.d(i3), z, d(abstractC4933gn));
        G10.f(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    public static final ColorSpace d(AbstractC4933gn abstractC4933gn) {
        G10.g(abstractC4933gn, "<this>");
        C5490in c5490in = C5490in.a;
        ColorSpace colorSpace = ColorSpace.get(G10.c(abstractC4933gn, c5490in.r()) ? ColorSpace.Named.SRGB : G10.c(abstractC4933gn, c5490in.a()) ? ColorSpace.Named.ACES : G10.c(abstractC4933gn, c5490in.b()) ? ColorSpace.Named.ACESCG : G10.c(abstractC4933gn, c5490in.c()) ? ColorSpace.Named.ADOBE_RGB : G10.c(abstractC4933gn, c5490in.d()) ? ColorSpace.Named.BT2020 : G10.c(abstractC4933gn, c5490in.e()) ? ColorSpace.Named.BT709 : G10.c(abstractC4933gn, c5490in.f()) ? ColorSpace.Named.CIE_LAB : G10.c(abstractC4933gn, c5490in.g()) ? ColorSpace.Named.CIE_XYZ : G10.c(abstractC4933gn, c5490in.i()) ? ColorSpace.Named.DCI_P3 : G10.c(abstractC4933gn, c5490in.j()) ? ColorSpace.Named.DISPLAY_P3 : G10.c(abstractC4933gn, c5490in.k()) ? ColorSpace.Named.EXTENDED_SRGB : G10.c(abstractC4933gn, c5490in.l()) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : G10.c(abstractC4933gn, c5490in.m()) ? ColorSpace.Named.LINEAR_SRGB : G10.c(abstractC4933gn, c5490in.n()) ? ColorSpace.Named.NTSC_1953 : G10.c(abstractC4933gn, c5490in.p()) ? ColorSpace.Named.PRO_PHOTO_RGB : G10.c(abstractC4933gn, c5490in.q()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
        G10.f(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
