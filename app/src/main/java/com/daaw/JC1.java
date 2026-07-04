package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JC1 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return l(intent.getExtras(), "ProxyBillingActivity");
        }
        j("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        j(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z3) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z2 && z4) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.d d(Intent intent, String str) {
        if (intent != null) {
            d.a aVarC = com.android.billingclient.api.d.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(f(intent.getExtras(), str));
            return aVarC.a();
        }
        j("BillingHelper", "Got null intent!");
        d.a aVarC2 = com.android.billingclient.api.d.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static C3461bZ e(Bundle bundle, String str) {
        return bundle == null ? new C3461bZ(0, null) : new C3461bZ(l(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        j(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String g(int i) {
        return EnumC8287sm1.a(i).toString();
    }

    public static List h(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM = m(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM == null) {
                i("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseM);
            return arrayList;
        }
        i("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
            Purchase purchaseM2 = m(stringArrayList.get(i), stringArrayList2.get(i));
            if (purchaseM2 != null) {
                arrayList.add(purchaseM2);
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int iMin = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, iMin);
            str2 = str2.substring(iMin);
            i -= iMin;
        }
    }

    public static int l(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        j(str, "Unexpected null bundle received!");
        return 0;
    }

    public static Purchase m(String str, String str2) {
        if (str == null || str2 == null) {
            i("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            j("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static void j(String str, String str2) {
    }

    public static void k(String str, String str2, Throwable th) {
    }
}
