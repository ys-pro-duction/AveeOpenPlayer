package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2584Vs0;
import com.daaw.R31;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();
    public final long B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final long G;
    public final long H;
    public final List I;
    public final boolean J;
    public final long K;
    public final int L;
    public final int M;
    public final int N;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand a(C2584Vs0 c2584Vs0, long j, R31 r31) {
        List list;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int iX;
        int iX2;
        boolean z5;
        int i2;
        long jB;
        long jZ = c2584Vs0.z();
        boolean z6 = (c2584Vs0.x() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jZ2 = -9223372036854775807L;
        if (z6) {
            list = list2;
            j2 = -9223372036854775807L;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 0;
            iX = 0;
            iX2 = 0;
        } else {
            int iX3 = c2584Vs0.x();
            boolean z7 = (iX3 & 128) != 0;
            boolean z8 = (iX3 & 64) != 0;
            boolean z9 = (iX3 & 32) != 0;
            boolean z10 = (iX3 & 16) != 0;
            long jB2 = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.b(c2584Vs0, j);
            if (!z8) {
                int iX4 = c2584Vs0.x();
                ArrayList arrayList = new ArrayList(iX4);
                int i3 = 0;
                while (i3 < iX4) {
                    int iX5 = c2584Vs0.x();
                    if (z10) {
                        i2 = iX4;
                        jB = -9223372036854775807L;
                    } else {
                        i2 = iX4;
                        jB = TimeSignalCommand.b(c2584Vs0, j);
                    }
                    arrayList.add(new b(iX5, jB, r31.b(jB), null));
                    i3++;
                    iX4 = i2;
                }
                list2 = arrayList;
            }
            if (z9) {
                long jX = c2584Vs0.x();
                boolean z11 = (128 & jX) != 0;
                jZ2 = ((((jX & 1) << 32) | c2584Vs0.z()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
            }
            int iD = c2584Vs0.D();
            long j3 = jB2;
            j2 = jZ2;
            jZ2 = j3;
            iX = c2584Vs0.x();
            iX2 = c2584Vs0.x();
            i = iD;
            z4 = z5;
            z = z7;
            z2 = z8;
            list = list2;
            z3 = z10;
        }
        return new SpliceInsertCommand(jZ, z6, z, z2, z3, jZ2, r31.b(jZ2), list, z4, j2, i, iX, iX2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.B);
        parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        int size = this.I.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.I.get(i2)).b(parcel);
        }
        parcel.writeByte(this.J ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.B = j;
        this.C = z;
        this.D = z2;
        this.E = z3;
        this.F = z4;
        this.G = j2;
        this.H = j3;
        this.I = DesugarCollections.unmodifiableList(list);
        this.J = z5;
        this.K = j4;
        this.L = i;
        this.M = i2;
        this.N = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.B = parcel.readLong();
        this.C = parcel.readByte() == 1;
        this.D = parcel.readByte() == 1;
        this.E = parcel.readByte() == 1;
        this.F = parcel.readByte() == 1;
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.I = DesugarCollections.unmodifiableList(arrayList);
        this.J = parcel.readByte() == 1;
        this.K = parcel.readLong();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
    }
}
