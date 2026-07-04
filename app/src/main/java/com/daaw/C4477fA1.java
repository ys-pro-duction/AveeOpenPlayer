package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.fA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4477fA1 implements Comparator {
    public C4477fA1(C6729nA1 c6729nA1) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C7566qA1 c7566qA1 = (C7566qA1) obj;
        C7566qA1 c7566qA12 = (C7566qA1) obj2;
        int i = c7566qA1.c - c7566qA12.c;
        return i != 0 ? i : (c7566qA1.a > c7566qA12.a ? 1 : (c7566qA1.a == c7566qA12.a ? 0 : -1));
    }
}
