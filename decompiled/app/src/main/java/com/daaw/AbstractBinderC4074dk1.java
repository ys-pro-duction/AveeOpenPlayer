package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.dk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4074dk1 extends AbstractBinderC1901Pj1 implements InterfaceC4641fk1 {
    public AbstractBinderC4074dk1() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // com.daaw.AbstractBinderC1901Pj1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2131Rj1.a(parcel, Bundle.CREATOR);
        AbstractC2131Rj1.b(parcel);
        f1(bundle);
        return true;
    }
}
