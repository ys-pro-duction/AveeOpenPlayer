package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.rN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7897rN2 extends AbstractBinderC6674mz1 implements InterfaceC8176sN2 {
    public AbstractBinderC7897rN2() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
        AbstractC6953nz1.c(parcel);
        H1(bundle);
        return true;
    }
}
