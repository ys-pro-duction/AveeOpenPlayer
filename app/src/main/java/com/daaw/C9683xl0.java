package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9683xl0 {
    public final BS0 a = new BS0();
    public final BS0 b = new BS0();

    public static void a(C9683xl0 c9683xl0, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c9683xl0.e(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c9683xl0.f(objectAnimator.getPropertyName(), C9962yl0.a(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static C9683xl0 b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C9683xl0 c(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    public static C9683xl0 d(List list) {
        C9683xl0 c9683xl0 = new C9683xl0();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(c9683xl0, (Animator) list.get(i));
        }
        return c9683xl0;
    }

    public void e(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9683xl0) {
            return this.a.equals(((C9683xl0) obj).a);
        }
        return false;
    }

    public void f(String str, C9962yl0 c9962yl0) {
        this.a.put(str, c9962yl0);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
