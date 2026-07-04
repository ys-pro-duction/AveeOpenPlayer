package com.daaw.avee.comp.Common.View;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.daaw.AbstractC4654fn;

/* JADX INFO: loaded from: classes.dex */
public class MyColorPickerView extends AbstractC4654fn {
    public MyColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void k() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // com.daaw.AbstractC4654fn, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if ((action == 0 || action == 2) && zOnTouchEvent) {
            k();
        }
        return zOnTouchEvent;
    }
}
