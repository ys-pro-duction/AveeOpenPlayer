package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.g;
import androidx.lifecycle.g;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final int[] B;
    public final ArrayList C;
    public final int[] D;
    public final int[] E;
    public final int F;
    public final String G;
    public final int H;
    public final int I;
    public final CharSequence J;
    public final int K;
    public final CharSequence L;
    public final ArrayList M;
    public final ArrayList N;
    public final boolean O;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackRecordState[] newArray(int i) {
            return new BackStackRecordState[i];
        }
    }

    public BackStackRecordState(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.B = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.C = new ArrayList(size);
        this.D = new int[size];
        this.E = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            g.a aVar2 = (g.a) aVar.c.get(i2);
            int i3 = i + 1;
            this.B[i] = aVar2.a;
            ArrayList arrayList = this.C;
            c cVar = aVar2.b;
            arrayList.add(cVar != null ? cVar.G : null);
            int[] iArr = this.B;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.D[i2] = aVar2.h.ordinal();
            this.E[i2] = aVar2.i.ordinal();
        }
        this.F = aVar.h;
        this.G = aVar.k;
        this.H = aVar.v;
        this.I = aVar.l;
        this.J = aVar.m;
        this.K = aVar.n;
        this.L = aVar.o;
        this.M = aVar.p;
        this.N = aVar.q;
        this.O = aVar.r;
    }

    public final void a(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.B.length) {
                aVar.h = this.F;
                aVar.k = this.G;
                aVar.i = true;
                aVar.l = this.I;
                aVar.m = this.J;
                aVar.n = this.K;
                aVar.o = this.L;
                aVar.p = this.M;
                aVar.q = this.N;
                aVar.r = this.O;
                return;
            }
            g.a aVar2 = new g.a();
            int i3 = i + 1;
            aVar2.a = this.B[i];
            if (FragmentManager.J0(2)) {
                Objects.toString(aVar);
                int i4 = this.B[i3];
            }
            aVar2.h = g.b.values()[this.D[i2]];
            aVar2.i = g.b.values()[this.E[i2]];
            int[] iArr = this.B;
            int i5 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i6 = iArr[i5];
            aVar2.d = i6;
            int i7 = iArr[i + 3];
            aVar2.e = i7;
            int i8 = i + 5;
            int i9 = iArr[i + 4];
            aVar2.f = i9;
            i += 6;
            int i10 = iArr[i8];
            aVar2.g = i10;
            aVar.d = i6;
            aVar.e = i7;
            aVar.f = i9;
            aVar.g = i10;
            aVar.e(aVar2);
            i2++;
        }
    }

    public androidx.fragment.app.a b(FragmentManager fragmentManager) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        a(aVar);
        aVar.v = this.H;
        for (int i = 0; i < this.C.size(); i++) {
            String str = (String) this.C.get(i);
            if (str != null) {
                ((g.a) aVar.c.get(i)).b = fragmentManager.g0(str);
            }
        }
        aVar.q(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.B);
        parcel.writeStringList(this.C);
        parcel.writeIntArray(this.D);
        parcel.writeIntArray(this.E);
        parcel.writeInt(this.F);
        parcel.writeString(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.I);
        TextUtils.writeToParcel(this.J, parcel, 0);
        parcel.writeInt(this.K);
        TextUtils.writeToParcel(this.L, parcel, 0);
        parcel.writeStringList(this.M);
        parcel.writeStringList(this.N);
        parcel.writeInt(this.O ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.B = parcel.createIntArray();
        this.C = parcel.createStringArrayList();
        this.D = parcel.createIntArray();
        this.E = parcel.createIntArray();
        this.F = parcel.readInt();
        this.G = parcel.readString();
        this.H = parcel.readInt();
        this.I = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.J = (CharSequence) creator.createFromParcel(parcel);
        this.K = parcel.readInt();
        this.L = (CharSequence) creator.createFromParcel(parcel);
        this.M = parcel.createStringArrayList();
        this.N = parcel.createStringArrayList();
        this.O = parcel.readInt() != 0;
    }
}
