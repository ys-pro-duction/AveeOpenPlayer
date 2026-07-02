package com.daaw;

/* JADX INFO: renamed from: com.daaw.Hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1081Hm0 {
    public static final YZ0 a = new YZ0("NO_OWNER");
    public static final YZ0 b = new YZ0("ALREADY_LOCKED_BY_OWNER");

    public static final InterfaceC0873Fm0 a(boolean z) {
        return new C0977Gm0(z);
    }

    public static /* synthetic */ InterfaceC0873Fm0 b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }
}
