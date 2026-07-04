package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.gJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4802gJ1 implements HI1 {
    public final C7447pl2 a;

    public C4802gJ1(C7447pl2 c7447pl2) {
        AbstractC7506py0.m(c7447pl2, "The Inspector Manager must not be null");
        this.a = c7447pl2;
    }

    @Override // com.daaw.HI1
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.a.i((String) map.get("extras"), j);
    }
}
