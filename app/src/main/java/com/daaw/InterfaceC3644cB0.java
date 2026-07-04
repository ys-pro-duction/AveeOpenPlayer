package com.daaw;

/* JADX INFO: renamed from: com.daaw.cB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public @interface InterfaceC3644cB0 {

    /* JADX INFO: renamed from: com.daaw.cB0$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
