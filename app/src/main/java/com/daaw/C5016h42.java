package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.h42, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5016h42 implements InterfaceC6700n42 {
    public final Map a;

    public C5016h42(Map map) {
        this.a = map;
    }

    @Override // com.daaw.InterfaceC6700n42
    public final InterfaceC2682Wq2 a(int i, String str) {
        return (InterfaceC2682Wq2) this.a.get(str);
    }
}
