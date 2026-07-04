package com.daaw;

/* JADX INFO: renamed from: com.daaw.ea3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4304ea3 extends Exception {
    public final int B;

    public C4304ea3(int i, String str) {
        super(str);
        this.B = i;
    }

    public final C4824gP a() {
        if (getCause() == null) {
            getMessage();
        } else {
            getMessage();
            getCause();
        }
        return new C4824gP(this.B, getMessage());
    }

    public C4304ea3(int i, String str, Throwable th) {
        super(str, th);
        this.B = i;
    }
}
