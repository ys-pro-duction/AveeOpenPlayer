package com.daaw;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.daaw.sG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8146sG0 implements Serializable {
    public static final a C = new a(null);
    public final Pattern B;

    /* JADX INFO: renamed from: com.daaw.sG0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public C8146sG0(Pattern pattern) {
        G10.g(pattern, "nativePattern");
        this.B = pattern;
    }

    public final InterfaceC2536Vg0 a(CharSequence charSequence) {
        G10.g(charSequence, "input");
        Matcher matcher = this.B.matcher(charSequence);
        G10.f(matcher, "matcher(...)");
        return AbstractC8425tG0.c(matcher, charSequence);
    }

    public final boolean b(CharSequence charSequence) {
        G10.g(charSequence, "input");
        return this.B.matcher(charSequence).matches();
    }

    public final String c(CharSequence charSequence, String str) {
        G10.g(charSequence, "input");
        G10.g(str, "replacement");
        String strReplaceAll = this.B.matcher(charSequence).replaceAll(str);
        G10.f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public String toString() {
        String string = this.B.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8146sG0(String str) {
        G10.g(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        G10.f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
