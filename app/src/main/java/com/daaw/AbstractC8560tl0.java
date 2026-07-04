package com.daaw;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.daaw.tl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8560tl0 {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
