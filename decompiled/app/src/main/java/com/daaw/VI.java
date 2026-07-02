package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class VI extends Exception {
    public final int B;
    public final int C;

    public VI(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.B = i;
        this.C = i2;
    }

    public static VI a(Exception exc, int i) {
        return new VI(1, null, exc, i);
    }

    public static VI b(IOException iOException) {
        return new VI(0, null, iOException, -1);
    }

    public static VI c(RuntimeException runtimeException) {
        return new VI(2, null, runtimeException, -1);
    }
}
