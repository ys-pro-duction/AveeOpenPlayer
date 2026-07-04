package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class O53 extends IllegalArgumentException {
    public O53(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
