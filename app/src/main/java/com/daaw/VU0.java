package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class VU0 extends RecyclerView.o {
    public Paint a;
    public int b;

    public VU0(int i, int i2) {
        Paint paint = new Paint();
        this.a = paint;
        this.b = i;
        paint.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.left = 0;
        rect.right = 0;
        rect.bottom = this.b;
        if (recyclerView.i0(view) == 0) {
            rect.top = this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            canvas.drawRect(paddingLeft, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) childAt.getLayoutParams())).bottomMargin, width, this.b + r3, this.a);
        }
    }
}
