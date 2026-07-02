package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC7087oU0;
import com.daaw.AbstractC7923rU0;
import com.daaw.G10;
import com.daaw.InterfaceC7645qU0;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/daaw/oU0;", "Landroid/os/Parcelable;", "value", "Lcom/daaw/qU0;", "policy", "<init>", "(Ljava/lang/Object;Lcom/daaw/qU0;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lcom/daaw/G91;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "D", "b", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ParcelableSnapshotMutableState<T> extends AbstractC7087oU0 implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel) {
            G10.g(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            InterfaceC7645qU0 interfaceC7645qU0F;
            G10.g(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i = parcel.readInt();
            if (i == 0) {
                interfaceC7645qU0F = AbstractC7923rU0.f();
            } else if (i == 1) {
                interfaceC7645qU0F = AbstractC7923rU0.k();
            } else {
                if (i != 2) {
                    throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
                }
                interfaceC7645qU0F = AbstractC7923rU0.h();
            }
            return new ParcelableSnapshotMutableState(value, interfaceC7645qU0F);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ParcelableSnapshotMutableState[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(Object obj, InterfaceC7645qU0 interfaceC7645qU0) {
        super(obj, interfaceC7645qU0);
        G10.g(interfaceC7645qU0, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        int i;
        G10.g(parcel, "parcel");
        parcel.writeValue(getValue());
        InterfaceC7645qU0 interfaceC7645qU0I = i();
        if (G10.c(interfaceC7645qU0I, AbstractC7923rU0.f())) {
            i = 0;
        } else if (G10.c(interfaceC7645qU0I, AbstractC7923rU0.k())) {
            i = 1;
        } else {
            if (!G10.c(interfaceC7645qU0I, AbstractC7923rU0.h())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i = 2;
        }
        parcel.writeInt(i);
    }
}
