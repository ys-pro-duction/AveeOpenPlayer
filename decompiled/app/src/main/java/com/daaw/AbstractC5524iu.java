package com.daaw;

import com.revenuecat.purchases.common.Constants;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.daaw.iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5524iu {
    public static String a(String str, String str2) {
        try {
            return "Basic " + C4908gi.o((str + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str2).getBytes("ISO-8859-1")).a();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
