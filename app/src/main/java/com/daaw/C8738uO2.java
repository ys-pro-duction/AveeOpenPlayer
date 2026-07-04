package com.daaw;

/* JADX INFO: renamed from: com.daaw.uO2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8738uO2 extends AbstractC9582xO2 {
    public final /* synthetic */ C9024vO2 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8738uO2(C9024vO2 c9024vO2, C10140zO2 c10140zO2, CharSequence charSequence) {
        super(c10140zO2, charSequence);
        this.H = c9024vO2;
    }

    @Override // com.daaw.AbstractC9582xO2
    public final int e(int i) {
        int i2 = i + 4000;
        if (i2 < this.D.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.daaw.AbstractC9582xO2
    public final int d(int i) {
        return i;
    }
}
