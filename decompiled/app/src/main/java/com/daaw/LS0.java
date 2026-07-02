package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public class LS0 implements FX {
    public short a;
    public int b;

    public LS0(short s, int i) {
        this.a = s;
        this.b = i;
    }

    @Override // com.daaw.FX
    public short get(int i) {
        return this.a;
    }

    @Override // com.daaw.FX
    public int size() {
        return this.b;
    }
}
