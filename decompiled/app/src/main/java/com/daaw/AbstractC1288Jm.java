package com.daaw;

/* JADX INFO: renamed from: com.daaw.Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1288Jm {
    public static StringBuilder a(int i) {
        AbstractC0768Em.b(i, "size");
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }
}
