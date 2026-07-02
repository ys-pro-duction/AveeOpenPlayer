package com.daaw;

/* JADX INFO: renamed from: com.daaw.r00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7793r00 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7793r00(String str, Exception exc) {
        super(str, exc);
        G10.g(str, "msg");
        G10.g(exc, "parent");
    }
}
