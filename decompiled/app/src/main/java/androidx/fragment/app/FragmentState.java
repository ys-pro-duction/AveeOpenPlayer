package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String B;
    public final String C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final int G;
    public final String H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final int M;
    public final String N;
    public final int O;
    public final boolean P;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(c cVar) {
        this.B = cVar.getClass().getName();
        this.C = cVar.G;
        this.D = cVar.Q;
        this.E = cVar.S;
        this.F = cVar.a0;
        this.G = cVar.b0;
        this.H = cVar.c0;
        this.I = cVar.f0;
        this.J = cVar.N;
        this.K = cVar.e0;
        this.L = cVar.d0;
        this.M = cVar.v0.ordinal();
        this.N = cVar.J;
        this.O = cVar.K;
        this.P = cVar.n0;
    }

    public c a(e eVar, ClassLoader classLoader) {
        c cVarA = eVar.a(classLoader, this.B);
        cVarA.G = this.C;
        cVarA.Q = this.D;
        cVarA.S = this.E;
        cVarA.T = true;
        cVarA.a0 = this.F;
        cVarA.b0 = this.G;
        cVarA.c0 = this.H;
        cVarA.f0 = this.I;
        cVarA.N = this.J;
        cVarA.e0 = this.K;
        cVarA.d0 = this.L;
        cVarA.v0 = g.b.values()[this.M];
        cVarA.J = this.N;
        cVarA.K = this.O;
        cVarA.n0 = this.P;
        return cVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.B);
        sb.append(" (");
        sb.append(this.C);
        sb.append(")}:");
        if (this.D) {
            sb.append(" fromLayout");
        }
        if (this.E) {
            sb.append(" dynamicContainer");
        }
        if (this.G != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.G));
        }
        String str = this.H;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.H);
        }
        if (this.I) {
            sb.append(" retainInstance");
        }
        if (this.J) {
            sb.append(" removing");
        }
        if (this.K) {
            sb.append(" detached");
        }
        if (this.L) {
            sb.append(" hidden");
        }
        if (this.N != null) {
            sb.append(" targetWho=");
            sb.append(this.N);
            sb.append(" targetRequestCode=");
            sb.append(this.O);
        }
        if (this.P) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeString(this.H);
        parcel.writeInt(this.I ? 1 : 0);
        parcel.writeInt(this.J ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O);
        parcel.writeInt(this.P ? 1 : 0);
    }

    public FragmentState(Parcel parcel) {
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readInt() != 0;
        this.E = parcel.readInt() != 0;
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readString();
        this.I = parcel.readInt() != 0;
        this.J = parcel.readInt() != 0;
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt() != 0;
        this.M = parcel.readInt();
        this.N = parcel.readString();
        this.O = parcel.readInt();
        this.P = parcel.readInt() != 0;
    }
}
