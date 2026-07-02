package com.daaw;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: com.daaw.b00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ViewOnTouchListenerC3312b00 implements View.OnTouchListener {
    public final Dialog B;
    public final int C;
    public final int D;
    public final int E;

    public ViewOnTouchListenerC3312b00(Dialog dialog, Rect rect) {
        this.B = dialog;
        this.C = rect.left;
        this.D = rect.top;
        this.E = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.C + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.D + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.E;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.B.onTouchEvent(motionEventObtain);
    }
}
