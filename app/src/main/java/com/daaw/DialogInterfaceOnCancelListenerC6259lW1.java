package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.daaw.lW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnCancelListenerC6259lW1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult B;

    public DialogInterfaceOnCancelListenerC6259lW1(JsPromptResult jsPromptResult) {
        this.B = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.B.cancel();
    }
}
