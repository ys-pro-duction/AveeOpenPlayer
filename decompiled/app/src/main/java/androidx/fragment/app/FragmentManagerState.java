package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList B;
    public ArrayList C;
    public BackStackRecordState[] D;
    public int E;
    public String F;
    public ArrayList G;
    public ArrayList H;
    public ArrayList I;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
        this.F = null;
        this.G = new ArrayList();
        this.H = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.B);
        parcel.writeStringList(this.C);
        parcel.writeTypedArray(this.D, i);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        parcel.writeStringList(this.G);
        parcel.writeTypedList(this.H);
        parcel.writeTypedList(this.I);
    }

    public FragmentManagerState(Parcel parcel) {
        this.F = null;
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.B = parcel.createStringArrayList();
        this.C = parcel.createStringArrayList();
        this.D = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.E = parcel.readInt();
        this.F = parcel.readString();
        this.G = parcel.createStringArrayList();
        this.H = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.I = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
