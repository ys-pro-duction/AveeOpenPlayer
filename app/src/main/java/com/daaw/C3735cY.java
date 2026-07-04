package com.daaw;

/* JADX INFO: renamed from: com.daaw.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3735cY extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3735cY(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        G10.g(illegalAccessException, "cause");
    }
}
