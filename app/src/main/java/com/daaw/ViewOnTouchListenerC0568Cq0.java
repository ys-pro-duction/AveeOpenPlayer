package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: com.daaw.Cq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ViewOnTouchListenerC0568Cq0 implements View.OnTouchListener {
    public ViewParent B;

    public ViewOnTouchListenerC0568Cq0(ViewParent viewParent) {
        this.B = viewParent;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.B.requestDisallowInterceptTouchEvent(true);
        return view.onTouchEvent(motionEvent);
    }
}
