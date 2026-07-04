package com.daaw;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.daaw.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7698qg {
    public static final C7698qg a = new C7698qg();

    public final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        G10.g(charSequence, "text");
        G10.g(textPaint, "paint");
        G10.g(metrics, "metrics");
        G10.g(alignment, "alignment");
        if (i < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i2 >= 0) {
            return truncateAt == null ? new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z) : new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        G10.g(charSequence, "text");
        G10.g(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
