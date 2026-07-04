package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2584Vs0;
import com.daaw.R31;

/* JADX INFO: loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();
    public final long B;
    public final long C;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static TimeSignalCommand a(C2584Vs0 c2584Vs0, long j, R31 r31) {
        long jB = b(c2584Vs0, j);
        return new TimeSignalCommand(jB, r31.b(jB));
    }

    public static long b(C2584Vs0 c2584Vs0, long j) {
        long jX = c2584Vs0.x();
        if ((128 & jX) != 0) {
            return 8589934591L & ((((jX & 1) << 32) | c2584Vs0.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
    }

    public TimeSignalCommand(long j, long j2) {
        this.B = j;
        this.C = j2;
    }
}
