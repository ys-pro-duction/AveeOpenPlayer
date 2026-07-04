package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.jP2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5665jP2 {
    public static boolean a(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
