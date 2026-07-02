package com.daaw.avee;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.daaw.WC0;

/* JADX INFO: loaded from: classes.dex */
public class CustomViewPager extends ViewPager {
    public float K0;
    public a L0;
    public boolean M0;
    public float N0;
    public float O0;
    public float P0;

    public interface a {
        void a(float f);

        void b();

        void c();
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M0 = false;
        this.N0 = 0.0f;
        this.O0 = 0.0f;
        this.P0 = 0.0f;
        this.N0 = context.getResources().getDimension(WC0.b);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        if ((action & 255) == 0) {
            this.K0 = x;
            this.M0 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            float r1 = r6.getX()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            if (r0 == 0) goto L9f
            r3 = 1
            if (r0 == r3) goto L92
            r4 = 2
            if (r0 == r4) goto L15
            goto Lad
        L15:
            boolean r0 = r5.M0
            if (r0 == 0) goto L1b
            goto Lad
        L1b:
            int r0 = r5.getCurrentItem()
            if (r0 != 0) goto L29
            float r0 = r5.K0
            float r0 = r1 - r0
            float r4 = r5.N0
        L27:
            float r0 = r0 / r4
            goto L3f
        L29:
            int r0 = r5.getCurrentItem()
            com.daaw.ps0 r4 = r5.getAdapter()
            int r4 = r4.c()
            int r4 = r4 - r3
            if (r0 != r4) goto L3e
            float r0 = r5.K0
            float r0 = r0 - r1
            float r4 = r5.N0
            goto L27
        L3e:
            r0 = 0
        L3f:
            float r4 = r5.P0
            float r0 = java.lang.Math.max(r4, r0)
            r5.P0 = r0
            com.daaw.avee.CustomViewPager$a r4 = r5.L0
            r4.a(r0)
            float r0 = r5.K0
            float r0 = r1 - r0
            float r4 = r5.N0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L6b
            int r0 = r5.getCurrentItem()
            if (r0 != 0) goto L6b
            r5.P0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.a(r2)
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.b()
            r5.M0 = r3
            goto Lad
        L6b:
            float r0 = r5.K0
            float r0 = r0 - r1
            float r1 = r5.N0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lad
            int r0 = r5.getCurrentItem()
            com.daaw.ps0 r1 = r5.getAdapter()
            int r1 = r1.c()
            int r1 = r1 - r3
            if (r0 != r1) goto Lad
            r5.P0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.a(r2)
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.c()
            r5.M0 = r3
            goto Lad
        L92:
            boolean r0 = r5.M0
            if (r0 == 0) goto L97
            goto Lad
        L97:
            r5.P0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.a(r2)
            goto Lad
        L9f:
            r5.K0 = r1
            r0 = 0
            r5.M0 = r0
            r5.O0 = r2
            r5.P0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.L0
            r0.a(r2)
        Lad:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.CustomViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnSwipeOutListener(a aVar) {
        this.L0 = aVar;
    }
}
