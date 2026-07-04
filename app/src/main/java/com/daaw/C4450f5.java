package com.daaw;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: renamed from: com.daaw.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4450f5 implements InterfaceC4649fm {
    public final ClipboardManager a;

    public C4450f5(ClipboardManager clipboardManager) {
        G10.g(clipboardManager, "clipboardManager");
        this.a = clipboardManager;
    }

    public final boolean a() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/plain");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4450f5(Context context) {
        G10.g(context, "context");
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            this((ClipboardManager) systemService);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
