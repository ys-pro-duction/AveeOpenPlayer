package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import com.daaw.AbstractC3885d31;
import com.daaw.AbstractC6867nh0;
import com.daaw.AbstractC8256sg0;
import com.daaw.JC0;
import com.daaw.SD0;
import com.daaw.WD0;

/* JADX INFO: loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {
    public final Rect H;
    public boolean I;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, JC0.l);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final String e(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        String str = "";
        String string = !TextUtils.isEmpty(hint) ? hint.toString() : "";
        if (zIsEmpty) {
            return !TextUtils.isEmpty(string) ? string : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        if (!TextUtils.isEmpty(string)) {
            str = ", " + string;
        }
        sb.append(str);
        return sb.toString();
    }

    public final boolean f(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.I;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.H);
        rect.bottom = this.H.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        return f(textInputLayout) ? textInputLayout.getGlobalVisibleRect(rect, point) : super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.P()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.P() && super.getHint() == null && AbstractC8256sg0.a()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(e(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!f(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.H.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.H);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.I = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(AbstractC6867nh0.c(context, attributeSet, i, 0), attributeSet, i);
        this.H = new Rect();
        TypedArray typedArrayI = AbstractC3885d31.i(context, attributeSet, WD0.O5, i, SD0.f, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(WD0.P5, false));
        typedArrayI.recycle();
    }
}
