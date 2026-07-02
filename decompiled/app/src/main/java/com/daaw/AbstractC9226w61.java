package com.daaw;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.w61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9226w61 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C9505x61 c9505x61) {
        if (c9505x61.h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c9505x61.h()), i, i2, 33);
        }
        if (c9505x61.m()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c9505x61.n()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c9505x61.k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c9505x61.c()), i, i2, 33);
        }
        if (c9505x61.j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c9505x61.b()), i, i2, 33);
        }
        if (c9505x61.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c9505x61.d()), i, i2, 33);
        }
        if (c9505x61.i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(c9505x61.i()), i, i2, 33);
        }
        int iF = c9505x61.f();
        if (iF == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c9505x61.e(), true), i, i2, 33);
        } else if (iF == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c9505x61.e()), i, i2, 33);
        } else {
            if (iF != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(c9505x61.e() / 100.0f), i, i2, 33);
        }
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static C9505x61 d(C9505x61 c9505x61, String[] strArr, Map map) {
        if (c9505x61 == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c9505x61 == null && strArr.length == 1) {
            return (C9505x61) map.get(strArr[0]);
        }
        if (c9505x61 == null && strArr.length > 1) {
            C9505x61 c9505x612 = new C9505x61();
            int length = strArr.length;
            while (i < length) {
                c9505x612.a((C9505x61) map.get(strArr[i]));
                i++;
            }
            return c9505x612;
        }
        if (c9505x61 != null && strArr != null && strArr.length == 1) {
            return c9505x61.a((C9505x61) map.get(strArr[0]));
        }
        if (c9505x61 != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                c9505x61.a((C9505x61) map.get(strArr[i]));
                i++;
            }
        }
        return c9505x61;
    }
}
