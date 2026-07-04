package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2584Vs0;

/* JADX INFO: loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a();
    public final long B;
    public final long C;
    public final byte[] D;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public /* synthetic */ PrivateCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static PrivateCommand a(C2584Vs0 c2584Vs0, int i, long j) {
        long jZ = c2584Vs0.z();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c2584Vs0.g(bArr, 0, i2);
        return new PrivateCommand(jZ, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeInt(this.D.length);
        parcel.writeByteArray(this.D);
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.B = j2;
        this.C = j;
        this.D = bArr;
    }

    public PrivateCommand(Parcel parcel) {
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.D = bArr;
        parcel.readByteArray(bArr);
    }
}
