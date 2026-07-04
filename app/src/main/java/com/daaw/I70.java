package com.daaw;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class I70 {
    public final KeyEvent a;

    public /* synthetic */ I70(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ I70 a(KeyEvent keyEvent) {
        return new I70(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        G10.g(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof I70) && G10.c(keyEvent, ((I70) obj).f());
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
