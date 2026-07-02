package com.daaw;

/* JADX INFO: renamed from: com.daaw.sJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC8157sJ {

    /* JADX INFO: renamed from: com.daaw.sJ$a */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* JADX INFO: renamed from: com.daaw.sJ$b */
    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    b a(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC4923gl interfaceC4923gl);

    a b();
}
