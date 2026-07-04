package com.daaw;

/* JADX INFO: renamed from: com.daaw.dJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3955dJ0 extends AbstractC7409pe {
    public AbstractC3955dJ0(InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC1416Ks);
        if (interfaceC1416Ks != null && interfaceC1416Ks.getContext() != C5905kG.B) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return C5905kG.B;
    }
}
