package com.daaw;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class FZ implements O90, Serializable {
    public final Object B;

    public FZ(Object obj) {
        this.B = obj;
    }

    @Override // com.daaw.O90
    public Object getValue() {
        return this.B;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
