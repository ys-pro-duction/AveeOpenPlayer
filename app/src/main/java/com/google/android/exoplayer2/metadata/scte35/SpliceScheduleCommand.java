package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2584Vs0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();
    public final List B;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceScheduleCommand a(C2584Vs0 c2584Vs0) {
        int iX = c2584Vs0.x();
        ArrayList arrayList = new ArrayList(iX);
        for (int i = 0; i < iX; i++) {
            arrayList.add(c.e(c2584Vs0));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.B.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((c) this.B.get(i2)).f(parcel);
        }
    }

    public SpliceScheduleCommand(List list) {
        this.B = DesugarCollections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(c.d(parcel));
        }
        this.B = DesugarCollections.unmodifiableList(arrayList);
    }

    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        public c(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = DesugarCollections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(C2584Vs0 c2584Vs0) {
            ArrayList arrayList;
            boolean z;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int iX;
            boolean z4;
            long jZ;
            long jZ2 = c2584Vs0.z();
            boolean z5 = (c2584Vs0.x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iX = 0;
            } else {
                int iX2 = c2584Vs0.x();
                boolean z6 = (iX2 & 128) != 0;
                boolean z7 = (iX2 & 64) != 0;
                boolean z8 = (iX2 & 32) != 0;
                long jZ3 = z7 ? c2584Vs0.z() : -9223372036854775807L;
                if (!z7) {
                    int iX3 = c2584Vs0.x();
                    ArrayList arrayList3 = new ArrayList(iX3);
                    int i3 = 0;
                    while (i3 < iX3) {
                        arrayList3.add(new b(c2584Vs0.x(), c2584Vs0.z(), null));
                        i3++;
                        iX3 = iX3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jX = c2584Vs0.x();
                    boolean z9 = (128 & jX) != 0;
                    jZ = ((((jX & 1) << 32) | c2584Vs0.z()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jZ = -9223372036854775807L;
                }
                int iD = c2584Vs0.D();
                int iX4 = c2584Vs0.x();
                boolean z10 = z6;
                z3 = z4;
                z = z10;
                iX = c2584Vs0.x();
                long j3 = jZ3;
                i = iD;
                i2 = iX4;
                long j4 = jZ;
                arrayList = arrayList2;
                z2 = z7;
                j = j3;
                j2 = j4;
            }
            return new c(jZ2, z5, z, z2, arrayList, j, z3, j2, i, i2, iX);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((b) this.f.get(i)).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(b.c(parcel));
            }
            this.f = DesugarCollections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }
}
