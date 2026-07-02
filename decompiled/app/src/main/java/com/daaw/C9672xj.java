package com.daaw;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* JADX INFO: renamed from: com.daaw.xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9672xj {
    public static final C9672xj g = new C9672xj(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public C9672xj(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static C9672xj a(CaptioningManager.CaptionStyle captionStyle) {
        return AbstractC6280lb1.a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    public static C9672xj b(CaptioningManager.CaptionStyle captionStyle) {
        return new C9672xj(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    public static C9672xj c(CaptioningManager.CaptionStyle captionStyle) {
        return new C9672xj(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
