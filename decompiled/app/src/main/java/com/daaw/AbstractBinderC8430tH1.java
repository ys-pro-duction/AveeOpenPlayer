package com.daaw;

import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.tH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC8430tH1 extends AbstractBinderC6674mz1 implements InterfaceC8709uH1 {
    public AbstractBinderC8430tH1() {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            e(string);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
