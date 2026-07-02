package com.daaw;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8281sl0 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final List d = new ArrayList();
    public int e = -1;
    public int f = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.b;
                long j = this.a;
                this.a = 1 + j;
                sparseLongArray.put(pointerId, j);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.b;
            long j2 = this.a;
            this.a = 1 + j2;
            sparseLongArray2.put(pointerId2, j2);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.e && source == this.f) {
            return;
        }
        this.e = toolType;
        this.f = source;
        this.c.clear();
        this.b.clear();
    }

    public final C8059rx0 c(MotionEvent motionEvent, InterfaceC1956Px0 interfaceC1956Px0) {
        G10.g(motionEvent, "motionEvent");
        G10.g(interfaceC1956Px0, "positionCalculator");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.b.clear();
            this.c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z2 = actionMasked == 8;
        if (z) {
            this.c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.d.add(d(interfaceC1956Px0, motionEvent, i, (z || i == actionIndex || (z2 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        h(motionEvent);
        return new C8059rx0(motionEvent.getEventTime(), this.d, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.C8338sx0 d(com.daaw.InterfaceC1956Px0 r24, android.view.MotionEvent r25, int r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8281sl0.d(com.daaw.Px0, android.view.MotionEvent, int, boolean):com.daaw.sx0");
    }

    public final void e(int i) {
        this.c.delete(i);
        this.b.delete(i);
    }

    public final long f(int i) {
        long jValueAt;
        int iIndexOfKey = this.b.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            jValueAt = this.b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.a;
            this.a = 1 + jValueAt;
            this.b.put(i, jValueAt);
        }
        return C6944nx0.b(jValueAt);
    }

    public final boolean g(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.c.get(pointerId, false)) {
                this.b.delete(pointerId);
                this.c.delete(pointerId);
            }
        }
        if (this.b.size() > motionEvent.getPointerCount()) {
            for (int size = this.b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.b.removeAt(size);
                    this.c.delete(iKeyAt);
                }
            }
        }
    }
}
