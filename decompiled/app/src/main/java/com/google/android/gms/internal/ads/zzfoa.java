package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3013Zv1;
import com.daaw.C8939v43;
import com.daaw.HL2;
import com.daaw.JM0;
import com.daaw.U33;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoa> CREATOR = new HL2();
    public final int B;
    public C3013Zv1 C = null;
    public byte[] D;

    public zzfoa(int i, byte[] bArr) {
        this.B = i;
        this.D = bArr;
        zzb();
    }

    public final C3013Zv1 e() {
        if (this.C == null) {
            try {
                this.C = C3013Zv1.I0(this.D, U33.a());
                this.D = null;
            } catch (C8939v43 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.C;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        byte[] bArrH = this.D;
        if (bArrH == null) {
            bArrH = this.C.h();
        }
        JM0.f(parcel, 2, bArrH, false);
        JM0.b(parcel, iA);
    }

    public final void zzb() {
        C3013Zv1 c3013Zv1 = this.C;
        if (c3013Zv1 != null || this.D == null) {
            if (c3013Zv1 == null || this.D != null) {
                if (c3013Zv1 != null && this.D != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (c3013Zv1 != null || this.D != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }
}
