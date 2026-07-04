package com.daaw;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3878d2 {
    public static final C3878d2 a = new C3878d2();

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        G10.g(accessibilityNodeInfo, "node");
        G10.g(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
