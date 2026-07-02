package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class S92 extends K72 {
    public final AbstractC4308eb2 D;

    public S92(AbstractC4308eb2 abstractC4308eb2, int i) {
        super(abstractC4308eb2.size(), i);
        this.D = abstractC4308eb2;
    }

    @Override // com.daaw.K72
    public final Object a(int i) {
        return this.D.get(i);
    }
}
