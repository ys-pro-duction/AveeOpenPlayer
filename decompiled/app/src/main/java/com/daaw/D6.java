package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class D6 extends ViewGroup {
    public final HashMap B;
    public final HashMap C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D6(Context context) {
        super(context);
        G10.g(context, "context");
        setClipChildren(false);
        this.B = new HashMap();
        this.C = new HashMap();
    }

    public Void a(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, E90> getHolderToLayoutNode() {
        return this.B;
    }

    public final HashMap<E90, Object> getLayoutNodeToHolder() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) a(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        G10.g(view, "child");
        G10.g(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set setKeySet = this.B.keySet();
        G10.f(setKeySet, "holderToLayoutNode.keys");
        Iterator it = setKeySet.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Set setKeySet = this.B.keySet();
        G10.f(setKeySet, "holderToLayoutNode.keys");
        Iterator it = setKeySet.iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(it.next());
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            E90 e90 = (E90) this.B.get(childAt);
            if (childAt.isLayoutRequested() && e90 != null) {
                E90.b1(e90, false, 1, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
