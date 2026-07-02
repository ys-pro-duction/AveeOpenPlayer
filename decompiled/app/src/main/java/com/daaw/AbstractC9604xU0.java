package com.daaw;

/* JADX INFO: renamed from: com.daaw.xU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9604xU0 {
    public static final Object a = new Object();

    public static final Void d() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    public static final void e(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }
}
