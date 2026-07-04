package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.XA1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaxe> CREATOR = new XA1();
    public ParcelFileDescriptor B;
    public final boolean C;
    public final boolean D;
    public final long E;
    public final boolean F;

    public zzaxe() {
        this(null, false, false, 0L, false);
    }

    public final synchronized boolean D() {
        return this.D;
    }

    public final synchronized boolean E() {
        return this.F;
    }

    public final synchronized long e() {
        return this.E;
    }

    public final synchronized ParcelFileDescriptor m() {
        return this.B;
    }

    public final synchronized InputStream p() {
        if (this.B == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.B);
        this.B = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean s() {
        return this.C;
    }

    public final synchronized boolean v() {
        return this.B != null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.p(parcel, 2, m(), i, false);
        JM0.c(parcel, 3, s());
        JM0.c(parcel, 4, D());
        JM0.n(parcel, 5, e());
        JM0.c(parcel, 6, E());
        JM0.b(parcel, iA);
    }

    public zzaxe(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.B = parcelFileDescriptor;
        this.C = z;
        this.D = z2;
        this.E = j;
        this.F = z3;
    }
}
