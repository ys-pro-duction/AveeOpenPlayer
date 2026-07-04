package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class AC extends AbstractC2751Xi {
    public final InterfaceC9531xC B;

    public AC(InterfaceC9531xC interfaceC9531xC) {
        this.B = interfaceC9531xC;
    }

    @Override // com.daaw.AbstractC2855Yi
    public void a(Throwable th) {
        this.B.a();
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return G91.a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.B + ']';
    }
}
