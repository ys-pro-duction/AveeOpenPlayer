package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.fF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4497fF1 {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final Context c;
    public final ScheduledExecutorService d;
    public final TI2 e;
    public final C5065hF1 f;

    public C4497fF1(Context context, ScheduledExecutorService scheduledExecutorService, C5065hF1 c5065hF1, TI2 ti2) {
        this.c = context;
        this.d = scheduledExecutorService;
        this.f = c5065hF1;
        this.e = ti2;
    }

    public final InterfaceFutureC8236sc0 a() {
        return (AbstractC4839gS2) AbstractC7360pS2.o(AbstractC4839gS2.C(AbstractC7360pS2.h(null)), ((Long) AF1.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.b.getEventTime()) {
                return;
            }
            this.b = MotionEvent.obtain(motionEvent);
        }
    }
}
