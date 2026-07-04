package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.lE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6186lE0 extends ConstraintLayout {
    public final Runnable b0;
    public int c0;
    public C4904gh0 d0;

    public AbstractC6186lE0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(BD0.k, this);
        AbstractC2317Td1.t0(this, u());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WD0.B4, i, 0);
        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(WD0.C4, 0);
        this.b0 = new Runnable() { // from class: com.daaw.kE0
            @Override // java.lang.Runnable
            public final void run() {
                this.B.z();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    public static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    public final void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.b0);
            handler.post(this.b0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC2317Td1.m());
        }
        A();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d0.S(ColorStateList.valueOf(i));
    }

    public final void t(List list, androidx.constraintlayout.widget.c cVar, int i) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.g(((View) it.next()).getId(), AbstractC5894kD0.c, i, size);
            size += 360.0f / list.size();
        }
    }

    public final Drawable u() {
        C4904gh0 c4904gh0 = new C4904gh0();
        this.d0 = c4904gh0;
        c4904gh0.Q(new C9548xG0(0.5f));
        this.d0.S(ColorStateList.valueOf(-1));
        return this.d0;
    }

    public int v(int i) {
        return i == 2 ? Math.round(this.c0 * 0.66f) : this.c0;
    }

    public int w() {
        return this.c0;
    }

    public void x(int i) {
        this.c0 = i;
        z();
    }

    public void z() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.f(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != AbstractC5894kD0.c && !y(childAt)) {
                int i2 = (Integer) childAt.getTag(AbstractC5894kD0.k);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            t((List) entry.getValue(), cVar, v(((Integer) entry.getKey()).intValue()));
        }
        cVar.c(this);
    }
}
