package com.daaw;

import com.daaw.F60;
import com.daaw.InterfaceC3347b70;

/* JADX INFO: renamed from: com.daaw.km0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6046km0 extends AbstractC6613mm0 implements F60 {
    public AbstractC6046km0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // com.daaw.AbstractC1687Ni
    public InterfaceC9220w50 computeReflected() {
        return AbstractC5624jG0.e(this);
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // com.daaw.W60
    /* JADX INFO: renamed from: f */
    public InterfaceC3347b70.a f0() {
        return ((F60) getReflected()).f0();
    }

    @Override // com.daaw.C60
    public F60.a g() {
        return ((F60) getReflected()).g();
    }
}
