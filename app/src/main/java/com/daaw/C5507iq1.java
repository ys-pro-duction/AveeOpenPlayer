package com.daaw;

/* JADX INFO: renamed from: com.daaw.iq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5507iq1 extends AbstractC2877Yn1 {
    public final AbstractC9714xr1 D;

    public C5507iq1(AbstractC9714xr1 abstractC9714xr1, int i) {
        super(abstractC9714xr1.size(), i);
        this.D = abstractC9714xr1;
    }

    @Override // com.daaw.AbstractC2877Yn1
    public final Object a(int i) {
        return this.D.get(i);
    }
}
