package com.daaw;

import com.daaw.InterfaceC3347b70;

/* JADX INFO: renamed from: com.daaw.mA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6449mA0 extends AbstractC7007oA0 implements InterfaceC3347b70 {
    public AbstractC6449mA0() {
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC9220w50 computeReflected() {
        return AbstractC5624jG0.h(this);
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return get(obj);
    }

    public AbstractC6449mA0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // com.daaw.W60
    /* JADX INFO: renamed from: f */
    public InterfaceC3347b70.a f0() {
        return ((InterfaceC3347b70) getReflected()).f0();
    }
}
