package com.daaw;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DY0 extends CY0 {
    public static final String E0(String str, int i) {
        G10.g(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(AbstractC8417tE0.h(i, str.length()));
            G10.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static String F0(String str, int i) {
        G10.g(str, "<this>");
        if (i >= 0) {
            return I0(str, AbstractC8417tE0.d(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static char G0(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char H0(CharSequence charSequence) {
        G10.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(BY0.G(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String I0(String str, int i) {
        G10.g(str, "<this>");
        if (i >= 0) {
            String strSubstring = str.substring(0, AbstractC8417tE0.h(i, str.length()));
            G10.f(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
