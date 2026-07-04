package com.daaw;

/* JADX INFO: renamed from: com.daaw.ik3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5479ik3 {
    public boolean a;
    public boolean b;
    public boolean c;

    public final C5479ik3 a(boolean z) {
        this.a = true;
        return this;
    }

    public final C5479ik3 b(boolean z) {
        this.b = z;
        return this;
    }

    public final C5479ik3 c(boolean z) {
        this.c = z;
        return this;
    }

    public final C6606mk3 d() {
        if (this.a || !(this.b || this.c)) {
            return new C6606mk3(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
