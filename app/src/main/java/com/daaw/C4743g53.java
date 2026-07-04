package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.g53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4743g53 extends AbstractC6975o33 {
    public final C5860k53 B;
    public InterfaceC7533q33 C = a();
    public final /* synthetic */ C7543q53 D;

    public C4743g53(C7543q53 c7543q53) {
        this.D = c7543q53;
        this.B = new C5860k53(c7543q53, null);
    }

    public final InterfaceC7533q33 a() {
        C5860k53 c5860k53 = this.B;
        if (c5860k53.hasNext()) {
            return c5860k53.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.C != null;
    }

    @Override // com.daaw.InterfaceC7533q33
    public final byte zza() {
        InterfaceC7533q33 interfaceC7533q33 = this.C;
        if (interfaceC7533q33 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = interfaceC7533q33.zza();
        if (!this.C.hasNext()) {
            this.C = a();
        }
        return bZza;
    }
}
