package com.daaw;

import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.o60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C6987o60 implements Comparator {
    public final InterfaceC3429bR B;

    public C6987o60(InterfaceC3429bR interfaceC3429bR) {
        this.B = interfaceC3429bR;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC7823r60.D(this.B, obj, obj2);
    }
}
