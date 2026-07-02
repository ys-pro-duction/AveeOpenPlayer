package com.daaw;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class Z21 implements InterfaceC9987yq0 {
    public static CharSequence b(Context context, ClipData.Item item, int i) {
        if ((i & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override // com.daaw.InterfaceC9987yq0
    public C3833cs a(View view, C3833cs c3833cs) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Objects.toString(c3833cs);
        }
        if (c3833cs.d() == 2) {
            return c3833cs;
        }
        ClipData clipDataB = c3833cs.b();
        int iC = c3833cs.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataB.getItemCount(); i++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i), iC);
            if (charSequenceB != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z = true;
                }
            }
        }
        return null;
    }
}
