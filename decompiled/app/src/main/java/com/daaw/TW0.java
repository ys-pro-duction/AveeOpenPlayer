package com.daaw;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class TW0 {
    public static final TW0 a = new TW0();
    public static final UW0 b;

    static {
        b = Build.VERSION.SDK_INT >= 23 ? new OW0() : new VW0();
    }

    public final StaticLayout a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2) {
        G10.g(charSequence, "text");
        G10.g(textPaint, "paint");
        G10.g(textDirectionHeuristic, "textDir");
        G10.g(alignment, "alignment");
        return b.a(new WW0(charSequence, i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, iArr, iArr2));
    }
}
