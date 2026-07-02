package com.daaw;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.px1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7503px1 extends AbstractC7224ox1 {
    public C7503px1(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static C7503px1 p(String str, Context context, boolean z) {
        AbstractC7224ox1.l(context, false);
        return new C7503px1(context, str, false);
    }

    public static C7503px1 q(String str, Context context, boolean z, int i) {
        AbstractC7224ox1.l(context, z);
        return new C7503px1(context, str, z);
    }

    @Override // com.daaw.AbstractC7224ox1
    public final List j(C2813Xx1 c2813Xx1, Context context, C9733xv1 c9733xv1, C7774qv1 c7774qv1) {
        if (c2813Xx1.k() == null || !this.W) {
            return super.j(c2813Xx1, context, c9733xv1, null);
        }
        int iA = c2813Xx1.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.j(c2813Xx1, context, c9733xv1, null));
        arrayList.add(new C9745xy1(c2813Xx1, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", c9733xv1, iA, 24));
        return arrayList;
    }
}
