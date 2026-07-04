package com.daaw;

import android.os.Bundle;
import com.daaw.Z9;

/* JADX INFO: renamed from: com.daaw.v82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8958v82 implements Z9.a {
    public final /* synthetic */ C2566Vn2 a;

    public C8958v82(C2566Vn2 c2566Vn2) {
        this.a = c2566Vn2;
    }

    @Override // com.daaw.M83
    public final void a(String str, String str2, Bundle bundle, long j) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Ub3 ub3 = AbstractC9039vS1.a;
            String strA = AbstractC9517x83.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            this.a.b.a(2, bundle2);
        }
    }
}
