package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int B;
    public final long C;
    public final long D;
    public final float E;
    public final long F;
    public final int G;
    public final CharSequence H;
    public final long I;
    public List J;
    public final long K;
    public final Bundle L;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String B;
        public final CharSequence C;
        public final int D;
        public final Bundle E;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.B = parcel.readString();
            this.C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.D = parcel.readInt();
            this.E = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.C) + ", mIcon=" + this.D + ", mExtras=" + this.E;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.B);
            TextUtils.writeToParcel(this.C, parcel, i);
            parcel.writeInt(this.D);
            parcel.writeBundle(this.E);
        }
    }

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.B = parcel.readInt();
        this.C = parcel.readLong();
        this.E = parcel.readFloat();
        this.I = parcel.readLong();
        this.D = parcel.readLong();
        this.F = parcel.readLong();
        this.H = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.J = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.K = parcel.readLong();
        this.L = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.G = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.B + ", position=" + this.C + ", buffered position=" + this.D + ", speed=" + this.E + ", updated=" + this.I + ", actions=" + this.F + ", error code=" + this.G + ", error message=" + this.H + ", custom actions=" + this.J + ", active item id=" + this.K + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.B);
        parcel.writeLong(this.C);
        parcel.writeFloat(this.E);
        parcel.writeLong(this.I);
        parcel.writeLong(this.D);
        parcel.writeLong(this.F);
        TextUtils.writeToParcel(this.H, parcel, i);
        parcel.writeTypedList(this.J);
        parcel.writeLong(this.K);
        parcel.writeBundle(this.L);
        parcel.writeInt(this.G);
    }
}
