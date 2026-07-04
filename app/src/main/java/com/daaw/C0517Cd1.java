package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: com.daaw.Cd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0517Cd1 extends AbstractC0413Bd1 {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public C0517Cd1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2407Ua(), new C2407Ua(), new C2407Ua());
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
        } else {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
        }
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void E(int i) {
        this.e.writeInt(i);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int iDataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(iDataPosition - i2);
            this.e.setDataPosition(iDataPosition);
        }
    }

    @Override // com.daaw.AbstractC0413Bd1
    public AbstractC0413Bd1 b() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new C0517Cd1(parcel, iDataPosition, i, this.h + "  ", this.a, this.b, this.c);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // com.daaw.AbstractC0413Bd1
    public byte[] i() {
        int i = this.e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // com.daaw.AbstractC0413Bd1
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int i3 = this.e.readInt();
            this.k = this.e.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // com.daaw.AbstractC0413Bd1
    public int o() {
        return this.e.readInt();
    }

    @Override // com.daaw.AbstractC0413Bd1
    public Parcelable q() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // com.daaw.AbstractC0413Bd1
    public String s() {
        return this.e.readString();
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void w(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        E(0);
        E(i);
    }

    @Override // com.daaw.AbstractC0413Bd1
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public C0517Cd1(Parcel parcel, int i, int i2, String str, C2407Ua c2407Ua, C2407Ua c2407Ua2, C2407Ua c2407Ua3) {
        super(c2407Ua, c2407Ua2, c2407Ua3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
