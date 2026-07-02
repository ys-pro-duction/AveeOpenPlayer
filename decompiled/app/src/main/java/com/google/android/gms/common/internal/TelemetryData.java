package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C1801Ok1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C1801Ok1();
    public final int B;
    public List C;

    public TelemetryData(int i, List list) {
        this.B = i;
        this.C = list;
    }

    public final int e() {
        return this.B;
    }

    public final List m() {
        return this.C;
    }

    public final void p(MethodInvocation methodInvocation) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(methodInvocation);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, this.B);
        JM0.u(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }
}
