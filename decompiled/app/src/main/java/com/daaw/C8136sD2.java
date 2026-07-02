package com.daaw;

import android.os.Bundle;
import com.daaw.Z9;

/* JADX INFO: renamed from: com.daaw.sD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8136sD2 implements Z9.a {
    public final /* synthetic */ C9598xS2 a;

    public C8136sD2(C9598xS2 c9598xS2) {
        this.a = c9598xS2;
    }

    @Override // com.daaw.M83
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (str == null || !AbstractC9039vS1.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        this.a.a.a(3, bundle2);
    }
}
