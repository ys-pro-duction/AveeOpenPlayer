package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC7359pS1;
import com.daaw.AbstractC7451pm1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC7451pm1 implements b {
    public c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account zzb() {
        Parcel parcelB = B(2, G());
        Account account = (Account) AbstractC7359pS1.a(parcelB, Account.CREATOR);
        parcelB.recycle();
        return account;
    }
}
