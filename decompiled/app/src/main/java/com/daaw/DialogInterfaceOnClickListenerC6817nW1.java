package com.daaw;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: com.daaw.nW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC6817nW1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult B;
    public final /* synthetic */ EditText C;

    public DialogInterfaceOnClickListenerC6817nW1(JsPromptResult jsPromptResult, EditText editText) {
        this.B = jsPromptResult;
        this.C = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.B.confirm(this.C.getText().toString());
    }
}
