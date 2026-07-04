package com.daaw;

import android.view.inputmethod.ExtractedText;

/* JADX INFO: loaded from: classes.dex */
public abstract class ZZ {
    public static final ExtractedText a(C3601c21 c3601c21) {
        G10.g(c3601c21, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = c3601c21.c();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = c3601c21.c().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = G21.i(c3601c21.b());
        extractedText.selectionEnd = G21.h(c3601c21.b());
        extractedText.flags = !BY0.y(c3601c21.c(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
