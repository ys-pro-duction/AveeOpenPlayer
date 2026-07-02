package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC2911Yw;
import com.daaw.C6902no0;
import com.daaw.G10;
import com.revenuecat.purchases.ProrationMode;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleProrationMode;", "", "Lcom/revenuecat/purchases/ProrationMode;", "", "playBillingClientMode", "<init>", "(Ljava/lang/String;II)V", "describeContents", "()I", "Landroid/os/Parcel;", "out", "flags", "Lcom/daaw/G91;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPlayBillingClientMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getAsGoogleReplacementMode$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "asGoogleReplacementMode", "CREATOR", "IMMEDIATE_WITHOUT_PRORATION", "IMMEDIATE_WITH_TIME_PRORATION", "IMMEDIATE_AND_CHARGE_FULL_PRICE", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum GoogleProrationMode implements ProrationMode {
    IMMEDIATE_WITHOUT_PRORATION(3),
    IMMEDIATE_WITH_TIME_PRORATION(1),
    IMMEDIATE_AND_CHARGE_FULL_PRICE(5),
    IMMEDIATE_AND_CHARGE_PRORATED_PRICE(2);


    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int playBillingClientMode;

    /* JADX INFO: renamed from: com.revenuecat.purchases.models.GoogleProrationMode$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleProrationMode$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/revenuecat/purchases/models/GoogleProrationMode;", "()V", "createFromParcel", "in", "Landroid/os/Parcel;", "fromPlayBillingClientMode", "playBillingClientMode", "", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleProrationMode;", "newArray", "", "size", "(I)[Lcom/revenuecat/purchases/models/GoogleProrationMode;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion implements Parcelable.Creator<GoogleProrationMode> {
        public /* synthetic */ Companion(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final GoogleProrationMode fromPlayBillingClientMode(Integer playBillingClientMode) {
            if (playBillingClientMode == null) {
                return null;
            }
            for (GoogleProrationMode googleProrationMode : GoogleProrationMode.values()) {
                if (playBillingClientMode.intValue() == googleProrationMode.getPlayBillingClientMode()) {
                    return googleProrationMode;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode createFromParcel(Parcel in) {
            G10.g(in, "in");
            String string = in.readString();
            if (string != null) {
                return GoogleProrationMode.valueOf(string);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode[] newArray(int size) {
            return new GoogleProrationMode[size];
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleProrationMode.values().length];
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GoogleProrationMode(int i) {
        this.playBillingClientMode = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final GoogleReplacementMode getAsGoogleReplacementMode$purchases_defaultsRelease() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return GoogleReplacementMode.WITHOUT_PRORATION;
        }
        if (i == 2) {
            return GoogleReplacementMode.WITH_TIME_PRORATION;
        }
        if (i == 3) {
            return GoogleReplacementMode.CHARGE_FULL_PRICE;
        }
        if (i == 4) {
            return GoogleReplacementMode.CHARGE_PRORATED_PRICE;
        }
        throw new C6902no0();
    }

    @Override // com.revenuecat.purchases.ProrationMode
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        G10.g(out, "out");
        out.writeString(name());
    }
}
