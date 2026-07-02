package com.daaw;

/* JADX INFO: renamed from: com.daaw.sO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8180sO2 extends AbstractC9582xO2 {
    public final /* synthetic */ C8459tO2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8180sO2(C8459tO2 c8459tO2, C10140zO2 c10140zO2, CharSequence charSequence) {
        super(c10140zO2, charSequence);
        this.H = c8459tO2;
    }

    @Override // com.daaw.AbstractC9582xO2
    public final int d(int i) {
        return i + 1;
    }

    @Override // com.daaw.AbstractC9582xO2
    public final int e(int i) {
        CharSequence charSequence = this.D;
        int length = charSequence.length();
        AbstractC5381iO2.b(i, length, "index");
        while (i < length) {
            C8459tO2 c8459tO2 = this.H;
            if (c8459tO2.a.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
