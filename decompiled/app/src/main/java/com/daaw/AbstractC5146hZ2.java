package com.daaw;

import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: com.daaw.hZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5146hZ2 {
    public static final C4439f23 a;
    public static final C4439f23 b;
    public static final C4439f23 c;

    static {
        new WY2();
        C4439f23 c4439f23N = C4439f23.N();
        a = c4439f23N;
        b = c4439f23N;
        c = c4439f23N;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        C6830nZ2.b();
        NY2.b();
        WY2.l(true);
        if (UW2.b()) {
            return;
        }
        C10180zY2.m(true);
    }
}
