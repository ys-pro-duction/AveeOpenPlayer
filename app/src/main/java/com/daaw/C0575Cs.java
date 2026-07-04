package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0575Cs implements InterfaceC7484pt {
    public final InterfaceC4684ft B;

    public C0575Cs(InterfaceC4684ft interfaceC4684ft) {
        this.B = interfaceC4684ft;
    }

    @Override // com.daaw.InterfaceC7484pt
    public InterfaceC4684ft i() {
        return this.B;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + i() + ')';
    }
}
