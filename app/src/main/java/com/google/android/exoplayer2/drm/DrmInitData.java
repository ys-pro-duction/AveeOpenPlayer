package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC6025ki;
import com.daaw.AbstractC6280lb1;
import com.daaw.AbstractC7115ob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();
    public final SchemeData[] B;
    public int C;
    public final String D;
    public final int E;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();
        public int B;
        public final UUID C;
        public final String D;
        public final byte[] E;
        public final boolean F;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public boolean b(SchemeData schemeData) {
            return c() && !schemeData.c() && d(schemeData.C);
        }

        public boolean c() {
            return this.E != null;
        }

        public boolean d(UUID uuid) {
            return AbstractC6025ki.b.equals(this.C) || uuid.equals(this.C);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return this.D.equals(schemeData.D) && AbstractC6280lb1.b(this.C, schemeData.C) && Arrays.equals(this.E, schemeData.E);
        }

        public int hashCode() {
            if (this.B == 0) {
                this.B = (((this.C.hashCode() * 31) + this.D.hashCode()) * 31) + Arrays.hashCode(this.E);
            }
            return this.B;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.C.getMostSignificantBits());
            parcel.writeLong(this.C.getLeastSignificantBits());
            parcel.writeString(this.D);
            parcel.writeByteArray(this.E);
            parcel.writeByte(this.F ? (byte) 1 : (byte) 0);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.C = (UUID) AbstractC7115ob.e(uuid);
            this.D = (String) AbstractC7115ob.e(str);
            this.E = bArr;
            this.F = z;
        }

        public SchemeData(Parcel parcel) {
            this.C = new UUID(parcel.readLong(), parcel.readLong());
            this.D = parcel.readString();
            this.E = parcel.createByteArray();
            this.F = parcel.readByte() != 0;
        }
    }

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public static boolean b(ArrayList arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((SchemeData) arrayList.get(i2)).C.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData d(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.D;
            for (SchemeData schemeData : drmInitData.B) {
                if (schemeData.c()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.D;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.B) {
                if (schemeData2.c() && !b(arrayList, size, schemeData2.C)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = AbstractC6025ki.b;
        return uuid.equals(schemeData.C) ? uuid.equals(schemeData2.C) ? 0 : 1 : schemeData.C.compareTo(schemeData2.C);
    }

    public DrmInitData c(String str) {
        return AbstractC6280lb1.b(this.D, str) ? this : new DrmInitData(str, false, this.B);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SchemeData e(int i) {
        return this.B[i];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (AbstractC6280lb1.b(this.D, drmInitData.D) && Arrays.equals(this.B, drmInitData.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.C == 0) {
            String str = this.D;
            this.C = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.B);
        }
        return this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.D);
        parcel.writeTypedArray(this.B, 0);
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.D = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.B = schemeDataArr;
        this.E = schemeDataArr.length;
    }

    public DrmInitData(Parcel parcel) {
        this.D = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.B = schemeDataArr;
        this.E = schemeDataArr.length;
    }
}
