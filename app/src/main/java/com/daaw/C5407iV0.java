package com.daaw;

/* JADX INFO: renamed from: com.daaw.iV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5407iV0 extends AbstractC9005vK {
    public EnumC5128hV0 B;

    public C5407iV0(EnumC5128hV0 enumC5128hV0) {
        this.B = EnumC5128hV0.NONE;
        AbstractC6948ny0.c(enumC5128hV0, "special char must not be null");
        this.B = enumC5128hV0;
    }

    @Override // com.daaw.AbstractC9005vK
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public EnumC5128hV0 a() {
        return this.B;
    }
}
