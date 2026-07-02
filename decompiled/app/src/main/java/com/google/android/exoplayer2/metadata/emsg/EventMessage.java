package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6280lb1;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();
    public final String B;
    public final String C;
    public final long D;
    public final long E;
    public final long F;
    public final byte[] G;
    public int H;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.B = str;
        this.C = str2;
        this.D = j;
        this.F = j2;
        this.G = bArr;
        this.E = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && EventMessage.class == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            if (this.E == eventMessage.E && this.D == eventMessage.D && this.F == eventMessage.F && AbstractC6280lb1.b(this.B, eventMessage.B) && AbstractC6280lb1.b(this.C, eventMessage.C) && Arrays.equals(this.G, eventMessage.G)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.B;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.C;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.E;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.D;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.F;
            this.H = ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.G);
        }
        return this.H;
    }

    public String toString() {
        return "EMSG: scheme=" + this.B + ", id=" + this.F + ", value=" + this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeLong(this.E);
        parcel.writeLong(this.D);
        parcel.writeLong(this.F);
        parcel.writeByteArray(this.G);
    }

    public EventMessage(Parcel parcel) {
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.E = parcel.readLong();
        this.D = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.createByteArray();
    }
}
