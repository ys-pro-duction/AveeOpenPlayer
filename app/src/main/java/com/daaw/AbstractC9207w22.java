package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.w22, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9207w22 {
    public static C6685n12 a(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length != 1) {
            if (length == 2) {
                strConcat = strArrSplit[0];
                str2 = strArrSplit[1];
            }
            return null;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        str2 = strArrSplit[0];
        strConcat = strValueOf.concat("_preferences");
        if (!TextUtils.isEmpty(strConcat) && !TextUtils.isEmpty(str2)) {
            return new C6685n12(strConcat, str2);
        }
        return null;
    }

    public static void b(Context context, Set set) {
        S12 s12 = new S12(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C6685n12 c6685n12A = a(context, str);
            if (c6685n12A == null) {
                "clearKeys: unable to process key: ".concat(String.valueOf(str));
            } else {
                s12.d(c6685n12A.a).remove(c6685n12A.b);
            }
        }
        s12.b();
    }
}
