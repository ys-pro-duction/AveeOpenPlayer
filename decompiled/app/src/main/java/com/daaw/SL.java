package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public class SL extends JL {
    public final a B;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public SL(a aVar) {
        this.B = aVar;
    }

    public SL(String str, a aVar) {
        super(str);
        this.B = aVar;
    }
}
