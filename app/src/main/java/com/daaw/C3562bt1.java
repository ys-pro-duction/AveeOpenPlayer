package com.daaw;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.bt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3562bt1 {
    public final int a;
    public final String b;
    public final List c;
    public final byte[] d;

    public C3562bt1(int i, String str, List list, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
        this.d = bArr;
    }
}
