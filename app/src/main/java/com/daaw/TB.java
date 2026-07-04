package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class TB {
    public final Context a;
    public final UB b;
    public final b c;
    public final a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public TB(Context context, UB ub) {
        this(context, ub, new b() { // from class: com.daaw.RB
            @Override // com.daaw.TB.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                TB.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: com.daaw.SB
            @Override // com.daaw.TB.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return TB.f(velocityTracker, motionEvent, i);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC3208ae1.i(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = AbstractC3208ae1.h(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        AbstractC8242sd1.a(velocityTracker, motionEvent);
        AbstractC8242sd1.b(velocityTracker, 1000);
        return AbstractC8242sd1.d(velocityTracker, i);
    }

    public final boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean zD = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i) * this.b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f) && fSignum != 0.0f)) {
            this.b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f = this.b.a(fMax) ? fMax : 0.0f;
    }

    public TB(Context context, UB ub, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.a = context;
        this.b = ub;
        this.c = bVar;
        this.d = aVar;
    }
}
