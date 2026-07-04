package com.daaw;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class UF {
    public final b a;
    public int b = Integer.MAX_VALUE;
    public int c = 0;

    public static class a extends b {
        public final EditText a;
        public final C3663cG b;

        public a(EditText editText, boolean z) {
            this.a = editText;
            C3663cG c3663cG = new C3663cG(editText, z);
            this.b = c3663cG;
            editText.addTextChangedListener(c3663cG);
            editText.setEditableFactory(VF.getInstance());
        }

        @Override // com.daaw.UF.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof ZF) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new ZF(keyListener);
        }

        @Override // com.daaw.UF.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof XF ? inputConnection : new XF(this.a, inputConnection, editorInfo);
        }

        @Override // com.daaw.UF.b
        public void c(boolean z) {
            this.b.c(z);
        }
    }

    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z);
    }

    public UF(EditText editText, boolean z) {
        AbstractC8621ty0.h(editText, "editText cannot be null");
        this.a = new a(editText, z);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.a.b(inputConnection, editorInfo);
    }

    public void c(boolean z) {
        this.a.c(z);
    }
}
