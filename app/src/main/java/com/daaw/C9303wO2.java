package com.daaw;

import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.wO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9303wO2 implements Iterable {
    public final /* synthetic */ CharSequence B;
    public final /* synthetic */ C10140zO2 C;

    public C9303wO2(C10140zO2 c10140zO2, CharSequence charSequence) {
        this.C = c10140zO2;
        this.B = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.C.g(this.B);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        XN2.b(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
