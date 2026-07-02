package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.n72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6715n72 extends AbstractC9351wa2 {
    public boolean C;

    public C6715n72(Set set) {
        super(set);
        this.C = false;
    }

    public final synchronized void zza() {
        if (this.C) {
            return;
        }
        A0(new InterfaceC9072va2() { // from class: com.daaw.m72
            @Override // com.daaw.InterfaceC9072va2
            public final void zza(Object obj) {
                ((InterfaceC7273p72) obj).zzq();
            }
        });
        this.C = true;
    }
}
