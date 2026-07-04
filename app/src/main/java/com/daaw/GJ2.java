package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public enum GJ2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");

    public final String B;

    GJ2(String str) {
        this.B = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.B;
    }
}
