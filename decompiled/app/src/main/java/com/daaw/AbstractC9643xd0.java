package com.daaw;

/* JADX INFO: renamed from: com.daaw.xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9643xd0 {
    public static final Object a = new YZ0("CONDITION_FALSE");

    public static final Object a() {
        return a;
    }

    public static final C9922yd0 b(Object obj) {
        C9922yd0 c9922yd0;
        SG0 sg0 = obj instanceof SG0 ? (SG0) obj : null;
        if (sg0 != null && (c9922yd0 = sg0.a) != null) {
            return c9922yd0;
        }
        G10.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C9922yd0) obj;
    }
}
