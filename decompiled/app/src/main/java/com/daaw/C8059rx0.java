package com.daaw;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.rx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8059rx0 {
    public final long a;
    public final List b;
    public final MotionEvent c;

    public C8059rx0(long j, List list, MotionEvent motionEvent) {
        G10.g(list, "pointers");
        G10.g(motionEvent, "motionEvent");
        this.a = j;
        this.b = list;
        this.c = motionEvent;
    }

    public final MotionEvent a() {
        return this.c;
    }

    public final List b() {
        return this.b;
    }
}
