package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Ak1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0337Ak1 {
    public final C5199hk1 a;
    public final String b;
    public final C0762Ek1 c;

    public C0337Ak1(Context context, C5199hk1 c5199hk1) {
        this.b = context.getPackageName();
        this.a = c5199hk1;
        if (AbstractC1282Jk1.a(context)) {
            this.c = new C0762Ek1(context, c5199hk1, "IntegrityService", AbstractC0658Dk1.a, C8835uk1.a, null, null);
        } else {
            c5199hk1.b("Phonesky is not installed.", new Object[0]);
            this.c = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(C0337Ak1 c0337Ak1, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c0337Ak1.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList<AbstractC2549Vj1> arrayList = new ArrayList();
        arrayList.add(AbstractC2549Vj1.c(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC2549Vj1 abstractC2549Vj1 : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", abstractC2549Vj1.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }

    public final AbstractC6963o11 b(W00 w00) {
        if (this.c == null) {
            return A11.d(new V00(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(w00.c(), 10);
            Long lB = w00.b();
            this.a.d("requestIntegrityToken(%s)", w00);
            C7521q11 c7521q11 = new C7521q11();
            this.c.p(new C9400wk1(this, c7521q11, bArrDecode, lB, c7521q11, w00), c7521q11);
            return c7521q11.a();
        } catch (IllegalArgumentException e) {
            return A11.d(new V00(-13, e));
        }
    }
}
