package com.daaw;

/* JADX INFO: renamed from: com.daaw.lY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6266lY0 {
    public static boolean a(CharSequence charSequence, char... cArr) {
        if (!b(charSequence) && cArr != null && cArr.length != 0) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i = length - 1;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == cCharAt) {
                        if (!Character.isHighSurrogate(cCharAt) || i4 == i2) {
                            return true;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
