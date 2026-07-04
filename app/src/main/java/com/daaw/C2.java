package com.daaw;

import android.content.Context;
import android.content.Intent;
import com.daaw.B2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class C2 extends B2 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Intent a(String[] strArr) {
            G10.g(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            G10.f(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        public a() {
        }
    }

    @Override // com.daaw.B2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String[] strArr) {
        G10.g(context, "context");
        G10.g(strArr, "input");
        return a.a(strArr);
    }

    @Override // com.daaw.B2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public B2.a b(Context context, String[] strArr) {
        G10.g(context, "context");
        G10.g(strArr, "input");
        if (strArr.length == 0) {
            return new B2.a(AbstractC1473Lg0.h());
        }
        for (String str : strArr) {
            if (AbstractC9438ws.a(context, str) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC8417tE0.d(AbstractC1369Kg0.d(strArr.length), 16));
        for (String str2 : strArr) {
            C0576Cs0 c0576Cs0A = D61.a(str2, Boolean.TRUE);
            linkedHashMap.put(c0576Cs0A.c(), c0576Cs0A.d());
        }
        return new B2.a(linkedHashMap);
    }

    @Override // com.daaw.B2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map c(int i, Intent intent) {
        if (i != -1) {
            return AbstractC1473Lg0.h();
        }
        if (intent == null) {
            return AbstractC1473Lg0.h();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return AbstractC1473Lg0.h();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return AbstractC1473Lg0.t(AbstractC2455Um.T0(AbstractC5431ib.D(stringArrayExtra), arrayList));
    }
}
