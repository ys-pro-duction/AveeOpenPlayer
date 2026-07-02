package com.daaw;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: com.daaw.p7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7270p7 {
    public static final C7270p7 a = new C7270p7();

    public final Animation a(int i, int i2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(i);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(i2);
        return alphaAnimation;
    }

    public final Animation b(int i, int i2) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setStartOffset(i);
        scaleAnimation.setDuration(i2);
        return scaleAnimation;
    }

    public final View c(View view, Animation animation) {
        G10.g(view, "view");
        G10.g(animation, "animation");
        view.startAnimation(animation);
        return view;
    }

    public final View d(View view, int i, int i2) {
        G10.g(view, "view");
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.05f), PropertyValuesHolder.ofFloat("scaleY", 1.05f));
        G10.f(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        objectAnimatorOfPropertyValuesHolder.setDuration(i2);
        objectAnimatorOfPropertyValuesHolder.setStartDelay(i);
        objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
        objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
        objectAnimatorOfPropertyValuesHolder.start();
        return view;
    }
}
