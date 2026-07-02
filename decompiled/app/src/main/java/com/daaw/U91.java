package com.daaw;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public class U91 implements Spannable {
    public boolean B = false;
    public Spannable C;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.chars());
        }

        public static IntStream b(CharSequence charSequence) {
            return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return charSequence instanceof AbstractC6111ky0;
        }
    }

    public static class c extends b {
        @Override // com.daaw.U91.b
        public boolean a(CharSequence charSequence) {
            return V91.a(charSequence) || (charSequence instanceof AbstractC6111ky0);
        }
    }

    public U91(Spannable spannable) {
        this.C = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.C;
        if (!this.B && c().a(spannable)) {
            this.C = new SpannableString(spannable);
        }
        this.B = true;
    }

    public Spannable b() {
        return this.C;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.C.charAt(i);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.C.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.C.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.C.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i, int i2, Class cls) {
        return this.C.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.C.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.C.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.C.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.C.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.C.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.C.toString();
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.C);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.C);
    }

    public U91(CharSequence charSequence) {
        this.C = new SpannableString(charSequence);
    }
}
