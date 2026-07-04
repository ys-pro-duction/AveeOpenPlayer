package com.daaw;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.az1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3308az1 {
    public final Map a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                if (!this.a.containsKey(str)) {
                    this.a.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
