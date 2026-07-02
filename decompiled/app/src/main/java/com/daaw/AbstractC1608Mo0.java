package com.daaw;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.AbstractC1401Ko0;

/* JADX INFO: renamed from: com.daaw.Mo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1608Mo0 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static Bundle a(AbstractC1401Ko0.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.d() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    public static Bundle b(LG0 lg0) {
        new Bundle();
        throw null;
    }

    public static Bundle[] c(LG0[] lg0Arr) {
        if (lg0Arr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[lg0Arr.length];
        for (int i = 0; i < lg0Arr.length; i++) {
            LG0 lg0 = lg0Arr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
