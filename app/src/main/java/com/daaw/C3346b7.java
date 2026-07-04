package com.daaw;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import com.daaw.AbstractC7931rW0;
import com.daaw.TD;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3346b7 extends AbstractC7931rW0 implements V31 {
    public c P;
    public g Q;
    public int R;
    public int S;
    public boolean T;

    /* JADX INFO: renamed from: com.daaw.b7$b */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // com.daaw.C3346b7.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.C3346b7.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b7$c */
    public static class c extends AbstractC7931rW0.a {
        public C7131oe0 K;
        public C3724cV0 L;

        public c(c cVar, C3346b7 c3346b7, Resources resources) {
            super(cVar, c3346b7, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new C7131oe0();
                this.L = new C3724cV0();
            }
        }

        public static long D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i) {
            int iZ = super.z(iArr, drawable);
            this.L.l(iZ, Integer.valueOf(i));
            return iZ;
        }

        public int C(int i, int i2, Drawable drawable, boolean z) {
            int iA = super.a(drawable);
            long jD = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = iA;
            this.K.b(jD, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return iA;
        }

        public int E(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.L.h(i, 0)).intValue();
        }

        public int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        public int G(int i, int i2) {
            return (int) ((Long) this.K.h(D(i, i2), -1L)).longValue();
        }

        public boolean H(int i, int i2) {
            return (((Long) this.K.h(D(i, i2), -1L)).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i, int i2) {
            return (((Long) this.K.h(D(i, i2), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C3346b7(this, null);
        }

        @Override // com.daaw.AbstractC7931rW0.a, com.daaw.TD.d
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C3346b7(this, resources);
        }
    }

    /* JADX INFO: renamed from: com.daaw.b7$d */
    public static class d extends g {
        public final C4181e7 a;

        public d(C4181e7 c4181e7) {
            super();
            this.a = c4181e7;
        }

        @Override // com.daaw.C3346b7.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.C3346b7.g
        public void d() {
            this.a.stop();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b7$e */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.b = z2;
            this.a = objectAnimatorOfInt;
        }

        @Override // com.daaw.C3346b7.g
        public boolean a() {
            return this.b;
        }

        @Override // com.daaw.C3346b7.g
        public void b() {
            this.a.reverse();
        }

        @Override // com.daaw.C3346b7.g
        public void c() {
            this.a.start();
        }

        @Override // com.daaw.C3346b7.g
        public void d() {
            this.a.cancel();
        }
    }

    /* JADX INFO: renamed from: com.daaw.b7$f */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    public C3346b7() {
        this(null, null);
    }

    public static C3346b7 l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C3346b7 c3346b7 = new C3346b7();
            c3346b7.m(context, resources, xmlPullParser, attributeSet, theme);
            return c3346b7;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    @Override // com.daaw.AbstractC7931rW0, com.daaw.TD
    public void h(TD.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.P = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // com.daaw.TD, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.Q;
        if (gVar != null) {
            gVar.d();
            this.Q = null;
            g(this.R);
            this.R = -1;
            this.S = -1;
        }
    }

    @Override // com.daaw.TD
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.P, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayK = M81.k(resources, theme, attributeSet, YD0.a);
        setVisible(typedArrayK.getBoolean(YD0.c, true), true);
        s(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // com.daaw.AbstractC7931rW0, com.daaw.TD, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.T && super.mutate() == this) {
            this.P.r();
            this.T = true;
        }
        return this;
    }

    public final void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    public final void o() {
        onStateChange(getState());
    }

    @Override // com.daaw.AbstractC7931rW0, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int iF = this.P.F(iArr);
        boolean z = iF != c() && (r(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z : z;
    }

    public final int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = M81.k(resources, theme, attributeSet, YD0.h);
        int resourceId = typedArrayK.getResourceId(YD0.i, 0);
        int resourceId2 = typedArrayK.getResourceId(YD0.j, -1);
        Drawable drawableJ = resourceId2 > 0 ? TI0.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? C2729Xc1.c(resources, xmlPullParser, attributeSet, theme) : AbstractC1292Jn.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.P.B(iArrJ, drawableJ, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    public final int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayK = M81.k(resources, theme, attributeSet, YD0.k);
        int resourceId = typedArrayK.getResourceId(YD0.n, -1);
        int resourceId2 = typedArrayK.getResourceId(YD0.m, -1);
        int resourceId3 = typedArrayK.getResourceId(YD0.l, -1);
        Drawable drawableJ = resourceId3 > 0 ? TI0.h().j(context, resourceId3) : null;
        boolean z = typedArrayK.getBoolean(YD0.o, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? C4181e7.b(context, resources, xmlPullParser, attributeSet, theme) : AbstractC1292Jn.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.P.C(resourceId, resourceId2, drawableJ, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    public final boolean r(int i) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.Q;
        if (gVar == null) {
            iC = c();
        } else {
            if (i == this.R) {
                return true;
            }
            if (i == this.S && gVar.a()) {
                gVar.b();
                this.R = this.S;
                this.S = i;
                return true;
            }
            iC = this.R;
            gVar.d();
        }
        this.Q = null;
        this.S = -1;
        this.R = -1;
        c cVar = this.P;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof C4181e7)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C4181e7) current);
        }
        bVar.c();
        this.Q = bVar;
        this.S = iC;
        this.R = i;
        return true;
    }

    public final void s(TypedArray typedArray) {
        c cVar = this.P;
        cVar.d |= AbstractC1292Jn.b(typedArray);
        cVar.x(typedArray.getBoolean(YD0.d, cVar.i));
        cVar.t(typedArray.getBoolean(YD0.e, cVar.l));
        cVar.u(typedArray.getInt(YD0.f, cVar.A));
        cVar.v(typedArray.getInt(YD0.g, cVar.B));
        setDither(typedArray.getBoolean(YD0.b, cVar.x));
    }

    @Override // com.daaw.TD, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.Q;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    public C3346b7(c cVar, Resources resources) {
        super(null);
        this.R = -1;
        this.S = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: renamed from: com.daaw.b7$g */
    public static abstract class g {
        public g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
