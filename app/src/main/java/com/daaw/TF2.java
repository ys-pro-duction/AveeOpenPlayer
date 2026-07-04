package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class TF2 extends RuntimeException {
    public TF2(InterfaceC7467pp2 interfaceC7467pp2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final U92 a() {
        return new U92(getMessage());
    }
}
