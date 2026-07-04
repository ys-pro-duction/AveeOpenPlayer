package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.e7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4181e7 extends AbstractC2625Wc1 implements Animatable {
    public c C;
    public Context D;
    public ArgbEvaluator E;
    public d F;
    public Animator.AnimatorListener G;
    public ArrayList H;
    public final Drawable.Callback I;

    /* JADX INFO: renamed from: com.daaw.e7$a */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C4181e7.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C4181e7.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C4181e7.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e7$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C4181e7.this.H);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((G6) arrayList.get(i)).b(C4181e7.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C4181e7.this.H);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((G6) arrayList.get(i)).c(C4181e7.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.e7$c */
    public static class c extends Drawable.ConstantState {
        public int a;
        public C2729Xc1 b;
        public AnimatorSet c;
        public ArrayList d;
        public C2407Ua e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.a = cVar.a;
                C2729Xc1 c2729Xc1 = cVar.b;
                if (c2729Xc1 != null) {
                    Drawable.ConstantState constantState = c2729Xc1.getConstantState();
                    if (resources != null) {
                        this.b = (C2729Xc1) constantState.newDrawable(resources);
                    } else {
                        this.b = (C2729Xc1) constantState.newDrawable();
                    }
                    C2729Xc1 c2729Xc12 = (C2729Xc1) this.b.mutate();
                    this.b = c2729Xc12;
                    c2729Xc12.setCallback(callback);
                    this.b.setBounds(cVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList arrayList = cVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList(size);
                    this.e = new C2407Ua(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) cVar.d.get(i);
                        Animator animatorClone = animator.clone();
                        String str = (String) cVar.e.get(animator);
                        animatorClone.setTarget(this.b.d(str));
                        this.d.add(animatorClone);
                        this.e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C4181e7() {
        this(null, null, null);
    }

    public static C4181e7 a(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C4181e7 c4181e7 = new C4181e7(context);
            Drawable drawableE = XI0.e(context.getResources(), i, context.getTheme());
            c4181e7.B = drawableE;
            drawableE.setCallback(c4181e7.I);
            c4181e7.F = new d(c4181e7.B.getConstantState());
            return c4181e7;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static C4181e7 b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C4181e7 c4181e7 = new C4181e7(context);
        c4181e7.inflate(resources, xmlPullParser, attributeSet, theme);
        return c4181e7;
    }

    public static void d(AnimatedVectorDrawable animatedVectorDrawable, G6 g6) {
        animatedVectorDrawable.registerAnimationCallback(g6.a());
    }

    public static boolean h(AnimatedVectorDrawable animatedVectorDrawable, G6 g6) {
        return animatedVectorDrawable.unregisterAnimationCallback(g6.a());
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.a(drawable, theme);
        }
    }

    public void c(G6 g6) {
        Drawable drawable = this.B;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, g6);
            return;
        }
        if (g6 == null) {
            return;
        }
        if (this.H == null) {
            this.H = new ArrayList();
        }
        if (this.H.contains(g6)) {
            return;
        }
        this.H.add(g6);
        if (this.G == null) {
            this.G = new b();
        }
        this.C.c.addListener(this.G);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.B;
        if (drawable != null) {
            return SD.b(drawable);
        }
        return false;
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.C.b.draw(canvas);
        if (this.C.c.isStarted()) {
            invalidateSelf();
        }
    }

    public final void e() {
        Animator.AnimatorListener animatorListener = this.G;
        if (animatorListener != null) {
            this.C.c.removeListener(animatorListener);
            this.G = null;
        }
    }

    public final void f(String str, Animator animator) {
        animator.setTarget(this.C.b.d(str));
        c cVar = this.C;
        if (cVar.d == null) {
            cVar.d = new ArrayList();
            this.C.e = new C2407Ua();
        }
        this.C.d.add(animator);
        this.C.e.put(animator, str);
    }

    public boolean g(G6 g6) {
        Drawable drawable = this.B;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, g6);
        }
        ArrayList arrayList = this.H;
        if (arrayList == null || g6 == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(g6);
        if (this.H.size() == 0) {
            e();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.B;
        return drawable != null ? SD.d(drawable) : this.C.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.B;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.C.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.B;
        return drawable != null ? SD.e(drawable) : this.C.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.B == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.B.getConstantState());
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.B;
        return drawable != null ? drawable.getIntrinsicHeight() : this.C.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.B;
        return drawable != null ? drawable.getIntrinsicWidth() : this.C.b.getIntrinsicWidth();
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.B;
        return drawable != null ? drawable.getOpacity() : this.C.b.getOpacity();
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayK = M81.k(resources, theme, attributeSet, AbstractC7544q6.e);
                    int resourceId = typedArrayK.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C2729Xc1 c2729Xc1B = C2729Xc1.b(resources, resourceId, theme);
                        c2729Xc1B.h(false);
                        c2729Xc1B.setCallback(this.I);
                        C2729Xc1 c2729Xc1 = this.C.b;
                        if (c2729Xc1 != null) {
                            c2729Xc1.setCallback(null);
                        }
                        this.C.b = c2729Xc1B;
                    }
                    typedArrayK.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC7544q6.f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.D;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, AbstractC9508x7.i(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.C.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.B;
        return drawable != null ? SD.h(drawable) : this.C.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.B;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.C.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.B;
        return drawable != null ? drawable.isStateful() : this.C.b.isStateful();
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.C.b.setBounds(rect);
        }
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.B;
        return drawable != null ? drawable.setLevel(i) : this.C.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.B;
        return drawable != null ? drawable.setState(iArr) : this.C.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.C.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.j(drawable, z);
        } else {
            this.C.b.setAutoMirrored(z);
        }
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.daaw.AbstractC2625Wc1, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.n(drawable, i);
        } else {
            this.C.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.o(drawable, colorStateList);
        } else {
            this.C.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.B;
        if (drawable != null) {
            SD.p(drawable, mode);
        } else {
            this.C.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.B;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.C.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.B;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.C.c.isStarted()) {
                return;
            }
            this.C.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.B;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.C.c.end();
        }
    }

    public C4181e7(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.B;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.C.b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: renamed from: com.daaw.e7$d */
    public static class d extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C4181e7 c4181e7 = new C4181e7();
            Drawable drawableNewDrawable = this.a.newDrawable();
            c4181e7.B = drawableNewDrawable;
            drawableNewDrawable.setCallback(c4181e7.I);
            return c4181e7;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C4181e7 c4181e7 = new C4181e7();
            Drawable drawableNewDrawable = this.a.newDrawable(resources);
            c4181e7.B = drawableNewDrawable;
            drawableNewDrawable.setCallback(c4181e7.I);
            return c4181e7;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C4181e7 c4181e7 = new C4181e7();
            Drawable drawableNewDrawable = this.a.newDrawable(resources, theme);
            c4181e7.B = drawableNewDrawable;
            drawableNewDrawable.setCallback(c4181e7.I);
            return c4181e7;
        }
    }

    public C4181e7(Context context, c cVar, Resources resources) {
        this.E = null;
        this.G = null;
        this.H = null;
        a aVar = new a();
        this.I = aVar;
        this.D = context;
        if (cVar != null) {
            this.C = cVar;
        } else {
            this.C = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
