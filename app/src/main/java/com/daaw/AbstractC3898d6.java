package com.daaw;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import com.daaw.GY0;
import com.daaw.IY0;

/* JADX INFO: renamed from: com.daaw.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3898d6 {

    /* JADX INFO: renamed from: com.daaw.d6$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            iArr[Paint.Style.STROKE.ordinal()] = 1;
            a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            iArr3[Paint.Join.MITER.ordinal()] = 1;
            iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[Paint.Join.ROUND.ordinal()] = 3;
            c = iArr3;
        }
    }

    public static final InterfaceC8595ts0 a() {
        return new C3619c6();
    }

    public static final float b(Paint paint) {
        G10.g(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final long c(Paint paint) {
        G10.g(paint, "<this>");
        return AbstractC3530bn.b(paint.getColor());
    }

    public static final int d(Paint paint) {
        G10.g(paint, "<this>");
        return !paint.isFilterBitmap() ? AbstractC3405bL.a.b() : AbstractC3405bL.a.a();
    }

    public static final int e(Paint paint) {
        G10.g(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : a.b[strokeCap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? GY0.b.a() : GY0.b.c() : GY0.b.b() : GY0.b.a();
    }

    public static final int f(Paint paint) {
        G10.g(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : a.c[strokeJoin.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? IY0.b.b() : IY0.b.c() : IY0.b.a() : IY0.b.b();
    }

    public static final float g(Paint paint) {
        G10.g(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float h(Paint paint) {
        G10.g(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint i() {
        return new Paint(7);
    }

    public static final void j(Paint paint, float f) {
        G10.g(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void k(Paint paint, int i) {
        G10.g(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C6320lj1.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(Z4.b(i)));
        }
    }

    public static final void l(Paint paint, long j) {
        G10.g(paint, "$this$setNativeColor");
        paint.setColor(AbstractC3530bn.i(j));
    }

    public static final void m(Paint paint, C2871Ym c2871Ym) {
        G10.g(paint, "<this>");
        paint.setColorFilter(c2871Ym != null ? AbstractC4739g5.b(c2871Ym) : null);
    }

    public static final void n(Paint paint, int i) {
        G10.g(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!AbstractC3405bL.d(i, AbstractC3405bL.a.b()));
    }

    public static final void o(Paint paint, InterfaceC6927nt0 interfaceC6927nt0) {
        G10.g(paint, "<this>");
        AbstractC6314li0.a(interfaceC6927nt0);
        paint.setPathEffect(null);
    }

    public static final void p(Paint paint, Shader shader) {
        G10.g(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void q(Paint paint, int i) {
        G10.g(paint, "$this$setNativeStrokeCap");
        GY0.a aVar = GY0.b;
        paint.setStrokeCap(GY0.g(i, aVar.c()) ? Paint.Cap.SQUARE : GY0.g(i, aVar.b()) ? Paint.Cap.ROUND : GY0.g(i, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void r(Paint paint, int i) {
        G10.g(paint, "$this$setNativeStrokeJoin");
        IY0.a aVar = IY0.b;
        paint.setStrokeJoin(IY0.g(i, aVar.b()) ? Paint.Join.MITER : IY0.g(i, aVar.a()) ? Paint.Join.BEVEL : IY0.g(i, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void s(Paint paint, float f) {
        G10.g(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void t(Paint paint, float f) {
        G10.g(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public static final void u(Paint paint, int i) {
        G10.g(paint, "$this$setNativeStyle");
        paint.setStyle(AbstractC0472Bs0.d(i, AbstractC0472Bs0.a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
