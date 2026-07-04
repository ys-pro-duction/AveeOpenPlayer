package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public enum DJ2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");

    public final String B;

    DJ2(String str) {
        this.B = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.B;
    }
}
