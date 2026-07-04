package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.P3;

/* JADX INFO: loaded from: classes.dex */
public class MyAlphaSlider extends P3 {
    public MyAlphaSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void h() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.AbstractC4424f, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && zOnTouchEvent) {
            h();
        }
        return zOnTouchEvent;
    }
}
