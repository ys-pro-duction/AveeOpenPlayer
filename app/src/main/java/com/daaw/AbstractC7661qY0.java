package com.daaw;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.qY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7661qY0 {
    public static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
