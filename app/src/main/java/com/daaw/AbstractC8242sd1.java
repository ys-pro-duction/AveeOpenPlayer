package com.daaw;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.sd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8242sd1 {
    public static Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: com.daaw.sd1$a */
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!a.containsKey(velocityTracker)) {
                a.put(velocityTracker, new C8521td1());
            }
            ((C8521td1) a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i) {
        c(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        C8521td1 c8521td1E = e(velocityTracker);
        if (c8521td1E != null) {
            c8521td1E.c(i, f);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        C8521td1 c8521td1E = e(velocityTracker);
        if (c8521td1E != null) {
            return c8521td1E.d(i);
        }
        return 0.0f;
    }

    public static C8521td1 e(VelocityTracker velocityTracker) {
        return (C8521td1) a.get(velocityTracker);
    }
}
