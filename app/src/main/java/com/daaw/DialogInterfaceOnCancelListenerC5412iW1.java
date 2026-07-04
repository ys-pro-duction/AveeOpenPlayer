package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: com.daaw.iW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC5412iW1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsResult B;

    public DialogInterfaceOnCancelListenerC5412iW1(JsResult jsResult) {
        this.B = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.B.cancel();
    }
}
