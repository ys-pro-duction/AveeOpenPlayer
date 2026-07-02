package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import com.daaw.BC0;
import com.daaw.ViewTreeObserverOnPreDrawListenerC1201Iq0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int a(c cVar, boolean z, boolean z2) {
        return z2 ? z ? cVar.K() : cVar.L() : z ? cVar.v() : cVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.fragment.app.d.a b(android.content.Context r4, androidx.fragment.app.c r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.G()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.x1(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.k0
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = com.daaw.AbstractC7855rD0.c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L20
            android.view.ViewGroup r1 = r5.k0
            int r3 = com.daaw.AbstractC7855rD0.c
            r1.setTag(r3, r2)
        L20:
            android.view.ViewGroup r1 = r5.k0
            if (r1 == 0) goto L2b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            android.view.animation.Animation r1 = r5.s0(r0, r6, r7)
            if (r1 == 0) goto L37
            androidx.fragment.app.d$a r4 = new androidx.fragment.app.d$a
            r4.<init>(r1)
            return r4
        L37:
            android.animation.Animator r5 = r5.t0(r0, r6, r7)
            if (r5 == 0) goto L43
            androidx.fragment.app.d$a r4 = new androidx.fragment.app.d$a
            r4.<init>(r5)
            return r4
        L43:
            if (r7 != 0) goto L4b
            if (r0 == 0) goto L4b
            int r7 = d(r4, r0, r6)
        L4b:
            if (r7 == 0) goto L87
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            if (r6 == 0) goto L87
            androidx.fragment.app.d$a r0 = new androidx.fragment.app.d$a     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            return r0
        L69:
            r4 = move-exception
            throw r4
        L6b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L77
            if (r6 == 0) goto L87
            androidx.fragment.app.d$a r0 = new androidx.fragment.app.d$a     // Catch: java.lang.RuntimeException -> L77
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L77
            return r0
        L77:
            r6 = move-exception
            if (r5 != 0) goto L86
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L87
            androidx.fragment.app.d$a r5 = new androidx.fragment.app.d$a
            r5.<init>(r4)
            return r5
        L86:
            throw r6
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d.b(android.content.Context, androidx.fragment.app.c, boolean, boolean):androidx.fragment.app.d$a");
    }

    public static int c(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i, boolean z) {
        if (i == 4097) {
            return z ? BC0.e : BC0.f;
        }
        if (i == 8194) {
            return z ? BC0.a : BC0.b;
        }
        if (i == 8197) {
            return z ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i == 4099) {
            return z ? BC0.c : BC0.d;
        }
        if (i != 4100) {
            return -1;
        }
        return z ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {
        public final Animation a;
        public final AnimatorSet b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup B;
        public final View C;
        public boolean D;
        public boolean E;
        public boolean F;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.F = true;
            this.B = viewGroup;
            this.C = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.F = true;
            if (this.D) {
                return !this.E;
            }
            if (!super.getTransformation(j, transformation)) {
                this.D = true;
                ViewTreeObserverOnPreDrawListenerC1201Iq0.a(this.B, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.D || !this.F) {
                this.B.endViewTransition(this.C);
                this.E = true;
            } else {
                this.F = false;
                this.B.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.F = true;
            if (this.D) {
                return !this.E;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.D = true;
                ViewTreeObserverOnPreDrawListenerC1201Iq0.a(this.B, this);
            }
            return true;
        }
    }
}
