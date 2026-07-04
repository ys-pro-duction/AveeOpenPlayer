package com.daaw;

/* JADX INFO: renamed from: com.daaw.q81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C7556q81 implements NQ {
    public final AbstractC7834r81 B;

    public C7556q81(AbstractC7834r81 abstractC7834r81) {
        this.B = abstractC7834r81;
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return Integer.valueOf(AbstractC7834r81.f(this.B, (String) obj));
    }
}
