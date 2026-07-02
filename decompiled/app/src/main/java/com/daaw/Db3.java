package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Db3 extends AbstractC6282lb3 {
    public final Rb3 D;

    public Db3(Rb3 rb3, int i) {
        super(rb3.size(), i);
        this.D = rb3;
    }

    @Override // com.daaw.AbstractC6282lb3
    public final Object a(int i) {
        return this.D.get(i);
    }
}
