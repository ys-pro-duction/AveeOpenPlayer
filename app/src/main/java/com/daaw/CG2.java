package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class CG2 implements Cloneable {
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CG2 clone() {
        try {
            return (CG2) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
