package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: com.daaw.mW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC6538mW1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult B;

    public DialogInterfaceOnClickListenerC6538mW1(JsPromptResult jsPromptResult) {
        this.B = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.B.cancel();
    }
}
