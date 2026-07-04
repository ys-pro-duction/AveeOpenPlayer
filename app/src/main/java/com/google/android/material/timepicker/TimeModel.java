package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C0324Ah0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();
    public final C0324Ah0 B;
    public final C0324Ah0 C;
    public final int D;
    public int E;
    public int F;
    public int G;
    public int H;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.E = i;
        this.F = i2;
        this.G = i3;
        this.D = i4;
        this.H = c(i);
        this.B = new C0324Ah0(59);
        this.C = new C0324Ah0(i4 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.E == timeModel.E && this.F == timeModel.F && this.D == timeModel.D && this.G == timeModel.G;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.D);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
