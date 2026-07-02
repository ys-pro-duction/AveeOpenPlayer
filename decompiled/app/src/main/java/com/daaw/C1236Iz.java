package com.daaw;

/* JADX INFO: renamed from: com.daaw.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1236Iz implements InterfaceC3429bR {
    public final InterfaceC1376Ki B;
    public final InterfaceC1376Ki C;

    public C1236Iz(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2) {
        this.B = interfaceC1376Ki;
        this.C = interfaceC1376Ki2;
    }

    @Override // com.daaw.InterfaceC3429bR
    public Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(C1340Jz.i(this.B, this.C, (InterfaceC8612tw) obj, (InterfaceC8612tw) obj2));
    }
}
