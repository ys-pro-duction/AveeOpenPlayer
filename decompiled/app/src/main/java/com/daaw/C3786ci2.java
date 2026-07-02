package com.daaw;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.zzau;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.ci2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3786ci2 extends FrameLayout {
    public final zzau B;

    public C3786ci2(Context context, View view, zzau zzauVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.B = zzauVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.B.zzm(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof InterfaceC9334wW1)) {
                arrayList.add((InterfaceC9334wW1) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC9334wW1) arrayList.get(i2)).destroy();
        }
    }
}
