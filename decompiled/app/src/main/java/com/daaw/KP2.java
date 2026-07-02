package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class KP2 extends AbstractC4259eP2 implements Serializable {
    public final Object B;
    public final Object C;

    public KP2(Object obj, Object obj2) {
        this.B = obj;
        this.C = obj2;
    }

    @Override // com.daaw.AbstractC4259eP2, java.util.Map.Entry
    public final Object getKey() {
        return this.B;
    }

    @Override // com.daaw.AbstractC4259eP2, java.util.Map.Entry
    public final Object getValue() {
        return this.C;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
