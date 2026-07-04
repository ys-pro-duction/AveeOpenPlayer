package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class IM0 {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static void A(Parcel parcel, int i, int i2) {
        int iW = w(parcel, i);
        if (iW == i2) {
            return;
        }
        throw new a("Expected size " + i2 + " got " + iW + " (0x" + Integer.toHexString(iW) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iW);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iW);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iW);
        return iArrCreateIntArray;
    }

    public static ArrayList d(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = parcel.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iW);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iW);
        return parcelable;
    }

    public static String f(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iW);
        return string;
    }

    public static String[] g(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iW);
        return strArrCreateStringArray;
    }

    public static ArrayList h(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateStringArrayList;
    }

    public static Object[] i(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return objArrCreateTypedArray;
    }

    public static ArrayList j(Parcel parcel, int i, Parcelable.Creator creator) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iW);
        return arrayListCreateTypedArrayList;
    }

    public static void k(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new a("Overread allowed size end=" + i, parcel);
    }

    public static int l(int i) {
        return (char) i;
    }

    public static boolean m(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i) {
        int iW = w(parcel, i);
        if (iW == 0) {
            return null;
        }
        z(parcel, i, iW, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i) {
        int iW = w(parcel, i);
        if (iW == 0) {
            return null;
        }
        z(parcel, i, iW, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readFloat();
    }

    public static Float q(Parcel parcel, int i) {
        int iW = w(parcel, i);
        if (iW == 0) {
            return null;
        }
        z(parcel, i, iW, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int r(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder s(Parcel parcel, int i) {
        int iW = w(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iW == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iW);
        return strongBinder;
    }

    public static int t(Parcel parcel, int i) {
        A(parcel, i, 4);
        return parcel.readInt();
    }

    public static long u(Parcel parcel, int i) {
        A(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long v(Parcel parcel, int i) {
        int iW = w(parcel, i);
        if (iW == 0) {
            return null;
        }
        z(parcel, i, iW, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int w(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void x(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + w(parcel, i));
    }

    public static int y(Parcel parcel) {
        int iR = r(parcel);
        int iW = w(parcel, iR);
        int iL = l(iR);
        int iDataPosition = parcel.dataPosition();
        if (iL != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iR))), parcel);
        }
        int i = iW + iDataPosition;
        if (i >= iDataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i, parcel);
    }

    public static void z(Parcel parcel, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        throw new a("Expected size " + i3 + " got " + i2 + " (0x" + Integer.toHexString(i2) + ")", parcel);
    }
}
