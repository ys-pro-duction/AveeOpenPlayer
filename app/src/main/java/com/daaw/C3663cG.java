package com.daaw;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.cG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3663cG implements TextWatcher {
    public final EditText B;
    public final boolean C;
    public c.f D;
    public int E = Integer.MAX_VALUE;
    public int F = 0;
    public boolean G = true;

    /* JADX INFO: renamed from: com.daaw.cG$a */
    public static class a extends c.f {
        public final Reference a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            super.b();
            C3663cG.b((EditText) this.a.get(), 1);
        }
    }

    public C3663cG(EditText editText, boolean z) {
        this.B = editText;
        this.C = z;
    }

    public static void b(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.c().p(editableText);
            YF.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.f a() {
        if (this.D == null) {
            this.D = new a(this.B);
        }
        return this.D;
    }

    public void c(boolean z) {
        if (this.G != z) {
            if (this.D != null) {
                androidx.emoji2.text.c.c().u(this.D);
            }
            this.G = z;
            if (z) {
                b(this.B, androidx.emoji2.text.c.c().e());
            }
        }
    }

    public final boolean d() {
        if (this.G) {
            return (this.C || androidx.emoji2.text.c.i()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.B.isInEditMode() || d() || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iE = androidx.emoji2.text.c.c().e();
        if (iE != 0) {
            if (iE == 1) {
                androidx.emoji2.text.c.c().s((Spannable) charSequence, i, i + i3, this.E, this.F);
                return;
            } else if (iE != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.c().t(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
