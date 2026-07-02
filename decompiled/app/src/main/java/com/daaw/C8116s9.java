package com.daaw;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.daaw.TI0;

/* JADX INFO: renamed from: com.daaw.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8116s9 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static C8116s9 c;
    public TI0 a;

    /* JADX INFO: renamed from: com.daaw.s9$a */
    public class a implements TI0.f {
        public final int[] a = {AbstractC4209eD0.R, AbstractC4209eD0.P, AbstractC4209eD0.a};
        public final int[] b = {AbstractC4209eD0.o, AbstractC4209eD0.B, AbstractC4209eD0.t, AbstractC4209eD0.p, AbstractC4209eD0.q, AbstractC4209eD0.s, AbstractC4209eD0.r};
        public final int[] c = {AbstractC4209eD0.O, AbstractC4209eD0.Q, AbstractC4209eD0.k, AbstractC4209eD0.K, AbstractC4209eD0.L, AbstractC4209eD0.M, AbstractC4209eD0.N};
        public final int[] d = {AbstractC4209eD0.w, AbstractC4209eD0.i, AbstractC4209eD0.v};
        public final int[] e = {AbstractC4209eD0.J, AbstractC4209eD0.S};
        public final int[] f = {AbstractC4209eD0.c, AbstractC4209eD0.g, AbstractC4209eD0.d, AbstractC4209eD0.h};

        @Override // com.daaw.TI0.f
        public Drawable a(TI0 ti0, Context context, int i) {
            if (i == AbstractC4209eD0.j) {
                return new LayerDrawable(new Drawable[]{ti0.j(context, AbstractC4209eD0.i), ti0.j(context, AbstractC4209eD0.k)});
            }
            if (i == AbstractC4209eD0.y) {
                return l(ti0, context, ZC0.c);
            }
            if (i == AbstractC4209eD0.x) {
                return l(ti0, context, ZC0.d);
            }
            if (i == AbstractC4209eD0.z) {
                return l(ti0, context, ZC0.e);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[RETURN] */
        @Override // com.daaw.TI0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = com.daaw.C8116s9.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = com.daaw.KC0.u
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = com.daaw.KC0.s
                goto L11
            L20:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = com.daaw.AbstractC4209eD0.u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = com.daaw.AbstractC4209eD0.l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L67
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = com.daaw.AbstractC4163e31.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = com.daaw.C8116s9.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L66
                r9.setAlpha(r0)
            L66:
                return r2
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8116s9.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // com.daaw.TI0.f
        public PorterDuff.Mode c(int i) {
            if (i == AbstractC4209eD0.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // com.daaw.TI0.f
        public ColorStateList d(Context context, int i) {
            if (i == AbstractC4209eD0.m) {
                return G9.a(context, SC0.e);
            }
            if (i == AbstractC4209eD0.I) {
                return G9.a(context, SC0.h);
            }
            if (i == AbstractC4209eD0.H) {
                return k(context);
            }
            if (i == AbstractC4209eD0.f) {
                return j(context);
            }
            if (i == AbstractC4209eD0.b) {
                return g(context);
            }
            if (i == AbstractC4209eD0.e) {
                return i(context);
            }
            if (i == AbstractC4209eD0.D || i == AbstractC4209eD0.E) {
                return G9.a(context, SC0.g);
            }
            if (f(this.b, i)) {
                return AbstractC4163e31.e(context, KC0.u);
            }
            if (f(this.e, i)) {
                return G9.a(context, SC0.d);
            }
            if (f(this.f, i)) {
                return G9.a(context, SC0.c);
            }
            if (i == AbstractC4209eD0.A) {
                return G9.a(context, SC0.f);
            }
            return null;
        }

        @Override // com.daaw.TI0.f
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == AbstractC4209eD0.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), AbstractC4163e31.c(context, KC0.u), C8116s9.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC4163e31.c(context, KC0.u), C8116s9.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC4163e31.c(context, KC0.s), C8116s9.b);
                return true;
            }
            if (i != AbstractC4209eD0.y && i != AbstractC4209eD0.x && i != AbstractC4209eD0.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC4163e31.b(context, KC0.u), C8116s9.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), AbstractC4163e31.c(context, KC0.s), C8116s9.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC4163e31.c(context, KC0.s), C8116s9.b);
            return true;
        }

        public final boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i) {
            int iC = AbstractC4163e31.c(context, KC0.t);
            return new ColorStateList(new int[][]{AbstractC4163e31.b, AbstractC4163e31.e, AbstractC4163e31.c, AbstractC4163e31.i}, new int[]{AbstractC4163e31.b(context, KC0.r), AbstractC6338ln.j(iC, i), AbstractC6338ln.j(iC, i), i});
        }

        public final ColorStateList i(Context context) {
            return h(context, AbstractC4163e31.c(context, KC0.q));
        }

        public final ColorStateList j(Context context) {
            return h(context, AbstractC4163e31.c(context, KC0.r));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = AbstractC4163e31.e(context, KC0.w);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = AbstractC4163e31.b;
                iArr2[0] = AbstractC4163e31.b(context, KC0.w);
                iArr[1] = AbstractC4163e31.f;
                iArr2[1] = AbstractC4163e31.c(context, KC0.s);
                iArr[2] = AbstractC4163e31.i;
                iArr2[2] = AbstractC4163e31.c(context, KC0.w);
            } else {
                int[] iArr3 = AbstractC4163e31.b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = AbstractC4163e31.f;
                iArr2[1] = AbstractC4163e31.c(context, KC0.s);
                iArr[2] = AbstractC4163e31.i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(TI0 ti0, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableJ = ti0.j(context, AbstractC4209eD0.F);
            Drawable drawableJ2 = ti0.j(context, AbstractC4209eD0.G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C8116s9.b;
            }
            drawableMutate.setColorFilter(C8116s9.e(i, mode));
        }
    }

    public static synchronized C8116s9 b() {
        try {
            if (c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        return TI0.l(i, mode);
    }

    public static synchronized void h() {
        if (c == null) {
            C8116s9 c8116s9 = new C8116s9();
            c = c8116s9;
            c8116s9.a = TI0.h();
            c.a.u(new a());
        }
    }

    public static void i(Drawable drawable, X31 x31, int[] iArr) {
        TI0.w(drawable, x31, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    public synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    public synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
