package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC1583Mi extends InterfaceC1376Ki, InterfaceC2232Si0 {

    /* JADX INFO: renamed from: com.daaw.Mi$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    InterfaceC1583Mi I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, a aVar, boolean z);

    @Override // com.daaw.InterfaceC1376Ki, com.daaw.InterfaceC8612tw
    InterfaceC1583Mi a();

    @Override // com.daaw.InterfaceC1376Ki
    Collection e();

    a i();

    void v0(Collection collection);
}
