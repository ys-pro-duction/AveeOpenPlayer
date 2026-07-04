package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2963Zj extends AbstractC8656u51 {
    public static final String[] n0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property o0 = new b(PointF.class, "boundsOrigin");
    public static final Property p0 = new c(PointF.class, "topLeft");
    public static final Property q0 = new d(PointF.class, "bottomRight");
    public static final Property r0 = new e(PointF.class, "bottomRight");
    public static final Property s0 = new f(PointF.class, "topLeft");
    public static final Property t0 = new g(PointF.class, "position");
    public static C3382bF0 u0 = new C3382bF0();
    public int[] k0 = new int[2];
    public boolean l0 = false;
    public boolean m0 = false;

    /* JADX INFO: renamed from: com.daaw.Zj$a */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ BitmapDrawable b;
        public final /* synthetic */ View c;
        public final /* synthetic */ float d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.a = viewGroup;
            this.b = bitmapDrawable;
            this.c = view;
            this.d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2841Ye1.b(this.a).b(this.b);
            AbstractC2841Ye1.g(this.c, this.d);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$b */
    public static class b extends Property {
        public Rect a;

        public b(Class cls, String str) {
            super(cls, str);
            this.a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$c */
    public static class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$d */
    public static class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$e */
    public static class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2841Ye1.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$f */
    public static class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            AbstractC2841Ye1.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$g */
    public static class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            AbstractC2841Ye1.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$h */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ k a;
        private k mViewBounds;

        public h(k kVar) {
            this.a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$i */
    public class i extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Rect c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.b = view;
            this.c = rect;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            AbstractC2317Td1.w0(this.b, this.c);
            AbstractC2841Ye1.f(this.b, this.d, this.e, this.f, this.g);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$j */
    public class j extends AbstractC8942v51 {
        public boolean a = false;
        public final /* synthetic */ ViewGroup b;

        public j(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // com.daaw.AbstractC8656u51.f
        public void a(AbstractC8656u51 abstractC8656u51) {
            if (!this.a) {
                AbstractC5169he1.c(this.b, false);
            }
            abstractC8656u51.W(this);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void b(AbstractC8656u51 abstractC8656u51) {
            AbstractC5169he1.c(this.b, false);
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void c(AbstractC8656u51 abstractC8656u51) {
            AbstractC5169he1.c(this.b, false);
            this.a = true;
        }

        @Override // com.daaw.AbstractC8942v51, com.daaw.AbstractC8656u51.f
        public void e(AbstractC8656u51 abstractC8656u51) {
            AbstractC5169he1.c(this.b, true);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Zj$k */
    public static class k {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;

        public k(View view) {
            this.e = view;
        }

        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        public final void b() {
            AbstractC2841Ye1.f(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public String[] G() {
        return n0;
    }

    @Override // com.daaw.AbstractC8656u51
    public void h(B51 b51) {
        j0(b51);
    }

    public final void j0(B51 b51) {
        View view = b51.b;
        if (!AbstractC2317Td1.U(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        b51.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        b51.a.put("android:changeBounds:parent", b51.b.getParent());
        if (this.m0) {
            b51.b.getLocationInWindow(this.k0);
            b51.a.put("android:changeBounds:windowX", Integer.valueOf(this.k0[0]));
            b51.a.put("android:changeBounds:windowY", Integer.valueOf(this.k0[1]));
        }
        if (this.l0) {
            b51.a.put("android:changeBounds:clip", AbstractC2317Td1.v(view));
        }
    }

    @Override // com.daaw.AbstractC8656u51
    public void k(B51 b51) {
        j0(b51);
    }

    public final boolean k0(View view, View view2) {
        if (!this.m0) {
            return true;
        }
        B51 b51V = v(view, true);
        return b51V == null ? view == view2 : view2 == b51V.b;
    }

    @Override // com.daaw.AbstractC8656u51
    public Animator o(ViewGroup viewGroup, B51 b51, B51 b512) {
        Animator animator;
        int i2;
        int i3;
        Rect rect;
        View view;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        if (b51 == null || b512 == null) {
            return null;
        }
        Map map = b51.a;
        Map map2 = b512.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = b512.b;
        if (k0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) b51.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) b512.a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            animator = null;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            Rect rect4 = (Rect) b51.a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) b512.a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (i8 != i9 || i10 != i11) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 > 0) {
                if (this.l0) {
                    AbstractC2841Ye1.f(view2, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                    ObjectAnimator objectAnimatorA = (i4 == i5 && i6 == i7) ? null : AbstractC5782jp0.a(view2, t0, x().a(i4, i6, i5, i7));
                    if (rect4 == null) {
                        i3 = 0;
                        rect = new Rect(0, 0, i12, i13);
                    } else {
                        i3 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
                    if (rect.equals(rect6)) {
                        view = view2;
                        objectAnimator = null;
                    } else {
                        AbstractC2317Td1.w0(view2, rect);
                        C3382bF0 c3382bF0 = u0;
                        Object[] objArr = new Object[2];
                        objArr[i3] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", c3382bF0, objArr);
                        view = view2;
                        objectAnimatorOfObject.addListener(new i(view2, rect5, i5, i7, i9, i11));
                        objectAnimator = objectAnimatorOfObject;
                    }
                    animatorC = A51.c(objectAnimatorA, objectAnimator);
                } else {
                    AbstractC2841Ye1.f(view2, i4, i6, i8, i10);
                    if (i2 != 2) {
                        animatorC = (i4 == i5 && i6 == i7) ? AbstractC5782jp0.a(view2, r0, x().a(i8, i10, i9, i11)) : AbstractC5782jp0.a(view2, s0, x().a(i4, i6, i5, i7));
                    } else if (i12 == i14 && i13 == i15) {
                        animatorC = AbstractC5782jp0.a(view2, t0, x().a(i4, i6, i5, i7));
                    } else {
                        k kVar = new k(view2);
                        ObjectAnimator objectAnimatorA2 = AbstractC5782jp0.a(kVar, p0, x().a(i4, i6, i5, i7));
                        ObjectAnimator objectAnimatorA3 = AbstractC5782jp0.a(kVar, q0, x().a(i8, i10, i9, i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                        animatorSet.addListener(new h(kVar));
                        animatorC = animatorSet;
                    }
                    view = view2;
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    AbstractC5169he1.c(viewGroup4, true);
                    b(new j(viewGroup4));
                }
                return animatorC;
            }
        } else {
            animator = null;
            int iIntValue = ((Integer) b51.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) b51.a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) b512.a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) b512.a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue != iIntValue3 || iIntValue2 != iIntValue4) {
                viewGroup.getLocationInWindow(this.k0);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(bitmapCreateBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                float fC = AbstractC2841Ye1.c(view2);
                AbstractC2841Ye1.g(view2, 0.0f);
                AbstractC2841Ye1.b(viewGroup).a(bitmapDrawable);
                AbstractC8879ut0 abstractC8879ut0X = x();
                int[] iArr = this.k0;
                int i16 = iArr[0];
                int i17 = iArr[1];
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, AbstractC8122sA0.a(o0, abstractC8879ut0X.a(iIntValue - i16, iIntValue2 - i17, iIntValue3 - i16, iIntValue4 - i17)));
                objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
                return objectAnimatorOfPropertyValuesHolder;
            }
        }
        return animator;
    }
}
