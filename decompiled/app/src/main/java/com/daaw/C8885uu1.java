package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.uu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8885uu1 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((byte[]) obj).length - ((byte[]) obj2).length;
    }
}
