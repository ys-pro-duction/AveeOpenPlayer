package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8245se;
import com.daaw.G10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\u001b!B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "Lcom/daaw/G91;", "writeToParcel", "(Landroid/os/Parcel;I)V", "B", "Landroid/content/IntentSender;", "d", "()Landroid/content/IntentSender;", "C", "Landroid/content/Intent;", "a", "()Landroid/content/Intent;", "D", "I", "b", "E", "c", "F", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentSenderRequest implements Parcelable {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final IntentSender intentSender;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final Intent fillInIntent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final int flagsMask;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final int flagsValues;
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    public static final class a {
        public final IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public a(IntentSender intentSender) {
            G10.g(intentSender, "intentSender");
            this.a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        public final a b(Intent intent) {
            this.b = intent;
            return this;
        }

        public final a c(int i, int i2) {
            this.d = i;
            this.c = i2;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(PendingIntent pendingIntent) {
            G10.g(pendingIntent, AbstractC8245se.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            G10.f(intentSender, "pendingIntent.intentSender");
            this(intentSender);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            G10.g(parcel, "inParcel");
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        G10.g(intentSender, "intentSender");
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFlagsMask() {
        return this.flagsMask;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFlagsValues() {
        return this.flagsValues;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        G10.g(dest, "dest");
        dest.writeParcelable(this.intentSender, flags);
        dest.writeParcelable(this.fillInIntent, flags);
        dest.writeInt(this.flagsMask);
        dest.writeInt(this.flagsValues);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntentSenderRequest(Parcel parcel) {
        G10.g(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        G10.d(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
