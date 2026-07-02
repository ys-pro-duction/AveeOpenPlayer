package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class WG2 implements Cloneable {
    public boolean B;
    public int C;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final WG2 clone() {
        try {
            return (WG2) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
