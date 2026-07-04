package com.daaw;

import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class MJ1 extends FJ1 {
    public final /* synthetic */ BT1 B;

    public MJ1(NJ1 nj1, BT1 bt1) {
        this.B = bt1;
    }

    @Override // com.daaw.GJ1
    public final void O(ParcelFileDescriptor parcelFileDescriptor) {
        this.B.b(parcelFileDescriptor);
    }
}
