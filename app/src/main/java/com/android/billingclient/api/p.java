package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.d;
import com.daaw.JC1;
import com.daaw.L82;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static L82 a(Bundle bundle, String str, String str2) {
        d dVar = i.j;
        if (bundle == null) {
            JC1.j("BillingClient", String.format("%s got null owned items list", str2));
            return new L82(dVar, 54);
        }
        int iB = JC1.b(bundle, "BillingClient");
        String strF = JC1.f(bundle, "BillingClient");
        d.a aVarC = d.c();
        aVarC.c(iB);
        aVarC.b(strF);
        d dVarA = aVarC.a();
        if (iB != 0) {
            JC1.j("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new L82(dVarA, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            JC1.j("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new L82(dVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            JC1.j("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new L82(dVar, 56);
        }
        if (stringArrayList2 == null) {
            JC1.j("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new L82(dVar, 57);
        }
        if (stringArrayList3 != null) {
            return new L82(i.l, 1);
        }
        JC1.j("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new L82(dVar, 58);
    }
}
