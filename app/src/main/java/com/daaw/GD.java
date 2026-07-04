package com.daaw;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class GD extends ViewGroup {
    public boolean B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GD(Context context) {
        super(context);
        G10.g(context, "context");
        setClipChildren(false);
        setTag(AbstractC6740nD0.J, Boolean.TRUE);
    }

    public final void a(InterfaceC6318lj interfaceC6318lj, View view, long j) {
        G10.g(interfaceC6318lj, "canvas");
        G10.g(view, "view");
        super.drawChild(AbstractC3614c5.c(interfaceC6318lj), view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        G10.g(canvas, "canvas");
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            }
            if (((C6295le1) childAt).s()) {
                this.B = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.B = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.B) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
