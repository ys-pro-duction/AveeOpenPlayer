package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.daaw.AbstractC2317Td1;
import com.daaw.AbstractC4163e31;
import com.daaw.AbstractC8141sF;
import com.daaw.AbstractC8960v9;
import com.daaw.C3833cs;
import com.daaw.C8395t9;
import com.daaw.F9;
import com.daaw.InterfaceC10266zq0;
import com.daaw.InterfaceC3333b41;
import com.daaw.KC0;
import com.daaw.L9;
import com.daaw.M9;
import com.daaw.PZ;
import com.daaw.R8;
import com.daaw.W31;
import com.daaw.X21;
import com.daaw.Z21;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC10266zq0, InterfaceC3333b41 {
    public final R8 B;
    public final M9 C;
    public final L9 D;
    public final Z21 E;
    public final C8395t9 F;
    public a G;

    public class a {
        public a() {
        }

        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, KC0.z);
    }

    private a getSuperCaller() {
        if (this.G == null) {
            this.G = new a();
        }
        return this.G;
    }

    @Override // com.daaw.InterfaceC10266zq0
    public C3833cs a(C3833cs c3833cs) {
        return this.E.a(this, c3833cs);
    }

    public void d(C8395t9 c8395t9) {
        KeyListener keyListener = getKeyListener();
        if (c8395t9.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c8395t9.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        R8 r8 = this.B;
        if (r8 != null) {
            r8.b();
        }
        M9 m9 = this.C;
        if (m9 != null) {
            m9.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return X21.q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        R8 r8 = this.B;
        if (r8 != null) {
            return r8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        R8 r8 = this.B;
        if (r8 != null) {
            return r8.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.C.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.C.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        L9 l9;
        return (Build.VERSION.SDK_INT >= 28 || (l9 = this.D) == null) ? getSuperCaller().a() : l9.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrG;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.C.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC8960v9.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrG = AbstractC2317Td1.G(this)) != null) {
            AbstractC8141sF.d(editorInfo, strArrG);
            inputConnectionA = PZ.c(this, inputConnectionA, editorInfo);
        }
        return this.F.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (F9.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (F9.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        R8 r8 = this.B;
        if (r8 != null) {
            r8.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        R8 r8 = this.B;
        if (r8 != null) {
            r8.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(X21.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.F.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.F.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        R8 r8 = this.B;
        if (r8 != null) {
            r8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        R8 r8 = this.B;
        if (r8 != null) {
            r8.j(mode);
        }
    }

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.C.w(colorStateList);
        this.C.b();
    }

    @Override // com.daaw.InterfaceC3333b41
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.C.x(mode);
        this.C.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        M9 m9 = this.C;
        if (m9 != null) {
            m9.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        L9 l9;
        if (Build.VERSION.SDK_INT >= 28 || (l9 = this.D) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            l9.b(textClassifier);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(W31.b(context), attributeSet, i);
        AbstractC4163e31.a(this, getContext());
        R8 r8 = new R8(this);
        this.B = r8;
        r8.e(attributeSet, i);
        M9 m9 = new M9(this);
        this.C = m9;
        m9.m(attributeSet, i);
        m9.b();
        this.D = new L9(this);
        this.E = new Z21();
        C8395t9 c8395t9 = new C8395t9(this);
        this.F = c8395t9;
        c8395t9.c(attributeSet, i);
        d(c8395t9);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
