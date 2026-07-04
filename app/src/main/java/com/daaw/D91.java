package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class D91 extends RuntimeException {
    public final List B;

    public D91(InterfaceC1900Pj0 interfaceC1900Pj0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.B = null;
    }

    public P10 a() {
        return new P10(getMessage());
    }
}
