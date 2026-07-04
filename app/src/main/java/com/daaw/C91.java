package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class C91 extends RuntimeException {
    public final List B;

    public C91(InterfaceC2026Qj0 interfaceC2026Qj0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.B = null;
    }

    public Q10 a() {
        return new Q10(getMessage());
    }
}
