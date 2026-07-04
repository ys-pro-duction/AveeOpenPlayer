package com.daaw;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class L70 {
    public static final long a(KeyEvent keyEvent) {
        G10.g(keyEvent, "$this$key");
        return V70.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        G10.g(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        return action != 0 ? action != 1 ? K70.a.c() : K70.a.b() : K70.a.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        G10.g(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
