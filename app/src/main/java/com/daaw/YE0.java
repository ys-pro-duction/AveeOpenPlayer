package com.daaw;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class YE0 implements InputConnection {
    public final RZ a;
    public final boolean b;
    public int c;
    public C3601c21 d;
    public int e;
    public boolean f;
    public final List g;
    public boolean h;

    public YE0(C3601c21 c3601c21, RZ rz, boolean z) {
        G10.g(c3601c21, "initState");
        G10.g(rz, "eventCallback");
        this.a = rz;
        this.b = z;
        this.d = c3601c21;
        this.g = new ArrayList();
        this.h = true;
    }

    public final void a(InterfaceC7026oF interfaceC7026oF) {
        b();
        try {
            this.g.add(interfaceC7026oF);
        } finally {
            c();
        }
    }

    public final boolean b() {
        this.c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z = this.h;
        return z ? b() : z;
    }

    public final boolean c() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0 && !this.g.isEmpty()) {
            this.a.c(AbstractC2455Um.O0(this.g));
            this.g.clear();
        }
        return this.c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        G10.g(inputContentInfo, "inputContentInfo");
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.h;
        return z ? this.b : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new C9692xn(String.valueOf(charSequence), i));
        }
        return z;
    }

    public final void d(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new C3023Zy(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new C3306az(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new C5646jL());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.d.c(), G21.i(this.d.b()), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.f = z;
        if (z) {
            this.e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return ZZ.a(this.d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i) {
        if (G21.f(this.d.b())) {
            return null;
        }
        return AbstractC3880d21.a(this.d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC3880d21.b(this.d, i).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC3880d21.c(this.d, i).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i) {
        boolean z = this.h;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    a(new C9030vQ0(0, this.d.c().length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i) {
        int iA;
        boolean z = this.h;
        if (!z) {
            return z;
        }
        if (i != 0) {
            switch (i) {
                case 2:
                    iA = FY.b.c();
                    break;
                case 3:
                    iA = FY.b.g();
                    break;
                case 4:
                    iA = FY.b.h();
                    break;
                case 5:
                    iA = FY.b.d();
                    break;
                case 6:
                    iA = FY.b.b();
                    break;
                case 7:
                    iA = FY.b.f();
                    break;
                default:
                    iA = FY.b.a();
                    break;
            }
        } else {
            iA = FY.b.a();
        }
        this.a.b(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.h;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i) {
        boolean z = this.h;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        G10.g(keyEvent, "event");
        boolean z = this.h;
        if (!z) {
            return z;
        }
        this.a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i, int i2) {
        boolean z = this.h;
        if (z) {
            a(new C8186sQ0(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.h;
        if (z) {
            a(new C8465tQ0(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i, int i2) {
        boolean z = this.h;
        if (!z) {
            return z;
        }
        a(new C9030vQ0(i, i2));
        return true;
    }
}
