package com.daaw;

import com.daaw.AbstractC8071s0;

/* JADX INFO: renamed from: com.daaw.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7235p0 implements NQ {
    public final AbstractC8071s0 B;
    public final AbstractC8071s0.a C;

    public C7235p0(AbstractC8071s0 abstractC8071s0, AbstractC8071s0.a aVar) {
        this.B = abstractC8071s0;
        this.C = aVar;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC8071s0.i(this.B, this.C, obj));
    }
}
