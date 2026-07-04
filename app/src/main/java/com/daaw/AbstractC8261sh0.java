package com.daaw;

/* JADX INFO: renamed from: com.daaw.sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8261sh0 extends AbstractC7982rh0 {
    public static int a(int i) {
        return Integer.signum(i);
    }

    public static int b(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }
}
