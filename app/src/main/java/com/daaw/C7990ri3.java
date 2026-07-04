package com.daaw;

/* JADX INFO: renamed from: com.daaw.ri3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7990ri3 extends IllegalArgumentException {
    public C7990ri3(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
