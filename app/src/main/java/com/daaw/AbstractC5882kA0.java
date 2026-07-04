package com.daaw;

import com.daaw.X60;

/* JADX INFO: renamed from: com.daaw.kA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5882kA0 extends AbstractC7007oA0 implements X60 {
    public AbstractC5882kA0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC9220w50 computeReflected() {
        return AbstractC5624jG0.g(this);
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return get();
    }

    @Override // com.daaw.W60
    public X60.a f() {
        return ((X60) getReflected()).f();
    }
}
