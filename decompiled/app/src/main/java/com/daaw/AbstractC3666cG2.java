package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.cG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC3666cG2 {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!AbstractC0552Cm0.a(atomicReference, null, obj2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }
}
