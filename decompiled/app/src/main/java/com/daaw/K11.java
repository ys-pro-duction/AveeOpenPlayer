package com.daaw;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class K11 {
    public static final K11 a = new K11();
    public static final Layout.Alignment b;
    public static final Layout.Alignment c;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (G10.c(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (G10.c(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        b = alignment;
        c = alignment2;
    }

    public final Layout.Alignment a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : c : b : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
