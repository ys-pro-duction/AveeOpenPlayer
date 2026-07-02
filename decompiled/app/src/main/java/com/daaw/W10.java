package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class W10 extends AbstractC2751Xi {
    public final NQ B;

    public W10(NQ nq) {
        this.B = nq;
    }

    @Override // com.daaw.AbstractC2855Yi
    public void a(Throwable th) {
        this.B.invoke(th);
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return G91.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + AbstractC8054rw.a(this.B) + '@' + AbstractC8054rw.b(this) + ']';
    }
}
