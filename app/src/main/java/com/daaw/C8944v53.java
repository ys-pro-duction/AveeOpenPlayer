package com.daaw;

/* JADX INFO: renamed from: com.daaw.v53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8944v53 extends RuntimeException {
    public C8944v53(U43 u43) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final C8939v43 a() {
        return new C8939v43(getMessage());
    }
}
